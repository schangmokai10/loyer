/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Data;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author oumarou
 */
@Entity
public class PayeLoyer {
 
   @Id
   @GeneratedValue(strategy = GenerationType.TABLE)
   private Long id;
   
   @Column
   private Long montantPayer;
   
   @Column 
   private int  nbreMoisApayer;

   @Column
   Date datePaye;
   
   @ManyToOne
   private MaisonLoyer PayeMaison;
   
   @ManyToOne
   private ClientLoyer PayeClient;
   
    public PayeLoyer() {
    }

    public int getNbreMoisApayer() {
        return nbreMoisApayer;
    }

    public void setNbreMoisApayer(int nbreMoisApayer) {
        this.nbreMoisApayer = nbreMoisApayer;
    }

    public MaisonLoyer getPayeMaison() {
        return PayeMaison;
    }

    public void setPayeMaison(MaisonLoyer PayeMaison) {
        this.PayeMaison = PayeMaison;
    }

    public ClientLoyer getPayeClient() {
        return PayeClient;
    }

    public void setPayeClient(ClientLoyer PayeClient) {
        this.PayeClient = PayeClient;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMontantPayer() {
        return montantPayer;
    }

    public void setMontantPayer(Long montantPayer) {
        this.montantPayer = montantPayer;
    }

    public int getNbreMois() {
        return nbreMoisApayer;
    }

    public void setNbreMois(int nbreMois) {
        this.nbreMoisApayer = nbreMois;
    }

    public Date getDatePaye() {
        return datePaye;
    }

    public void setDatePaye(Date datePaye) {
        this.datePaye = datePaye;
    }
   
   
   
   
   
}
