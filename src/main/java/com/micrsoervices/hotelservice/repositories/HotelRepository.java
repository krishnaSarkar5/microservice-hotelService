package com.micrsoervices.hotelservice.repositories;

import com.micrsoervices.hotelservice.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,String> {

    List<Hotel> findAllByHotelIdIn(List<String> hotelIdList);
}
