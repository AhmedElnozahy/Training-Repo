package com.abdelrazik.service.api;

import com.abdelrazik.domain.SampleObject;

/**
 * User: Andrew
 * Date: 6/20/13
 */
public interface TestService {
    
    public SampleObject getSampleObjectById(Long id) throws Exception;
}
