/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.ServiceImplement;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.loyer.DaoInter.IRappelLoyer;
import com.mycompany.loyer.Data.Rappel;
import com.mycompany.loyer.ServiceInter.IRappelService;
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
public class RappelServiceImpl implements IRappelService{
    
    IRappelLoyer iRappelLoyer;

    public IRappelLoyer getiRappelLoyer() {
        return iRappelLoyer;
    }

    public void setiRappelLoyer(IRappelLoyer iRappelLoyer) {
        this.iRappelLoyer = iRappelLoyer;
    }
    
    
    

    public Rappel create(Rappel rappel) throws ServiceException {
        
        
       try {
            
             return iRappelLoyer.create(rappel);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(RappelServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
//To change body of generated methods, choose Tools | Templates.
    }

    public Rappel update(Rappel rappel) throws ServiceException {

    try {
            
             return iRappelLoyer.update(rappel);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(RappelServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    }

    public Rappel findById(Long id) throws ServiceException {

    
    
    try {
            
             return iRappelLoyer.findById(id);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(RappelServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    
    }

    public List<Rappel> findAll() throws ServiceException {

    
    try {
            
             return iRappelLoyer.findAll();
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(RappelServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    
    }
    
}
