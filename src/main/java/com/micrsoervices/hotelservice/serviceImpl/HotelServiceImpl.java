package com.micrsoervices.hotelservice.serviceImpl;

import com.micrsoervices.hotelservice.entities.Hotel;
import com.micrsoervices.hotelservice.exception.ResourceNotFoundException;
import com.micrsoervices.hotelservice.repositories.HotelRepository;
import com.micrsoervices.hotelservice.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;


    @Override
    public Hotel saveHotel(Hotel hotel) {

        String id = UUID.randomUUID().toString();
        hotel.setHotelId(id);
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotel(String hotelId) {
        return hotelRepository.findById(hotelId).orElseThrow(()-> new ResourceNotFoundException("Hotel with not found with id "+hotelId));
    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public List<Hotel> getAllHotelsByIdList(List<String> idList) {
        return hotelRepository.findAllByHotelIdIn(idList);
    }
}
