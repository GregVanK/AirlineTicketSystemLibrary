/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.airline.business.models;

/**
 *
 * @author Greg.VanKampen
 */
public interface IFlightBase {
    int	    getFlightNo();
    void    setFlightNo(int flightNo);
    String  getAirlineName();
    void    setAirlineName(String airlineName);
    String  getDepartureAirport();
    void    setDepartureAirport(String departureAirport);
    String  getArrivalAirport();
    void    setArrivalAirport(String departureAirport);
    String  getDepartureDate();
    void    setDepartureDate(String departureDate);
    String  getArrivalDate();
    void    setArrivalDate(String arrivalDate);
    String  getFlightTime();
    void    setFlightTime(String flightTime);
    String  getStatus();
    void    setStatus(String Status);
    int	    getSeats();
    void    setSeats(int seats);
    int	    getAvailableSeats();
    void    setAvailableSeats(int availableSeats);
    float   getPrice();
    void   setPrice(float price);  
}
