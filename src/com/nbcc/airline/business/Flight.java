/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.airline.business;

import com.nbcc.airline.business.models.IFlightBase;
import com.nbcc.airline.repository.FlightRepository;

/**
 *
 * @author Greg.VanKampen
 */
public class Flight {
    private FlightRepository repo;
    public Flight(){
        repo = new FlightRepository();
    }
    public IFlightBase createFlight(IFlightBase flight) throws Exception{
        if(true){//TODO:add validation
            repo.insertFlight(flight);
            return flight;
        }
        else{
            throw new FlightException("Invalid flight values");
        }
        
    }
}
