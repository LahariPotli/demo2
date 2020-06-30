package com.example.hotel.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;

import com.example.hotel.Enum.StatusType;

@Entity
public class RoomStatus {
	@Id
	private int roomStatusId;
	@Enumerated(value = EnumType.STRING)
	private StatusType status;
	private LocalDate date;

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public int getRoomStatusId() {
		return roomStatusId;
	}

	public void setRoomStatusId(int roomStatusId) {
		this.roomStatusId = roomStatusId;
	}

	@Override
	public String toString() {
		return "RoomStatus [roomStatusId=" + roomStatusId + ", status=" + status + ", date=" + date + "]";
	}
}
