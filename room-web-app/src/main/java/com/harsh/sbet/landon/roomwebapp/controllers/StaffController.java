package com.harsh.sbet.landon.roomwebapp.controllers;

import com.harsh.sbet.landon.roomwebapp.services.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff")
public class StaffController {
    @Autowired

    public StaffService staffService;


    @GetMapping
    public String getAllStaff(Model model){
        model.addAttribute("staff",staffService.getAllStaff());
        return "staff";
    }
}
