package com.harsh.sbet.landon.roomwebapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    private UUID id;
    private String first_name;
    private String last_name;
    private Position position;
}
