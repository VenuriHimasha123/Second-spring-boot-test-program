package edu.icet.demo.controller;

import edu.icet.demo.service.CityService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@CrossOrigin
public class CityController {


    @GetMapping("/get-city/{postalCode}")
    public HashMap getCity(@PathVariable String postalCode){
        System.out.println("Request Recived");
        System.out.println(postalCode);

        CityService service = new CityService();

        HashMap response = new HashMap();
        response.put("city", service.getCityByPostalCode(postalCode));

        return response;
    }
}
