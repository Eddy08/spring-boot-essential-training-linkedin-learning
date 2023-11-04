package com.harsh.sbet.landon.roomwebapp.services;

import com.harsh.sbet.landon.roomwebapp.models.Position;
import com.harsh.sbet.landon.roomwebapp.models.Staff;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {
    public static final List<Staff> staff = new ArrayList<>();

 static{
    staff.add(new Staff(UUID.randomUUID(),"Adams", "Martin", Position.SECURITY));
    staff.add(new Staff(UUID.randomUUID(),"Alvarez", "Roger", Position.FRONT_DESK));
    staff.add(new Staff(UUID.randomUUID(),"Alvarez", "Anne", Position.HOUSEKEEPING));
    staff.add(new Staff(UUID.randomUUID(),"Alvarez", "Ann", Position.CONCIERGE));
    staff.add(new Staff(UUID.randomUUID(),"Anderson", "Betty", Position.HOUSEKEEPING));
 }
 public List<Staff> getAllStaff(){
     return staff;
 }
}
