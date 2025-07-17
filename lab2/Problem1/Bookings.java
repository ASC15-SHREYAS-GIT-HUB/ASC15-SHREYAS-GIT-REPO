package com.demo.labs.lab2.Problem1;

import java.util.ArrayList;
import java.util.List;

public class Bookings {
    private List<Booking> bookings;
    private List<MeetingRoom> meetingRooms;

    public Bookings() {
        bookings = new ArrayList<>();
        meetingRooms = new ArrayList<>();
    }

    public void addMeetingRoom(MeetingRoom room) {
        meetingRooms.add(room);
    }

    public void addBooking(Booking booking) {
        // Validate meetingRoomId exists
        boolean roomExists = meetingRooms.stream()
                .anyMatch(room -> room.getMeetingRoomId().equals(booking.getMeetingRoomId()));
        if (!roomExists) {
            throw new IllegalArgumentException("Invalid meeting room ID: " + booking.getMeetingRoomId());
        }
        bookings.add(booking);
    }

    public List<Booking> getAllBookings() {
        return new ArrayList<>(bookings); // Return a copy to prevent external modification
    }

    public List<Booking> getBookingsByDate(String date) {
        List<Booking> dateBookings = new ArrayList<>();
        for (Booking booking : bookings) {
            if (booking.getMeetingDate().equals(date)) {
                dateBookings.add(booking);
            }
        }
        return dateBookings;
    }

    // Helper method to get MeetingRoom by ID
    public MeetingRoom getMeetingRoomById(String meetingRoomId) {
        for (MeetingRoom room : meetingRooms) {
            if (room.getMeetingRoomId().equals(meetingRoomId)) {
                return room;
            }
        }
        return null; // Should not happen if addBooking validates
    }
}