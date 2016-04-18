/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.ServiceInter;

import com.mycompany.loyer.Data.AdminLoyer;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author oumarou
 */
@Transactional
public interface IAdminService {
    
     public AdminLoyer create (AdminLoyer admin) throws ServiceException;
    public AdminLoyer update(AdminLoyer admin) throws ServiceException;
    public AdminLoyer findById(Long id) throws ServiceException;
    public List<AdminLoyer> findAll() throws ServiceException;
    
    
}
