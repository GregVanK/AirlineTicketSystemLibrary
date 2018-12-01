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
    int	    getId();
    void    setId(int id);
    String  getStatus();
    void    setStatus(String Status);
    String  getStartDate();
    void    setStartDate(String startDate);
    String  getEndDate();
    void    setEndDate(String endDate);
    int	    getPassengerNo();
    void    setPassengerNo(int passengerNo);
    String  getTicketType();
    void    setTicketType(String ticketType);
    boolean isNonStopFlight();
    void    setNonStopFlight(boolean nonStopFlight);
    String  getFlightClass();
    void    setFlightClass(String flightClass);
    String  getCreditType();
    void    setCreditType(String creditType);
    int	    getCreditNo();
    void    setCreditNo(int creditCardNo);
    String  getCreditExpDate();
    void    setCreditExpDate(String creditExpDate);
    int	    getCreditId();
    void    setCreditId(int creditId);
    String  getAddress1();
    void    setAddress1(String address1);
    String  getAddress2();
    void    setAddress2(String address2);
    String  getCountry();
    void    setCountry(String country);
    float   getTotalCosts();
    void    setTotalCosts(float totalCosts);
    float   getTransportCosts();
    void    setTransportCosts(float transportCosts);
    float   getOtherFees();
    void    setOtherFees(float otherFees);
    
}
