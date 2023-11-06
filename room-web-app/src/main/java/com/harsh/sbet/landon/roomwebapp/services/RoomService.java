package com.harsh.sbet.landon.roomwebapp.services;

import com.harsh.sbet.landon.roomwebapp.data.RoomRepository;
import com.harsh.sbet.landon.roomwebapp.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    /* Static Way
    private static final List<Room> rooms= new ArrayList<>();

    static{
        for(long i=0;i<10;i++) rooms.add(new Room(i,"Room "+i,"R"+1,"Q"));
    }

    public List<Room> getAllRooms() {
        return rooms;
    }

     */

    @Autowired
    public RoomRepository roomRepository;
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

}
