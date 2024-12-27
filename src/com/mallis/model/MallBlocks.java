package com.mallis.model;

/**
 *
 * @author Anup Wagle 23048623
 */
public class MallBlocks {
    private int spaceID;
    private int customerID;
    private String customerName;
    private int flatNumber;
    private int monthlyPrice;
    private int rentalMonths;
    private double fullPrice;
    private boolean available;

    public MallBlocks(int spaceID, int customerID, String customerName, int flatNumber, int monthlyPrice, int rentalMonths) {
        this.spaceID = spaceID;
        this.customerID = customerID;
        this.customerName = customerName;
        this.flatNumber = flatNumber;
        this.monthlyPrice = monthlyPrice;
        this.rentalMonths = rentalMonths;
        this.fullPrice = monthlyPrice * rentalMonths;
        this.available = true;
    }

    // Getters and Setters...

    public int getSpaceID() {
        return spaceID;
    }

    public void setSpaceID(int spaceID) {
        this.spaceID = spaceID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(int flatNumber) {
        this.flatNumber = flatNumber;
    }

    public int getMonthlyPrice() {
        return monthlyPrice;
    }

    public void setMonthlyPrice(int monthlyPrice) {
        this.monthlyPrice = monthlyPrice;
        this.fullPrice = monthlyPrice * rentalMonths;
    }

    public int getRentalMonths() {
        return rentalMonths;
    }

    public void setRentalMonths(int rentalMonths) {
        this.rentalMonths = rentalMonths;
        this.fullPrice = monthlyPrice * rentalMonths;
    }

    public double getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailability(boolean available) {
        this.available = available;
    }
}