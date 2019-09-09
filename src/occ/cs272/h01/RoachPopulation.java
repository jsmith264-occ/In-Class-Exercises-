/**
 * CS 272 - Fall 2019
 * H01-RoachPopulation.java
 */
package occ.cs272.h01;

/**
 * @author jsmith264
 * @version 9/9
 *
 */
public class RoachPopulation
{
    // TODO: You must fill these in correctly to get credit
    public static final String STUDENT = "jsmith264";
    public static final String ASSIGNMENT = "H01-A";
	public int roachCount;
	
	
	
	public RoachPopulation(int roachCount) {
		super();
		this.roachCount = roachCount;
	}
	public void breed() 
	{
		roachCount*=2;
	}
	public void spray()
	{
		roachCount*=.1;
	}
	public int getRoaches()
	{
		return roachCount;
		
	}
	

    // TODO: Complete the RoachPopulation class
    
    
    
    
    
    
}
