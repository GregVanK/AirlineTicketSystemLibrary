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
public class TravelerBase implements Serializable, ITravelerBase{
    int	    id;
    String  fName;
    String  mName;
    String  lName;
    String  gender;
    int	    phoneNo;
    String  passport;
    String  birthday;
    String  email;

    //<editor-fold defaultstate="collapsed" desc="Getters and Setters">
    @Override
    public int getId() {
	return id;
    }
    @Override
    public void setId(int id) {
	this.id = id;
    }
    @Override
    public String getfName() {
	return fName;
    }
    @Override
    public void setfName(String fName) {
	this.fName = fName;
    }
    @Override
    public String getmName() {
	return mName;
    }
    @Override
    public void setmName(String mName) {
	this.mName = mName;
    }
    @Override
    public String getlName() {
	return lName;
    }
    @Override
    public void setlName(String lName) {
	this.lName = lName;
    }
    @Override
    public String getGender() {
	return gender;
    }
    @Override
    public void setGender(String gender) {
	this.gender = gender;
    }
    @Override
    public int getPhoneNo() {
	return phoneNo;
    }
    @Override
    public void setPhoneNo(int phoneNo) {
	this.phoneNo = phoneNo;
    }
    @Override
    public String getPassport() {
	return passport;
    }
    @Override
    public void setPassport(String passport) {
	this.passport = passport;
    }
    @Override
    public String getBirthday() {
	return birthday;
    }
    @Override
    public void setBirthday(String birthday) {
	this.birthday = birthday;
    }
    @Override
    public String getEmail() {
	return email;
    }
    @Override
    public void setEmail(String email) {
	this.email = email;
    }
    
//</editor-fold>
    
}
