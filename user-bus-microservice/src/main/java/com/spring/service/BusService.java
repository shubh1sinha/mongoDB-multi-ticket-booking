package com.spring.service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dto.BusBookingDTO;
import com.spring.entity.Bus;
import com.spring.entity.BusBooking;
import com.spring.entity.Cities;
import com.spring.repo.BusBookingRepository;
import com.spring.repo.BusRepository;
import com.spring.repo.CityRepository;

/****
 * 
 * @project Multi-ticket booking
 * @author shubh-sinha
 * @author ashu-mittal
 *
 */
@Service
public class BusService implements BusServiceDAO {

	@Autowired
	BusRepository busRepo;

	@Autowired
	CityRepository cityRepo;
	
	@Autowired
	BusBookingRepository bookingRepo;

	/***
	 * @method Admin method to give routes to a bus
	 * @joining ManyToMany Mapping
	 */
	@Override
	public Bus giveBusRouteByJoining() {
		int busId = 5;
		Optional<Bus> bus = busRepo.findById(busId);
		Optional<Cities> c1 = cityRepo.findById(1);
		Optional<Cities> c2 = cityRepo.findById(4);
		Optional<Cities> c3 = cityRepo.findById(5);
		Optional<Cities> c4 = cityRepo.findById(6);
		Optional<Cities> c5 = cityRepo.findById(2);
		Set<Cities> cityList = new HashSet<Cities>();
		if(c1.isPresent()||c2.isPresent()||c3.isPresent()||c4.isPresent()||c5.isPresent()) {
		cityList.add(c1.get());
		cityList.add(c2.get());
		cityList.add(c3.get());
		cityList.add(c4.get());
		cityList.add(c5.get());
		bus.get().setRoutes(cityList);
		}
		busRepo.save(bus.get());
		return bus.get();

	}

	/***
	 * @method List All Bus
	 */
	@Override
	public List<Bus> findAllBus() {
		return busRepo.findAll();
	}

	/***
	 * @method list Bus by Id
	 */
	@Override
	public List<Bus> findAllBusbySrcnDstns(String name) {
		return busRepo.findAllBysrcDestn(name);

	}
	
	/***
	 * @method Book Bus 
	 * @param booking
	 * 
	 */
	@Transactional
	@Override
	public String bookBus(BusBookingDTO booking) {
		Optional<Bus> opBus = busRepo.findById(booking.getBusId());
		if(opBus.isPresent()) {
		if(opBus.get().getSeats() > booking.getPassengers() && booking.getPassengers()!=0) {
		BusBooking bus = new BusBooking();
		bus.setBusId(booking.getBusId());
		bus.setUserId(booking.getUserId());
		bus.setPassengers(booking.getPassengers());
		bus.setBoarding(booking.getBoarding());
		bus.setDropping(booking.getDropping());
		bookingRepo.save(bus);
		busRepo.updateSeatsById(booking.getBusId(), booking.getPassengers());
		return "Booking of "+booking.getPassengers()+" passengers Done!";
		}
		else {
			return "Try Again!";
		}
		}
		else {
			return "Try Again!";
		}
	}

	/***
	 * @method List-All bookings By username
	 * 
	 */
	@Override
	public List<BusBooking> viewAllBookingsById(String userId) {
		return bookingRepo.findAllByuserId(userId);
	}

}
