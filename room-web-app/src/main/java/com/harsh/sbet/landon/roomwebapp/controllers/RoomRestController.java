package com.harsh.sbet.landon.roomwebapp.controllers;

import com.harsh.sbet.landon.roomwebapp.models.Room;
import com.harsh.sbet.landon.roomwebapp.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/room")
public class RoomRestController {
    @Autowired
    public RoomService roomService;

    @GetMapping
    public List<Room> getAllRooms(){
        return roomService.getAllRooms();
    }
}
