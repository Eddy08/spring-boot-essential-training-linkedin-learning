package com.harsh.sbet.landon.roomwebapp.services;

import com.harsh.sbet.landon.roomwebapp.models.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private static final List<Room> rooms= new ArrayList<>();

    static{
        for(long i=0;i<10;i++) rooms.add(new Room(i,"Room "+i,"R"+1,"Q"));
    }

    public static List<Room> getAllRooms() {
        return rooms;
    }
}
