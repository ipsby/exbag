package com.iman.exbag.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ResponseData {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String responseCode;
}
