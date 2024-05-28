package com.example.nxtstayz.repository;

import com.example.nxtstayz.model.Hotel;
import com.example.nxtstayz.model.Room;

import java.util.ArrayList;

public interface RoomRepository {
    ArrayList<Room> getRooms();
    Room getRoomsById(int roomId);
    Room addRoom(Room room);
    Room updateRoom(int roomId, Room room);
    void deleteRoom(int roomId);
    Hotel getRoomHotel(int roomId);
}
