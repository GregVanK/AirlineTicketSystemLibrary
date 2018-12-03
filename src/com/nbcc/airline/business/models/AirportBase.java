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
public class AirportBase implements Serializable,IAirportBase {
    String Name;
    String IATA;

    @Override
    public String getName() {
	return Name;
    }
    @Override
    public void setName(String Name) {
	this.Name = Name;
    }
    @Override
    public String getIATA() {
	return IATA;
    }
    @Override
    public void setIATA(String IATA) {
	this.IATA = IATA;
    }
    
}
