/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.ServiceImplement;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.loyer.DaoInter.ILocationLoyer;
import com.mycompany.loyer.Data.Location;
import com.mycompany.loyer.ServiceInter.ILocationService;
import com.mycompany.loyer.ServiceInter.ServiceException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author oumarou
 */
@Transactional
public class LocationServiceImpl  implements ILocationService{
    
    
    ILocationLoyer iLocationLoyer;

    public ILocationLoyer getiLocationLoyer() {
        return iLocationLoyer;
    }

    public void setiLocationLoyer(ILocationLoyer iLocationLoyer) {
        this.iLocationLoyer = iLocationLoyer;
    }
    
    
    
    
    
    

    public Location create(Location oLocation) throws ServiceException {

        try {
            
             return iLocationLoyer.create(oLocation);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(LocationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    
    
    
    }

    public Location update(Location oLocation) throws ServiceException {

      try {
            
             return iLocationLoyer.update(oLocation);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(LocationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    }

    public Location findById(Long id) throws ServiceException {

      try {
            
             return iLocationLoyer.findById(id);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(LocationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    
    }

    public List<Location> findAll() throws ServiceException {

    
    try {
            
             return iLocationLoyer.findAll();
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(LocationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    
    }
    
}
