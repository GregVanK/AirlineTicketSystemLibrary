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
public class Parameter implements IParameter {
    private Object value;
    private Type type;
    private int sqlType;
    
    public Parameter(){}
    
    public Parameter(Object value){
        this.value = value;
        this.type=Type.IN;
        
    }
    public Parameter(Object value, Type type){
        this.value=value;
        this.type=type;
    }

    public Parameter(Object value, Type type, int sqlType) {
        this.value = value;
        this.type = type;
        this.sqlType = sqlType;
    }
    
    @Override
    public Object getValue() {
        return value;
    }
    @Override
    public void setValue(Object value) {
        this.value = value;
    }
    @Override
    public Type getType() {
        return type;
    }
    @Override
    public void setType(Type type) {
        this.type = type;
    }
    @Override
    public int getSQLType() {
        return sqlType;
    }
    @Override
    public void setSQLType(int sqlType) {
        this.sqlType = sqlType;
    }
    
}
