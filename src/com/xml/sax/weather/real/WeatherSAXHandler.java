package com.xml.sax.weather.real;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class WeatherSAXHandler extends DefaultHandler {
	List<Weather> list;
	Weather weather;
	String txt;
	Date date;

	public WeatherSAXHandler() {
		list = new ArrayList<Weather>();
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("data")) {
			weather = new Weather();
		}

	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (weather != null) {
			if (qName.equals("tmEf")) {
				SimpleDateFormat formmatter = new SimpleDateFormat("yyyyMMDDHHmm");
				try {
					date = formmatter.parse(txt);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				weather.setTmEf(date);

			} else if (qName.equals("wf")) {
				weather.setWf(txt);
			} else if (qName.equals("tmn")) {
				weather.setTmn(txt);
			} else if (qName.equals("tmx")) {
				weather.setTmx(txt);
			} else if (qName.equals("data")) {
				list.add(weather);
				weather = null;
			}
		}

	}

	public void characters(char[] ch, int start, int length) throws SAXException {
		String str = new String(ch, start, length).trim();
		txt = str;

	}

	public List<Weather> getList() {
		return list;
	}

}
