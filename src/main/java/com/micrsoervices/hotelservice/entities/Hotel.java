package com.micrsoervices.hotelservice.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Hotel {

    @Id
    private String hotelId;

    private String name;

    private String location;

    private String about;
}
