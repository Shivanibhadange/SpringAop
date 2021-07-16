package com.fis.app.model;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ElectronicDevice implements Serializable,Comparable<ElectronicDevice> {
	
	@Value("${Electronic.Devicetype}")
	private String Devicetype;
	
	@Autowired
	private Memory memory;
	
	@Autowired
	private Battery battery;
	
	
	
	public ElectronicDevice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectronicDevice(String devicetype, Memory memory, Battery battery) {
		super();
		this.Devicetype = devicetype;
		this.memory = memory;
		this.battery = battery;
	}
	public String getDevicetype() {
		return Devicetype;
	}
	public void setDevicetype(String devicetype) {
		Devicetype = devicetype;
	}
	public Memory getMemory() {
		return memory;
	}
	public void setMemory(Memory memory) {
		this.memory = memory;
	}
	public Battery getBattery() {
		return battery;
	}
	public void setBattery(Battery battery) {
		this.battery = battery;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Devicetype == null) ? 0 : Devicetype.hashCode());
		result = prime * result + ((battery == null) ? 0 : battery.hashCode());
		result = prime * result + ((memory == null) ? 0 : memory.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectronicDevice other = (ElectronicDevice) obj;
		if (Devicetype == null) {
			if (other.Devicetype != null)
				return false;
		} else if (!Devicetype.equals(other.Devicetype))
			return false;
		if (battery == null) {
			if (other.battery != null)
				return false;
		} else if (!battery.equals(other.battery))
			return false;
		if (memory == null) {
			if (other.memory != null)
				return false;
		} else if (!memory.equals(other.memory))
			return false;
		return true;
	}
	public int compareTo(ElectronicDevice o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
