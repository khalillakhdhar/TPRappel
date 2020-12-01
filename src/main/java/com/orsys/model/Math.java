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
	if(this.a>this.b)
		return this.a+" est superieur a "+this.b;
	else
		return this.b+" est superieur a "+this.a;
	
}


public String factoriel()
{
	
}
}
