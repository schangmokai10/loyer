/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.Beans;

import com.mycompany.loyer.Data.ClientLoyer;
import com.mycompany.loyer.Data.PayeLoyer;
import com.mycompany.loyer.ServiceInter.IClientService;
import com.mycompany.loyer.ServiceInter.IPayeLoyerService;
import com.mycompany.loyer.ServiceInter.ServiceException;
import java.util.Date;
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
public class PayeBeans {
    
    @ManagedProperty(value = "#{IPayeLoyerService}")
    IPayeLoyerService iPayeService;
    
    PayeLoyer paye = new PayeLoyer();

    Date date = new Date();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public PayeLoyer getPaye() {
        return paye;
    }

    public void setPaye(PayeLoyer paye) {
        this.paye = paye;
    }
    
    
    
    public IPayeLoyerService getiPayeService() {
        return iPayeService;
    }

    public void setiPayeService(IPayeLoyerService iPayeService) {
        this.iPayeService = iPayeService;
    }

    
    
    
    
     public PayeLoyer create () throws ServiceException{
       paye.setDatePaye(date);
       return iPayeService.create(paye);
    }
     
     
    public PayeLoyer update() throws ServiceException{
       return iPayeService.update(paye);
    }
    
    
    public PayeLoyer findById() throws ServiceException{
       return iPayeService.findById(paye.getId());
    }
    
    
    public List<PayeLoyer> findAll() throws ServiceException{
       return iPayeService.findAll();
    }
    
    
}
