package com.vlu.bokkit.controller;

import com.vlu.bokkit.dto.CreateRoomDTO;
import com.vlu.bokkit.dto.RoomDTO;
import com.vlu.bokkit.entity.Room;
import com.vlu.bokkit.service.impl.RoomServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("room")
public class RoomController {
    private final RoomServiceImpl roomService;

    @Autowired
    public RoomController(RoomServiceImpl roomService) {
        this.roomService = roomService;
    }

    @GetMapping("/getallroom")
    public List<Room> getAllRoom()
    {
        return roomService.getAllRoom();
    }

    @PutMapping("/updateroom/{id}")
    public RoomDTO updateHotel(@RequestBody RoomDTO newRoom, @PathVariable Long id)
    {
        return roomService.updateRoom(newRoom,id);
    }

    @DeleteMapping("/deleteroom/{id}")
    public String deleteHotel(@PathVariable Long id)
    {
        roomService.deleteRoom(id);
        return "Room with id: " + id + " has been removed";
    }

    @PostMapping
    public RoomDTO createRoom(@RequestBody CreateRoomDTO dto) {
        return roomService.createRoom(dto);
    }
}
