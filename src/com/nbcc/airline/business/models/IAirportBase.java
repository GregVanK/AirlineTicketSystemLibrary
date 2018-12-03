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
public interface IAirportBase {
    String  getName();
    void    setName(String name);
    String  getIATA();
    void    setIATA(String IATA);
    
}
