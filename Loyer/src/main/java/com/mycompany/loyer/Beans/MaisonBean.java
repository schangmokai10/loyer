/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Beans;

import com.mycompany.loyer.Data.MaisonLoyer;
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
public class MaisonBean {
    
    @ManagedProperty(value = "#{IMaisonService}")
    private IMaisonService iMaisonService;
    
    MaisonLoyer oMaisonLoyer = new MaisonLoyer();

    public MaisonBean() {
    }

    public IMaisonService getiMaisonService() {
        return iMaisonService;
    }

    public void setiMaisonService(IMaisonService iMaisonService) {
        this.iMaisonService = iMaisonService;
    }

    public MaisonLoyer getoMaisonLoyer() {
        return oMaisonLoyer;
    }

    public void setoMaisonLoyer(MaisonLoyer oMaisonLoyer) {
        this.oMaisonLoyer = oMaisonLoyer;
    }

  
  
  
        
    public MaisonLoyer create () throws ServiceException{
    
        
    return iMaisonService.create(oMaisonLoyer);
    
    }
    
    
    public MaisonLoyer update() throws ServiceException{
    
    
    return iMaisonService.update(oMaisonLoyer);
    }
 
    public MaisonLoyer findById() throws ServiceException{
    
    return iMaisonService.findById(oMaisonLoyer.getId());
    
    }
    
    
    
    public List<MaisonLoyer> findAll() throws ServiceException{
    
        
        
    return iMaisonService.findAll();
    
    }
    
       
    
}
