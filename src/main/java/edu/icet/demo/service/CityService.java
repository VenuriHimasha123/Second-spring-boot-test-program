package edu.icet.demo.service;

import java.util.HashMap;

public class CityService {

    public String getCityByPostalCode(String postalCode){
        HashMap<String,String> cityList  = new HashMap();
        cityList.put("10400","Moratuwa");
        cityList.put("20000", "Horana");
        cityList.put("3002","Kalutara");
        return cityList.get(postalCode);
    }
}

