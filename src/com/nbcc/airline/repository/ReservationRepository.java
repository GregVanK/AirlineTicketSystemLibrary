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
import com.nbcc.airline.business.models.IReservationBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Greg.VanKampen
 */
public class ReservationRepository extends RepositoryBase {
    private final String SPROC_INSERT_REPOSITORY_WITH_RETURN = "CALL InsertReservation(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    public int insertReservation(IReservationBase reserve){
        int returnID = 0;
        try {
            int reserveID = 0;
            List<Object> returnValues;
            List<IParameter> params = new ArrayList(){
            {
             add(new Parameter(reserve.getStatus()));
             add(new Parameter(reserve.getStartDate()));
             add(new Parameter(reserve.getEndDate()));
             add(new Parameter(reserve.getPassengerNo()));
             add(new Parameter(reserve.getTicketType()));
             add(new Parameter(reserve.isNonStopFlight()));
             add(new Parameter(reserve.getFlightClass()));
             add(new Parameter(reserve.getCreditType()));
             add(new Parameter(reserve.getCreditNo()));
             add(new Parameter(reserve.getCreditHolder()));
             add(new Parameter(reserve.getCreditExpDate()));
             add(new Parameter(reserve.getCreditId()));
             add(new Parameter(reserve.getAddress1()));
             add(new Parameter(reserve.getAddress2()));
             add(new Parameter(reserve.getPostalCode()));
             add(new Parameter(reserve.getCountry()));
             add(new Parameter(reserve.getTotalCosts()));
             add(new Parameter(reserve.getTransportCosts()));
             add(new Parameter(reserve.getTotalCosts()));
             add(new Parameter(reserveID,Type.OUT,java.sql.Types.INTEGER));
            }
        };
            returnValues = DALRdbms.executeNonQuery(SPROC_INSERT_REPOSITORY_WITH_RETURN,params);
//            if(returnValues != null){
//                returnID = Integer.parseInt(returnValues.get(0).toString());
//            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return returnID;
    }
}
