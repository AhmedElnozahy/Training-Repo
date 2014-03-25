package com.abdelrazik.dao;

import com.pearlox.framework.dao.BasicDao;
import com.abdelrazik.domain.SampleObject;

/**
 * User: Andrew
 * Date: 6/18/13
 */
public interface SampleObjectDao extends BasicDao<SampleObject> {
    
    public SampleObject findById2(Long id);
}
