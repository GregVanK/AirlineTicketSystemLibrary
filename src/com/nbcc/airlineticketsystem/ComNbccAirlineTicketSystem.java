/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.airlineticketsystem;

import com.nbcc.airline.business.Flight;
import com.nbcc.airline.business.Traveler;
import com.nbcc.airline.business.models.FlightBase;
import com.nbcc.airline.business.models.IFlightBase;
import com.nbcc.airline.business.models.ITravelerBase;
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
        IFlightBase demo = new FlightBase();
        Flight frontEmu = new Flight();
        demo.setAirlineName("Airline Testing");
        demo.setStatus("Testing");
        demo.setArrivalAirport("TE1");
        demo.setDepartureAirport("TE2");
        demo.setFlightNo(505);
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
