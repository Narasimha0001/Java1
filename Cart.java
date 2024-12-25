package ca;
import app.Promain;
import java.util.*;
import java.util.ArrayList;

public class Cart {
    private ArrayList<String> cartItems;
    private ArrayList<Double> cartPrices;
    private ArrayList<String> orderItems;
    private ArrayList<Double> orderPrices;
    private Scanner scanner;
    public static Cart cart = new Cart();
    static Promain main = Promain.main;
    // Constructor
    public Cart() {
        cartItems = new ArrayList<>();
        cartPrices = new ArrayList<>();
        scanner = new Scanner(System.in);
        orderItems = new ArrayList<>();
        orderPrices = new ArrayList<>();


    }

    // Add item to cart
    public void addItem(String itemName, double price) {
        cartItems.add(itemName);
        cartPrices.add(price);
        System.out.println(itemName + " added to the cart.");
    }

    // Display cart items
    public void displayCart() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty.");
            while(true){
                System.out.println("->Back");
                String bac = scanner.next();
                if(bac.equalsIgnoreCase("back")) break;
                else System.out.println("Invalid Input.");
                }
                return;
        } else {
            System.out.println("Items in your cart:");
            for (int i = 0; i < cartItems.size(); i++) {
                System.out.println((i + 1) + ". " + cartItems.get(i) + " - $" + cartPrices.get(i));
            }
            if(cartItems.size()>1) System.out.println("Do you want to buy items (yes/no): ");
            else System.out.println("Do you want to buy item  (yes/no):");
            String buy;
            while(true){
                buy = scanner.next();
                if(buy.equalsIgnoreCase("yes") || buy.equalsIgnoreCase("no")) break;
                else System.out.println("Invalid Selection. Please enter a valid Input(yes/no):");
            }
            if(buy.equalsIgnoreCase("yes")) generateBill();
            else {
                String remove;
                if(cartItems.size()>0){
                System.out.println("Do you want to remove item  (yes/no):");
                while(true){
                    remove = scanner.next();
                    if(remove.equalsIgnoreCase("yes") || remove.equalsIgnoreCase("no")) break;
                    else System.out.println("Invalid Selection. Please enter a valid Input(yes/no):");
                }
                if(remove.equalsIgnoreCase("yes")) removeItem();
                else main.main(new String[]{});
            }
            }
        }
    }
    public void clearCart() {
        cartItems.clear();
        cartPrices.clear();
        //System.out.println("Your cart has been cleared.");
    }
      // Remove item from cart
      public void removeItem() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty. No items to remove.");
            return;
        }

        //displayCart(); String remove;
        
        
        while(true){      
        System.out.print("Enter the number of the item to remove: ");
        int index = 0;
        while(true){
            int c = 0;
            try{
         index = scanner.nextInt() - 1;
         c++;
            }
            catch(Exception e){
                System.out.println("Please enter a Integer.");
            }
            if(c!=0 ) break;
        }
        if (index >= 0 && index < cartItems.size()) {
            System.out.println(cartItems.get(index) + " removed from the cart.");
            cartItems.remove(index);
            cartPrices.remove(index);
            displayCart();
        } else {
            System.out.println("Invalid selection. No item removed.");
        }
        if (!(index >= 0 && index < cartItems.size())) break;
    }
}

    // Billing method
    public void generateBill() {
        if (cartItems.isEmpty()) {
            System.out.println("Your cart is empty. No bill to generate.");
            return;
        }

        double total = 0.0;
        System.out.println("Billing Details:");
        for (int i = 0; i < cartItems.size(); i++) {
            System.out.println(cartItems.get(i) + " - $" + cartPrices.get(i));
            total += cartPrices.get(i);
        }
        System.out.println("Total Amount: $" + total);
        System.out.println("Do you want to proceed for payment(yes/no):");
        String payment;
        while(true){
            payment = scanner.next();
            if(payment.equalsIgnoreCase("yes") || payment.equalsIgnoreCase("no")) break;
            else System.out.println("Invalid Selection. Please enter a valid Input(yes/no):");
        }
        if(payment.equalsIgnoreCase("yes")) choosePaymentMode();
        else displayCart();
    }
        public  void orders() {    
            // Adding items to the cart
            if(cartItems.size()>0){
            for(int i = 0;i<cartItems.size();i++){
            orderItems.add(cartItems.get(i));
            // Displaying cart items
            orderPrices.add(cartPrices.get(i));
            }
            clearCart();
        }
        }
        public  void displayorders(){
            if(orderItems.size()>0){
                int i = 0;
            for ( i = 0; i < orderItems.size(); i++) {
                System.out.println((i + 1) + ". " + orderItems.get(i) + " - $" + orderPrices.get(i));
            }
            System.out.println( "-> Back");
            while(true){
            String back = scanner.next();
            if(back.equalsIgnoreCase("back")) break;
            else System.out.println("Invalid input.");
            }
            return;
            }
            else{
                System.out.println("No Orders done yet!");
                while(true){
                System.out.println("->Back");
                String bac = scanner.next();
                if(bac.equalsIgnoreCase("back")) break;
                else System.out.println("Invalid Input.");
                }
                return;
            }
        }
    
    public void choosePaymentMode() {
        System.out.println("\u001B[36;1mEnter full name:\u001B[0m");
		String fullname = scanner.next();
		System.out.println("\u001B[36mEnter Address:\u001B[0m");
		String address = scanner.next();
		while(true) {
			System.out.println("\u001B[36mEnter Pincode:\u001B[0m");
            int pin;
            while(true){
                try{
			pin = scanner.nextInt();
            c++;
                }catch(Exception e){
                    System.out.println("please enter an integer");
                }
                if(c!=0) break;
            }
			if(pin>100000-1&&pin<1000000)
				break;

			System.out.println("Pin code must be 6 digit numeric value");
		}
		while(true) {
			System.out.println("\u001B[36mEnter phone number:\u001B[0m");
            int contactNumber;
            while(true){
                try{
                    contactNumber = scanner.nextInt();
            c++;
                }catch(Exception e){
                    System.out.println("please enter an integer");
                }
                if(c!=0) break;
            }
			if(contactNumber>(long)(Math.pow(10,9))-1&&contactNumber<(long)(Math.pow(10,10)))
				break;
			System.out.println("Phone number length must be 10 digits only");
		}
        System.out.println("Address added Successfully.\n\n\n");
        System.out.println("Choose a payment method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. UPI (currently unavaliable)");
        System.out.println("4. Cash on Delivery");
        System.out.print("Enter your choice: ");
        String choice = scanner.next();

        switch (choice) {
            case "1":
                System.out.println("You selected: Credit Card");
                //System.out.print("Enter Credit Card Number: ");
                String cardNumber;
				while(true) {
					System.out.print("\u001B[36mEnter Credit Card Number: \u001B[0m");
					 cardNumber = scanner.next();
					if(cardNumber.length()==16 && cardNumber.charAt(0) != '0'){
                        int c = 0;
                        for(int i = 0;i<16;i++){
                             if(cardNumber.charAt(i)>='0' && cardNumber.charAt(i)<='9') c++;
                        }
                        if(c == 16) break;
                    }
                    else 
					System.out.println("The cardNumber must be 16 digits");
				}

				String cvv;
				while(true) {
					System.out.print("Enter CVV:");
					cvv = scanner.next();
					if(cardNumber.length()==3 && cardNumber.charAt(0) != '0'){
                        int c = 0;
                        for(int i = 0;i<3;i++){
                             if(cardNumber.charAt(i)>='0' && cardNumber.charAt(i)<='9') c++;
                        }
                        if(c == 3) break;
                    }
                        else
						System.out.println("Please enter 3 digit number only");
				}
				while(true) {
					int expiryMonth;
					while(true) {
						System.out.print("Enter Expiry Month: ");
                        while(true){
                            int c = 0;
                        try{
						expiryMonth = scanner.nextInt();
                        c++;
                        }
                        catch(Exception e){
                            System.out.println("Please Enter an Integer");
                        }
                        if(c!=0) break;
                    }
						if(expiryMonth>=1&&expiryMonth<13)
							break;
						System.out.println("The month range must be 1 and 12");
					}

					System.out.print("Enter Expiry Year: ");
                    int expiryYear
                        while(true){
                            int c = 0;
                        try{
                            expiryYear = scanner.nextInt();
                        c++;
                        }
                        catch(Exception e){
                            System.out.println("Please Enter an Integer");
                        }
                        if(c!=0) break;
                    }
					if(expiryYear>2024||(expiryYear==2024&&expiryMonth==12))
						break;
					System.out.println("The expiry of the card must be greater than Today's date");
				}
                orders();
                System.out.println("Credit Card details received successfully.");
                System.out.println("Your order will be delivered soon.");
                break;
            case "2":
                System.out.println("You selected: Debit Card");
                String cardNumber;
				while(true) {
					System.out.print("\u001B[36mEnter Debit Card Number: \u001B[0m");
					 cardNumber = scanner.next();
					if(cardNumber.length()==16 && cardNumber.charAt(0) != '0'){
                        int c = 0;
                        for(int i = 0;i<16;i++){
                             if(cardNumber.charAt(i)>='0' && cardNumber.charAt(i)<='9') c++;
                        }
                        if(c == 16) break;
                    }
                    else 
					System.out.println("The cardNumber must be 16 digits");
				}

				String cvv;
				while(true) {
					System.out.print("Enter CVV:");
					cvv = scanner.next();
					if(cardNumber.length()==3 && cardNumber.charAt(0) != '0'){
                        int c = 0;
                        for(int i = 0;i<3;i++){
                             if(cardNumber.charAt(i)>='0' && cardNumber.charAt(i)<='9') c++;
                        }
                        if(c == 3) break;
                    }
                        else
						System.out.println("Please enter 3 digit number only");
				}
                while(true) {
					int expiryMonth;
					while(true) {
						System.out.print("Enter Expiry Month: ");
                        while(true){
                            int c = 0;
                        try{
						expiryMonth = scanner.nextInt();
                        c++;
                        }
                        catch(Exception e){
                            System.out.println("Please Enter an Integer");
                        }
                        if(c!=0) break;
                    }
						if(expiryMonth>=1&&expiryMonth<13)
							break;
						System.out.println("The month range must be 1 and 12");
					}

					System.out.print("Enter Expiry Year: ");
                    int expiryYear
                        while(true){
                            int c = 0;
                        try{
                            expiryYear = scanner.nextInt();
                        c++;
                        }
                        catch(Exception e){
                            System.out.println("Please Enter an Integer");
                        }
                        if(c!=0) break;
                    }
					if(expiryYear>2024||(expiryYear==2024&&expiryMonth==12))
						break;
					System.out.println("The expiry of the card must be greater than Today's date");
				}
                orders();
                System.out.println("Debit Card details received successfully.");
                System.out.println("Your order will be delivered soon.");

                break;
            case "3":
                System.out.println("Sorry for the Inconvience UPI Currently Unavailable");
                System.out.print("Page is Reloading to back. Please Wait. ");
                System.out.print("Loading");
                for (int i = 0; i < 5; i++) {
                    try {
                        System.out.print(".");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("An error occurred.");
                        return;
                    }
                }
                choosePaymentMode();
                break;
            case "4":
                System.out.println("You selected: Cash on Delivery");
                orders();
                System.out.println("Please have the exact amount ready at the time of delivery.");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                choosePaymentMode(); // Retry on invalid input
        }
        System.out.println("Do you want to shop more(yes/no):");
        String shop;
        while(true){
            shop = scanner.next();
            if(shop.equalsIgnoreCase("yes") || shop.equalsIgnoreCase("no")) break;
            else System.out.println("Invalid Selection. Please enter a valid Input(yes/no):");
        }
        if(shop.equalsIgnoreCase("yes"))
        { Promain Main = new Promain();
		Main.main(new String[]{});
    }
        else System.exit(0);
    }


}
