package com.awelless;

public class Treasure implements Comparable<Treasure>{

	private String name;
	private int value;

	Treasure(String name, int value) {
		this.name  = name;
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	@Override
	public int compareTo(Treasure other) {
		return value - other.value;
	}

	@Override
	public String toString() {
		return "Name: " + name + ", Value: " + value;
	}
}
