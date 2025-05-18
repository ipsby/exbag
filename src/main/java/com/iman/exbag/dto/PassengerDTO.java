package com.iman.exbag.dto;

import lombok.Data;

@Data
public class PassengerDTO {
    String name;
    String nik;
    String ktp;
    String phone;
    String booking_id;
    String flight_number;
    String  route;
    String departure_date;
    String  free_baggage;
    String actual_weight;
    String   excess_weight;
    String excess_charge;
    Long pax_id;
}
