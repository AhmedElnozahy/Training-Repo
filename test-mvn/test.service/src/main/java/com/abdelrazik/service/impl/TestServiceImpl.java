package com.abdelrazik.service.impl;

import com.abdelrazik.dao.SampleObjectDao;
import com.abdelrazik.domain.SampleObject;
import com.abdelrazik.service.api.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: Andrew
 * Date: 6/20/13
 */
@Service
public class TestServiceImpl implements TestService {
    
    @Autowired
    private SampleObjectDao sampleObjectDao;
    
    @Override
    public SampleObject getSampleObjectById(Long id) throws Exception {
        return sampleObjectDao.findById2(id);
    }
}
