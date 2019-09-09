/**
 * CS 272 - Fall 2019
 * H01-IceCreamCone.java
 */
package occ.cs272.h01;

/**
 * @author Josh Smith
 * @version 9/9
 * 
 */
public class IceCreamCone
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "jsmith264";
    public static final String ASSIGNMENT = "H01-B";

    // TODO: Complete this class
double height=1.11;
double radius=2.23;


public IceCreamCone(double height, double radius) {
	super();
	this.height = height;
	this.radius = radius;
}
public double getSurfaceArea()
{
	return ((Math.PI*height*radius) + (Math.PI*(radius*radius)));
}
public double getVolume()
{
	return (Math.PI*(radius*radius)*height);
	
}
  
    
}
