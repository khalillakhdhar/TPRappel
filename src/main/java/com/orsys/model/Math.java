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
	long f=1;
	for(int i=2;i<=this.a;i++)
		f=f*i;
	return "la factoriel de "+this.a+" est"+ f;
}
public String PGCD()
{
	int x=this.a; int y=this.b;
while(this.a!=this.b)
{	if(this.a>this.b)
		this.a=this.a -this.b;
//this.a-=this.b
	else
		this.b-=this.a;

}
return "le PGCD de "+x+" et "+y+" est: "+ this.a;

}
}
