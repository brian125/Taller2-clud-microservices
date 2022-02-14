package com.cloud.booking.mapper;

import com.cloud.booking.dto.BookingDto;
import com.cloud.booking.entities.Booking;

public class BookingMapper {

    public static Booking buildBooking(BookingDto bookingDto){
        return Booking.builder()
                .id(bookingDto.getId())
                .userId(bookingDto.getUserId())
                .showtimeId(bookingDto.getShowtimeId())
                .moviesIds(bookingDto.getMoviesIds())
                .build();
    }

}
