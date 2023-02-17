package com.micrsoervices.hotelservice.dto;

import lombok.Data;

import java.util.List;

@Data
public class GetAllHotelByIdDto {
    List<String> idList;
}
