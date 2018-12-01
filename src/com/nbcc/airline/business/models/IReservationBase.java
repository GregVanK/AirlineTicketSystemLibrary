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
public interface IReservationBase {
    int	    getID();
    void    setID(int id);
    String  getStatus();
    void    setStatus(String Status);
    String  getStartDate();
    void    setStartDate(String startDate);
    String  getEndDate();
    void    setEndDate(String endDate);
    int	    getPassengerNo();
    void    setPassenengerNo(int passengerNo);
    String  getTicketType();
    void    setTicketType(String ticketType);
    boolean getNonStopFlight();
    void    setNonStopFlight(boolean nonStopFlight);
    String  getFlightClass();
    void    setFlightClass(String flightClass);
    String  getCreditType();
    void    setCreditType(String creditType);
    int	    getCreditNo();
    void    setCreditNo(int creditCardNo);
    String  getCredidExpDate();
    void    setCreditExpDate(String creditExpDate);
    int	    getCreditId();
    void    setCreditId(int creditId);
    String  getAddress1();
    void    setAddress1(String address1);
    String  getAddress2();
    void    setAddress2(String address2);
    String  getCountry();
    void    setCountry(String country);
    float   getTotalCost();
    void    setTotalCosts(float totalCosts);
    float   getTransportCost();
    void    setTransportCost(float transportCost);
    float   getOtherFees();
    void    setOtherFees(float otherFees);
    
}
