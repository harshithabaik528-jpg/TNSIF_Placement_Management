package com.tns.placementmanagement.repository;

import com.tns.placementmanagement.entity.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College, Long> {
}