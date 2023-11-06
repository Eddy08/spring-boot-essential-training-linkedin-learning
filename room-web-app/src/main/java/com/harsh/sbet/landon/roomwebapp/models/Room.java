package com.harsh.sbet.landon.roomwebapp.models;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "ROOM")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Room {
    @Id
    @Column(name="ROOM_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="ROOM_NUMBER")
    private String number;
    @Column(name="NAME")
    private String name;
    @Column(name="BED_INFO")
    private String info;
}
