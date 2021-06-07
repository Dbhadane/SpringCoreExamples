package Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Route 
{
	
	private String from;
	private String to;
	private String hotel;
	
	@Autowired
	public Route(String from, String to, String hotel) {
		super();
		this.from = from;
		this.to = to;
		this.hotel = hotel;
	}
	@Override
	public String toString() {
		return "Route [from=" + from + ", to=" + to + ", hotel=" + hotel + "]";
	}
	
	
}
