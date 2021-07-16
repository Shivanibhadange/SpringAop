package com.fis.app.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Memory {
	
	@Value("${memory.ram}")
	private int ram;
	
	@Value("${memory.memorytype}")
	private String memorytype;
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public String getMemorytype() {
		return memorytype;
	}
	public void setMemorytype(String memorytype) {
		this.memorytype = memorytype;
	}
	@Override
	public String toString() {
		return "Memory [ram=" + ram + ", memorytype=" + memorytype + "]";
	}
	

}
