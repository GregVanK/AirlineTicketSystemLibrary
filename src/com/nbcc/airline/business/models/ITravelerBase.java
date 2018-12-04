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
public interface ITravelerBase {
    int	    getId();
    void    setId(int id);
    String  getFName();
    void    setFName(String fName);
    String  getMName();
    void    setMName(String mName);
    String  getLName();
    void    setLName(String lName);
    String  getGender();
    void    setGender(String gender);
    int	    getPhoneNo();
    void    setPhoneNo(int phoneNo);
    String  getPassport();
    void    setPassport(String passport);
    String  getBirthday();
    void    setBirthday(String birthday);
    String  getEmail();
    void    setEmail(String email);
}
