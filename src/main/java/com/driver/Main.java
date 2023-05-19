package com.driver;

public class Main {
public static class Product
{
int product(int x,int y)
{
return x*y;
}
int product(int x,int y,int z)
{
return x*y*z;
}
double product(double x,double y)
{
return x*y;
}
}
public static void main(String args[])
{
Product p=new Product();
int ans=p.product(10,20);
int ans1=p.product(10,20,30);
double ans2=p.product(10.0,20.0);
System.out.println(ans+" "+ans1+" "+ans2);
}
}