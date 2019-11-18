package com.example.scrapvend.Models;

public class PickupinfoModel {
    String username;
    String pickupPersonName;
    String userId;
    String bookingId;
    String pickupStatus;
    String pickupPersonId;
    String scheduleTime;
    String schuduleDate;
    String pickupDate;
    String pickupTime;
    String bookedDate;
    String bookedTime;
    String location;
    String Address;

    public PickupinfoModel() {
    }

    public PickupinfoModel(String username, String pickupPersonName, String userId, String bookingId, String pickupStatus, String pickupPersonId, String scheduleTime, String schuduleDate, String pickupDate, String pickupTime, String bookedDate, String bookedTime, String location, String address) {
        this.username = username;
        this.pickupPersonName = pickupPersonName;
        this.userId = userId;
        this.bookingId = bookingId;
        this.pickupStatus = pickupStatus;
        this.pickupPersonId = pickupPersonId;
        this.scheduleTime = scheduleTime;
        this.schuduleDate = schuduleDate;
        this.pickupDate = pickupDate;
        this.pickupTime = pickupTime;
        this.bookedDate = bookedDate;
        this.bookedTime = bookedTime;
        this.location = location;
        Address = address;
    }

    public PickupinfoModel(String username, String pickupPersonName, String schuduleDate, String location) {
        this.username = username;
        this.pickupPersonName = pickupPersonName;
        this.schuduleDate = schuduleDate;
        this.location = location;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPickupPersonName() {
        return pickupPersonName;
    }

    public void setPickupPersonName(String pickupPersonName) {
        this.pickupPersonName = pickupPersonName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getPickupStatus() {
        return pickupStatus;
    }

    public void setPickupStatus(String pickupStatus) {
        this.pickupStatus = pickupStatus;
    }

    public String getPickupPersonId() {
        return pickupPersonId;
    }

    public void setPickupPersonId(String pickupPersonId) {
        this.pickupPersonId = pickupPersonId;
    }

    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public String getSchuduleDate() {
        return schuduleDate;
    }

    public void setSchuduleDate(String schuduleDate) {
        this.schuduleDate = schuduleDate;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getPickupTime() {
        return pickupTime;
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getBookedDate() {
        return bookedDate;
    }

    public void setBookedDate(String bookedDate) {
        this.bookedDate = bookedDate;
    }

    public String getBookedTime() {
        return bookedTime;
    }

    public void setBookedTime(String bookedTime) {
        this.bookedTime = bookedTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}