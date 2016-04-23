/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Beans;

import com.mycompany.loyer.Data.Location;
import com.mycompany.loyer.Data.MaisonLoyer;
import com.mycompany.loyer.ServiceInter.ILocationService;
import com.mycompany.loyer.ServiceInter.IMaisonService;
import com.mycompany.loyer.ServiceInter.ServiceException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author oumarou
 */
@ManagedBean
@RequestScoped
public class LocationBean {
 
     @ManagedProperty(value = "#{IMaisonService}")
    private ILocationService iLocationService;
     
    private Location oLocation = new  Location();

    public LocationBean() {
    }

    public ILocationService getiLocationService() {
        return iLocationService;
    }

    public void setiLocationService(ILocationService iLocationService) {
        this.iLocationService = iLocationService;
    }

    public Location getoLocation() {
        return oLocation;
    }

    public void setoLocation(Location oLocation) {
        this.oLocation = oLocation;
    }

   
    
        
    public Location create () throws ServiceException{
    
        
    return iLocationService.create(oLocation);
    
    }
    
    
    public Location update() throws ServiceException{
    
    
    return iLocationService.update(oLocation);
    }
 
    public Location findById() throws ServiceException{
    
    return iLocationService.findById(oLocation.getId());
    
    }
    
    
    
    public List<Location> findAll() throws ServiceException{
    
        
        
    return iLocationService.findAll();
    
    }
    
    
    
}
