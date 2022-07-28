package com.xml.sax.weather.real;

import java.util.Date;

public class Weather {
	private Date tmEf;
	private String wf;
	private String tmn;
	private String tmx;
	public Date getTmEf() {
		return tmEf;
	}
	public void setTmEf(Date tmEf) {
		this.tmEf = tmEf;
	}
	public String getWf() {
		return wf;
	}
	public void setWf(String wf) {
		this.wf = wf;
	}
	public String getTmn() {
		return tmn;
	}
	public void setTmn(String tmn) {
		this.tmn = tmn;
	}
	public String getTmx() {
		return tmx;
	}
	public void setTmx(String tmx) {
		this.tmx = tmx;
	}
	public Weather(Date tmEf, String wf, String tmn, String tmx) {
		super();
		this.tmEf = tmEf;
		this.wf = wf;
		this.tmn = tmn;
		this.tmx = tmx;
	}
	@Override
	public String toString() {
		return "Weather [tmEf=" + tmEf + ", wf=" + wf + ", tmn=" + tmn + ", tmx=" + tmx + "]";
	}
	public Weather() {
		super();
	}
	
}
