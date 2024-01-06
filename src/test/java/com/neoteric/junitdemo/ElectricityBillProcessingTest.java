package com.neoteric.junitdemo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ElectricityBillProcessingTest {
    @Test
    public void generateElectricityBill100(){
        ElectricityBillProcess process =new ElectricityBillProcess();
        CustomerElectricityBill customerElectricityBill = new CustomerElectricityBill("123","Sasank","abc","12/f/45g",200,100);
        ElectriCityBill electriCityBill= process.generateBill(customerElectricityBill);
        Assertions.assertNotNull(electriCityBill);
        Assertions.assertEquals(100,electriCityBill.getAmount());

    }
    @Test
    public void generateElectricityBill200(){
        ElectricityBillProcess process =new ElectricityBillProcess();
        CustomerElectricityBill customerElectricityBill = new CustomerElectricityBill("123","Sasank","abc","12/f/45g",300,100);
        ElectriCityBill electriCityBill= process.generateBill(customerElectricityBill);
        Assertions.assertNotNull(electriCityBill);
        Assertions.assertEquals(400,electriCityBill.getAmount());

    }
    @Test
    public void generateElectricityBill300(){
        ElectricityBillProcess process =new ElectricityBillProcess();
        CustomerElectricityBill customerElectricityBill = new CustomerElectricityBill("123","Sasank","abc","12/f/45g",400,100);
        ElectriCityBill electriCityBill= process.generateBill(customerElectricityBill);
        Assertions.assertNotNull(electriCityBill);
        Assertions.assertEquals(900,electriCityBill.getAmount());

    }
}
