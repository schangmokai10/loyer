/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Data;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Column;


/**
 *
 * @author oumarou
 */
@Entity
public class Rappel {
     @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
     @Column
    private Date dateDelvrance;
    
    @ManyToOne
    private ClientLoyer RapelClient;

    public Rappel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDelvrance() {
        return dateDelvrance;
    }

    public void setDateDelvrance(Date dateDelvrance) {
        this.dateDelvrance = dateDelvrance;
    }

    public ClientLoyer getRapelClient() {
        return RapelClient;
    }

    public void setRapelClient(ClientLoyer RapelClient) {
        this.RapelClient = RapelClient;
    }

    
}
