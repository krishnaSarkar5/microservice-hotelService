package com.micrsoervices.hotelservice.controller;

import com.micrsoervices.hotelservice.dto.GetAllHotelByIdDto;
import com.micrsoervices.hotelservice.entities.Hotel;
import com.micrsoervices.hotelservice.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        Hotel saveHotel = hotelService.saveHotel(hotel);
        return new ResponseEntity<Hotel>(saveHotel, HttpStatus.CREATED);
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getAHotel(@PathVariable String hotelId){
        Hotel saveHotel = hotelService.getHotel(hotelId);
        return new ResponseEntity<Hotel>(saveHotel, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel(){
        List<Hotel> saveHotel = hotelService.getAllHotels();
        return new ResponseEntity<List<Hotel>>(saveHotel, HttpStatus.OK);
    }


    @PostMapping("/get-all-by-id")
    public ResponseEntity<List<Hotel>> getAllHotelById(@RequestBody GetAllHotelByIdDto request){
        List<Hotel> saveHotel = hotelService.getAllHotelsByIdList(request.getIdList());
        return new ResponseEntity<List<Hotel>>(saveHotel, HttpStatus.OK);
    }
}
