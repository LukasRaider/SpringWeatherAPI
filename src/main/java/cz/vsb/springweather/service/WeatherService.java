package cz.vsb.springweather.service;

import cz.vsb.springweather.City;
import cz.vsb.springweather.connector.WeatherApiConnector;
import cz.vsb.springweather.dto.WeatherAPIDto;
import cz.vsb.springweather.dto.WeatherDto;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

    public WeatherDto getWeatherForCity(City cityEnum){
        WeatherApiConnector connector = new WeatherApiConnector();
        WeatherAPIDto connectorWeatherForCity = connector.getWeatherForCity(cityEnum);
        WeatherDto weatherDto = transformDto(connectorWeatherForCity);
        //WeatherService weatherDto = transformDto(cityEnum, connector);
        //weatherDto. setLocation(connector.getWeatherForCity(cityEnum)); // nastaveni lokace pro system
        return weatherDto;
    }

    public WeatherDto transformDto(WeatherAPIDto weatherAPIDto){
        WeatherDto weatherDto = new WeatherDto();
        weatherDto. setLocation(weatherAPIDto.getLocation().getName());
        weatherDto. setWeather_description(weatherAPIDto.getCurrent().getCondition().getText());
        weatherDto. setRel_humidity(weatherAPIDto.getCurrent().getHumidity());
        weatherDto. setTimestap(weatherAPIDto.getCurrent().getLast_updated());
        weatherDto. setTemp_celsium(weatherAPIDto.getCurrent().getTemp_c());
        weatherDto. setWind_direction(weatherAPIDto.getCurrent().getWind_dir());
        weatherDto. setWindSpeed_mps(Math.round(weatherAPIDto.getCurrent().getWind_kph()/3.6));

        return weatherDto;
    }
}
