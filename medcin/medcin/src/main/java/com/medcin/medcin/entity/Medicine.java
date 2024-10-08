package com.medcin.medcin.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String expDate;
    private Double Price;
    private int noOfQuantity;
    boolean available;

    public Medicine() {

    }

    public Medicine(Long id, String name, String expDate, Double price, int noOfQuantity, boolean available) {
        id = id;
        this.name = name;
        this.expDate = expDate;
        Price = price;
        this.noOfQuantity = noOfQuantity;
        this.available = available;
    }

    public Long getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public int getNoOfQuantity() {
        return noOfQuantity;
    }

    public void setNoOfQuantity(int noOfQuantity) {
        this.noOfQuantity = noOfQuantity;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Medicin{" +
                "Id=" + id +
                ", name='" + name + '\'' +
                ", expDate='" + expDate + '\'' +
                ", Price=" + Price +
                ", noOfQuantity=" + noOfQuantity +
                ", available=" + available +
                '}';
    }
}
