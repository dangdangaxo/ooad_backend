package com.vlu.bokkit.service.impl;

import com.vlu.bokkit.dto.CreateRoomDTO;
import com.vlu.bokkit.dto.RoomDTO;
import com.vlu.bokkit.entity.Hotel;
import com.vlu.bokkit.entity.Room;
import com.vlu.bokkit.entity.enumClass.RoomAction;
import com.vlu.bokkit.entity.enumClass.RoomStatus;
import com.vlu.bokkit.entity.enumClass.Star;
import com.vlu.bokkit.repository.HotelRepository;
import com.vlu.bokkit.repository.RoomRepository;
import com.vlu.bokkit.service.RoomService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    private final RoomRepository roomRepository;
    private final HotelRepository hotelRepository;


    public RoomServiceImpl(RoomRepository roomRepository, HotelRepository hotelRepository) {
        this.roomRepository = roomRepository;
        this.hotelRepository = hotelRepository;
    }
    
//    public RoomDTO addNewRoom(RoomDTO roomDTO) {
//        if (Room.getComment() == null || Room.getComment() == null)
//        {
//            throw new RoomCommentAndStarNoValue();
//        }
//        roomRepository.save(convertRoomDTOtoEntity(roomDTO));
//        return roomDTO;
//    }

    public RoomDTO updateRoom (RoomDTO newRoom, Long id)
    {
        Room room = (Room) roomRepository.findById(id).get();
//        if (Room == null)
//        {
//            throw new RoomNotFoundException(id);
//        }
//        if (newRoom.getStar() == null || newRoom.getComment() == null)
//        {
//            throw new RoomCommentAndStarNoValue();
//        }
//        room.setRoomComment(newRoom.getRoomComment());
//        room.setRoomStar(newRoom.getRoomStar());

        roomRepository.save(room);
        return convertRoomToDTO(room);
    }
    @Override
    public List<Room> getAllRoom()
    {
        return roomRepository.findAll();
    }

    @Override
    public RoomDTO createRoom(CreateRoomDTO dto) {
        Hotel hotel = hotelRepository.findById(dto.getHotelId()).get();

        Room newRoom = Room.builder()
                .hotelId(hotel)
                .roomStatus(RoomStatus.AVAILABLE)
                .roomAction(RoomAction.CANCEL_BOOK)
                .roomType(dto.getRoomType())
                .priceByDay(dto.getPriceByDay())
                .priceByHour(dto.getPriceByHour())
                .priceByNight(dto.getPriceByNight())
                .roomNumber(dto.getRoomNumber())
                .build();
        Room createdRoom = roomRepository.save(newRoom);
        return RoomDTO.builder()
                .roomID(createdRoom.getId())
                .roomStatus(createdRoom.getRoomStatus())
                .roomType(createdRoom.getRoomType())
                .roomAction(createdRoom.getRoomAction())
                .priceByDay(createdRoom.getPriceByDay())
                .priceByHour(createdRoom.getPriceByHour())
                .priceByNight(createdRoom.getPriceByNight())
                .roomNumber(createdRoom.getRoomNumber())
                .build();
    }

    public void deleteRoom(Long id)
    {
        if (!roomRepository.existsById(id))
        {
//            throw new RoomNotFoundException(id);
        }
        roomRepository.deleteById(id);
    }
    private RoomDTO convertRoomToDTO(Room currentRoom)
    {
        RoomDTO roomDTO = new RoomDTO();
        return roomDTO.builder()
                .id(currentRoom.getId())
                .roomNumber(currentRoom.getRoomNumber())
                .roomStatus(currentRoom.getRoomStatus())
                .roomType(currentRoom.getRoomType())
                .roomAction(currentRoom.getRoomAction())
//                .roomID(currentRoom.getRoomID())
                .priceByDay(currentRoom.getPriceByDay())
                .priceByNight(currentRoom.getPriceByNight())
                .priceByHour(currentRoom.getPriceByHour())
                .build();

    }
//    private Room convertRoomDTOtoEntity(RoomDTO roomDTO)
//    {
//        Room room = new Room();
//        BeanUtils.copyProperties(roomDTO, room);
//        return room;
//    }
}
