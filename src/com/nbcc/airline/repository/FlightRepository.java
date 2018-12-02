/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.airline.repository;

import com.nbcc.airline.access.DALRdbms;
import com.nbcc.airline.access.IParameter;
import com.nbcc.airline.access.Parameter;
import com.nbcc.airline.business.models.IFlightBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Greg.VanKampen
 */
public class FlightRepository {
     private final String SPROC_INSERT_FLIGHT_WITH_RETURN = "CALL InsertFlight()";
    public int insertFlight(IFlightBase flight){
        int returnID = 0;
        try {
            int reserveID = 0;
            List<Object> returnValues;
            List<IParameter> params = new ArrayList(){
            {
             add(new Parameter(flight.getFlightNo()));
             add(new Parameter(flight.getAirlineName()));
             add(new Parameter(flight.getDepartureAirport()));
             add(new Parameter(flight.getArrivalAirport()));
             add(new Parameter(flight.getDepartureDate()));
             add(new Parameter(flight.getArrivalDate()));
             add(new Parameter(flight.getFlightTime()));
             add(new Parameter(flight.getStatus()));
             add(new Parameter(flight.getSeats()));
             add(new Parameter(flight.getAvailableSeats()));
             add(new Parameter(flight.getPrice()));
            }
        };
            returnValues = DALRdbms.executeNonQuery(SPROC_INSERT_FLIGHT_WITH_RETURN,params);
            if(returnValues != null){
                returnID = Integer.parseInt(returnValues.get(0).toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return returnID;
    }
}
