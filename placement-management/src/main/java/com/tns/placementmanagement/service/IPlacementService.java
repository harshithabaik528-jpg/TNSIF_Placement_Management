package com.tns.placementmanagement.service;

import com.tns.placementmanagement.entity.Placement;

public interface IPlacementService {
    Placement addPlacement(Placement placement);
    Placement updatePlacement(Placement placement);
    Placement searchPlacement(long id);
    boolean cancelPlacement(long id);
}