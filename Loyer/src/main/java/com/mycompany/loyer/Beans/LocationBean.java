/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Beans;

import com.mycompany.loyer.Data.Location;
import com.mycompany.loyer.ServiceInter.ILocationService;
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
 
     @ManagedProperty(value = "#{ILocationService}")
    private ILocationService iLocationService;
     
    private Location location;

    public LocationBean() {
    }

    public ILocationService getiLocationService() {
        return iLocationService;
    }

    public void setiLocationService(ILocationService iLocationService) {
        this.iLocationService = iLocationService;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
        
    public Location create () throws ServiceException{
    
        
    return iLocationService.create(location);
    
    }
    
    
    public Location update() throws ServiceException{
    
    
    return iLocationService.update(location);
    }
 
    public Location findById() throws ServiceException{
    
       return iLocationService.findById(location.getId());
    
    }
    
    
    
    public List<Location> findAll() throws ServiceException{     
       return iLocationService.findAll();  
    } 
    
}
