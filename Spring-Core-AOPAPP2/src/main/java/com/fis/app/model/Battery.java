package com.fis.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Battery {

	@Value("${battery.batteryCharging}")
	private int batteryCharging;
	
	@Value("${battery.batterypower}")
	private int batterypower;
	
	public int getBatteryCharging() {
		return batteryCharging;
	}
	public void setBatteryCharging(int batteryCharging) {
		this.batteryCharging = batteryCharging;
	}
	public int getBatterypower() {
		return batterypower;
	}
	public void setBatterypower(int batterypower) {
		this.batterypower = batterypower;
	}
	@Override
	public String toString() {
		return "Battery [batteryCharging=" + batteryCharging + ", batterypower=" + batterypower + "]";
	}
	
	
}
