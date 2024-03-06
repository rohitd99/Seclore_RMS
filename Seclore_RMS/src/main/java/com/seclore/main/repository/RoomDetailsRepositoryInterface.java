package com.seclore.main.repository;

import java.util.List;

import com.seclore.main.domain.RoomDetails;

public interface RoomDetailsRepositoryInterface {

	public boolean addNewRoom(RoomDetails roomDetails);

	public boolean updateRoom(RoomDetails roomDetails);

	public RoomDetails getOneRoomDetails(int roomId);

	public List<RoomDetails> getAllRoomDetails();

	public List<RoomDetails> getRoomsByNameLike(String pattern);
	
	public List<RoomDetails> getAvailableRoomsWithCondition(RoomDetails roomDetails);
}
