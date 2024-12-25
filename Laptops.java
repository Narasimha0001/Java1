package app;
import app.Promain;
import java.util.Scanner;
import ca.Cart;
public class Laptops {

    static Cart ct = Cart.cart;
	static double price ;
	static String sc;
	static Promain main = Promain.main;
	private static Scanner scanner = new Scanner(System.in);

	public class Lenovo {
		public void showSpecifications() {
			while(true) {
			System.out.println("!-----Available Models-----!");
			System.out.println("1. Lenovo ThinkPad Laptop");
			System.out.println("2. Lenovo IdeaPad Laptop");
			System.out.println("3. Lenovo Legion Laptop");
			System.out.println("4. Lenovo Yoga Laptop");
			System.out.println("5. Lenovo Chromebook Laptop");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print("Enter your choice between 1 and 7: "); 

				String series = scanner.next();

				switch(series) {
				case "1":
					lenovoThinkPadModel();
					break;
				case "2":
					lenovoIdeaPadModel();
					break;
				case "3":
					lenovoLegionModel();
					break;
				case "4":
					lenovoYogaModel();
					break;
				case "5":
					lenovoChromebookModel();
					break;
				case "6":
					Laptops.main(new String[] {});
					return;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println("Invalid choice. Please select a number between 1 and 7.");
				}
				if(series.equals("1")||series.equals("2")||series.equals("3")||series.equals("4")||series.equals("5")||series.equals("6")||series.equals("7")) break;
			}
		}
		public void lenovoThinkPadModel() {
			System.out.println("Lenovo ThinkPad Laptop Specifications:");
			System.out.println("1. ThinkPad X1 Carbon");
			System.out.println("   - Processor: Intel Core i5/i7");
			System.out.println("   - RAM: 8GB/16GB");
			System.out.println("   - Storage: 256GB/512GB SSD");
			System.out.println("   - Graphics: Integrated");
			System.out.println("   - Price Range: $1000 - $1500");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Lenovo ThinkPad Laptop model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your ThinkPad variant:");
					System.out.println("1. ThinkPad X1 Carbon Core i5, 8GB RAM, 256GB SSD  - $1000");
					System.out.println("2. ThinkPad X1 Carbon Core i7, 16GB RAM, 512GB SSD  - $1500");
					System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}

						switch (variant) {
						case "1":
							System.out.println("You've selected: ThinkPad X1 Carbon Core i5, 8GB RAM, 256GB SSD  - $1000");
                            price = 1000;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Lenovo ThinkPad Laptop, ThinkPad X1 Carbon Core i5, 8GB RAM, 256GB SSD", price);
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
							System.out.println("You've selected: ThinkPad X1 Carbon Core i7, 16GB RAM, 512GB SSD  - $1500");
                            price = 1500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Lenovo ThinkPad Laptop, ThinkPad X1 Carbon Core i7, 16GB RAM, 512GB SSD", price);
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

		public void lenovoIdeaPadModel() {
			System.out.println("Lenovo IdeaPad Laptop Specifications:");
			System.out.println("1. IdeaPad Slim 5");
			System.out.println("   - Processor: AMD Ryzen 5/7");
			System.out.println("   - RAM: 8GB/16GB");
			System.out.println("   - Storage: 256GB/512GB SSD");
			System.out.println("   - Graphics: Integrated");
			System.out.println("   - Price Range: $700 - $1000");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Lenovo IdeaPad Laptop model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your IdeaPad variant:");
					System.out.println("1. IdeaPad Slim 5 Ryzen 5, 8GB RAM, 256GB SSD  - $700");
					System.out.println("2. IdeaPad Slim 5 Ryzen 7, 16GB RAM, 512GB SSD  - $1000");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}

						switch (variant) {
						case "1":
							System.out.println("You've selected: IdeaPad Slim 5 Ryzen 5, 8GB RAM, 256GB SSD  - $700");
                            price = 700;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Lenovo IdeaPad Laptop, IdeaPad Slim 5 Ryzen 5, 8GB RAM, 256GB SSD", price);
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
							System.out.println("You've selected: IdeaPad Slim 5 Ryzen 7, 16GB RAM, 512GB SSD  - $1000");
                            price = 1000;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Lenovo IdeaPad Laptop, IdeaPad Slim 5 Ryzen 7, 16GB RAM, 512GB SSD", price);
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

		public void lenovoLegionModel() {
			System.out.println("Lenovo Legion Laptop Specifications:");
			System.out.println("1. Legion 5 Pro");
			System.out.println("   - Processor: Intel Core i7/i9");
			System.out.println("   - RAM: 16GB/32GB");
			System.out.println("   - Storage: 512GB/1TB SSD");
			System.out.println("   - Graphics: NVIDIA RTX 3060/3070");
			System.out.println("   - Price Range: $1500 - $2500");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Lenovo Legion Laptop model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Legion variant:");
					System.out.println("1. Legion 5 Pro Core i7, 16GB RAM, 512GB SSD, RTX 3060  - $1500");
					System.out.println("2. Legion 5 Pro Core i9, 32GB RAM, 1TB SSD, RTX 3070  - $2500");
					System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}

						switch (variant) {
						case "1":
							System.out.println("You've selected: Legion 5 Pro Core i7, 16GB RAM, 512GB SSD, RTX 3060  - $1500");
                            price = 1500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Lenovo Legion Laptop, Legion 5 Pro Core i7, 16GB RAM, 512GB SSD, RTX 3060", price);
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
							System.out.println("You've selected: Legion 5 Pro Core i9, 32GB RAM, 1TB SSD, RTX 3070  - $2500");
                            price = 2500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Lenovo Legion Laptop, Legion 5 Pro Core i9, 32GB RAM, 1TB SSD, RTX 3070", price);
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

		public void lenovoYogaModel() {
			System.out.println("Lenovo Yoga Laptop Specifications:");
			System.out.println("1. Yoga 7i");
			System.out.println("   - Processor: Intel Core i5/i7");
			System.out.println("   - RAM: 8GB/16GB");
			System.out.println("   - Storage: 256GB/512GB SSD");
			System.out.println("   - Graphics: Integrated");
			System.out.println("   - Price Range: $900 - $1300");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Lenovo Yoga Laptop model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Yoga variant:");
					System.out.println("1. Yoga 7i Core i5, 8GB RAM, 256GB SSD  - $900");
					System.out.println("2. Yoga 7i Core i7, 16GB RAM, 512GB SSD  - $1300");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}

						switch (variant) {
						case "1":
							System.out.println("You've selected: Yoga 7i Core i5, 8GB RAM, 256GB SSD  - $900");
                            price = 900;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Lenovo Yoga Laptop, Yoga 7i Core i5, 8GB RAM, 256GB SSD", price);
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
							System.out.println("You've selected: Yoga 7i Core i7, 16GB RAM, 512GB SSD  - $1300");
                            price = 1300;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Lenovo Yoga Laptop, Yoga 7i Core i7, 16GB RAM, 512GB SSD", price);
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

		public void lenovoChromebookModel() {
			System.out.println("Lenovo Chromebook Laptop Specifications:");
			System.out.println("1. Chromebook Flex 5");
			System.out.println("   - Processor: Intel Core i3/i5");
			System.out.println("   - RAM: 4GB/8GB");
			System.out.println("   - Storage: 64GB/128GB eMMC");
			System.out.println("   - Graphics: Integrated");
			System.out.println("   - Price Range: $300 - $500");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Lenovo Chromebook Laptop model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Chromebook variant:");
					System.out.println("1. Chromebook Flex 5 Core i3, 4GB RAM, 64GB eMMC  - $300");
					System.out.println("2. Chromebook Flex 5 Core i5, 8GB RAM, 128GB eMMC  - $500");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}

						switch (variant) {
						case "1":
							System.out.println("You've selected: Chromebook Flex 5 Core i3, 4GB RAM, 64GB eMMC  - $300");
                            price = 300;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Lenovo Chromebook Laptop, Chromebook Flex 5 Core i3, 4GB RAM, 64GB eMMC", price);
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
							System.out.println("You've selected: Chromebook Flex 5 Core i5, 8GB RAM, 128GB eMMC  - $500");
                            price = 500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Lenovo Chromebook Laptop, Chromebook Flex 5 Core i5, 8GB RAM, 128GB eMMC", price);
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

	public class Dell {
		public void showSpecifications() {
			while(true) {
			System.out.println("!-----Available Models-----!");
			System.out.println("1. Dell XPS Laptop");
			System.out.println("2. Dell Latitude Laptop");
			System.out.println("3. Dell Vostro Laptop");
			System.out.println("4. Dell Alienware Laptop");
			System.out.println("5. Back");
			System.out.println("6. Home");
			System.out.print("Enter your choice (1-6): ");

			
				String series = scanner.next();

				switch(series) {
				case "1":
					xpsModel();
					break;
				case "2":
					latitudeModel();
					break;
				case "3":
					vostroModel();
					break;
				case "4":
					alienwareModel();
					break;
				case "5":
					Laptops.main(new String[] {});
					return ;
					case "6":
					main.main(new String[]{});
				default:
					System.out.println("Invalid choice. Please select a number between 1 and 6.");
				}
				if(series.equals("1")||series.equals("2")||series.equals("3")||series.equals("4")||series.equals("5")||series.equals("6")) break;
			}
		}
		// Method for Dell XPS Laptop
		public void xpsModel() {
			System.out.println("Dell XPS Laptop Specifications:");
			System.out.println("1. XPS 13-inch");
			System.out.println("   - Processor: Intel Core i5/i7/i9");
			System.out.println("   - RAM: 16GB/32GB");
			System.out.println("   - Storage: 512GB/1TB SSD");
			System.out.println("   - Graphics: Integrated");
			System.out.println("   - Price Range: $1000 - $2000");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Dell XPS Laptop model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your XPS variant:");
					System.out.println("1. XPS 13 Core i7, 16GB RAM, 512GB SSD  - $1000");
					System.out.println("2. XPS 13 Core i9, 32GB RAM, 1TB SSD  - $2000");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}
						switch(variant) {
						case "1":
							System.out.println("You've selected: XPS 13 Core i7, 16GB RAM, 512GB SSD  - $1000");
                            price = 1000;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Dell XPS Laptop, XPS 13 Core i7, 16GB RAM, 512GB SSD", price);
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
							System.out.println("You've selected: XPS 13 Core i9, 32GB RAM, 1TB SSD  - $2000");
                            price = 2000;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Dell XPS Laptop, XPS 13 Core i9, 32GB RAM, 1TB SSD", price);
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

// Method for Dell Latitude Laptop
		public void latitudeModel() {
			System.out.println("Dell Latitude Laptop Specifications:");
			System.out.println("1. Latitude 14-inch");
			System.out.println("   - Processor: Intel Core i3/i5/i7");
			System.out.println("   - RAM: 8GB/16GB");
			System.out.println("   - Storage: 256GB/512GB SSD");
			System.out.println("   - Graphics: Integrated");
			System.out.println("   - Price Range: $700 - $1500");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Dell Latitude Laptop model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Latitude variant:");
					System.out.println("1. Latitude 14 Core i5, 8GB RAM, 256GB SSD  - $700");
					System.out.println("2. Latitude 14 Core i7, 16GB RAM, 512GB SSD  - $1500");
					System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}


						switch(variant) {
						case "1":
							System.out.println("You've selected: Latitude 14 Core i5, 8GB RAM, 256GB SSD  - $700");
                            price = 700;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Dell Latitude Laptop, Latitude 14 Core i5, 8GB RAM, 256GB SSD", price);
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
							System.out.println("You've selected: Latitude 14 Core i7, 16GB RAM, 512GB SSD  - $1500");
                            price = 1500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Dell Latitude Laptop, Latitude 14 Core i7, 16GB RAM, 512GB SSD", price);
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

// Method for Dell Vostro Laptop
		public void vostroModel() {
			System.out.println("Dell Vostro Laptop Specifications:");
			System.out.println("1. Vostro 15-inch");
			System.out.println("   - Processor: Intel Core i3/i5/i7");
			System.out.println("   - RAM: 8GB/16GB");
			System.out.println("   - Storage: 256GB/512GB SSD");
			System.out.println("   - Graphics: Integrated/Dedicated");
			System.out.println("   - Price Range: $600 - $1200");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Dell Vostro Laptop model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Vostro variant:");
					System.out.println("1. Vostro 15 Core i5, 8GB RAM, 256GB SSD  - $600");
					System.out.println("2. Vostro 15 Core i7, 16GB RAM, 512GB SSD  - $1200");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}


						switch(variant) {
						case "1":
							System.out.println("You've selected: Vostro 15 Core i5, 8GB RAM, 256GB SSD - $600");
                            price = 600;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Dell Vostro Laptop, Vostro 15 Core i5, 8GB RAM, 256GB SSD", price);
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
							System.out.println("You've selected: Vostro 15 Core i7, 16GB RAM, 512GB SSD  - $1200");
                            price = 1200;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Dell Vostro Laptop, Vostro 15 Core i7, 16GB RAM, 512GB SSD", price);
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

// Method for Dell Alienware Laptop
		public void alienwareModel() {
			System.out.println("Dell Alienware Laptop Specifications:");
			System.out.println("1. Alienware 15-inch");
			System.out.println("   - Processor: Intel Core i7/i9");
			System.out.println("   - RAM: 16GB/32GB");
			System.out.println("   - Storage: 1TB/2TB SSD");
			System.out.println("   - Graphics: Dedicated NVIDIA GeForce RTX");
			System.out.println("   - Price Range: $2000 - $4000");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Dell Alienware Laptop model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Alienware variant:");
					System.out.println("1. Alienware 15 Core i7, 16GB RAM, 1TB SSD, RTX 4060  - $2000");
					System.out.println("2. Alienware 15 Core i9, 32GB RAM, 2TB SSD, RTX 4090  - $4000");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}


						switch(variant) {
						case "1":
							System.out.println("You've selected: Alienware 15 Core i7, 16GB RAM, 1TB SSD, RTX 4060  - $2000");
                            price = 2000;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Dell Alienware Laptop, Alienware 15 Core i7, 16GB RAM, 1TB SSD, RTX 4060", price);
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
							System.out.println("You've selected: Alienware 15 Core i9, 32GB RAM, 2TB SSD, RTX 4090  - $4000");
                            price = 4000;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Dell Alienware Laptop, Alienware 15 Core i9, 32GB RAM, 2TB SSD, RTX 4090", price);
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


	public class HP {
		public void showSpecifications() {
			while(true) {
			System.out.println("!-----Available Models-----!");
			System.out.println("1. HP Pavilion Laptop");
			System.out.println("2. HP Spectre Laptop");
			System.out.println("3. HP Envy Laptop");
			System.out.println("4. HP Omen Gaming Laptop");
			System.out.println("5. HP Elite Dragonfly Business Laptop");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print("Enter your choice (1-7): ");

			
				String series = scanner.next();

				switch(series) {
				case "1":
					pavilionModel();
					break;
				case "2":
					spectreModel();
					break;
				case "3":
					envyModel();
					break;
				case "4":
					omenModel();
					break;
				case "5":
					eliteDragonflyModel();
					break;
				case "6":
					Laptops.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				}
				if(series.equals("1")||series.equals("2")||series.equals("3")||series.equals("4")||series.equals("5")||series.equals("6")||series.equals("7")) break;
			}
		}

		// Method for HP Pavilion Laptop
		public void pavilionModel() {
			System.out.println("HP Pavilion Laptop Specifications:");
			System.out.println("1. Pavilion 15-inch");
			System.out.println("   - Processor: Intel Core i5/i7");
			System.out.println("   - RAM: 8GB/16GB");
			System.out.println("   - Storage: 256GB/512GB SSD");
			System.out.println("   - Graphics: Integrated/Dedicated");
			System.out.println("   - Price Range: $600 - $1000");
            String choice;
			while(true) {
				System.out.print("Would you like to select the HP Pavilion Laptop model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Pavilion variant:");
					System.out.println("1. 15-inch Core i5, 8GB RAM, 256GB SSD  - $600");
					System.out.println("2. 15-inch Core i7, 16GB RAM, 512GB SSD  - $1000");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}


						switch(variant) {
						case "1":
							System.out.println("You've selected: Pavilion 15-inch Core i5, 8GB RAM, 256GB SSD  - $600");
                            price = 600;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("HP Pavilion Laptop, Pavilion 15-inch Core i5, 8GB RAM, 256GB SSD", price);
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
							System.out.println("You've selected: Pavilion 15-inch Core i7, 16GB RAM, 512GB SSD  - $1000");
                            price = 1000;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("HP Pavilion Laptop, Pavilion 15-inch Core i7, 16GB RAM, 512GB SSD", price);
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

		// Method for HP Spectre Laptop
		public void spectreModel() {
			System.out.println("HP Spectre Laptop Specifications:");
			System.out.println("1. Spectre x360");
			System.out.println("   - Processor: Intel Core i7");
			System.out.println("   - RAM: 16GB");
			System.out.println("   - Storage: 512GB/1TB SSD");
			System.out.println("   - Graphics: Integrated Intel Iris Xe");
			System.out.println("   - Features: 2-in-1 Convertible, Premium Design");
			System.out.println("   - Price Range: $1200 - $1800");
            String choice;
			while(true) {
				System.out.print("Would you like to select the HP Spectre Laptop model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Spectre variant:");
					System.out.println("1. x360 Core i7, 16GB RAM, 512GB SSD  - $1200");
					System.out.println("2. x360 Core i7, 16GB RAM, 1TB SSD  - $1800");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}


						switch(variant) {
						case "1":
							System.out.println("You've selected: Spectre x360 Core i7, 16GB RAM, 512GB SSD  - $1200");
                            price = 1200;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("HP Spectre Laptop, Spectre x360 Core i7, 16GB RAM, 512GB SSD", price);
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
							System.out.println("You've selected: Spectre x360 Core i7, 16GB RAM, 1TB SSD  - $1800");
                            price = 1800;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("HP Spectre Laptop, Spectre x360 Core i7, 16GB RAM, 1TB SSD", price);
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

		// Method for HP Envy Laptop
		public void envyModel() {
			System.out.println("HP Envy Laptop Specifications:");
			System.out.println("1. Envy 15-inch");
			System.out.println("   - Processor: Intel Core i7/i9");
			System.out.println("   - RAM: 16GB/32GB");
			System.out.println("   - Storage: 512GB/1TB SSD");
			System.out.println("   - Graphics: NVIDIA GeForce RTX");
			System.out.println("   - Price Range: $1000 - $2000");
            String choice;
			while(true) {
				System.out.print("Would you like to select the HP Envy Laptop model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Envy variant:");
					System.out.println("1. Envy 15-inch Core i7, 16GB RAM, 512GB SSD  - $1000");
					System.out.println("2. Envy 15-inch Core i9, 32GB RAM, 1TB SSD  - $2000");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}

						switch(variant) {
						case "1":
							System.out.println("You've selected: Envy 15-inch Core i7, 16GB RAM, 512GB SSD  - $2000");
                            price = 1000;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("HP Envy Laptop, Envy 15-inch Core i7, 16GB RAM, 512GB SSD", price);
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
							System.out.println("You've selected: Envy 15-inch Core i9, 32GB RAM, 1TB SSD  - $2000");
                            price = 2000;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("HP Envy Laptop, Envy 15-inch Core i9, 32GB RAM, 1TB SSD", price);
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

		// Method for HP Omen Gaming Laptop
		public void omenModel() {
			System.out.println("HP Omen Gaming Laptop Specifications:");
			System.out.println("1. Omen 15-inch");
			System.out.println("   - Processor: Intel Core i7/i9");
			System.out.println("   - RAM: 16GB/32GB");
			System.out.println("   - Storage: 512GB/1TB SSD");
			System.out.println("   - Graphics: NVIDIA GeForce RTX 3070/3080");
			System.out.println("   - Price Range: $1500 - $2500");
            String choice;
			while(true) {
				System.out.print("Would you like to select the HP Omen Gaming Laptop model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}


				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Omen variant:");
					System.out.println("1. Omen 15-inch Core i7, 16GB RAM, RTX 3070  - $1500");
					System.out.println("2. Omen 15-inch Core i9, 32GB RAM, RTX 3080  - $2500");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}


						switch(variant) {
						case "1":
							System.out.println("You've selected: Omen 15-inch Core i7, 16GB RAM, RTX 3070  - $1500");
                            price = 1500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("HP Omen Gaming Laptop, Omen 15-inch Core i7, 16GB RAM, RTX 3070", price);
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
							System.out.println("You've selected: Omen 15-inch Core i9, 32GB RAM, RTX 3080  - $2500");
                            price = 2500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("HP Omen Gaming Laptop, Omen 15-inch Core i9, 32GB RAM, RTX 3080", price);
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

		// Method for HP Elite Dragonfly Business Laptop
		public void eliteDragonflyModel() {
			System.out.println("HP Elite Dragonfly Business Laptop Specifications:");
			System.out.println("1. Elite Dragonfly G3");
			System.out.println("   - Processor: Intel Core i5/i7");
			System.out.println("   - RAM: 16GB/32GB");
			System.out.println("   - Storage: 512GB/1TB SSD");
			System.out.println("   - Graphics: Integrated Intel Iris Xe");
			System.out.println("   - Features: Ultra-lightweight, Business-class Security");
			System.out.println("   - Price Range: $1500 - $2500");
            String choice;
			while(true) {
				System.out.print("Would you like to select the HP Elite Dragonfly Business model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}


				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Elite Dragonfly variant:");
					System.out.println("1. Elite Dragonfly G3 Core i5, 16GB RAM, 512GB SSD  - $1500");
					System.out.println("2. Elite Dragonfly G3 Core i7, 32GB RAM, 1TB SSD  - $2500");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}


						switch(variant) {
						case "1":
							System.out.println("You've selected: Elite Dragonfly G3 Core i5, 16GB RAM, 512GB SSD  - $1500");
                            price = 1500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("HP Elite Dragonfly Business Laptop, Elite Dragonfly G3 Core i5, 16GB RAM, 512GB SSD", price);
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
							System.out.println("You've selected: Elite Dragonfly G3 Core i7, 32GB RAM, 1TB SSD  - $2500");
                            price = 2500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("HP Elite Dragonfly Business Laptop, Elite Dragonfly G3 Core i7, 32GB RAM, 1TB SSD", price);
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

	// Main method to demonstrate the functionality

	public class MacBook {
		public void showSpecifications() {
			while(true) {
			System.out.println("!-----Available Models-----!");
			System.out.println("1. MacBook Air");
			System.out.println("2. MacBook Pro 14-inch");
			System.out.println("3. MacBook Pro 16-inch");
			System.out.println("4. MacBook Air 15-inch");
			System.out.println("5. MacBook Pro 13-inch");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print("Enter your choice (1-7): ");

			
				String series = scanner.next();

				switch(series) {
				case "1":
					macBookAirModel();
					break;
				case "2":
					macBookPro14Model();
					break;
				case "3":
					macBookPro16Model();
					break;
				case "4":
					macBookAir15Model();
					break;
				case "5":
					macBookPro13Model();
					break;
				case "6":
					Laptops.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println("Invalid choice. Please select a number between 1 and 7.");
				}
				if(series.equals("1")||series.equals("2")||series.equals("3")||series.equals("4")||series.equals("5")||series.equals("6")||series.equals("7")) break;
			}
		}

// Method for MacBook Air
		public void macBookAirModel() {
			System.out.println("MacBook Air Specifications:");
			System.out.println("1. MacBook Air 13-inch");
			System.out.println("   - Processor: Apple M1/M2");
			System.out.println("   - RAM: 8GB/16GB");
			System.out.println("   - Storage: 256GB/512GB SSD");
			System.out.println("   - Price Range: $999 - $1499");
            String choice;
			while(true) {
				System.out.print("Would you like to select the MacBook Air model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your MacBook Air variant:");
					System.out.println("1. MacBook Air M1, 8GB RAM, 256GB SSD  - $999");
					System.out.println("2. MacBook Air M2, 16GB RAM, 512GB SSD  - $1499");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}


						switch(variant) {
						case "1":
							System.out.println("You've selected: MacBook Air M1, 8GB RAM, 256GB SSD  - $999");
                            price = 999;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem(" MacBook Air M1, 8GB RAM, 256GB SSD", price);
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
							System.out.println("You've selected: MacBook Air M2, 16GB RAM, 512GB SSD  - $1499");
                            price = 1499;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem(" MacBook Air M2, 16GB RAM, 512GB SSD", price);
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
						showSpecifications();
						break;
					}
				}

			}
			else if(choice.equalsIgnoreCase("No")) {
				showSpecifications();
				return;
			}

		}// Method for MacBook Pro 14-inch
		public void macBookPro14Model() {
			System.out.println("MacBook Pro 14-inch Specifications:");
			System.out.println("1. MacBook Pro 14-inch");
			System.out.println("   - Processor: Apple M1 Pro/M2 Pro");
			System.out.println("   - RAM: 16GB/32GB");
			System.out.println("   - Storage: 512GB/1TB SSD");
			System.out.println("   - Price Range: $1999 - $2499");
            String choice;
			while(true) {
				System.out.print("Would you like to select the MacBook Pro 14-inch model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your MacBook Pro 14-inch variant:");
					System.out.println("1. MacBook Pro 14 M1 Pro, 16GB RAM, 512GB SSD  - $1999");
					System.out.println("2. MacBook Pro 14 M2 Pro, 32GB RAM, 1TB SSD  - $2499");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}


						switch(variant) {
						case "1":
							System.out.println("You've selected: MacBook Pro 14 M1 Pro, 16GB RAM, 512GB SSD  - $1999");
                            price = 1999;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("MacBook Pro 14 M1 Pro, 16GB RAM, 512GB SSD", price);
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
							System.out.println("You've selected: MacBook Pro 14 M2 Pro, 32GB RAM, 1TB SSD  - $2499");
                            price = 2499;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("MacBook Pro 14 M2 Pro, 32GB RAM, 1TB SSD", price);
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

// Method for MacBook Pro 16-inch
		public void macBookPro16Model() {
			System.out.println("MacBook Pro 16-inch Specifications:");
			System.out.println("1. MacBook Pro 16-inch");
			System.out.println("   - Processor: Apple M1 Max/M2 Max");
			System.out.println("   - RAM: 32GB/64GB");
			System.out.println("   - Storage: 1TB/2TB SSD");
			System.out.println("   - Price Range: $2499 - $3499");
            String choice;
			while(true) {
				System.out.print("Would you like to select the MacBook Pro 16-inch model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your MacBook Pro 16-inch variant:");
					System.out.println("1. MacBook Pro 16 M1 Max, 32GB RAM, 1TB SSD  - $2499");
					System.out.println("2. MacBook Pro 16 M2 Max, 64GB RAM, 2TB SSD  - $3499");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}

						switch(variant) {
						case "1":
							System.out.println("You've selected: MacBook Pro 16 M1 Max, 32GB RAM, 1TB SSD  - $2499");
                            price = 2499;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("MacBook Pro 16 M1 Max, 32GB RAM, 1TB SSD", price);
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
							System.out.println("You've selected: MacBook Pro 16 M2 Max, 64GB RAM, 2TB SSD  - $3499");
                            price = 3499;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("MacBook Pro 16 M2 Max, 64GB RAM, 2TB SSD", price);
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

// Method for MacBook Air 15-inch
		public void macBookAir15Model() {
			System.out.println("MacBook Air 15-inch Specifications:");
			System.out.println("1. MacBook Air 15-inch");
			System.out.println("   - Processor: Apple M2");
			System.out.println("   - RAM: 8GB/16GB");
			System.out.println("   - Storage: 512GB/1TB SSD");
			System.out.println("   - Price Range: $1299 - $1599");
            String choice;
			while(true) {
				System.out.print("Would you like to select the MacBook Air 15-inch model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your MacBook Air 15-inch variant:");
					System.out.println("1. MacBook Air 15 M2, 8GB RAM, 512GB SSD  - $1299");
					System.out.println("2. MacBook Air 15 M2, 16GB RAM, 1TB SSD  - $1599");
					System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}

						switch(variant) {
						case "1":
							System.out.println("You've selected: MacBook Air 15 M2, 8GB RAM, 512GB SSD  - $1299");
                            price = 1299;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("MacBook Air 15-inch, MacBook Air 15 M2, 8GB RAM, 512GB SSD", price);
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
							System.out.println("You've selected: MacBook Air 15 M2, 16GB RAM, 1TB SSD  - $1599");
                            price = 1599;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("MacBook Air 15-inch, MacBook Air 15 M2, 16GB RAM, 1TB SSD", price);
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

// Method for MacBook Pro 13-inch
		public void macBookPro13Model() {
			System.out.println("MacBook Pro 13-inch Specifications:");
			System.out.println("1. MacBook Pro 13-inch");
			System.out.println("   - Processor: Apple M2");
			System.out.println("   - RAM: 8GB/16GB");
			System.out.println("   - Storage: 256GB/512GB SSD");
			System.out.println("   - Price Range: $1299 - $1499");
            String choice;
			while(true) {
				System.out.print("Would you like to select the MacBook Pro 13-inch model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your MacBook Pro 13-inch variant:");
					System.out.println("1. MacBook Pro 13 M2, 8GB RAM, 256GB SSD  - $1299");
					System.out.println("2. MacBook Pro 13 M2, 16GB RAM, 512GB SSD  - $1499");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}


						switch(variant) {
						case "1":
							System.out.println("You've selected: MacBook Pro 13 M2, 8GB RAM, 256GB SSD  - $1299");
                            price = 1299;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("MacBook Pro 13-inch, MacBook Pro 13 M2, 8GB RAM, 256GB SSD", price);
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
							System.out.println("You've selected: MacBook Pro 13 M2, 16GB RAM, 512GB SSD  - $1499");
                            price = 1499;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("MacBook Pro 13-inch, MacBook Pro 13 M2, 16GB RAM, 512GB SSD", price);
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
	public class Asus {
		public void showSpecifications() {
			while(true) {
			System.out.println("!-----Available Models-----!");
			System.out.println("1. Asus Vivobook");
			System.out.println("2. Asus Zenbook");
			System.out.println("3. Asus ROG");
			System.out.println("4. Asus TUF");
			System.out.println("5. Asus ExpertBook");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print("Enter your choice (1-7): ");

			
				String series = scanner.next();

				switch(series) {
				case "1":
					asusVivobookModel();
					break;
				case "2":
					asusZenbookModel();
					break;
				case "3":
					asusRogModel();
					break;
				case "4":
					asusTufModel();
					break;
				case "5":
					asusExpertBookModel();
					break;
				case "6":
					Laptops.main(new String[] {});
					return ;
				case "7":
					main.main(new String[]{});
				default:
					System.out.println("Invalid choice. Please select a number between 1 and 7.");
				}
				if(series.equals("1")||series.equals("2")||series.equals("3")||series.equals("4")||series.equals("5")||series.equals("6")||series.equals("7")) break;
			}
		}
		public void asusVivobookModel() {
			System.out.println("Asus Vivobook Specifications:");
			System.out.println("1. Vivobook 14-inch");
			System.out.println("   - Processor: Intel Core i3/i5");
			System.out.println("   - RAM: 8GB");
			System.out.println("   - Storage: 256GB SSD");
			System.out.println("   - Price Range: $400 - $700");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Asus Vivobook model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Vivobook variant:");
					System.out.println("1. Vivobook Core i3, 8GB RAM, 256GB SSD  - $400");
					System.out.println("2. Vivobook Core i5, 8GB RAM, 256GB SSD  - $700");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}

						switch(variant) {
						case "1":
							System.out.println("You've selected: Vivobook Core i3, 8GB RAM, 256GB SSD  - $400");
                            price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Asus Vivobook, Vivobook Core i3, 8GB RAM, 256GB SSD", price);
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
							System.out.println("You've selected: Vivobook Core i5, 8GB RAM, 256GB SSD  - $700");
                            price = 700;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Asus Vivobook, Vivobook Core i5, 8GB RAM, 256GB SSD", price);
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

		// Method for Asus Zenbook
		public void asusZenbookModel() {
			System.out.println("Asus Zenbook Specifications:");
			System.out.println("1. Zenbook 13-inch");
			System.out.println("   - Processor: Intel Core i5/i7");
			System.out.println("   - RAM: 16GB");
			System.out.println("   - Storage: 512GB SSD");
			System.out.println("   - Price Range: $800 - $1200");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Asus Zenbook model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Zenbook variant:");
					System.out.println("1. Zenbook Core i5, 16GB RAM, 512GB SSD  - $800");
					System.out.println("2. Zenbook Core i7, 16GB RAM, 512GB SSD  - $1200");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}


						switch(variant) {
						case "1":
							System.out.println("You've selected: Zenbook Core i5, 16GB RAM, 512GB SSD  - $800");
                            price = 800;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Asus Zenbook, Zenbook Core i5, 16GB RAM, 512GB SSD", price);
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
							System.out.println("You've selected: Zenbook Core i7, 16GB RAM, 512GB SSD  - $1200");
                            price = 1200;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Asus Zenbook, Zenbook Core i7, 16GB RAM, 512GB SSD", price);
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

		// Method for Asus ROG
		public void asusRogModel() {
			System.out.println("Asus ROG Specifications:");
			System.out.println("1. ROG 15-inch");
			System.out.println("   - Processor: AMD Ryzen 7/9");
			System.out.println("   - RAM: 16GB/32GB");
			System.out.println("   - Storage: 1TB SSD");
			System.out.println("   - Graphics: NVIDIA GeForce RTX 3060/3070");
			System.out.println("   - Price Range: $1500 - $2500");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Asus ROG model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your ROG variant:");
					System.out.println("1. ROG Ryzen 7, 16GB RAM, 1TB SSD, RTX 3060  - $1500");
					System.out.println("2. ROG Ryzen 9, 32GB RAM, 1TB SSD, RTX 3070  - $2500");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}


						switch(variant) {
						case "1":
							System.out.println("You've selected: ROG Ryzen 7, 16GB RAM, 1TB SSD, RTX 3060  - $1500");
                            price = 1500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Asus ROG, ROG Ryzen 7, 16GB RAM, 1TB SSD, RTX 3060", price);
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
							System.out.println("You've selected: ROG Ryzen 9, 32GB RAM, 1TB SSD, RTX 3070  - $2500");
                            price = 2500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Asus ROG, ROG Ryzen 9, 32GB RAM, 1TB SSD, RTX 3070", price);
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
		// Method for Asus TUF
		public  void asusTufModel() {
			System.out.println("Asus TUF Specifications:");
			System.out.println("1. TUF 15-inch");
			System.out.println("   - Processor: Intel Core i7/i9 or AMD Ryzen 7/9");
			System.out.println("   - RAM: 16GB/32GB");
			System.out.println("   - Storage: 512GB SSD/1TB SSD");
			System.out.println("   - Graphics: NVIDIA GeForce RTX 3060/3070");
			System.out.println("   - Price Range: $1000 - $2000");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Asus TUF model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your TUF variant:");
					System.out.println("1. TUF Intel Core i7, 16GB RAM, 512GB SSD, RTX 3060  - $1000");
					System.out.println("2. TUF Ryzen 9, 32GB RAM, 1TB SSD, RTX 3070  - $2000");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}


						switch(variant) {
						case "1":
							System.out.println("You've selected: TUF Intel Core i7, 16GB RAM, 512GB SSD, RTX 3060  - $1000");
                            price = 1000;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Asus TUF, TUF Intel Core i7, 16GB RAM, 512GB SSD, RTX 3060", price);
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
							System.out.println("You've selected: TUF Ryzen 9, 32GB RAM, 1TB SSD, RTX 3070  - $2000");
                            price = 2000;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Asus TUF, TUF Ryzen 9, 32GB RAM, 1TB SSD, RTX 3070", price);
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

		// Method for Asus ExpertBook
		public  void asusExpertBookModel() {
			System.out.println("Asus ExpertBook Specifications:");
			System.out.println("1. ExpertBook 14-inch");
			System.out.println("   - Processor: Intel Core i5/i7");
			System.out.println("   - RAM: 8GB/16GB");
			System.out.println("   - Storage: 256GB SSD/512GB SSD");
			System.out.println("   - Price Range: $600 - $1200");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Asus ExpertBook model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}


				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your ExpertBook variant:");
					System.out.println("1. ExpertBook Core i5, 8GB RAM, 256GB SSD  - $600");
					System.out.println("2. ExpertBook Core i7, 16GB RAM, 512GB SSD  - $1200");
                    System.out.println("3. Back");
					System.out.print("Enter your choice (1/2/3): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3): ");
					}

						switch(variant) {
						case "1":
							System.out.println("You've selected: ExpertBook Core i5, 8GB RAM, 256GB SSD  - $600");
                            price = 600;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Asus ExpertBook, ExpertBook Core i5, 8GB RAM, 256GB SSD", price);
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
							System.out.println("You've selected: ExpertBook Core i7, 16GB RAM, 512GB SSD  - $1200");
                            price = 1200;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Asus ExpertBook, ExpertBook Core i7, 16GB RAM, 512GB SSD", price);
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

	public static void main(String[] args) {
		Laptops lap = new Laptops();

		System.out.println("Welcome to Laptop Selector!");
		System.out.println("Choose from our laptop models:");
		System.out.println("1. Lenovo");
		System.out.println("2. HP");
		System.out.println("3. Dell");
		System.out.println("4. Asus");
		System.out.println("5. MacBook");
		System.out.println("6. Back");

		System.out.print("Enter your choice (1-6): ");
		while(true) {
			String series = scanner.next();


			switch(series) {
			case "1":
				Laptops.Lenovo lenovo = lap.new Lenovo();
				lenovo.showSpecifications();
				break;
			case "2":
				Laptops.HP hp = lap.new HP();
				hp.showSpecifications();
				break;
			case "3":
				Laptops.Dell dell = lap.new Dell();
				dell.showSpecifications();
				break;
			case "4":
				Laptops.Asus asus = lap.new Asus();
				asus.showSpecifications();
				break;
			case "5":
				Laptops.MacBook macbook = lap.new MacBook();
				macbook.showSpecifications();
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
