/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbcc.airline.access;

/**
 *
 * @author Greg VanKampen
 */
public interface IParameter {
    /**
     * Parameter Types
     * Input and Output
     */
    public enum Type{
        IN,
        OUT
    }
    void setValue(Object value);
    void setType(Type type);
    void setSQLType(int sqlType);
    
    Object getValue();
    Type getType();
    int getSQLType();
    
}
