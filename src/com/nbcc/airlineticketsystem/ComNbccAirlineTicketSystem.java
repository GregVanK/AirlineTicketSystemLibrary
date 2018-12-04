/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.airlineticketsystem;

import com.nbcc.airline.business.Flight;
import com.nbcc.airline.business.Reservation;
import com.nbcc.airline.business.Traveler;
import com.nbcc.airline.business.models.FlightBase;
import com.nbcc.airline.business.models.IFlightBase;
import com.nbcc.airline.business.models.IReservationBase;
import com.nbcc.airline.business.models.ITravelerBase;
import com.nbcc.airline.business.models.ReservationBase;
import com.nbcc.airline.business.models.TravelerBase;

/**
 *
 * @author Greg.VanKampen
 */
public class ComNbccAirlineTicketSystem {

    /**
     * Used for testing
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//	IReservationBase demo = new ReservationBase();
//	Reservation frontEmu = new Reservation();
//	demo.setStatus("Active");
//	demo.setStartDate("2000-01-01 00:00:00");
//	demo.setEndDate("2000-01-01 00:00:01");
//	demo.setPassengerNo(50);
//	demo.setTicketType("Adult");
//	demo.setNonStopFlight(true);
//	demo.setFlightClass("Economy");
//	demo.setCreditType("Testa");
//	demo.setCreditNo(1);
//	demo.setCreditHolder("ME");
//	demo.setCreditExpDate("1996-04-04");
//	demo.setCreditId(123);
//	demo.setAddress1("test street");
//	demo.setAddress2("test street2");
//	demo.setPostalCode("aaaa");
//	demo.setCountry("Testicia");
//	demo.setTotalCosts(50.01f);
//	demo.setTransportCosts(50.01f);
//	demo.setOtherFees(0.01f);
//	try {
//	    frontEmu.createReservation(demo);
//	} catch (Exception e) {
//	}
        IFlightBase demo = new FlightBase();
        Flight frontEmu = new Flight();
        demo.setAirlineName("Airline Testing");
        demo.setStatus("Testing");
        demo.setArrivalAirport("TE1");
        demo.setDepartureAirport("TE2");
        demo.setFlightNo(506);
        demo.setArrivalDate("2000-01-01 00:00:00");
        demo.setDepartureDate("2000-01-01 00:00:00");
        demo.setSeats(5);
        demo.setAvailableSeats(4);
        demo.setFlightTime("00:00:10");
        demo.setPrice(12.00f);
        try {
            frontEmu.createFlight(demo);
        } catch (Exception e) {
        }
//	ITravelerBase demo = new TravelerBase();
//        Traveler frontEmu = new Traveler();
//        demo.setfName("Jest");
//        demo.setmName("Von");
//        demo.setlName("Test");
//        demo.setGender("Male");
//        demo.setPassport("PassportTest");
//        demo.setPhoneNo(1234567);
//        demo.setEmail("tester@t.com");
//        demo.setBirthday("1996-04-18");
//        try {
//            frontEmu.createTraveler(demo);
//        } catch (Exception e) {
//        }
    }
    
}
