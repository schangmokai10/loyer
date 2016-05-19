/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.ServiceInter;

import com.mycompany.loyer.Data.PayeLoyer;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author oumarou
 */
@Transactional
public interface IPayeLoyerService {
    
     public PayeLoyer create (PayeLoyer paye) throws ServiceException;
    public PayeLoyer update(PayeLoyer paye) throws ServiceException;
    public PayeLoyer findById(Long id) throws ServiceException;
    public List<PayeLoyer> findAll() throws ServiceException;
    
}
