/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.airline.business.models;

import java.io.Serializable;

/**
 *
 * @author Greg.VanKampen
 */
public class FlightBase implements Serializable, IFlightBase {
    int	    flightNo;
    String  airlineName;
    String  departureAirport;
    String  arrivalAirport;
    String  departureDate;
    String  arrivalDate;
    String  flightTime;
    String  status;
    int	    seats;
    int	    availableSeats;
    float   price;
    
//<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    @Override
    public int getFlightNo() {
	return flightNo;
    }
    @Override
    public void setFlightNo(int flightNo) {
	this.flightNo = flightNo;
    }
    @Override
    public String getAirlineName() {
	return airlineName;
    }
    @Override
    public void setAirlineName(String airlineName) {
	this.airlineName = airlineName;
    }
    @Override
    public String getDepartureAirport() {
	return departureAirport;
    }
    @Override
    public void setDepartureAirport(String departureAirport) {
	this.departureAirport = departureAirport;
    }
    @Override
    public String getArrivalAirport() {
	return arrivalAirport;
    }
    @Override
    public void setArrivalAirport(String arrivalAirport) {
	this.arrivalAirport = arrivalAirport;
    }
    @Override
    public String getDepartureDate() {
	return departureDate;
    }
    @Override
    public void setDepartureDate(String departureDate) {
	this.departureDate = departureDate;
    }
    @Override
    public String getArrivalDate() {
	return arrivalDate;
    }
    @Override
    public void setArrivalDate(String arrivalDate) {
	this.arrivalDate = arrivalDate;
    }
    @Override
    public String getFlightTime() {
	return flightTime;
    }
    @Override
    public void setFlightTime(String flightTime) {
	this.flightTime = flightTime;
    }
    @Override
    public String getStatus() {
	return status;
    }
    @Override
    public void setStatus(String status) {
	this.status = status;
    }
    @Override
    public int getSeats() {
	return seats;
    }
    @Override
    public void setSeats(int seats) {
	this.seats = seats;
    }
    @Override
    public int getAvailableSeats() {
	return availableSeats;
    }
    @Override
    public void setAvailableSeats(int availableSeats) {
	this.availableSeats = availableSeats;
    }
    @Override
    public float getPrice() {
	return price;
    }
    @Override
    public void setPrice(float price) {
	this.price = price;
    }
//</editor-fold>
    
    
}
