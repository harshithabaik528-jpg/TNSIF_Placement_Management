package com.tns.placementmanagement.controller;

import com.tns.placementmanagement.entity.College;
import com.tns.placementmanagement.service.ICollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/college")
public class CollegeController {

    @Autowired
    private ICollegeService collegeService;

    @PostMapping
    public ResponseEntity<College> addCollege(@RequestBody College college) {
        return ResponseEntity.ok(collegeService.addCollege(college));
    }

    @PutMapping
    public ResponseEntity<College> updateCollege(@RequestBody College college) {
        return ResponseEntity.ok(collegeService.updateCollege(college));
    }

    @GetMapping("/{id}")
    public ResponseEntity<College> searchCollege(@PathVariable long id) {
        return ResponseEntity.ok(collegeService.searchCollege(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteCollege(@PathVariable long id) {
        return ResponseEntity.ok(collegeService.deleteCollege(id));
    }
}