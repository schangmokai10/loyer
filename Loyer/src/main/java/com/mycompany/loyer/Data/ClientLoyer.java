/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Data;


import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

/**
 *
 * @author oumarou
 */
@Entity
public class ClientLoyer  extends Personne{
    @Column
    private String NumeroCni;
    @Column
    private Date DateLivraison;

    @OneToMany(mappedBy = "locationClient")
    private List<Location> listLocation;
    
    @OneToMany(mappedBy = "RapelClient")
    private List<Rappel> listRappel;
     
    
    public ClientLoyer() {
    }

    public List<Location> getListLocation() {
        return listLocation;
    }

    public void setListLocation(List<Location> listLocation) {
        this.listLocation = listLocation;
    }

    public List<Rappel> getListRappel() {
        return listRappel;
    }

    public void setListRappel(List<Rappel> listRappel) {
        this.listRappel = listRappel;
    }
    
    
    

    public String getNumeroCni() {
        return NumeroCni;
    }

    public void setNumeroCni(String NumeroCni) {
        this.NumeroCni = NumeroCni;
    }

    public Date getDateLivraison() {
        return DateLivraison;
    }

    public void setDateLivraison(Date DateLivraison) {
        this.DateLivraison = DateLivraison;
    }
    
    
    
}
