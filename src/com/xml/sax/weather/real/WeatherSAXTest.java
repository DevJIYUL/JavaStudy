package com.xml.sax.weather.real;

import java.net.URL;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;


public class WeatherSAXTest {

	public static void main(String[] args) {
		String url= "http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108";
		SAXParserFactory factory = SAXParserFactory.newInstance();
		
		try {
			SAXParser parser = factory.newSAXParser();
			WeatherSAXHandler handler = new WeatherSAXHandler();
			parser.parse(new URL (url).openConnection().getInputStream(),handler);
			
			List<Weather> list = handler.getList();
			for (Weather w : list) {
				System.out.printf("날짜: %tY-%1$tm-%1$td %1$tm:%tS시	온도 : %s ~ %s	구름량: %s%n",w.getTmEf(),w.getTmEf(),w.getTmn(),w.getTmx(),w.getWf());
			}

		} catch (Exception e) {
			throw new RuntimeException();
		}
	
	
	}

}
