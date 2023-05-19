package com.driver;
class Product
{
public int x;
public int y;
public int z;
private double a;
private double b;
void product(int x,int y)
{
this.x=x;
this.y=y;
}
void product(int x,int y,int z)
{
this.x=x;
this.y=y;
this.z=z;
}
void product(double x,double y)
{
this.a=x;
this.b=y;
}
}
public class Main {
public static void main(String args[])
{
Product p=new Product();
p.product(10,20);
p.product(10,20,30);
p.product(10.0,20.0);
}
}