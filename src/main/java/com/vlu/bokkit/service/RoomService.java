package com.vlu.bokkit.service;

import com.vlu.bokkit.dto.CreateRoomDTO;
import com.vlu.bokkit.dto.RoomDTO;
import com.vlu.bokkit.entity.Room;

import java.util.List;

public interface RoomService {
    List<Room> getAllRoom();
    RoomDTO createRoom(CreateRoomDTO dto);

}
