/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.airline.repository;

import com.nbcc.airline.access.DALRdbms;
import com.nbcc.airline.access.IParameter;
import com.nbcc.airline.access.Parameter;
import com.nbcc.airline.business.models.AirportBase;
import com.nbcc.airline.business.models.IAirportBase;
import com.nbcc.airline.business.models.IFlightBase;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.sql.rowset.CachedRowSet;

/**
 *
 * @author Greg.VanKampen
 */
public class FlightRepository {
     private final String SPROC_INSERT_FLIGHT = "CALL InsertFlight(?,?,?,?,?,?,?,?,?,?,?)";
     private final String SPROC_GET_AIRPORTS = "CALL GetAirports()";
    public int insertFlight(IFlightBase flight){
        int returnID = 0;
        try {
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
            DALRdbms.executeNonQuery(SPROC_INSERT_FLIGHT,params);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return returnID;
    }
    
    public List<IAirportBase> retrieveAirports(){
	List<IAirportBase> airports = new ArrayList();
	try {
	    CachedRowSet rs = DALRdbms.executeFill(SPROC_GET_AIRPORTS, null);
	    airports = toListOfAirports(rs); 
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	}
	return airports;
    }
    
    private List<IAirportBase> toListOfAirports(CachedRowSet rs)throws SQLException{
	List<IAirportBase> airports = new ArrayList();
	IAirportBase airport;
	while(rs.next()){
            try {
                airport = new AirportBase();
                airport.setName(rs.getString("Name"));
                airport.setName(rs.getString("IATA"));
                airports.add(airport);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return airports;
    }
}
