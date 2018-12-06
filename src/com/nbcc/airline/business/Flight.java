/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.airline.business;

import com.nbcc.airline.business.models.FlightBase;
import com.nbcc.airline.business.models.IAirportBase;
import com.nbcc.airline.business.models.IFlightBase;
import com.nbcc.airline.repository.FlightRepository;
import java.util.List;

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
    public List<IAirportBase> getAirports(){
	    return repo.retrieveAirports();
    }
    public IFlightBase getFlight(int FlightNo){
        IFlightBase flight= new FlightBase();
        flight = repo.retrieveFlight(FlightNo);
        return flight;
    }
    public void updateFlight(IFlightBase flight)throws Exception{
        if(true){//TODO: Add validation
            repo.updateFlight(flight);
            
        }
        else{
            throw new FlightException("Unable to update flight: Missing Values");
        }
    }
    public void deleteFlight(int flightNo){
	repo.deleteFlight(flightNo);
    }
    public List<IFlightBase> searchFlights(IFlightBase flight){
	return repo.searchFlights(flight);
    }
}
