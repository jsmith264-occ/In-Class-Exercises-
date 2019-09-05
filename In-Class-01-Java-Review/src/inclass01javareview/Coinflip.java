


/**
 * @author Josh Smith
 * @date September 9, 2019
 */
package inclass01javareview;
import java.util.Scanner;
/**
@Coinflipclass
**/
public class Coinflip 
{

	public static void main(String[] args) 
	{
		int endflip;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many times would you like the coin to be flipped?");
		int n = keyboard.nextInt();
		for (endflip = 0; endflip < n; endflip++)
		{
			if (Math.random() < .5)
				{
					System.out.println("Tails");
				}
			else 
				{
					System.out.println("Heads");
				}
		}
		

	
	
	
	}
	
	
	
	

}
