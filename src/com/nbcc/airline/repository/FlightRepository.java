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
import com.nbcc.airline.business.models.FlightBase;
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
     private final String SPROC_GET_FLIGHT = "CALL GetFlight(?)";
     private final String SPROC_UPDATE_FLIGHT = "CALL UpdateFlight(?,?,?,?,?,?,?,?)";
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
    
    public IFlightBase retrieveFlight(int flightno){
       List<IFlightBase> flight = new ArrayList();
        try {
            ArrayList<Object> params = new ArrayList()
            {
                {
                    add(flightno);
                }
            };
            CachedRowSet rs = DALRdbms.executeFill(SPROC_GET_FLIGHT, params.toArray());
            flight = toListOfFlights(rs);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        if(flight.size() >0)
            return flight.get(0);
        else
            return null;
    }
    public List<IFlightBase> toListOfFlights(CachedRowSet rs) throws SQLException{
        List<IFlightBase> flights = new ArrayList();
        IFlightBase flight;
        while(rs.next()){
            flight = new FlightBase();
            flight.setFlightNo(rs.getInt("FlightNo"));
            flight.setAirlineName(rs.getString("AirlineName"));
            flight.setDepartureAirport(rs.getString("DepartureAirport"));
            flight.setArrivalAirport(rs.getString("ArrivalAirport"));
            flight.setDepartureDate(rs.getString("DepartureDate"));
            flight.setArrivalDate(rs.getString("ArrivalDate"));
            flight.setFlightTime(rs.getString("FlightTime"));
            flight.setStatus(rs.getString("Status"));
            flight.setSeats(rs.getInt("Seats"));
            flight.setAvailableSeats(rs.getInt("AvailableSeats"));
            flight.setPrice(rs.getFloat("Price"));
            flights.add(flight);
        }
        return flights;
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
                airport.setIATA(rs.getString("IATA"));
                airports.add(airport);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return airports;
    }
    
    public void updateFlight(IFlightBase flight){
         try {
            List<Object> params = new ArrayList(){
            {
             add(flight.getFlightNo());
             add(flight.getDepartureDate());
             add(flight.getArrivalDate());
             add(flight.getFlightTime());
             add(flight.getStatus());
             
             
             add(flight.getSeats());
             add(flight.getAvailableSeats());
             add(flight.getPrice());
            }
            
        };
             DALRdbms.executeNonQuery(SPROC_UPDATE_FLIGHT,params.toArray());
       } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
