package com.tns.placementmanagement.repository;

import com.tns.placementmanagement.entity.Placement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacementRepository extends JpaRepository<Placement, Long> {
}