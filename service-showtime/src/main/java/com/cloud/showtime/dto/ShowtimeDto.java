package com.cloud.showtime.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.sql.Date;

@Data
@NoArgsConstructor
public class ShowtimeDto {

    private Long id;

    @NotNull(message = "No puede estar vacia la fecha")
    private Date date;

    private Long[] movies;
}
