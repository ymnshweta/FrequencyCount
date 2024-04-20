package com.aa;

public class Frequency_Count {
public static void main(String[] args) {
	String x="noon";
	char ch='o';
	int freq=0;
	
	for(int i=0;i<x.length();i++) {
		if(x.charAt(i)==ch) {
			freq++;
		}
	}
	System.out.println("frequncy of given String:"+freq);
}
}
