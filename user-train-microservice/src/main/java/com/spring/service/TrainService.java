package com.spring.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dto.BookingDTO;
import com.spring.entity.Booking;
import com.spring.entity.Seat;
import com.spring.entity.SourceDestination;
import com.spring.entity.Trains;
import com.spring.repo.BookingRepository;
import com.spring.repo.SeatRepository;
import com.spring.repo.SourceDestinationRepository;
import com.spring.repo.TrainsRepository;
/***
 * 
 * @author shubh-sinha
 * @project Multi-tour-booking
 *
 */
@Service
public class TrainService implements TrainsServiceDAO {

	@Autowired
	private TrainsRepository trainRepo;

	@Autowired
	private SourceDestinationRepository sdRepo;

	@Autowired
	private SeatRepository seatRepo;

	@Autowired
	private BookingRepository bookingRepo;

	/***
	 * @method get-current-date return formatted-date
	 */
	@Override
	public String getCurrentDate() {
		LocalDate localdate = LocalDate.now();
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_DATE;
		return localdate.format(dateTimeFormatter);
	}

	/***
	 * @method list-of-source and destination
	 */
	@Override
	public List<SourceDestination> listAllSourceDestination() {
		return sdRepo.findAll();
	}

	/***
	 * @method list-of-trains by-source-department
	 * @param sourceId
	 * @param destinationId
	 * @param date
	 * 
	 */
	@Override
	public List<Trains> listAllTrainsBySdId(int sourceId, int destinationId, String date) {
		return trainRepo.findAllBySdId(sourceId, destinationId, date);
	}

	/***
	 * @method train-booking
	 * @param BookingDTO
	 * @return response
	 * @description First Booking is created 
	 * 			and saved into table and meanwhile
	 * 			seats is automatically creating accroding
	 * 			to passengers and parallely the seats which
	 * 			is defaulted updates accroding to passengers
	 * 			booking(saved) -> seat(automatically-created)
	 *          -> trains(seats-passengers)
	 */			 
	@Transactional
	@Override
	public String trainBooking(BookingDTO booking) {
		Booking bookings = new Booking();
		bookings.setPassengers(booking.getPassengers());
		bookings.setTrainId(booking.getTrainId());
		bookings.setUserId(booking.getUserId());
		

		Optional<Trains> train = trainRepo.findById(booking.getTrainId());
		if(train.isPresent()) {
		if (train.get().getSeats() > booking.getPassengers()) {
			trainRepo.updateSeats(booking.getPassengers(), booking.getTrainId());

			List<Seat> seatList = new ArrayList<>();
			int seatno = 1;
			int autoId;
			int bookingId;
			if(seatRepo.findNullIdDesc() == null) {
				 autoId = 1;
				 bookingId=1;
			}
			else {
				 autoId = seatRepo.findTopByOrderByIdDesc()+1;
				 bookingId = bookingRepo.findTopByBookingByIdDesc()+1;
			}
			
			int range=booking.getPassengers();
			if (seatRepo.findifSeatIsNull(booking.getTrainId()) == null) {
				seatno=1;
				range=booking.getPassengers();
			}
			else {
				seatno= seatRepo.findTopByOrderBySeatNoDesc(booking.getTrainId()) + 1;
				range = booking.getPassengers() +seatno;
			}
			bookings.setBookingId(bookingId);
			bookingRepo.save(bookings);
			for (int i = seatno; i <= range; i++) {
				Seat seats = new Seat();
				seats.setTrainId(booking.getTrainId());
				seats.setSeatNo(i);
				seats.setSeatId(autoId++);
				seats.setStatus("Confirm");
				seats.setBooking(bookings);
				seatList.add(seats);
			}
			booking.setSeat(seatList);
			seatRepo.saveAll(seatList);
			
			return "The seat "+seatList+" Saved Successfully!";
		} else {
			return "No Seats Availabale! Try with different train";
		}
		}
		else {
			return "Cannot Be Null";
		}

	}

	/***
	 * @param userId
	 * @return list of bookings
	 *  according to userId
	 */
	@Override
	public List<Booking> listBookings(String userId) {
		return bookingRepo.findAllByBookingId(userId);
	}


}