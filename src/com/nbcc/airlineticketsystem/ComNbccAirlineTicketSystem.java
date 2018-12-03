/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.airlineticketsystem;

import com.nbcc.airline.business.Traveler;
import com.nbcc.airline.business.models.ITravelerBase;
import com.nbcc.airline.business.models.TravelerBase;

/**
 *
 * @author Googis
 */
public class ComNbccAirlineTicketSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	ITravelerBase demo = new TravelerBase();
        Traveler frontEmu = new Traveler();
        demo.setfName("Jest");
        demo.setmName("Von");
        demo.setlName("Test");
        demo.setGender("Male");
        demo.setPassport("PassportTest");
        demo.setPhoneNo(1234567);
        demo.setEmail("tester@t.com");
        demo.setBirthday("1996-04-18");
        try {
            frontEmu.createTraveler(demo);
        } catch (Exception e) {
        }
    }
    
}
