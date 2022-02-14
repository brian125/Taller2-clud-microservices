package com.cloud.booking.dto;

import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;

@Data
public class MovieDto {

    private Long id;
    @NotBlank(message = "El titulo no puede estar en blanco")
    private String tittle;
    @NotBlank(message = "El director no puede estar en blanco")
    private String director;
    @Range(min = 1,max = 5)
    private Integer rating;
}
