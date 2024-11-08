package com.example.goready.dto;

import lombok.*;

@Getter
@Setter
@Builder
@Data
@AllArgsConstructor
public class WeatherData {

    private int maxTemp;
    private int minTemp;
    private int rainPer;
    private int currentTemp;
    private int yesterdayTemp;

}
