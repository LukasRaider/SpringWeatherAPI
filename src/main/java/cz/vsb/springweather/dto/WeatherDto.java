package cz.vsb.springweather.dto;

public class WeatherDto {
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTimestap() {
        return timestap;
    }

    public void setTimestap(String timestap) {
        this.timestap = timestap;
    }

    public double getTemp_celsium() {
        return temp_celsium;
    }

    public void setTemp_celsium(double temp_celsium) {
        this.temp_celsium = temp_celsium;
    }

    public double getWindSpeed_mps() {
        return windSpeed_mps;
    }

    public void setWindSpeed_mps(double windSpeed_mps) {
        this.windSpeed_mps = windSpeed_mps;
    }

    public int getRel_humidity() {
        return rel_humidity;
    }

    public void setRel_humidity(int rel_humidity) {
        this.rel_humidity = rel_humidity;
    }

    public String getWind_direction() {
        return wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public String getWeather_description() {
        return weather_description;
    }

    public void setWeather_description(String weather_description) {
        this.weather_description = weather_description;
    }

    private String location;
    private String timestap;
    private double temp_celsium;
    private double windSpeed_mps;
    private int rel_humidity;
    private String wind_direction;
    private String weather_description;
}
