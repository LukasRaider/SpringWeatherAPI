package cz.vsb.springweather.controller;

import cz.vsb.springweather.City;
import cz.vsb.springweather.connector.WeatherApiConnector;
import cz.vsb.springweather.dto.WeatherDto;
import cz.vsb.springweather.service.WeatherService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    @RequestMapping("/weather")
    String getWeather(){
        return "Pocasi pro vsechna mesta";
    }
    @RequestMapping("/weather/{city}")
    WeatherDto getWeatherForCity(@PathVariable("city") String city){
        City cityEnum = City.valueOf(city.toUpperCase());
        WeatherService weatherService = new WeatherService();
        return weatherService.getWeatherForCity(cityEnum);
    }
}
