package com.demo.labs.lab2;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

class MeetingRoomApp {

    // Base class
    static class MeetingRoom {
        private String roomId;
        private int capacity;
        private int floor;

        public MeetingRoom(String roomId, int capacity, int floor) {
            this.roomId = roomId;
            this.capacity = capacity;
            this.floor = floor;
        }

        public String getRoomId() { return roomId; }
        public int getCapacity() { return capacity; }
        public int getFloor() { return floor; }

        @Override
        public String toString() {
            return "Room ID: " + roomId + ", Capacity: " + capacity + ", Floor: " + floor;
        }
    }

    // Subclass for Zoom rooms
    static class ZoomMeetingRoom extends MeetingRoom {
        private String zoomDeviceId;
        private String zoomAccountId;

        public ZoomMeetingRoom(String roomId, int capacity, int floor, String zoomDeviceId, String zoomAccountId) {
            super(roomId, capacity, floor);
            this.zoomDeviceId = zoomDeviceId;
            this.zoomAccountId = zoomAccountId;
        }

        public String getZoomDeviceId() { return zoomDeviceId; }
        public String getZoomAccountId() { return zoomAccountId; }

        @Override
        public String toString() {
            return super.toString() + ", Zoom Device ID: " + zoomDeviceId + ", Zoom Account ID: " + zoomAccountId;
        }
    }

    // Employee class
    static class Employee {
        private String employeeId;

        public Employee(String employeeId) {
            this.employeeId = employeeId;
        }

        public String getEmployeeId() {
            return employeeId;
        }
    }

    // Booking class
    static class Booking {
        private String bookingId;
        private MeetingRoom meetingRoom;
        private Employee employee;
        private LocalDate date;
        private LocalTime startTime;
        private Duration duration;

        public Booking(String bookingId, MeetingRoom meetingRoom, Employee employee,
                       LocalDate date, LocalTime startTime, Duration duration) {
            this.bookingId = bookingId;
            this.meetingRoom = meetingRoom;
            this.employee = employee;
            this.date = date;
            this.startTime = startTime;
            this.duration = duration;
        }

        public LocalDate getDate() { return date; }
        public MeetingRoom getMeetingRoom() { return meetingRoom; }

        public boolean overlapsWith(Booking other) {
            if (!this.date.equals(other.date)) return false;
            LocalTime endThis = this.startTime.plus(this.duration);
            LocalTime endOther = other.startTime.plus(other.duration);
            return !(endThis.isBefore(other.startTime) || endOther.isBefore(this.startTime));
        }

        @Override
        public String toString() {
            return "Booking ID: " + bookingId +
                    ", Room: " + meetingRoom.getRoomId() +
                    ", Employee: " + employee.getEmployeeId() +
                    ", Date: " + date +
                    ", Start: " + startTime +
                    ", Duration: " + duration.toMinutes() + " minutes";
        }
    }

    // Manager class
    static class MeetingRoomManager {
        private List<MeetingRoom> meetingRooms = new ArrayList<>();
        private List<Booking> bookings = new ArrayList<>();

        public void addMeetingRoom(MeetingRoom room) {
            meetingRooms.add(room);
        }

        public boolean bookRoom(String employeeId, String roomId, LocalDate date,
                                LocalTime time, Duration duration) {
            MeetingRoom room = meetingRooms.stream()
                    .filter(r -> r.getRoomId().equals(roomId))
                    .findFirst()
                    .orElse(null);

            if (room == null) return false;

            Employee employee = new Employee(employeeId);
            Booking newBooking = new Booking(UUID.randomUUID().toString(), room, employee, date, time, duration);

            for (Booking existing : bookings) {
                if (existing.getMeetingRoom().getRoomId().equals(roomId) && existing.overlapsWith(newBooking)) {
                    return false; // conflict
                }
            }

            bookings.add(newBooking);
            return true;
        }

        public List<Booking> getBookingsByDate(LocalDate date) {
            List<Booking> result = new ArrayList<>();
            for (Booking b : bookings) {
                if (b.getDate().equals(date)) {
                    result.add(b);
                }
            }
            return result;
        }

        public void printAllRooms() {
            System.out.println("Meeting Rooms:");
            for (MeetingRoom room : meetingRooms) {
                System.out.println(room);
            }
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        MeetingRoomManager manager = new MeetingRoomManager();

        // Add rooms
        manager.addMeetingRoom(new MeetingRoom("R101", 10, 1));
        manager.addMeetingRoom(new ZoomMeetingRoom("Z201", 20, 2, "ZD123", "acc789"));

        // Print rooms
        manager.printAllRooms();

        // Bookings
        LocalDate meetingDate = LocalDate.of(2025, 7, 15);
        LocalTime startTime = LocalTime.of(10, 0);
        Duration duration = Duration.ofMinutes(60);

        boolean booked1 = manager.bookRoom("EMP001", "R101", meetingDate, startTime, duration);
        boolean booked2 = manager.bookRoom("EMP002", "R101", meetingDate, LocalTime.of(11, 0), Duration.ofMinutes(30));
        boolean booked3 = manager.bookRoom("EMP003", "R101", meetingDate, LocalTime.of(10, 30), Duration.ofMinutes(45)); // should fail

        System.out.println("\nBookings for " + meetingDate + ":");
        for (Booking b : manager.getBookingsByDate(meetingDate)) {
            System.out.println(b);
        }

        System.out.println("\nBooking Results:");
        System.out.println("Booking 1 successful? " + booked1);
        System.out.println("Booking 2 successful? " + booked2);
        System.out.println("Booking 3 successful? " + booked3);
    }
}
