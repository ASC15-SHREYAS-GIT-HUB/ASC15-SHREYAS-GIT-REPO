package com.demo.labs.lab2.Problem1;

public class MeetingRoom {
    private String meetingRoomId;
    private byte capacity;
    private String floorLocation;

    public MeetingRoom(String meetingRoomId, byte capacity, String floorLocation) {
        this.meetingRoomId = meetingRoomId;
        this.capacity = capacity;
        this.floorLocation = floorLocation;
    }

    // Getters
    public String getMeetingRoomId() {
        return meetingRoomId;
    }

    public byte getCapacity() {
        return capacity;
    }

    public String getFloorLocation() {
        return floorLocation;
    }

    // Setters
    public void setMeetingRoomId(String meetingRoomId) {
        this.meetingRoomId = meetingRoomId;
    }

    public void setCapacity(byte capacity) {
        this.capacity = capacity;
    }

    public void setFloorLocation(String floorLocation) {
        this.floorLocation = floorLocation;
    }

    @Override
    public String toString() {
        return "Meeting Room ID: " + meetingRoomId +
                ", Capacity: " + capacity +
                ", Floor: " + floorLocation;
    }
}