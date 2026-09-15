package com.tns.placementmanagement.service;

import com.tns.placementmanagement.entity.College;
import com.tns.placementmanagement.repository.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CollegeServiceImpl implements ICollegeService {

    private final CollegeRepository collegeRepository;

    @Autowired
    public CollegeServiceImpl(CollegeRepository collegeRepository) {
        this.collegeRepository = collegeRepository;
    }

    @Override
    public College addCollege(College college) {
        return collegeRepository.save(college);
    }

    @Override
    public College updateCollege(College college) {
        return collegeRepository.save(college);
    }

    @Override
    public College searchCollege(long id) {
        return collegeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("College not found with id: " + id));
    }

    @Override
    public boolean deleteCollege(long id) {
        if (collegeRepository.existsById(id)) {
            collegeRepository.deleteById(id);
            return true;
        }
        return false;
    }
}