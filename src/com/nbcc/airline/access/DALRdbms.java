/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.airline.access;

import com.nbcc.airline.access.IParameter.Type;
import com.sun.rowset.CachedRowSetImpl;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.sql.rowset.CachedRowSet;

/**
 *
 * @author Greg VanKampen
 */
public final class DALRdbms {
    private static String url = "";
    private static String username = "";
    private static String password = "";
    private static String driver = "";
    
    /**
     * Executes a non query DML statement or DDL statement. accepts parameters as an object array
     * @param statement original statement
     * @param params parameters of original statement
     * @return nothing for now
     */
    public static long executeNonQuery(String statement, Object[] params){
        long returnValue = 0;
        try{
            propertiesSetUp();
            try(Connection conn = DriverManager.getConnection(url, username, password)){
                try(PreparedStatement pstmt = conn.prepareStatement(statement)){//switch to statement if wrong
                    int i = 1;
                    for(Object o : params)
                        pstmt.setObject(i++, o);
                    pstmt.execute();
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return returnValue;
        }
    /**
     * Executes a non query using iParameters to control the type*(in/out) and SQL datatype
     * @param statement SQL statement to be executed
     * @param params incoming or outgoing
     * @return a list of return parameters, if any
     */
    public static List<Object> executeNonQuery(String statement, List<IParameter> params){
        List<Object> returnValues = new ArrayList();
        try{
            propertiesSetUp();
            try(Connection conn = DriverManager.getConnection(url, username, password)){
                try(CallableStatement cstmt = conn.prepareCall(statement)){
                    int i = 1;
                    for (IParameter p : params){
                        if(p.getType() == Type.IN)
                            cstmt.setObject(i, p.getValue());
                        else{
                            cstmt.registerOutParameter(i,p.getSQLType());
                        }
                        i++;
                    }
                    cstmt.execute();
                    i=1;
                    for(IParameter p : params){
                        if(p.getType() == Type.OUT){
                            returnValues.add(cstmt.getString(i));
                        }
                        i++;
                    }
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return returnValues;
    }
    /**
     * Executes fills of data using Select statements
     * @param statement The select statement
     * @param params values to be selected. can be null
     * @return a disconnected data set
     * @throws Exception 
     */
    public static CachedRowSet  executeFill(String statement, Object[] params) throws Exception{
        CachedRowSet rowSet;
        propertiesSetUp();
          try(Connection conn = DriverManager.getConnection(url, username, password)){
              try(PreparedStatement pstmt = conn.prepareStatement(statement)){
                  int i = 1;
                  if (params != null){
                      for(Object o : params){
                          pstmt.setObject(i,o);
                          i++;
                      }
                  }
                  try(ResultSet rs = (ResultSet) pstmt.executeQuery()){
                      rowSet = new CachedRowSetImpl();
                      rowSet.populate(rs);
                  }
              }
          }
        return rowSet;
                
    }
    public static Object executeScalar(String statement, Object[] params) throws Exception{
        propertiesSetUp();
        Object returnValue = null;
        
        try(Connection conn = DriverManager.getConnection(url, username, password)){
            try(PreparedStatement pstmt = conn.prepareStatement(statement)){
                int i = 1;
                if(params!=null){
                    for(Object o: params){
                        pstmt.setObject(i, o);
                        i++;
                    }
                }
                try(ResultSet rs = (ResultSet) pstmt.executeQuery()){
                      if(rs.next()){
                          returnValue = rs.getString(1);
                      }
                  }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return returnValue;
    }
    
    /**
     * 
     * @throws Exception 
     */
    private static void propertiesSetUp() throws Exception{
        Properties props = DALHelper.getProperties();
        url= props.getProperty("database.url");
        username= props.getProperty("database.username");
        password= props.getProperty("database.password");
        driver= props.getProperty("database.driver");
        Class.forName(driver).newInstance();
    }
}
