package com.harsh.sbet.landon.roomwebapp.models;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room {

    private long id;
    private String number;
    private String name;
    private String info;
}
