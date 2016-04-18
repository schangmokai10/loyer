/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 *
 * @author oumarou
 */
@Entity
public class AdminLoyer  extends Personne{
   @Column
    private String login;
    
  @Column
    private String passwd;

    public AdminLoyer() {
    }
    
    
    
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
    
    
    
}
