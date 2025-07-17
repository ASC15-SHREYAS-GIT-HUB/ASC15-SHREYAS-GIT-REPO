package com.demo.labs.lab2.Problem1;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Meeting Room Application!");

        // Create some meeting rooms
        MeetingRoom mr1 = new MeetingRoom("MR001", (byte)10, "3rd Floor");
        ZoomMeetingRoom zmr1 = new ZoomMeetingRoom("MR002", (byte)15, "4th Floor", "DEV001", "ACC001");

        // Initialize bookings manager
        Bookings bookingsManager = new Bookings();

        // Add meeting rooms to bookings manager
        bookingsManager.addMeetingRoom(mr1);
        bookingsManager.addMeetingRoom(zmr1);

        // Create some bookings
        bookingsManager.addBooking(new Booking("E123", "MR001", "2025-07-15", "01:00 AM", "2 hours"));
        bookingsManager.addBooking(new Booking("E124", "MR002", "2025-07-15", "02:00 PM", "1 hour"));
        bookingsManager.addBooking(new Booking("E125", "MR001", "2025-07-16", "10:00 AM", "1.5 hours"));

        System.out.println("Bookings created successfully!");

        // Display all bookings with room details
        System.out.println("\nAll Bookings:");
        for (Booking booking : bookingsManager.getAllBookings()) {
            MeetingRoom room = bookingsManager.getMeetingRoomById(booking.getMeetingRoomId());
            System.out.println(booking + ", Capacity: " + (room != null ? room.getCapacity() : "Unknown") +
                    ", Floor: " + (room != null ? room.getFloorLocation() : "Unknown") +
                    (room instanceof ZoomMeetingRoom ? ", Zoom Device ID: " + ((ZoomMeetingRoom) room).getDeviceId() +
                            ", Zoom Account ID: " + ((ZoomMeetingRoom) room).getAccountId() : ""));
        }

        // Display bookings for a specific date with room details
        System.out.println("\nBookings for 2025-07-15:");
        for (Booking booking : bookingsManager.getBookingsByDate("2025-07-15")) {
            MeetingRoom room = bookingsManager.getMeetingRoomById(booking.getMeetingRoomId());
            System.out.println(booking + ", Capacity: " + (room != null ? room.getCapacity() : "Unknown") +
                    ", Floor: " + (room != null ? room.getFloorLocation() : "Unknown") +
                    (room instanceof ZoomMeetingRoom ? ", Zoom Device ID: " + ((ZoomMeetingRoom) room).getDeviceId() +
                            ", Zoom Account ID: " + ((ZoomMeetingRoom) room).getAccountId() : ""));
        }
    }
}