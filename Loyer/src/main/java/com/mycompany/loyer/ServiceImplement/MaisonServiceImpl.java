/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.ServiceImplement;

import com.douwe.generic.dao.DataAccessException;
import com.mycompany.loyer.DaoInter.IMaisonLoyer;
import com.mycompany.loyer.DaoInter.IRappelLoyer;
import com.mycompany.loyer.Data.MaisonLoyer;
import com.mycompany.loyer.ServiceInter.IMaisonService;
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
public class MaisonServiceImpl  implements IMaisonService{
    
    IMaisonLoyer iMaisonLoyer;

    public IMaisonLoyer getiMaisonLoyer() {
        return iMaisonLoyer;
    }

    public void setiMaisonLoyer(IMaisonLoyer iMaisonLoyer) {
        this.iMaisonLoyer = iMaisonLoyer;
    }

    public MaisonLoyer create(MaisonLoyer oMaisonLoyer) throws ServiceException {

    
        try {
            
             return iMaisonLoyer.create(oMaisonLoyer);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(MaisonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    
    
    }

    public MaisonLoyer update(MaisonLoyer oMaisonLoyer) throws ServiceException {

    
      
      try {
            
             return iMaisonLoyer.update(oMaisonLoyer);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(MaisonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    
    
    }

    public MaisonLoyer findById(Long id) throws ServiceException {

      try {
            
             return iMaisonLoyer.findById(id);
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(MaisonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    
    
    }

    public List<MaisonLoyer> findAll() throws ServiceException {

    
      try {
            
             return iMaisonLoyer.findAll();
             
             //To change body of generated methods, choose Tools | Templates.
         } catch (DataAccessException ex) {
             Logger.getLogger(MaisonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
              throw new ServiceException("imposssible de faire le create");
         }
    
    
    
    
    }
    
    
    
    
    
}
