/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.airline.repository;

import com.nbcc.airline.access.DALRdbms;
import com.nbcc.airline.access.IParameter;
import com.nbcc.airline.access.IParameter.Type;
import com.nbcc.airline.access.Parameter;
import com.nbcc.airline.business.models.ITravelerBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Greg.VanKampen
 */
public class TravelerRepository {
    private final String SPROC_INSERT_TRAVELER_WITH_RETURN = "CALL InsertFlight(?,?,?,?,?,?,?,?,?,?)";
    public int insertTraveler(ITravelerBase traveler){
        int returnID = 0;
        try {
            int travelerID = 0;
            List<Object> returnValues;
            List<IParameter> params = new ArrayList(){
            {
             add(new Parameter(traveler.getfName()));
             add(new Parameter(traveler.getmName()));
             add(new Parameter(traveler.getlName()));
             add(new Parameter(traveler.getGender()));
             add(new Parameter(traveler.getPhoneNo()));
             add(new Parameter(traveler.getPassport()));
             add(new Parameter(traveler.getPassport()));
             add(new Parameter(traveler.getBirthday()));
             add(new Parameter(traveler.getEmail()));
             add(new Parameter(travelerID,Type.OUT,java.sql.Types.INTEGER));
            }
        };
            returnValues = DALRdbms.executeNonQuery(SPROC_INSERT_TRAVELER_WITH_RETURN,params);
            if(returnValues != null){
                returnID = Integer.parseInt(returnValues.get(0).toString());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return returnID;
    }
}
