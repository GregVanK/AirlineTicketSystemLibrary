/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.airline.access;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Greg VanKampen
 */
public class DALHelper {
    /**
     * Loads db.properties file into an instance of a properties object
     * @returnproperties object
     * @throws Exception
     */
    public static Properties getProperties() throws Exception{
        Properties props = new Properties();
        
        try{
            //get path to db.properties
            //String propertiesPath = System.getProperty("user.dir") + "\\db.properties";
            ClassLoader classLoader = DALHelper.class.getClassLoader();
            
            InputStream in = classLoader.getResourceAsStream("com/properties/db.properties");
            //stream in the data from the file
            
            //loads data into props object
            props.load(in);
            in.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
            throw e;
        }
        return props;
    }
}
