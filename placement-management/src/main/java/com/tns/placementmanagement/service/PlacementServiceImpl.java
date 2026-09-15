package com.tns.placementmanagement.service;

import com.tns.placementmanagement.entity.Placement;
import com.tns.placementmanagement.repository.PlacementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlacementServiceImpl implements IPlacementService {

    private final PlacementRepository placementRepository;

    @Autowired
    public PlacementServiceImpl(PlacementRepository placementRepository) {
        this.placementRepository = placementRepository;
    }

    @Override
    public Placement addPlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    @Override
    public Placement updatePlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    @Override
    public Placement searchPlacement(long id) {
        return placementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Placement not found with id: " + id));
    }

    @Override
    public boolean cancelPlacement(long id) {
        if (placementRepository.existsById(id)) {
            placementRepository.deleteById(id);
            return true;
        }
        return false;
    }
}