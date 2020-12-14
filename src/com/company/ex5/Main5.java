package com.company.ex5;

import com.company.ex6.Converter;

public class Main5 {
    public static void main(String[] args) {
        TemperatureConverter temperatureConverter=new TemperatureConverter();

        Farenheit farenheit=new Farenheit();
        farenheit.setTemp(50);

        Celsius celsius= temperatureConverter.convertFarenheitToCelsius(farenheit);
        System.out.println(farenheit.getTemp()+" farenheit is "+celsius.getTemp()+" celsius");

        Kelvin kelvin= temperatureConverter.convertFarenheitToKelvin(farenheit);
        System.out.println(farenheit.getTemp()+" farenheit is "+kelvin.getTemp()+" kelvin");


        Celsius celsius1=new Celsius();
        celsius1.setTemp(100);

        Farenheit farenheit1= temperatureConverter.convertCelsiusToFarenheit(celsius1);
        System.out.println(celsius1.getTemp()+" celsius is "+farenheit1.getTemp()+" farenheit");

        Kelvin kelvin1= temperatureConverter.convertCelsiusToKelvin(celsius1);
        System.out.println(celsius1.getTemp()+" celsius is "+kelvin1.getTemp()+" kelvin");

        Kelvin kelvin2=new Kelvin();
        kelvin2.setTemp(500);
        Farenheit farenheit2= temperatureConverter.convertKelvinToFarenheit(kelvin2);
        System.out.println(kelvin2.getTemp()+" kelvin is "+ farenheit2.getTemp()+" farenheit");
        Celsius celsius2= temperatureConverter.convertKelvinToCelsius(kelvin2);
        System.out.println(kelvin2.getTemp()+" kelvin is "+ celsius2.getTemp()+" celsius");

    }
}
