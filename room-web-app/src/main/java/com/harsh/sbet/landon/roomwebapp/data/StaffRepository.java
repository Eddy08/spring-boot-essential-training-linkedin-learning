package com.harsh.sbet.landon.roomwebapp.data;

import com.harsh.sbet.landon.roomwebapp.models.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StaffRepository extends JpaRepository<Staff, UUID> {
}
