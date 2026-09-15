package com.tns.placementmanagement.service;

import com.tns.placementmanagement.entity.College;

public interface ICollegeService {
    College addCollege(College college);
    College updateCollege(College college);
    College searchCollege(long id);
    boolean deleteCollege(long id);
}