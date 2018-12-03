/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.airline.business;

import com.nbcc.airline.business.models.ITravelerBase;
import com.nbcc.airline.business.models.TravelerBase;
import com.nbcc.airline.repository.TravelerRepository;

/**
 *
 * @author Greg.VanKampen
 */
public class Traveler {
    private TravelerRepository repo;
    public Traveler(){
        repo = new TravelerRepository();
        
        
    }
    public ITravelerBase createTraveler(ITravelerBase traveler) throws Exception{
        int travelerID = 0;
        if(true){//TODO:add validation
            travelerID = repo.insertTraveler(traveler);
            traveler.setId(travelerID);
            return traveler;
        }
        else{
            throw new TravelerException("Invalid traveler values");
        }
    }
    
}
