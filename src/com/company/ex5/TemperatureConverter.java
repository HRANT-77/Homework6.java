package com.company.ex5;

public class TemperatureConverter {


    public Celsius convertFarenheitToCelsius(Farenheit farenheit) {

        Celsius celsius = new Celsius();
        celsius.setTemp((farenheit.getTemp() - 32) * 0.5556);
        return celsius;
    }

    public Kelvin convertFarenheitToKelvin(Farenheit farenheit) {

        Kelvin kelvin = new Kelvin();
        kelvin.setTemp((farenheit.getTemp() + 459.67) / 1.8);
        return kelvin;

    }

    public Farenheit convertCelsiusToFarenheit(Celsius celsius) {

        Farenheit farenheit = new Farenheit();
        farenheit.setTemp((celsius.getTemp() * 1.8) + 32);
        return farenheit;

    }

    public Farenheit convertKelvinToFarenheit(Kelvin kelvin) {

        Farenheit farenheit = new Farenheit();
        farenheit.setTemp((kelvin.getTemp() * 1.8) - 459.67);
        return farenheit;
    }

    public Celsius convertKelvinToCelsius(Kelvin kelvin) {

        Celsius celsius1 = new Celsius();
        celsius1.setTemp(kelvin.getTemp() - 273.15);
        return celsius1;

    }

    public Kelvin convertCelsiusToKelvin(Celsius celsius) {

        Kelvin kelvin = new Kelvin();
        kelvin.setTemp(celsius.getTemp() + 273.15);
        return kelvin;


    }

}
