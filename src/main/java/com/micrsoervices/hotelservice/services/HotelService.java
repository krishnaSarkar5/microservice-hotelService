package com.micrsoervices.hotelservice.services;

import com.micrsoervices.hotelservice.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel saveHotel(Hotel hotel);

    Hotel getHotel(String hotelId);

    List<Hotel> getAllHotels();

    List<Hotel> getAllHotelsByIdList(List<String> idList);
}
