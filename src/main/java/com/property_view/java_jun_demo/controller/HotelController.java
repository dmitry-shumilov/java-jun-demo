package com.property_view.java_jun_demo.controller;

import com.property_view.java_jun_demo.model.HotelResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HotelController {

    @GetMapping("/hotels")
    public List<HotelResponse> getHotels() {
        return List.of();
    }
}
