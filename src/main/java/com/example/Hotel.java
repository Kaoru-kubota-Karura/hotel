package com.example;

import java.util.ArrayList;
// import java.util.List;

public class Hotel {
    private ArrayList<Room> roomList;
    private ArrayList<Employee> employeelist;
    private String name;
    public boolean checker;

    public Hotel(String name) {
        this.roomList = new ArrayList<Room>();
        this.employeelist = new ArrayList<Employee>();
        this.name = name;
    }

    public ArrayList<Room> getRooms() {
        return this.roomList;
    }

    public String getName() {
        return this.name;
        // this.rooms = new ArrayList<Room>();
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.roomList = rooms;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setRoomList(ArrayList<Room> newRoomList) {
        this.roomList = newRoomList;
    }

    public ArrayList<Employee> getEmployees() {
        return this.employeelist;
    }

    // addEmployee
    public void addEmployee(Employee employee) {
        this.employeelist.add(employee);
    }

    // removeEmployee
    public void removeEmployee(Employee employee) {
        this.employeelist.remove(employee);
    }

    public ArrayList<Room> getList() {
        return this.roomList;
    }

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public void removeRoom(Room room) {
        roomList.remove(room);
    }

    public boolean book(ArrayList<Guest> guests, double budget) {
        ArrayList<Room> available = new ArrayList<Room>();
        for (Room room : this.roomList) {
            if (room.getOccupied() == false) {
                available.add(room);
            }
        }
        for (int i = 0; i < available.size(); i++) {
            for (int j = 0; j < available.size() - 1 - i; j++) {
                if (available.get(j).getPrice() > available.get(j + 1).getPrice()) {
                    Room temp = available.get(j);
                    available.set(j, available.get(j + 1));
                    available.set(j + 1, temp);
                }
            }
        }
        int counter = 0;
        ArrayList<Room> roomsForBooking = new ArrayList<Room>();
        for (Room room : available) {
            if (counter >= guests.size()) {
                break;
            }
            roomsForBooking.add(room);
            counter += room.getOccupancy();
        }
        if (counter < guests.size()) {
            return false;
        }
        int totalPrice = 0;
        for (Room room : roomsForBooking) {
            totalPrice += room.getPrice();
            // for each room get the price and add to totalPrice
        }
        if (budget < totalPrice) {
            return false;
        }
        // check that budget is below roomsforbooking total price. if not return false

        // set rooms in roomsforbooking to occupied
        // for (Room room : roomsForBooking) {
        //     room.setOccupied(true);

        //     // take 2 guests forom guests arraylist
        //     for (int i = 0; i < room.getOccupancy(); i++) {
        //         room.addGuest(guests.get(i));
        //     }
        //     // add the guests to the room

        // }
        for (Room room : roomsForBooking) {
            room.setOccupied(true);
            int assignedGuests = 0;
        
            for (int i = 0; i < room.getOccupancy() && assignedGuests < guests.size(); i++) {
                room.addGuest(guests.get(assignedGuests));
                assignedGuests++;
            }
        }

        return true;

    }
}