package com.neoteric.junitdemo;

import java.util.Date;

public class ElectriCityBill {
    private String custId;
    private String name;
    private String houseName;
    private String flatNo;
    private int currentUnits;
    private  int amount;
    private Date month;

    public ElectriCityBill(String custId, String name, String houseName, String flatNo, int currentUnits, int amount, Date month) {
        this.custId = custId;
        this.name = name;
        this.houseName = houseName;
        this.flatNo = flatNo;
        this.currentUnits = currentUnits;
        this.amount = amount;
        this.month = month;
    }
    public int getAmount(){
        return amount;

    }

    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getHouseName() {
        return houseName;
    }

    public String getFlatNo() {
        return flatNo;
    }

    public int getCurrentUnits() {
        return currentUnits;
    }

    public Date getMonth() {
        return month;
    }
}
