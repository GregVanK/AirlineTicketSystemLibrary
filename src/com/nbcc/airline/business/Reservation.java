/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.airline.business;

import com.nbcc.airline.business.models.IReservationBase;
import com.nbcc.airline.repository.ReservationRepository;

/**
 *
 * @author Greg.VanKampen
 */
public class Reservation {
    private ReservationRepository repo;
    public Reservation(){
        repo = new ReservationRepository();
    }
    public IReservationBase createReservation(IReservationBase reservation) throws Exception{
        int reservationID = 0;
        if(true){//TODO:add validation
            reservationID = repo.insertReservation(reservation);
            reservation.setId(reservationID);
            return reservation;
        }
        else{
            throw new ReservationException("Invalid reservation values");
        }
    }
}
