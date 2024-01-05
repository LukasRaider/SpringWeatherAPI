package cz.vsb.springweather.connector;

import cz.vsb.springweather.City;
import cz.vsb.springweather.dto.WeatherAPIDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class WeatherApiConnector {

    //"https://api.weatherapi.com/v1/current.json?key=8e8fa98598464f778a395930231312&q=London&aqi=no";

    private static String baseUrl = "https://api.weatherapi.com/v1/";
    private static String urlParameters = "current.json?key=";
    private static String APIKey = "8e8fa98598464f778a395930231312";
    private static String url = baseUrl + urlParameters + APIKey + "&q=";
    public WeatherAPIDto getWeatherForCity(City city){

        RestTemplate template = new RestTemplate();
        URI uri = null;
        try {
            uri = new URI(url + city.toString());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        ResponseEntity<WeatherAPIDto> response = template.getForEntity(uri, WeatherAPIDto.class);
        return response.getBody();
    }
}
