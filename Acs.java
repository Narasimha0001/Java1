package app;
import app.Promain;
import java.util.Scanner;
import ca.Cart;
public class Acs {
	static Scanner scanner = new Scanner(System.in);
    static Cart ct = Cart.cart;
	static double price ;
	static String sc;
	static Promain main = Promain.main;
	public class HaierACSelector {
		public  static void showSpecifications() {
			while(true) {
			System.out.println("!-----Available Models-----!");
			System.out.println("1. Haier Split AC");
			System.out.println("2. Haier Window AC");
			System.out.println("3. Haier Inverter AC");
			System.out.println("4. Haier Portable AC");
			System.out.println("5. Haier Smart AC");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print("Enter your choice (1-7): ");

			
				String series = scanner.next();

				switch(series) {
				case "1":
					haierSplitACModel();
					break;
				case "2":
					haierWindowACModel();
					break;
				case "3":
					haierInverterACModel();
					break;
				case "4":
					haierPortableACModel();
					break;
				case "5":
					haierSmartACModel();
					break;
				case "6":
					Acs.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println("Invalid choice. Please select a number between 1 and 7.");
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}

		// Method for Haier Split AC
		public static void haierSplitACModel() {
			System.out.println("Haier Split AC Specifications:");
			System.out.println("1. 1 Ton Split AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 3 stars");
			System.out.println("   - Price Range: $300 - $450");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Haier Split AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Haier Split AC variant:");
					System.out.println("1. 1 Ton, 3 stars, Cooling Only  - $300");
					System.out.println("2. 1 Ton, 4 stars, with Dehumidification  - $350");
					System.out.println("3. 1.5 Ton, 5 stars, with Turbo Cooling  - $450");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 3 stars, Cooling Only  - $300");
							price = 300;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Split AC, 1 Ton, 3 stars, Cooling Only", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1 Ton, 4 stars, with Dehumidification  - $350");
							price = 350;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Split AC, 1 Ton, 4 stars, with Dehumidification", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 1.5 Ton, 5 stars, with Turbo Cooling  - $450");
							price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Split AC, 1.5 Ton, 5 stars, with Turbo Cooling", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Haier Window AC
		public static void haierWindowACModel() {
			System.out.println("Haier Window AC Specifications:");
			System.out.println("1. 1 Ton Window AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 2 stars");
			System.out.println("   - Price Range: $250 - $400");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Haier Window AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Haier Window AC variant:");
					System.out.println("1. 1 Ton, 2 stars, Cooling Only  - $250");
					System.out.println("2. 1 Ton, 3 stars, with Filter Cleaning  - $300");
					System.out.println("3. 1.5 Ton, 4 stars, with Auto Restart  - $400");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 2 stars, Cooling Only  - $250");
							price = 250;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Window AC, 1 Ton, 2 stars, Cooling Only", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1 Ton, 3 stars, with Filter Cleaning  - $300");
							price = 300;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Window AC, 1 Ton, 3 stars, with Filter Cleaning", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 1.5 Ton, 4 stars, with Auto Restart  - $400");
							price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Window AC, 1.5 Ton, 4 stars, with Auto Restart", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Haier Inverter AC
		public static void haierInverterACModel() {
			System.out.println("Haier Inverter AC Specifications:");
			System.out.println("1. 1 Ton Inverter AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 5 stars");
			System.out.println("   - Price Range: $400 - $600");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Haier Inverter AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}


				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Haier Inverter AC variant:");
					System.out.println("1. 1 Ton, 5 stars, Inverter with Smart Control  - $400");
					System.out.println("2. 1.5 Ton, 5 stars, Inverter with Fast Cooling  - $500");
					System.out.println("3. 2 Ton, 5 stars, Inverter with Low Noise  - $600");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 5 stars, Inverter with Smart Control  - $400");
							price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Inverter AC, 1 Ton, 5 stars, Inverter with Smart Control", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1.5 Ton, 5 stars, Inverter with Fast Cooling  - $500");
							price = 500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Inverter AC, 1.5 Ton, 5 stars, Inverter with Fast Cooling", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 2 Ton, 5 stars, Inverter with Low Noise  - $600");
							price = 600;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Inverter AC, 2 Ton, 5 stars, Inverter with Low Noise", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Haier Portable AC
		public static void haierPortableACModel() {
			System.out.println("Haier Portable AC Specifications:");
			System.out.println("1. 1 Ton Portable AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 3 stars");
			System.out.println("   - Price Range: $350 - $500");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Haier Portable AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Haier Portable AC variant:");
					System.out.println("1. 1 Ton, 3 stars, Easy Mobility  - $350");
					System.out.println("2. 1.5 Ton, 4 stars, Dehumidifier  - $450");
					System.out.println("3. 2 Ton, 5 stars, Turbo Cooling  - $500");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 3 stars, Easy Mobility  - $350");
							price = 350;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Portable AC, 1 Ton, 3 stars, Easy Mobility", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1.5 Ton, 4 stars, Dehumidifier  - $450");
							price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Portable AC, 1.5 Ton, 4 stars, Dehumidifier", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 2 Ton, 5 stars, Turbo Cooling  - $500");
							price = 500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Portable AC, 2 Ton, 5 stars, Turbo Cooling", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Haier Smart AC
		public static void haierSmartACModel() {
			System.out.println("Haier Smart AC Specifications:");
			System.out.println("1. 1 Ton Smart AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 5 stars");
			System.out.println("   - Price Range: $450 - $650");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Haier Smart AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}


				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Haier Smart AC variant:");
					System.out.println("1. 1 Ton, 5 stars, Smart Wi-Fi Control  - $450");
					System.out.println("2. 1.5 Ton, 5 stars, Voice Control  - $550");
					System.out.println("3. 2 Ton, 5 stars, Smart Remote  - $650");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 5 stars, Smart Wi-Fi Control  - $450");
							price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Smart AC, 1 Ton, 5 stars, Smart Wi-Fi Control", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1.5 Ton, 5 stars, Voice Control  - $550");
							price = 550;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Smart AC, 1.5 Ton, 5 stars, Voice Control", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 2 Ton, 5 stars, Smart Remote  - $650");
							price = 650;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Haier Smart AC, 2 Ton, 5 stars, Smart Remote", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}
	}

	public class WhirlpoolACSelector {
		public  static void showSpecifications() {
			while(true) {
			System.out.println("!-----Available Models-----!");
			System.out.println("1. Whirlpool Split AC");
			System.out.println("2. Whirlpool Window AC");
			System.out.println("3. Whirlpool Inverter AC");
			System.out.println("4. Whirlpool Portable AC");
			System.out.println("5. Whirlpool Smart AC");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print("Enter your choice (1-7): ");

			
				String series = scanner.next();

				switch(series) {
				case "1":
					whirlpoolSplitACModel();
					break;
				case "2":
					whirlpoolWindowACModel();
					break;
				case "3":
					whirlpoolInverterACModel();
					break;
				case "4":
					whirlpoolPortableACModel();
					break;
				case "5":
					whirlpoolSmartACModel();
					break;
				case "6":
					Acs.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println("Invalid choice. Please select a number between 1 and 7.");
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}

		// Method for Whirlpool Split AC
		public static void whirlpoolSplitACModel() {
			System.out.println("Whirlpool Split AC Specifications:");
			System.out.println("1. 1 Ton Split AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 3 stars");
			System.out.println("   - Price Range: $350 - $500");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Whirlpool Split AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Whirlpool Split AC variant:");
					System.out.println("1. 1 Ton, 3 stars, Cooling Only  - $350");
					System.out.println("2. 1 Ton, 4 stars, with Dehumidification  - $400");
					System.out.println("3. 1.5 Ton, 5 stars, with Turbo Cooling  - $500");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 3 stars, Cooling Only  - $350");
							price = 350;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Split AC, 1 Ton, 3 stars, Cooling Only", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1 Ton, 4 stars, with Dehumidification  - $400");
							price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Split AC, 1 Ton, 4 stars, with Dehumidification", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 1.5 Ton, 5 stars, with Turbo Cooling  - $500");
							price = 500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Split AC, 1.5 Ton, 5 stars, with Turbo Cooling", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Whirlpool Window AC
		public static void whirlpoolWindowACModel() {
			System.out.println("Whirlpool Window AC Specifications:");
			System.out.println("1. 1 Ton Window AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 2 stars");
			System.out.println("   - Price Range: $250 - $400");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Whirlpool Window AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Whirlpool Window AC variant:");
					System.out.println("1. 1 Ton, 2 stars, Cooling Only  - $250");
					System.out.println("2. 1 Ton, 3 stars, with Filter Cleaning  - $300");
					System.out.println("3. 1.5 Ton, 4 stars, with Auto Restart  - $400");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 2 stars, Cooling Only  - $250");
							price = 250;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Window AC, 1 Ton, 2 stars, Cooling Only", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1 Ton, 3 stars, with Filter Cleaning  - $300");
							price = 300;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Window AC, 1 Ton, 3 stars, with Filter Cleaning", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 1.5 Ton, 4 stars, with Auto Restart  - $400");
							price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Window AC, 1.5 Ton, 4 stars, with Auto Restart", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Whirlpool Inverter AC
		public static void whirlpoolInverterACModel() {
			System.out.println("Whirlpool Inverter AC Specifications:");
			System.out.println("1. 1 Ton Inverter AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 5 stars");
			System.out.println("   - Price Range: $450 - $650");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Whirlpool Inverter AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Whirlpool Inverter AC variant:");
					System.out.println("1. 1 Ton, 5 stars, Inverter with Smart Control  - $450");
					System.out.println("2. 1.5 Ton, 5 stars, Inverter with Fast Cooling  - $550");
					System.out.println("3. 2 Ton, 5 stars, Inverter with Low Noise  - $650");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 5 stars, Inverter with Smart Control  - $450");
							price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Inverter AC, 1 Ton, 5 stars, Inverter with Smart Control", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1.5 Ton, 5 stars, Inverter with Fast Cooling  - $550");
							price = 550;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Inverter AC, 1.5 Ton, 5 stars, Inverter with Fast Cooling", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 2 Ton, 5 stars, Inverter with Low Noise  - $650");
							price = 650;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Inverter AC, 2 Ton, 5 stars, Inverter with Low Noise", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Whirlpool Portable AC
		public static void whirlpoolPortableACModel() {
			System.out.println("Whirlpool Portable AC Specifications:");
			System.out.println("1. 1 Ton Portable AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 3 stars");
			System.out.println("   - Price Range: $400 - $550");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Whirlpool Portable AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Whirlpool Portable AC variant:");
					System.out.println("1. 1 Ton, 3 stars, Easy Mobility  - $400");
					System.out.println("2. 1.5 Ton, 4 stars, with Dehumidification  - $450");
					System.out.println("3. 2 Ton, 5 stars, with Turbo Cooling  - $550");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 3 stars, Easy Mobility  - $400");
							price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Portable AC, 1 Ton, 3 stars, Easy Mobility", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1.5 Ton, 4 stars, with Dehumidification  - $450");
							price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Portable AC, 1.5 Ton, 4 stars, with Dehumidification", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 2 Ton, 5 stars, with Turbo Cooling  - $550");
							price = 550;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Portable AC, 2 Ton, 5 stars, with Turbo Cooling", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Whirlpool Smart AC
		public static void whirlpoolSmartACModel() {
			System.out.println("Whirlpool Smart AC Specifications:");
			System.out.println("1. 1 Ton Smart AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 5 stars");
			System.out.println("   - Price Range: $450 - $600");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Whirlpool Smart AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Whirlpool Smart AC variant:");
					System.out.println("1. 1 Ton, 5 stars, Smart Wi-Fi Control  - $450");
					System.out.println("2. 1.5 Ton, 5 stars, Voice Control  - $500");
					System.out.println("3. 2 Ton, 5 stars, Smart Remote  - $600");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 5 stars, Smart Wi-Fi Control  - $450");
							price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Smart AC, 1 Ton, 5 stars, Smart Wi-Fi Control", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1.5 Ton, 5 stars, Voice Control  - $500");
							price = 500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Smart AC, 1.5 Ton, 5 stars, Voice Control", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 2 Ton, 5 stars, Smart Remote  - $600");
							price = 600;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Whirlpool Smart AC, 2 Ton, 5 stars, Smart Remote", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}
	}

	public class GodrejACSelector {
		public  static void showSpecifications() {
			while(true) {
			System.out.println("!-----Available Models-----!");
			System.out.println("1. Godrej Split AC");
			System.out.println("2. Godrej Window AC");
			System.out.println("3. Godrej Inverter AC");
			System.out.println("4. Godrej Portable AC");
			System.out.println("5. Godrej Smart AC");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print("Enter your choice (1-7): ");

			
				String series = scanner.next();

				switch(series) {
				case "1":
					godrejSplitACModel();
					break;
				case "2":
					godrejWindowACModel();
					break;
				case "3":
					godrejInverterACModel();
					break;
				case "4":
					godrejPortableACModel();
					break;
				case "5":
					godrejSmartACModel();
					break;
				case "6":
					Acs.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println("Invalid choice. Please select a number between 1 and 7.");
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}

		// Method for Godrej Split AC
		public static void godrejSplitACModel() {
			System.out.println("Godrej Split AC Specifications:");
			System.out.println("1. 1 Ton Split AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 3 stars");
			System.out.println("   - Price Range: $350 - $500");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Godrej Split AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Godrej Split AC variant:");
					System.out.println("1. 1 Ton, 3 stars, Cooling Only  - $350");
					System.out.println("2. 1 Ton, 4 stars, with Anti-Bacterial Filter  - $400");
					System.out.println("3. 1.5 Ton, 5 stars, with Turbo Cooling  - $500");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 

						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 3 stars, Cooling Only  - $350");
							price = 350;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Split AC, 1 Ton, 3 stars, Cooling Only", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1 Ton, 4 stars, with Anti-Bacterial Filter  - $400");
							price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Split AC, 1 Ton, 4 stars, with Anti-Bacterial Filter", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 1.5 Ton, 5 stars, with Turbo Cooling  - $500");
							price = 500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Split AC, 1.5 Ton, 5 stars, with Turbo Cooling", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Godrej Window AC
		public static void godrejWindowACModel() {
			System.out.println("Godrej Window AC Specifications:");
			System.out.println("1. 1 Ton Window AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 2 stars");
			System.out.println("   - Price Range: $250 - $400");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Godrej Window AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Godrej Window AC variant:");
					System.out.println("1. 1 Ton, 2 stars, Cooling Only  - $250");
					System.out.println("2. 1 Ton, 3 stars, with Dust Filter  - $300");
					System.out.println("3. 1.5 Ton, 4 stars, with Auto Restart  - $400");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 2 stars, Cooling Only  - $250");
							price = 250;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Window AC, 1 Ton, 2 stars, Cooling Only", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1 Ton, 3 stars, with Dust Filter  - $300");
							price = 300;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Window AC, 1 Ton, 3 stars, with Dust Filter", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 1.5 Ton, 4 stars, with Auto Restart  - $400");
							price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Window AC, 1.5 Ton, 4 stars, with Auto Restart", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Godrej Inverter AC
		public static void godrejInverterACModel() {
			System.out.println("Godrej Inverter AC Specifications:");
			System.out.println("1. 1 Ton Inverter AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 5 stars");
			System.out.println("   - Price Range: $450 - $650");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Godrej Inverter AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Godrej Inverter AC variant:");
					System.out.println("1. 1 Ton, 5 stars, Inverter with Smart Control  - $450");
					System.out.println("2. 1.5 Ton, 5 stars, Inverter with Auto Clean  - $550");
					System.out.println("3. 2 Ton, 5 stars, Inverter with Sleep Mode  - $650");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 

						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 5 stars, Inverter with Smart Control  - $450");
							price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Inverter AC, 1 Ton, 5 stars, Inverter with Smart Control", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1.5 Ton, 5 stars, Inverter with Auto Clean  - $550");
							price = 550;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Inverter AC,  1.5 Ton, 5 stars, Inverter with Auto Clean", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 2 Ton, 5 stars, Inverter with Sleep Mode  - $650");
							price = 650;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Inverter AC,  2 Ton, 5 stars, Inverter with Sleep Mode", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Godrej Portable AC
		public static void godrejPortableACModel() {
			System.out.println("Godrej Portable AC Specifications:");
			System.out.println("1. 1 Ton Portable AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 3 stars");
			System.out.println("   - Price Range: $400 - $550");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Godrej Portable AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Godrej Portable AC variant:");
					System.out.println("1. 1 Ton, 3 stars, Easy Mobility  - $400");
					System.out.println("2. 1.5 Ton, 4 stars, with Dehumidification  - $450");
					System.out.println("3. 2 Ton, 5 stars, with Turbo Cooling  - $550");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 3 stars, Easy Mobility  - $400");
							price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Portable AC, 1 Ton, 3 stars, Easy Mobility", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1.5 Ton, 4 stars, with Dehumidification  - $450");
							price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Portable AC, 1.5 Ton, 4 stars, with Dehumidification", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 2 Ton, 5 stars, with Turbo Cooling  - $550");
							price = 550;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Portable AC,  2 Ton, 5 stars, with Turbo Cooling", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Godrej Smart AC
		public static void godrejSmartACModel() {
			System.out.println("Godrej Smart AC Specifications:");
			System.out.println("1. 1 Ton Smart AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 5 stars");
			System.out.println("   - Price Range: $450 - $600");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Godrej Smart AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Godrej Smart AC variant:");
					System.out.println("1. 1 Ton, 5 stars, Smart Wi-Fi Control  - $450");
					System.out.println("2. 1.5 Ton, 5 stars, Voice Control  - $500");
					System.out.println("3. 2 Ton, 5 stars, with Smart Remote  - $600");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 

						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 5 stars, Smart Wi-Fi Control  - $450");
							price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Smart AC, 1 Ton, 5 stars, Smart Wi-Fi Control", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1.5 Ton, 5 stars, Voice Control  - $500");
							price = 500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Smart AC, 1.5 Ton, 5 stars, Voice Control", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 2 Ton, 5 stars, with Smart Remote  - $600");
							price = 600;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Godrej Smart AC, 2 Ton, 5 stars, with Smart Remote", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}
	}

	public class BlueStarACSelector {
		public  static void showSpecifications() {
			while(true) {
			System.out.println("!-----Available Models-----!");
			System.out.println("1. Blue Star Split AC");
			System.out.println("2. Blue Star Window AC");
			System.out.println("3. Blue Star Inverter AC");
			System.out.println("4. Blue Star Portable AC");
			System.out.println("5. Blue Star Smart AC");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print("Enter your choice (1-7): ");

			
				String series = scanner.next();

				switch(series) {
				case "1":
					blueStarSplitACModel();
					break;
				case "2":
					blueStarWindowACModel();
					break;
				case "3":
					blueStarInverterACModel();
					break;
				case "4":
					blueStarPortableACModel();
					break;
				case "5":
					blueStarSmartACModel();
					break;
				case "6":
					Acs.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println("Invalid choice. Please select a number between 1 and 7.");
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}
		// Method for Blue Star Split AC
		public static void blueStarSplitACModel() {
			System.out.println("Blue Star Split AC Specifications:");
			System.out.println("1. 1 Ton Split AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 3 stars");
			System.out.println("   - Price Range: $350 - $500");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Blue Star Split AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Blue Star Split AC variant:");
					System.out.println("1. 1 Ton, 3 stars, Cooling Only  - $350");
					System.out.println("2. 1 Ton, 4 stars, with Anti-Bacterial Filter  - $400");
					System.out.println("3. 1.5 Ton, 5 stars, with Turbo Cooling  - $500");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 3 stars, Cooling Only  - $350");
							price = 350;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Blue Star Split AC, 1 Ton, 3 stars, Cooling Only", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1 Ton, 4 stars, with Anti-Bacterial Filter  - $400");
							price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Blue Star Split AC, 1 Ton, 4 stars, with Anti-Bacterial Filter", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 1.5 Ton, 5 stars, with Turbo Cooling  - $500");
							price = 500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Blue Star Split AC, 1.5 Ton, 5 stars, with Turbo Cooling", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Blue Star Window AC
		public static void blueStarWindowACModel() {
			System.out.println("Blue Star Window AC Specifications:");
			System.out.println("1. 1 Ton Window AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 2 stars");
			System.out.println("   - Price Range: $250 - $400");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Blue Star Window AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Blue Star Window AC variant:");
					System.out.println("1. 1 Ton, 2 stars, Cooling Only  - $250");
					System.out.println("2. 1 Ton, 3 stars, with Dust Filter  - $300");
					System.out.println("3. 1.5 Ton, 4 stars, with Auto Restart  - $400");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 2 stars, Cooling Only  - $250");
							price = 250;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Blue Star Window AC, 1 Ton, 2 stars, Cooling Only", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1 Ton, 3 stars, with Dust Filter  - $300");
							price = 300;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Blue Star Window AC, 1 Ton, 3 stars, with Dust Filter", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 1.5 Ton, 4 stars, with Auto Restart  - $400");
							price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Blue Star Window AC, 1.5 Ton, 4 stars, with Auto Restart", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Blue Star Inverter AC
		public static void blueStarInverterACModel() {
			System.out.println("Blue Star Inverter AC Specifications:");
			System.out.println("1. 1 Ton Inverter AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 5 stars");
			System.out.println("   - Price Range: $450 - $650");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Blue Star Inverter AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Blue Star Inverter AC variant:");
					System.out.println("1. 1 Ton, 5 stars, Inverter with Smart Control  - $450");
					System.out.println("2. 1.5 Ton, 5 stars, Inverter with Auto Clean  - $550");
					System.out.println("3. 2 Ton, 5 stars, Inverter with Sleep Mode  - $650");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 5 stars, Inverter with Smart Control  - $450");
							price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Blue Star Inverter AC, 1 Ton, 5 stars, Inverter with Smart Control", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1.5 Ton, 5 stars, Inverter with Auto Clean  - $550");
							price = 550;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Blue Star Inverter AC, 1.5 Ton, 5 stars, Inverter with Auto Clean", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 2 Ton, 5 stars, Inverter with Sleep Mode  - $650");
							price = 650;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Blue Star Inverter AC, 2 Ton, 5 stars, Inverter with Sleep Mode", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Blue Star Portable AC
		public static void blueStarPortableACModel() {
			System.out.println("Blue Star Portable AC Specifications:");
			System.out.println("1. 1 Ton Portable AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 3 stars");
			System.out.println("   - Price Range: $400 - $550");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Blue Star Portable AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Blue Star Portable AC variant:");
					System.out.println("1. 1 Ton, 3 stars, Easy Mobility  - $400");
					System.out.println("2. 1.5 Ton, 4 stars, with Dehumidification  - $450");
					System.out.println("3. 2 Ton, 5 stars, with Turbo Cooling  - $550");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 

						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 3 stars, Easy Mobility  - $400");
							price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Blue Star Portable AC, 1 Ton, 3 stars, Easy Mobility", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1.5 Ton, 4 stars, with Dehumidification  - $450");
							price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Blue Star Portable AC, 1.5 Ton, 4 stars, with Dehumidification", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 2 Ton, 5 stars, with Turbo Cooling  - $550");
							price = 550;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Blue Star Portable AC, 2 Ton, 5 stars, with Turbo Cooling", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for Blue Star Smart AC
		public static void blueStarSmartACModel() {
			System.out.println("Blue Star Smart AC Specifications:");
			System.out.println("1. 1 Ton Smart AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 5 stars");
			System.out.println("   - Price Range: $450 - $600");
			String choice;
			while(true) {
				System.out.print("Would you like to select the Blue Star Smart AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your Blue Star Smart AC variant:");
					System.out.println("1. 1 Ton, 5 stars, Smart Wi-Fi Control  - $450");
					System.out.println("2. 1.5 Ton, 5 stars, Voice Control  - $500");
					System.out.println("3. 2 Ton, 5 stars, with Smart Remote  - $600");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 

						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 5 stars, Smart Wi-Fi Control  - $450");
							price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Blue Star Smart AC, 1 Ton, 5 stars, Smart Wi-Fi Control", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1.5 Ton, 5 stars, Voice Control  - $500");
							price = 500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Blue Star Smart AC, 1.5 Ton, 5 stars, Voice Control", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 2 Ton, 5 stars, with Smart Remote  - $600");
							price = 600;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Blue Star Smart AC, 2 Ton, 5 stars, with Smart Remote", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}
	}

	public class LGACSelector {
		public  static void showSpecifications() {
			while(true) {
			System.out.println("!-----Available Models-----!");
			System.out.println("1. LG Split AC");
			System.out.println("2. LG Window AC");
			System.out.println("3. LG Inverter AC");
			System.out.println("4.LG Portable AC");
			System.out.println("5. LG Smart AC");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print("Enter your choice (1-7): ");

			
				String series = scanner.next();

				switch(series) {
				case "1":
					lgSplitACModel();
					break;
				case "2":
					lgWindowACModel();
					break;
				case "3":
					lgInverterACModel();
					break;
				case "4":
					lgPortableACModel();
					break;
				case "5":
					lgSmartACModel();
					break;
				case "6":
					Acs.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println("Invalid choice. Please select a number between 1 and 7.");
				}
				if(series.equalsIgnoreCase("1")||series.equalsIgnoreCase("2")||series.equalsIgnoreCase("3")||series.equalsIgnoreCase("4")||series.equalsIgnoreCase("5")||series.equalsIgnoreCase("6")||series.equalsIgnoreCase("7")) break;
			}
		}

		// Method for LG Split AC
		public static void lgSplitACModel() {
			System.out.println("LG Split AC Specifications:");
			System.out.println("1. 1 Ton Split AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 3 stars");
			System.out.println("   - Price Range: $350 - $500");
			String choice;
			while(true) {
				System.out.print("Would you like to select the LG Split AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your LG Split AC variant:");
					System.out.println("1. 1 Ton, 3 stars, Cooling Only  - $350");
					System.out.println("2. 1 Ton, 4 stars, with Anti-Bacterial Filter  - $400");
					System.out.println("3. 1.5 Ton, 5 stars, with Turbo Cooling  - $500");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 3 stars, Cooling Only  - $350");
							price = 350;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Split AC, 1 Ton, 3 stars, Cooling Only", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1 Ton, 4 stars, with Anti-Bacterial Filter  - $400");
							price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Split AC, 1 Ton, 4 stars, with Anti-Bacterial Filter", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 1.5 Ton, 5 stars, with Turbo Cooling  - $500");
							price = 500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Split AC, 1.5 Ton, 5 stars, with Turbo Cooling", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for LG Window AC
		public static void lgWindowACModel() {
			System.out.println("LG Window AC Specifications:");
			System.out.println("1. 1 Ton Window AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 2 stars");
			System.out.println("   - Price Range: $250 - $400");
			String choice;
			while(true) {
				System.out.print("Would you like to select the LG Window AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your LG Window AC variant:");
					System.out.println("1. 1 Ton, 2 stars, Cooling Only  - $250");
					System.out.println("2. 1 Ton, 3 stars, with Dust Filter  - $300");
					System.out.println("3. 1.5 Ton, 4 stars, with Auto Restart  - $400");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 


						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 2 stars, Cooling Only  - $250");
							price = 250;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Window AC, 1 Ton, 2 stars, Cooling Only", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1 Ton, 3 stars, with Dust Filter  - $300");
							price = 300;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Window AC, 1 Ton, 3 stars, with Dust Filter", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 1.5 Ton, 4 stars, with Auto Restart  - $400");
							price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Window AC, 1.5 Ton, 4 stars, with Auto Restart", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for LG Inverter AC
		public static void lgInverterACModel() {
			System.out.println("LG Inverter AC Specifications:");
			System.out.println("1. 1 Ton Inverter AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 5 stars");
			System.out.println("   - Price Range: $450 - $650");
			String choice;
			while(true) {
				System.out.print("Would you like to select the LG Inverter AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your LG Inverter AC variant:");
					System.out.println("1. 1 Ton, 5 stars, Inverter with Smart Control  - $450");
					System.out.println("2. 1.5 Ton, 5 stars, Inverter with Auto Clean  - $550");
					System.out.println("3. 2 Ton, 5 stars, Inverter with Sleep Mode  - $650");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 

						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 5 stars, Inverter with Smart Control  - $450");
							price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Inverter AC, 1 Ton, 5 stars, Inverter with Smart Control", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1.5 Ton, 5 stars, Inverter with Auto Clean  - $550");
							price = 550;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Inverter AC, 1.5 Ton, 5 stars, Inverter with Auto Clean", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 2 Ton, 5 stars, Inverter with Sleep Mode  - $650");
							price = 650;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Inverter AC, 2 Ton, 5 stars, Inverter with Sleep Mode", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}

		// Method for LG Portable AC
		public static void lgPortableACModel() {
			System.out.println("LG Portable AC Specifications:");
			System.out.println("1. 1 Ton Portable AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 3 stars");
			System.out.println("   - Price Range: $400 - $550");
			String choice;
			while(true) {
				System.out.print("Would you like to select the LG Portable AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your LG Portable AC variant:");
					System.out.println("1. 1 Ton, 3 stars, Easy Mobility - $400");
					System.out.println("2. 1.5 Ton, 4 stars, with Dehumidification - $450");
					System.out.println("3. 2 Ton, 5 stars, with Turbo Cooling  - $550");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 

						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 3 stars, Easy Mobility  - $400");
							price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Portable AC, 1 Ton, 3 stars, Easy Mobility", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1.5 Ton, 4 stars, with Dehumidification  - $450");
							price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Portable AC, 1.5 Ton, 4 stars, with Dehumidification", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 2 Ton, 5 stars, with Turbo Cooling  - $550");
							price = 550;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Portable AC, 2 Ton, 5 stars, with Turbo Cooling", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "4":
							showSpecifications();
							break;
						}
					}
				}

				else if(choice.equalsIgnoreCase("No")) {
					showSpecifications();
					return;
				}
			}

		// Method for LG Smart AC
		public static void lgSmartACModel() {
			System.out.println("LG Smart AC Specifications:");
			System.out.println("1. 1 Ton Smart AC");
			System.out.println("   - Cooling Capacity: 1 Ton");
			System.out.println("   - Energy Rating: 5 stars");
			System.out.println("   - Price Range: $450 - $600");
			String choice;
			while(true) {
				System.out.print("Would you like to select the LG Smart AC model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
					while(true){
					System.out.println("Select your LG Smart AC variant:");
					System.out.println("1. 1 Ton, 5 stars, Smart Wi-Fi Control  - $450");
					System.out.println("2. 1.5 Ton, 5 stars, Voice Control  - $500");
					System.out.println("3. 2 Ton, 5 stars, with Smart Remote  - $600");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}
 

						switch(variant) {
						case "1":
							System.out.println("You've selected: 1 Ton, 5 stars, Smart Wi-Fi Control  - $450");
							price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Smart AC, 1 Ton, 5 stars, Smart Wi-Fi Control", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "2":
							System.out.println("You've selected: 1.5 Ton, 5 stars, Voice Control  - $500");
							price = 500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Smart AC, 1.5 Ton, 5 stars, Voice Control", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
						case "3":
							System.out.println("You've selected: 2 Ton, 5 stars, with Smart Remote  - $600");
							price = 600;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("LG Smart AC, 2 Ton, 5 stars, with Smart Remote", price);
								String dis;
								while(true) {
									System.out.println("Do you want to see cart (yes/no)");
									dis = scanner.next();
									if(dis.equalsIgnoreCase("yes") || dis.equalsIgnoreCase("no")) break;
									else System.out.print("Invalid Input.");
								}
								if(dis.equalsIgnoreCase("yes")) {
									ct.displayCart();
								}

							}
							break;
				case "4":
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}
	}
	public static void range() {
		int ran;
		int ran1;
		System.out.println("Please enter your Starting Range");
		System.out.print("$ ");

		while(true) {
			try {
				ran = scanner.nextInt();
				break;
			}
			catch(Exception e) {
				System.out.println("Please enter a Integer value");
			}
		}
		System.out.println("Please enter your Ending  Range");
		System.out.print("$ ");
		while(true) {
			try {
				ran1 = scanner.nextInt();
				break;
			}
			catch(Exception e) {
				System.out.println("Please enter a Integer value");
			}
		}
		for(int i = ran; i<=ran1; i++) {

		}
	}
	public static void main(String[] args) {
		Acs ac = new Acs();

		System.out.println("Welcome to AC Selector!");
		System.out.println("Choose from our AC models:");
		System.out.println("1. Haier ACs");
		System.out.println("2. Whirlpool Acs");
		System.out.println("3. Godrej Acs");
		System.out.println("4. Blue Star Acs");
		System.out.println("5. LG Acs");
		System.out.println("6. Back");

		
		while(true) {
			System.out.print("Enter your choice (1-6): ");
			String series = scanner.next();

			switch(series) {
			case "1":
				Acs.HaierACSelector haier = ac.new HaierACSelector();
				haier.showSpecifications();
				break;
			case "2":
				Acs.WhirlpoolACSelector whirlpool = ac.new WhirlpoolACSelector();
				whirlpool.showSpecifications();
				break;
			case "3":
				Acs.GodrejACSelector godrej = ac.new GodrejACSelector();
				godrej.showSpecifications();
				break;
			case "4":
				Acs.BlueStarACSelector bluestar = ac.new BlueStarACSelector();
				bluestar.showSpecifications();
				break;
			case "5":
				Acs.LGACSelector lg = ac.new LGACSelector();
				lg.showSpecifications();
				break;
			case "6":
			Promain Main = new Promain();
			Main.main(new String[]{});
			break ;
			default:
				System.out.println("Invalid selection");
			}
			if(series.equals("1")||series.equals("2")||series.equals("3")||series.equals("4")||series.equals("5")) break;
		}
		scanner.close();
	}
}

