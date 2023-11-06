package com.harsh.sbet.landon.roomwebapp.controllers;

import com.harsh.sbet.landon.roomwebapp.models.Staff;
import com.harsh.sbet.landon.roomwebapp.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/staff")
public class StaffRestController {
    @Autowired
    public StaffService staffService;

    @GetMapping
    public List<Staff> getAllStaff(){
        return staffService.getAllStaff();
    }
}
