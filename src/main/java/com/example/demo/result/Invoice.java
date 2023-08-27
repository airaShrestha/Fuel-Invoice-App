package com.example.demo.result;

import java.util.Date;

public class Invoice {

    private Date date;
    private double pricePerGallon;
    private double noOfGallonsToBeFilled;

    private double totalPrice;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPricePerGallon() {
        return pricePerGallon;
    }

    public void setPricePerGallon(double pricePerGallon) {
        this.pricePerGallon = pricePerGallon;
    }

    public double getNoOfGallonsToBeFilled() {
        return noOfGallonsToBeFilled;
    }

    public void setNoOfGallonsToBeFilled(double noOfGallonsToBeFilled) {
        this.noOfGallonsToBeFilled = noOfGallonsToBeFilled;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "CalculateAmount Details:\nInvoice{" +
                "date=" + date +
                ", pricePerGallon=" + pricePerGallon +
                ", noOfGallonsToBeFilled=" + noOfGallonsToBeFilled +
                ", totalPrice=" + totalPrice +
                '}';
    }
}

