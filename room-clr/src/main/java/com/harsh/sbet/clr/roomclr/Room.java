package com.harsh.sbet.clr.roomclr;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Room {

    private long id;
    private String number;
    private String name;
    private String info;
}
