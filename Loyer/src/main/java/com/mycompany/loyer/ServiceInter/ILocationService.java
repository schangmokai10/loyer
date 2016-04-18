/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.loyer.ServiceInter;

import com.mycompany.loyer.Data.Location;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author oumarou
 */
@Transactional
public interface ILocationService {
    
    
    public Location create (Location oLocation) throws ServiceException;
    public Location update(Location oLocation) throws ServiceException;
    public Location findById(Long id) throws ServiceException;
    public List<Location> findAll() throws ServiceException;
    
    
    
}
