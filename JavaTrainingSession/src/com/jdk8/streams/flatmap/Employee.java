package com.jdk8.streams.flatmap;

import java.util.HashSet;
import java.util.Set;

public class Employee {
	private String name;
	private Set<String> devices;
	
	/*public Employee(String name, Set<String> devices) {
		this.name = name;
		this.devices = devices;
	}*/
	
	public void addDevices(String devicesName) {
		if(this.devices == null) {
			this.devices = new HashSet<String>();
		}
		
		this.devices.add(devicesName);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getDevices() {
		return devices;
	}

	public void setDevices(Set<String> devices) {
		this.devices = devices;
	}

}
