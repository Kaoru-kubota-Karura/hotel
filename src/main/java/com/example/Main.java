package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Employee Brad = new Employee ("a", 1234, 100, "unknown", 50, "Brad", 80);
        Hotel pitbullHotel = new Hotel("APCSA");
        Room regularRoom = new Room(2, 600, false);
        Room economyRoom = new Room(2, 300, false);
        Room deluxeRoom = new Room(2, 800, false);
        ArrayList<Room> roomList = new ArrayList<Room>();

        pitbullHotel.addEmployee(Brad);
        System.out.println(Brad.getName());
        System.out.println(Brad.getId());
        System.out.println(Brad.getHeight());

        roomList.add(economyRoom);
        roomList.add(regularRoom);
        roomList.add(deluxeRoom);
        pitbullHotel.setRoomList(roomList);
        pitbullHotel.checker = true;
        ArrayList<Guest> guestsForBooking = new ArrayList<Guest>();
        Guest kaoru = new Guest(16, true, 16, "Men", 170, "Kaoru", 70);
        guestsForBooking.add(kaoru);
        boolean booking_possible = pitbullHotel.book(guestsForBooking,400);
        for (Room room: pitbullHotel.getList()){
            System.out.println(room.getOccupied());
            for (Guest guest: room.getGuest_List()){
                System.out.println(guest.getName());
            }

        }
        // if (pitbullHotel.checker == false){
        //     System.out.println("The hotel does not have enough rooms to accommodate guests. \nPlease try to rebook at one of the following hotels in the vicinity.");
        // }else{
        // System.out.println(order);    
        // for(Room room: order){
        //     System.out.println(room.getPrice());
        // }
        // }
    }    
}