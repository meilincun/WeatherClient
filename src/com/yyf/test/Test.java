package com.yyf.test;

import com.yyf.weather.ArrayOfString;
import com.yyf.weather.WeatherWebService;
import com.yyf.weather.WeatherWebServiceSoap;

public class Test {
	public static void main(String[] args) {
		WeatherWebService wws = new WeatherWebService();
		WeatherWebServiceSoap wwss = wws.getWeatherWebServiceSoap();
		ArrayOfString weatherbyCityName = wwss.getWeatherbyCityName("…œ∫£");
		for (String st : weatherbyCityName.getString()) {
						System.out.println(st);
						System.out.println("---------------------------------------------");
		}
	}
}
