package com.medcin.medcin.entity;

import jakarta.persistence.*;


import java.time.LocalDate;
@Entity
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int medicineId;
    private String medicineName;
    private int quantitySold;
    private double pricePerUnit;
    private double totalPrice;
   // private String customerName;
   // private String customerPhoneNumber;
    private LocalDate saleDate;

//    @ManyToOne
//    @JoinColumn(name = "medicine_id") // This will create a foreign key column "medicine_id" in the Billing table
//    private Medicine medicine;

    public Billing(){}

    public Billing(int id, int medicineId, String medicineName, int quantitySold, double pricePerUnit, double totalPrice, String customerName, String customerPhoneNumber, LocalDate saleDate) {
        this.id = id;
        this.medicineId = medicineId;
        this.medicineName = medicineName;
        this.quantitySold = quantitySold;
        this.pricePerUnit = pricePerUnit;
        this.totalPrice = totalPrice;
//        this.customerName = customerName;
//        this.customerPhoneNumber = customerPhoneNumber;
        this.saleDate = saleDate;
    }

    public Billing(Long id, String name, int quantitySold, double pricePerUnit, Double totalPrice, LocalDate now) {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

//    public String getCustomerName() {
//        return customerName;
//    }
//
//    public void setCustomerName(String customerName) {
//        this.customerName = customerName;
//    }
//
//    public String getCustomerPhoneNumber() {
//        return customerPhoneNumber;
//    }
//
//    public void setCustomerPhoneNumber(String customerPhoneNumber) {
//        this.customerPhoneNumber = customerPhoneNumber;
//    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public String toString() {
        return "Billing{" +
                "id=" + id +
                ", medicineId=" + medicineId +
                ", medicineName='" + medicineName + '\'' +
                ", quantitySold=" + quantitySold +
                ", pricePerUnit=" + pricePerUnit +
                ", totalPrice=" + totalPrice +
//                ", customerName='" + customerName + '\'' +
//                ", customerPhoneNumber='" + customerPhoneNumber + '\'' +
                ", saleDate=" + saleDate +
                '}';
    }
}
