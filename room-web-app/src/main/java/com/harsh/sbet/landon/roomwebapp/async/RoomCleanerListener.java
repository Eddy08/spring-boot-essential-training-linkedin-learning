package com.harsh.sbet.landon.roomwebapp.async;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.harsh.sbet.landon.roomwebapp.models.Room;
import com.harsh.sbet.landon.roomwebapp.services.RoomService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class RoomCleanerListener {
    private final ObjectMapper mapper;
    private final RoomService roomService;

    public void recieveMessage(String message){
        try{
            AsyncPayload payload=mapper.readValue(message, AsyncPayload.class);
            if("ROOM".equals(payload.getModel())){
                Room room=roomService.getById(payload.getId());
                log.info("Room {}:{} needs to be cleaned",room.getNumber(),room.getName());

            }
            else{
                log.warn("Unknown model type");
            }
        }
        catch (JsonProcessingException e){
            log.error(e.getMessage());
            e.printStackTrace();
        }
    }
}
