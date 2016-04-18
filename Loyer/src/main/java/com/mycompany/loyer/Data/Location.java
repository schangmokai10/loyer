/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author oumarou
 */
@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    @Column
    private Date dateDebut;
    @Column
    private Date DateFin;
    @Column
    private Double montantMensuel;

    @ManyToOne
    private ClientLoyer locationClient;
    
     @ManyToOne
    private MaisonLoyer locationMaison;
     
     
    public Location() {
    }

    public ClientLoyer getLocationClient() {
        return locationClient;
    }

    public void setLocationClient(ClientLoyer locationClient) {
        this.locationClient = locationClient;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return DateFin;
    }

    public void setDateFin(Date DateFin) {
        this.DateFin = DateFin;
    }

    public Double getMontantMensuel() {
        return montantMensuel;
    }

    public void setMontantMensuel(Double montantMensuel) {
        this.montantMensuel = montantMensuel;
    }

    public MaisonLoyer getLocationMaison() {
        return locationMaison;
    }

    public void setLocationMaison(MaisonLoyer locationMaison) {
        this.locationMaison = locationMaison;
    }
    
    
    
    
    
}
