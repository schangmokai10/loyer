/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.ServiceImplement;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.loyer.DaoInter.IClientLoyer;
import com.mycompany.loyer.Data.ClientLoyer;
import com.mycompany.loyer.ServiceInter.IClientService;
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
public class ClientLoyerServiceImpl  implements IClientService{
    
    
    IClientLoyer iClientLoyer;

    public IClientLoyer getiClientLoyer() {
        return iClientLoyer;
    }

    public void setiClientLoyer(IClientLoyer iClientLoyer) {
        this.iClientLoyer = iClientLoyer;
    }
    
    
    

    public ClientLoyer create(ClientLoyer oClientLoyer) throws ServiceException {

    
    try {
            
             return iClientLoyer.create(oClientLoyer);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(ClientLoyerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    }

    public ClientLoyer update(ClientLoyer oClientLoyer) throws ServiceException {

      try {
            
             return iClientLoyer.update(oClientLoyer);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(ClientLoyerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    }

    public ClientLoyer findById(Long id) throws ServiceException {

    try {
            
             return iClientLoyer.findById(id);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(ClientLoyerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    }

    public List<ClientLoyer> findAll() throws ServiceException {

    try {
            
             return iClientLoyer.findAll();
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(ClientLoyerServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    }
    
}
