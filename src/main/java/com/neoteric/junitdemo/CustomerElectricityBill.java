package com.neoteric.junitdemo;

public class CustomerElectricityBill {
    private String custId;
    private String name;
    private String houseName;
    private String flatNo;
    private int currentUnits;
    private int previousUnits;

    public CustomerElectricityBill(String custId, String name, String houseName, String flatNo, int currentUnits,int previousUnits) {
        this.previousUnits=previousUnits;
        this.custId = custId;
        this.name = name;
        this.houseName = houseName;
        this.flatNo = flatNo;
        this.currentUnits = currentUnits;
    }


    @Override
    public String toString() {
        return "CustomerElectricityBill{" +
                "custId='" + custId + '\'' +
                ", name='" + name + '\'' +
                ", houseName='" + houseName + '\'' +
                ", flatNo='" + flatNo + '\'' +
                ", currentUnits=" + currentUnits +
                ", previousUnits=" + previousUnits +
                '}';
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

    public int getPreviousUnits() {
        return previousUnits;
    }
}

