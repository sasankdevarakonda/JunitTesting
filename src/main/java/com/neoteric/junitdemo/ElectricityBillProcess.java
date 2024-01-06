package com.neoteric.junitdemo;

import java.util.Date;

public class ElectricityBillProcess {
    public ElectriCityBill generateBill(CustomerElectricityBill bill){

       int Units = bill.getCurrentUnits()- bill.getPreviousUnits();

       int currentCharges=0;

       if(Units==100){
           currentCharges =Units*1;
       }
        if(Units==200){
            currentCharges =Units*2;
        }
        if(Units==300){
            currentCharges =Units*3;
        }
        ElectriCityBill electriCityBill = new ElectriCityBill(bill.getCustId(),bill.getName(),bill.getHouseName(),bill.getFlatNo(),bill.getCurrentUnits(),currentCharges,new Date());
        return electriCityBill;
    }
}
