package com.orsys.model;

public class Math {
private int a,b;

public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public int getB() {
	return b;
}

public void setB(int b) {
	this.b = b;
}

public String max()
{
	if(a>b)
		return a+" est superieur a "+b;
	else
		return b+" est superieur a "+a;
	
}
}
