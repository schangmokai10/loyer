/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Beans;

import com.mycompany.loyer.Data.Rappel;
import com.mycompany.loyer.ServiceInter.IRappelService;
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
public class RappelBean {
 
    @ManagedProperty(value = "#{IRappelService}")
    
        private IRappelService iRappelService;
        
        Rappel oRappel = new Rappel();

    public RappelBean() {
    }

    public IRappelService getiRappelService() {
        return iRappelService;
    }

    public void setiRappelService(IRappelService iRappelService) {
        this.iRappelService = iRappelService;
    }

    public Rappel getoRappel() {
        return oRappel;
    }

    public void setoRappel(Rappel oRappel) {
        this.oRappel = oRappel;
    }
        
        
    public Rappel create () throws ServiceException{
    
        
    return iRappelService.create(oRappel);
    
    }
    
    
    public Rappel update() throws ServiceException{
    
    
    return iRappelService.update(oRappel);
    }
 
    public Rappel findById() throws ServiceException{
    
    return iRappelService.findById(oRappel.getId());
    
    }
    
    
    
    public List<Rappel> findAll() throws ServiceException{
    
        
        
    return iRappelService.findAll();
    
    }
    
    
    
    
    
}
