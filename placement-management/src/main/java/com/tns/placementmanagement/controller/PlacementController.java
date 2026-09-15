package com.tns.placementmanagement.controller;

import com.tns.placementmanagement.entity.Placement;
import com.tns.placementmanagement.service.IPlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/placement")
public class PlacementController {

    @Autowired
    private IPlacementService placementService;

    @PostMapping
    public ResponseEntity<Placement> addPlacement(@RequestBody Placement placement) {
        return ResponseEntity.ok(placementService.addPlacement(placement));
    }

    @PutMapping
    public ResponseEntity<Placement> updatePlacement(@RequestBody Placement placement) {
        return ResponseEntity.ok(placementService.updatePlacement(placement));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Placement> searchPlacement(@PathVariable long id) {
        return ResponseEntity.ok(placementService.searchPlacement(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> cancelPlacement(@PathVariable long id) {
        return ResponseEntity.ok(placementService.cancelPlacement(id));
    }
}