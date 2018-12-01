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
public class ReservationBase implements Serializable, IReservationBase {
    int	    id;
    String  status;
    String  startDate;
    String  endDate;
    int	    passengerNo;
    String  ticketType;
    boolean nonStopFlight;
    String  flightClass;
    String  creditType;
    int	    creditNo;
    String  creditExpDate;
    int	    creditId;
    String  address1;
    String  address2;
    String  country;
    float   totalCosts;
    float   transportCosts;
    float   otherFees;
    
    @Override
    public int getId() {
	return id;
    }
    @Override
    public void setId(int id) {
	this.id = id;
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
    public String getStartDate() {
	return startDate;
    }
    @Override
    public void setStartDate(String startDate) {
	this.startDate = startDate;
    }
    @Override
    public String getEndDate() {
	return endDate;
    }
    @Override
    public void setEndDate(String endDate) {
	this.endDate = endDate;
    }
    @Override
    public int getPassengerNo() {
	return passengerNo;
    }
    @Override
    public void setPassengerNo(int passengerNo) {
	this.passengerNo = passengerNo;
    }
    @Override
    public String getTicketType() {
	return ticketType;
    }
    @Override
    public void setTicketType(String ticketType) {
	this.ticketType = ticketType;
    }
    @Override
    public boolean isNonStopFlight() {
	return nonStopFlight;
    }
    @Override
    public void setNonStopFlight(boolean nonStopFlight) {
	this.nonStopFlight = nonStopFlight;
    }
    @Override
    public String getFlightClass() {
	return flightClass;
    }
    @Override
    public void setFlightClass(String flightClass) {
	this.flightClass = flightClass;
    }
    @Override
    public String getCreditType() {
	return creditType;
    }
    @Override
    public void setCreditType(String creditType) {
	this.creditType = creditType;
    }
    @Override
    public int getCreditNo() {
	return creditNo;
    }
    @Override
    public void setCreditNo(int creditNo) {
	this.creditNo = creditNo;
    }
    @Override
    public String getCreditExpDate() {
	return creditExpDate;
    }
    @Override
    public void setCreditExpDate(String creditExpDate) {
	this.creditExpDate = creditExpDate;
    }
    @Override
    public int getCreditId() {
	return creditId;
    }
    @Override
    public void setCreditId(int creditId) {
	this.creditId = creditId;
    }
    @Override
    public String getAddress1() {
	return address1;
    }
    @Override
    public void setAddress1(String address1) {
	this.address1 = address1;
    }
    @Override
    public String getAddress2() {
	return address2;
    }
    @Override
    public void setAddress2(String address2) {
	this.address2 = address2;
    }
    @Override
    public String getCountry() {
	return country;
    }
    @Override
    public void setCountry(String country) {
	this.country = country;
    }
    @Override
    public float getTotalCosts() {
	return totalCosts;
    }
    @Override
    public void setTotalCosts(float totalCosts) {
	this.totalCosts = totalCosts;
    }
    @Override
    public float getTransportCosts() {
	return transportCosts;
    }
    @Override
    public void setTransportCosts(float transportCosts) {
	this.transportCosts = transportCosts;
    }
    @Override
    public float getOtherFees() {
	return otherFees;
    }
    @Override
    public void setOtherFees(float otherFees) {
	this.otherFees = otherFees;
    }
   
    
}
