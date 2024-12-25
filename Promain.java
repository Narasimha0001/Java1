package app;
import app.Acs;
import app.Fridges;
import app.Tvs;
import app.Buds;
import app.Laptops;
import app.Mobiles;
import ca.Cart;
import app.Login;
import java.util.Scanner;
public class Promain
{
	static Login login = new Login();
	static Scanner sc=new Scanner(System.in);
	public static Promain main = new Promain();
	static
	{
		System.out.println("Welcome");
	}
	public static void main(String [] args)
	{
		
		
		while(true)
		{
			System.out.println("Which product you want\n 1.Air Conditioners \n 2.Airpods\n 3.Fridges \n 4.Laptops \n 5.Mobiles \n 6.Televisions \n 7.view cart\n 8.Orders\n 9.Logout");
			String product=sc.next();
			if(product.equals("1"))
			{
				Acs ac=new Acs();
				ac.main(new String[]{});
			}
			else if(product.equals("2"))
			{
				Buds bud=new Buds();
				bud.main(new String[]{});
			}
			else if(product.equals("3"))
			{
				Fridges fd=new Fridges();
				fd.main(new String[]{});
			}
			else if(product.equals("4"))
			{
				Laptops lap=new Laptops();
				lap.main(new String[]{});
			}
			else if(product.equals("5"))
			{
				Mobiles phn=new Mobiles();
				phn.main(new String[]{});
			}
			else if(product.equals("6"))
			{
				Tvs tv=new Tvs();
				tv.main(new String[]{});
			}
			else if(product.equals("7"))
			{
				Cart cart = Login.getCurrentUserCart();
				cart.displayCart();
			}
			else if(product.equals("8")){
				Cart ct = Cart.cart;
				ct.displayorders();
			}
			else if(product.equals("9"))
			{
				System.out.print("Thank you for visiting");
				login.main(new String[]{});
			}
			else{
				System.out.println("Invalid Input");
				System.out.println("Please enter valid Input");
				continue;
			}
		}
	}
}
