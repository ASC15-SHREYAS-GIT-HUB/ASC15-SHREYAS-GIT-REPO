package com.demo.labs.lab2.Problem1;

public class ZoomMeetingRoom extends MeetingRoom {
    private String deviceId;
    private String accountId;

    public ZoomMeetingRoom(String meetingRoomId, byte capacity, String floorLocation,
                           String deviceId, String accountId) {
        super(meetingRoomId, capacity, floorLocation);
        this.deviceId = deviceId;
        this.accountId = accountId;
    }

    // Getters
    public String getDeviceId() {
        return deviceId;
    }

    public String getAccountId() {
        return accountId;
    }

    // Setters
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Zoom Device ID: " + deviceId +
                ", Zoom Account ID: " + accountId;
    }
}