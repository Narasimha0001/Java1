package app;
import app.Promain;
import java.util.Scanner;
import ca.Cart;
public class Mobiles {
    static Cart ct = Cart.cart;
	static double price ;
	static String sc;
	static Promain main = Promain.main;

    private static Scanner scanner = new Scanner(System.in);

	// Inner class for Apple brand
	public class Apple {
		
		public void showSpecifications() {
			while(true) {
			System.out.println("!-----Available Models-----!");
			System.out.println("1. iPhone 13");
			System.out.println("2. iPhone 14 ");
			System.out.println("3. iPhone SE (3rd Gen)");
			System.out.println("4. iPhone 12");
			System.out.println("5. iPhone 11");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print("Enter your choice (1-7): ");

				String series = scanner.next();

				switch(series) {
				case "1":
					appleIPhone13Model();
					break;
				case "2":
					appleIPhone14Model();
					break;
				case "3":
					appleIPhoneSEModel();
					break;
				case "4":
					appleIPhone12Model();
					break;
				case "5":
					appleIPhone11Model();
					break;
				case "6":
					Mobiles.main(new String[]{});
				case "7":
					main.main(new String[]{});
				}
				if(series.equals("1")||series.equals("2")||series.equals("3")||series.equals("4")||series.equals("5")||series.equals("6")||series.equals("7")) break;
			}
		}
		public void appleIPhone13Model() {
			System.out.println("1. iPhone 13 Specifications:");
			System.out.println("   - Processor: A15 Bionic Chip");
			System.out.println("   - RAM: 4GB");
			System.out.println("   - Storage: 128GB/256GB/512GB");
			System.out.println("   - Camera: 12MP + 12MP");
			System.out.println("   - Price Range: $799 - $1099");
            String choice;
			while(true) {
				System.out.print("Would you like to select the iPhone 13 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your iPhone 13 variant:");
					System.out.println("1. iPhone 13, 128GB Storage  - $799");
					System.out.println("2. iPhone 13, 256GB Storage  - $949");
					System.out.println("3. iPhone 13, 512GB Storage  - $1099");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}

						switch (variant) {
						case "1":
							System.out.println("You've selected: iPhone 13, 128GB Storage  - $799");
                            price = 799;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("iPhone 13, 128GB Storage", price);
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
							System.out.println("You've selected: iPhone 13, 256GB Storage  - $949");
                            price = 949;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("iPhone 13, 256GB Storage", price);
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
							System.out.println("You've selected: iPhone 13, 512GB Storage  - $1099");
                            price = 1099;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("iPhone 13, 512GB Storage", price);
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

		public void appleIPhone14Model() {
			System.out.println("1. iPhone 14 Specifications:");
			System.out.println("   - Processor: A15 Bionic Chip");
			System.out.println("   - RAM: 6GB");
			System.out.println("   - Storage: 128GB/256GB/512GB");
			System.out.println("   - Camera: 12MP + 12MP");
			System.out.println("   - Price Range: $799 - $1099");
            String choice;
			while(true) {
				System.out.print("Would you like to select the iPhone 14 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your iPhone 14 variant:");
					System.out.println("1. iPhone 14, 128GB Storage  - $799");
					System.out.println("2. iPhone 14, 256GB Storage  - $949");
					System.out.println("3. iPhone 14, 512GB Storage  - $1099");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}

						switch (variant) {
						case "1":
							System.out.println("You've selected: iPhone 14, 128GB Storage  - $799");
                            price = 799;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("iPhone 14, 128GB Storage", price);
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
							System.out.println("You've selected: iPhone 14, 256GB Storage  - $949");
                            price = 949;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("iPhone 14, 256GB Storage", price);
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
							System.out.println("You've selected: iPhone 14, 512GB Storage  - $1099");
                            price = 1099;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("iPhone 14, 512GB Storage", price);
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

		public void appleIPhoneSEModel() {
			System.out.println("1. iPhone SE (3rd Gen) Specifications:");
			System.out.println("   - Processor: A15 Bionic Chip");
			System.out.println("   - RAM: 4GB");
			System.out.println("   - Storage: 64GB/128GB/256GB");
			System.out.println("   - Camera: 12MP");
			System.out.println("   - Price Range: $429 - $579");
            String choice;
			while(true) {
				System.out.print("Would you like to select the iPhone SE (3rd Gen) model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your iPhone SE variant:");
					System.out.println("1. iPhone SE, 64GB Storage  - $429");
					System.out.println("2. iPhone SE, 128GB Storage  - $499");
					System.out.println("3. iPhone SE, 256GB Storage  - $579");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}

						switch (variant) {
						case "1":
							System.out.println("You've selected: iPhone SE, 64GB Storage  - $429");
                            price = 429;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("iPhone SE, 64GB Storage", price);
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
							System.out.println("You've selected: iPhone SE, 128GB Storage  - $499");
                            price = 499;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("iPhone SE, 128GB Storage", price);
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
							System.out.println("You've selected: iPhone SE, 256GB Storage  - $579");
                            price = 579;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("iPhone SE, 256GB Storage", price);
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

		public void appleIPhone12Model() {
			System.out.println("1. iPhone 12 Specifications:");
			System.out.println("   - Processor: A14 Bionic Chip");
			System.out.println("   - RAM: 4GB");
			System.out.println("   - Storage: 64GB/128GB/256GB");
			System.out.println("   - Camera: 12MP + 12MP");
			System.out.println("   - Price Range: $699 - $949");
            String choice;
			while(true) {
				System.out.print("Would you like to select the iPhone 12 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your iPhone 12 variant:");
					System.out.println("1. iPhone 12, 64GB Storage  - $699");
					System.out.println("2. iPhone 12, 128GB Storage  - $799");
					System.out.println("3. iPhone 12, 256GB Storage  - $949");
					System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/3/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}

						switch (variant) {
						case "1":
							System.out.println("You've selected: iPhone 12, 64GB Storage  - $699");
                            price = 699;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("iPhone 12, 64GB Storage", price);
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
							System.out.println("You've selected: iPhone 12, 128GB Storage  - $799");
                            price = 799;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("iPhone 12, 128GB Storage", price);
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
							System.out.println("You've selected: iPhone 12, 256GB Storage  - $949");
                            price = 949;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("iPhone 12, 256GB Storage", price);
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

		public void appleIPhone11Model() {
			System.out.println("1. iPhone 11 Specifications:");
			System.out.println("   - Processor: A13 Bionic Chip");
			System.out.println("   - RAM: 4GB");
			System.out.println("   - Storage: 64GB/128GB/256GB");
			System.out.println("   - Camera: 12MP + 12MP");
			System.out.println("   - Price Range: $599 - $849");
            String choice;
			while(true) {
				System.out.print("Would you like to select the iPhone 11 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your iPhone 11 variant:");
					System.out.println("1. iPhone 11, 64GB Storage - $599");
					System.out.println("2. iPhone 11, 128GB Storage - $649");
					System.out.println("3. iPhone 11, 256GB Storage - $849");
                    System.out.println("4. Back");
					System.out.print("Enter your choice (1/2/4): ");
					String variant;
					while(true) {
						variant = scanner.next();
						if(variant.equals("1")||variant.equals("2")||variant.equals("3")||variant.equals("4")) break;
						else System.out.println(" Invalid Selection. Please Enter your choice (1/2/3/4): ");
					}

					switch (variant) {
					case "1":
						System.out.println("You've selected: iPhone 11, 64GB Storage  - $599");
                        price = 599;
                        while(true) {
                            System.out.println("!---Do you want to add this to cart---!");
                            sc = scanner.next();
                            if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
                            else System.out.println(" Invalid Selection. ");
                        }
                        if(sc.equalsIgnoreCase("yes")) {
                            ct.addItem("iPhone 11, 64GB Storage", price);
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

                        }						break;
					case "2":
						System.out.println("You've selected: iPhone 11, 128GB Storage  - $649");
                        price = 649;
                        while(true) {
                            System.out.println("!---Do you want to add this to cart---!");
                            sc = scanner.next();
                            if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
                            else System.out.println(" Invalid Selection. ");
                        }
                        if(sc.equalsIgnoreCase("yes")) {
                            ct.addItem("iPhone 11, 128GB Storage", price);
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

                        }						break;
					case "3":
						System.out.println("You've selected: iPhone 11, 256GB Storage  - $849");
                        price = 849;
                        while(true) {
                            System.out.println("!---Do you want to add this to cart---!");
                            sc = scanner.next();
                            if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
                            else System.out.println(" Invalid Selection. ");
                        }
                        if(sc.equalsIgnoreCase("yes")) {
                            ct.addItem("iPhone 11, 256GB Storage", price);
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

	// Inner class for Samsung brand
	public class Samsung {
		// Existing ASCII art pattern
		
		// Galaxy S24 Ultra Variants
		public void showSpecifications() {
			while(true) {
			System.out.println("!-----Available Models-----!");
			System.out.println("1. Galaxy S22");
			System.out.println("2. Galaxy Note 20 Ultra");
			System.out.println("3. Galaxy A72");
			System.out.println("4. Galaxy M32");
			System.out.println("5. Galaxy Z Fold 3");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print("Enter your choice (1-7): ");
				String series = scanner.next();

				switch(series) {
				case "1":
					samsungGalaxySModel();
					break;
				case "2":
					samsungGalaxyNoteModel();
					break;
				case "3":
					samsungGalaxyAModel();
					break;
				case "4":
					samsungGalaxyMModel();
					break;
				case "5":
					samsungGalaxyZModel();
					break;
				case "6":
					Mobiles.main(new String[]{});
				case "7":
					main.main(new String[]{});
				}
				if(series.equals("1")||series.equals("2")||series.equals("3")||series.equals("4")||series.equals("5")||series.equals("6")||series.equals("7")) break;

			}
		}
		public void samsungGalaxySModel() {
			System.out.println("1. Galaxy S22 Mobile Specifications:");
			System.out.println("   - Processor: Exynos 2200 / Snapdragon 8 Gen 1");
			System.out.println("   - RAM: 8GB");
			System.out.println("   - Storage: 128GB/256GB");
			System.out.println("   - Camera: 50MP + 12MP + 10MP");
			System.out.println("   - Price Range: $800 - $1000");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Galaxy S22 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Galaxy S variant:");
					System.out.println("1. Galaxy S22, 8GB RAM, 128GB Storage  - $800");
					System.out.println("2. Galaxy S22, 8GB RAM, 256GB Storage  - $1000");
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
							System.out.println("You've selected: Galaxy S22, 8GB RAM, 128GB Storage  - $800");
                            price = 800;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Galaxy S22, 8GB RAM, 128GB Storage", price);
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
							System.out.println("You've selected: Galaxy S22, 8GB RAM, 256GB Storage  - $1000");
                            price = 1000;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Galaxy S22, 8GB RAM, 256GB Storage", price);
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

		public void samsungGalaxyNoteModel() {
			System.out.println("1. Galaxy Note 20 Ultra Mobile Specifications:");
			System.out.println("   - Processor: Exynos 990 / Snapdragon 865+");
			System.out.println("   - RAM: 12GB");
			System.out.println("   - Storage: 256GB/512GB");
			System.out.println("   - Camera: 108MP + 12MP + 12MP");
			System.out.println("   - Price Range: $1200 - $1400");
            String choice;
			while(true) {
				System.out.print("Would you like to select the  Galaxy Note 20 Ultra model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Galaxy Note variant:");
					System.out.println("1. Galaxy Note 20 Ultra, 12GB RAM, 256GB Storage  - $1200");
					System.out.println("2. Galaxy Note 20 Ultra, 12GB RAM, 512GB Storage  - $1400");
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
							System.out.println("You've selected: Galaxy Note 20 Ultra, 12GB RAM, 256GB Storage  - $1200");
                            price = 1200;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Galaxy Note 20 Ultra, 12GB RAM, 256GB Storage", price);
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
							System.out.println("You've selected: Galaxy Note 20 Ultra, 12GB RAM, 512GB Storage  - $1400");
                            price = 1400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Galaxy Note 20 Ultra, 12GB RAM, 512GB Storage", price);
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

		public void samsungGalaxyAModel() {
			System.out.println("1. Galaxy A72 Mobile Specifications:");
			System.out.println("   - Processor: Qualcomm Snapdragon 720G");
			System.out.println("   - RAM: 6GB/8GB");
			System.out.println("   - Storage: 128GB/256GB");
			System.out.println("   - Camera: 64MP + 12MP + 8MP + 5MP");
			System.out.println("   - Price Range: $400 - $500");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Galaxy A72 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Galaxy A variant:");
					System.out.println("1. Galaxy A72, 6GB RAM, 128GB Storage  - $400");
					System.out.println("2. Galaxy A72, 8GB RAM, 256GB Storage  - $500");
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
							System.out.println("You've selected: Galaxy A72, 6GB RAM, 128GB Storage  - $400");
                            price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Galaxy A72, 6GB RAM, 128GB Storage", price);
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
							System.out.println("You've selected: Galaxy A72, 8GB RAM, 256GB Storage  - $500");
                            price = 500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Galaxy A72, 8GB RAM, 256GB Storage", price);
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

		public void samsungGalaxyMModel() {
			System.out.println("1. Galaxy M32 Mobile Specifications:");
			System.out.println("   - Processor: MediaTek Helio G80");
			System.out.println("   - RAM: 4GB/6GB");
			System.out.println("   - Storage: 64GB/128GB");
			System.out.println("   - Camera: 64MP + 8MP + 2MP + 2MP");
			System.out.println("   - Price Range: $200 - $300");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Galaxy M32 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Galaxy M variant:");
					System.out.println("1. Galaxy M32, 4GB RAM, 64GB Storage  - $200");
					System.out.println("2. Galaxy M32, 6GB RAM, 128GB Storage  - $300");
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
							System.out.println("You've selected: Galaxy M32, 4GB RAM, 64GB Storage  - $200");
                            price = 200;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Galaxy M32, 4GB RAM, 64GB Storage", price);
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
							System.out.println("You've selected: Galaxy M32, 6GB RAM, 128GB Storage  - $300");
                            price = 300;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Galaxy M32, 6GB RAM, 128GB Storage", price);
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

		public void samsungGalaxyZModel() {
			System.out.println("1. Galaxy Z Fold 3 Mobile Specifications:");
			System.out.println("   - Processor: Qualcomm Snapdragon 888");
			System.out.println("   - RAM: 12GB");
			System.out.println("   - Storage: 256GB/512GB");
			System.out.println("   - Camera: 12MP + 12MP + 12MP");
			System.out.println("   - Price Range: $1800 - $2000");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Galaxy Z Fold 3 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Galaxy Z variant:");
					System.out.println("1. Galaxy Z Fold 3, 12GB RAM, 256GB Storage  - $1800");
					System.out.println("2. Galaxy Z Fold 3, 12GB RAM, 512GB Storage  - $2000");
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
							System.out.println("You've selected: Galaxy Z Fold 3, 12GB RAM, 256GB Storage  - $1800");
                            price = 1800;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Galaxy Z Fold 3, 12GB RAM, 256GB Storage", price);
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
							System.out.println("You've selected: Galaxy Z Fold 3, 12GB RAM, 512GB Storage  - $2000");
                            price = 2000;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Galaxy Z Fold 3, 12GB RAM, 512GB Storage", price);
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
	public class Xiaomi {
		

		public void showSpecifications() {
			while(true) {
			System.out.println("!-----Available Models-----!");
			System.out.println("1. Mi 11 Ultra");
			System.out.println("2. Mi Note 10");
			System.out.println("3. Redmi Note 11 Pro");
			System.out.println("4. Poco X3 Pro");
			System.out.println("5. Mi Mix 4");
			System.out.println("6.Back");
			System.out.println("7. Home");
			System.out.print("Enter your choice (1-7): ");

			
				String series = scanner.next();

				switch(series) {
				case "1":
					mi11SeriesModel();
					break;
				case "2":
					miNoteSeriesModel();
					break;
				case "3":
					miRedmiSeriesModel();
					break;
				case "4":
					miPocoSeriesModel();
					break;
				case "5":
					miMixSeriesModel();
					break;
				case "6":
				Mobiles.main(new String[]{});
				case "7":
					main.main(new String[]{});
				}
				if(series.equals("1")||series.equals("2")||series.equals("3")||series.equals("4")||series.equals("5")||series.equals("6")||series.equals("7")) break;

			}
		}
		public void mi11SeriesModel() {
			System.out.println("1. Mi 11 Ultra Mobile Specifications:");
			System.out.println("   - Processor: Qualcomm Snapdragon 888");
			System.out.println("   - RAM: 8GB/12GB");
			System.out.println("   - Storage: 256GB/512GB");
			System.out.println("   - Camera: 50MP + 48MP + 48MP");
			System.out.println("   - Price Range: $800 - $1200");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Mi 11 Ultra model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Mi 11 Series variant:");
					System.out.println("1. Mi 11 Ultra, 8GB RAM, 256GB Storage  - $800");
					System.out.println("2. Mi 11 Ultra, 12GB RAM, 512GB Storage  - $1200");
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
							System.out.println("You've selected: Mi 11 Ultra, 8GB RAM, 256GB Storage  - $800");
                            price = 800;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Mi 11 Ultra, 8GB RAM, 256GB Storage", price);
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
							System.out.println("You've selected: Mi 11 Ultra, 12GB RAM, 512GB Storage  - $1200");
                            price = 1200;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Mi 11 Ultra, 12GB RAM, 512GB Storage", price);
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

		public void miNoteSeriesModel() {
			System.out.println("1. Mi Note 10 Mobile Specifications:");
			System.out.println("   - Processor: Qualcomm Snapdragon 730G");
			System.out.println("   - RAM: 6GB/8GB");
			System.out.println("   - Storage: 128GB/256GB");
			System.out.println("   - Camera: 108MP + 12MP + 20MP + 5MP + 2MP");
			System.out.println("   - Price Range: $500 - $700");
            String choice;
			while(true) {
				System.out.print("Would you like to select the  Mi Note 10 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Mi Note Series variant:");
					System.out.println("1. Mi Note 10, 6GB RAM, 128GB Storage  - $500");
					System.out.println("2. Mi Note 10, 8GB RAM, 256GB Storage  - $700");
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
							System.out.println("You've selected: Mi Note 10, 6GB RAM, 128GB Storage  - $500");
                            price = 500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Mi Note 10, 6GB RAM, 128GB Storage", price);
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
							System.out.println("You've selected: Mi Note 10, 8GB RAM, 256GB Storage  - $700");
                            price = 700;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Mi Note 10, 8GB RAM, 256GB Storage", price);
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

		public void miRedmiSeriesModel() {
			System.out.println("1. Redmi Note 11 Pro Mobile Specifications:");
			System.out.println("   - Processor: MediaTek Helio G96");
			System.out.println("   - RAM: 6GB/8GB");
			System.out.println("   - Storage: 128GB/256GB");
			System.out.println("   - Camera: 108MP + 8MP + 2MP + 2MP");
			System.out.println("   - Price Range: $250 - $400");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Redmi Note 11 Pro model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Redmi Series variant:");
					System.out.println("1. Redmi Note 11 Pro, 6GB RAM, 128GB Storage  - $250");
					System.out.println("2. Redmi Note 11 Pro, 8GB RAM, 256GB Storage  - $400");
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
							System.out.println("You've selected: Redmi Note 11 Pro, 6GB RAM, 128GB Storage  - $250");
                            price = 250;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Redmi Note 11 Pro, 6GB RAM, 128GB Storage", price);
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
							System.out.println("You've selected: Redmi Note 11 Pro, 8GB RAM, 256GB Storage  - $400");
                            price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Redmi Note 11 Pro, 8GB RAM, 256GB Storage", price);
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

		public void miPocoSeriesModel() {
			System.out.println("1. Poco X3 Pro Mobile Specifications:");
			System.out.println("   - Processor: Qualcomm Snapdragon 860");
			System.out.println("   - RAM: 6GB/8GB");
			System.out.println("   - Storage: 128GB/256GB");
			System.out.println("   - Camera: 48MP + 8MP + 2MP + 2MP");
			System.out.println("   - Price Range: $300 - $450");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Poco X3 Pro model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Poco Series variant:");
					System.out.println("1. Poco X3 Pro, 6GB RAM, 128GB Storage  - $300");
					System.out.println("2. Poco X3 Pro, 8GB RAM, 256GB Storage  - $450");
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
							System.out.println("You've selected: Poco X3 Pro, 6GB RAM, 128GB Storage  - $300");
                            price = 300;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Poco X3 Pro, 6GB RAM, 128GB Storage", price);
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
							System.out.println("You've selected: Poco X3 Pro, 8GB RAM, 256GB Storage  - $450");
                            price = 450;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Poco X3 Pro, 8GB RAM, 256GB Storage", price);
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

		public void miMixSeriesModel() {
			System.out.println("1. Mi Mix 4 Mobile Specifications:");
			System.out.println("   - Processor: Qualcomm Snapdragon 888+");
			System.out.println("   - RAM: 8GB/12GB");
			System.out.println("   - Storage: 128GB/256GB/512GB");
			System.out.println("   - Camera: 108MP + 13MP + 8MP");
			System.out.println("   - Price Range: $900 - $1200");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Mi Mix 4 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Mix Series variant:");
					System.out.println("1. Mi Mix 4, 8GB RAM, 128GB Storage  - $900");
					System.out.println("2. Mi Mix 4, 12GB RAM, 512GB Storage  - $1200");
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
							System.out.println("You've selected: Mi Mix 4, 8GB RAM, 128GB Storage  - $900");
                            price = 900;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Mi Mix 4, 8GB RAM, 128GB Storage", price);
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
							System.out.println("You've selected: Mi Mix 4, 12GB RAM, 512GB Storage  - $1200");
                            price = 1200;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Mi Mix 4, 12GB RAM, 512GB Storage", price);
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

	public class OnePlus {

		public void showSpecifications() {
			while(true) {
			System.out.println("!-----Available Models-----!");
			System.out.println("1. OnePlus Nord 2");
			System.out.println("2. OnePlus 9 Pro");
			System.out.println("3. OnePlus 8T");
			System.out.println("4. OnePlus 10 Pro");
			System.out.println("5. OnePlus 7T");
			System.out.println("6. Back");
			System.out.println("7. Home");
			System.out.print("Enter your choice (1-7): ");

				String series = scanner.next();

				switch(series) {
				case "1":
					onePlusNordModel();
					break;
				case "2":
					onePlus9SeriesModel();
					break;
				case "3":
					onePlus8SeriesModel();
					break;
				case "4":
					onePlus10SeriesModel();
					break;
				case "5":
					onePlus7SeriesModel();
					break;
				case "6":
				Mobiles.main(new String[]{});

				case "7":
					main.main(new String[]{});
				}
				if(series.equals("1")||series.equals("2")||series.equals("3")||series.equals("4")||series.equals("5")||series.equals("6")||series.equals("7")) break;

			}
		}
		public void onePlusNordModel() {
			System.out.println("1. OnePlus Nord 2 Mobile Specifications:");
			System.out.println("   - Processor: MediaTek Dimensity 1200-AI");
			System.out.println("   - RAM: 8GB/12GB");
			System.out.println("   - Storage: 128GB/256GB");
			System.out.println("   - Camera: 50MP + 8MP + 2MP");
			System.out.println("   - Price Range: $400 - $500");
            String choice;
			while(true) {
				System.out.print("Would you like to select the OnePlus Nord 2 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Nord variant:");
					System.out.println("1. OnePlus Nord 2, 8GB RAM, 128GB Storage  - $400");
					System.out.println("2. OnePlus Nord 2, 12GB RAM, 256GB Storage  - $500");
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
							System.out.println("You've selected: OnePlus Nord 2, 8GB RAM, 128GB Storage  - $400");
                            price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("OnePlus Nord 2, 8GB RAM, 128GB Storage", price);
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
							System.out.println("You've selected: OnePlus Nord 2, 12GB RAM, 256GB Storage  - $500");
                            price = 500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("OnePlus Nord 2, 12GB RAM, 256GB Storage", price);
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

		public void onePlus9SeriesModel() {
			System.out.println("1. OnePlus 9 Pro Mobile Specifications:");
			System.out.println("   - Processor: Qualcomm Snapdragon 888");
			System.out.println("   - RAM: 8GB/12GB");
			System.out.println("   - Storage: 128GB/256GB");
			System.out.println("   - Camera: 48MP + 50MP + 8MP");
			System.out.println("   - Price Range: $700 - $900");
            String choice;
			while(true) {
				System.out.print("Would you like to select the OnePlus 9 Pro model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your 9 Series variant:");
					System.out.println("1. OnePlus 9 Pro, 8GB RAM, 128GB Storage  - $700");
					System.out.println("2. OnePlus 9 Pro, 12GB RAM, 256GB Storage  - $900");
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
							System.out.println("You've selected: OnePlus 9 Pro, 8GB RAM, 128GB Storage  - $700");
                            price = 700;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("OnePlus 9 Pro, 8GB RAM, 128GB Storage", price);
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
							System.out.println("You've selected: OnePlus 9 Pro, 12GB RAM, 256GB Storage  - $900");
                            price = 900;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("OnePlus 9 Pro, 12GB RAM, 256GB Storage", price);
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

		public void onePlus8SeriesModel() {
			System.out.println("1. OnePlus 8T  Mobile Specifications:");
			System.out.println("   - Processor: Qualcomm Snapdragon 865");
			System.out.println("   - RAM: 8GB/12GB");
			System.out.println("   - Storage: 128GB/256GB");
			System.out.println("   - Camera: 48MP + 16MP + 5MP + 2MP");
			System.out.println("   - Price Range: $600 - $700");
            String choice;
			while(true) {
				System.out.print("Would you like to select the OnePlus 8T model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your 8 Series variant:");
					System.out.println("1. OnePlus 8T, 8GB RAM, 128GB Storage  - $600");
					System.out.println("2. OnePlus 8T, 12GB RAM, 256GB Storage  - $700");
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
							System.out.println("You've selected: OnePlus 8T, 8GB RAM, 128GB Storage  - $600");
                            price = 600;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("OnePlus 8T, 8GB RAM, 128GB Storage", price);
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
							System.out.println("You've selected: OnePlus 8T, 12GB RAM, 256GB Storage  - $700");
                            price = 700;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("OnePlus 8T, 12GB RAM, 256GB Storage", price);
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

		public void onePlus10SeriesModel() {
			System.out.println("1. OnePlus 10 Pro Series Mobile Specifications:");
			System.out.println("   - Processor: Qualcomm Snapdragon 8 Gen 1");
			System.out.println("   - RAM: 8GB/12GB");
			System.out.println("   - Storage: 128GB/256GB");
			System.out.println("   - Camera: 48MP + 50MP + 8MP");
			System.out.println("   - Price Range: $900 - $1,100");
            String choice;
			while(true) {
				System.out.print("Would you like to select the OnePlus 10 Pro model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your 10 Series variant:");
					System.out.println("1. OnePlus 10 Pro, 8GB RAM, 128GB Storage  - $900");
					System.out.println("2. OnePlus 10 Pro, 12GB RAM, 256GB Storage  - $1,100");
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
							System.out.println("You've selected: OnePlus 10 Pro, 8GB RAM, 128GB Storage  - $900");
                            price = 900;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("OnePlus 10 Pro, 8GB RAM, 128GB Storage", price);
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
							System.out.println("You've selected: OnePlus 10 Pro, 12GB RAM, 256GB Storage  - $1,100");
                            price = 1100;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("OnePlus 10 Pro, 12GB RAM, 256GB Storage", price);
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

		public void onePlus7SeriesModel() {
			System.out.println("1. OnePlus 7T Series Mobile Specifications:");
			System.out.println("   - Processor: Qualcomm Snapdragon 855+");
			System.out.println("   - RAM: 8GB/12GB");
			System.out.println("   - Storage: 128GB/256GB");
			System.out.println("   - Camera: 48MP + 12MP + 16MP");
			System.out.println("   - Price Range: $500 - $600");
            String choice;
			while(true) {
				System.out.print("Would you like to select the OnePlus 7T model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your 7 Series variant:");
					System.out.println("1. OnePlus 7T, 8GB RAM, 128GB Storage  - $500");
					System.out.println("2. OnePlus 7T, 12GB RAM, 256GB Storage  - $600");
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
							System.out.println("You've selected: OnePlus 7T, 8GB RAM, 128GB Storage  - $500");
                            price = 500;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("OnePlus 7T, 8GB RAM, 128GB Storage", price);
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
							System.out.println("You've selected: OnePlus 7T, 12GB RAM, 256GB Storage  - $600");
                            price = 600;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("OnePlus 7T, 12GB RAM, 256GB Storage", price);
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

	public class Vivo {
		// Vivo X100 Pro Variants
	
		public void showSpecifications() {
			while(true) {
			System.out.println("!-----Available Models-----!");
			System.out.println("1. Vivo X80");
			System.out.println("2. Vivo V25");
			System.out.println("3. Vivo Y75");
			System.out.println("4. Vivo T1");
			System.out.println("5. Vivo Z5");
			System.out.println("6.Back");
			System.out.println("7. Home");
			System.out.print("Enter your choice (1-7): ");

			
				String series = scanner.next();

				switch(series) {
				case "1":
					vivoXSeriesModel();
					break;
				case "2":
					vivoVSeriesModel();
					break;
				case "3":
					vivoYSeriesModel();
					break;
				case "4":
					vivoTSeriesModel();
					break;
				case "5":
					vivoZSeriesModel();
					break;
				case "6":
				Mobiles.main(new String[]{});
				case "7":
					main.main(new String[]{});
					break;
				}
				if(series.equals("1")||series.equals("2")||series.equals("3")||series.equals("4")||series.equals("5")||series.equals("6")||series.equals("7")) break;
			}
		}
		public void vivoXSeriesModel() {
			System.out.println("1. Vivo X80 Series Mobile Specifications:");
			System.out.println("   - Processor: MediaTek Dimensity 9000");
			System.out.println("   - RAM: 8GB/12GB");
			System.out.println("   - Storage: 128GB/256GB");
			System.out.println("   - Camera: 50MP + 12MP + 12MP");
			System.out.println("   - Price Range: $600 - $800");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Vivo X80 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your X Series variant:");
					System.out.println("1. Vivo X80, 8GB RAM, 128GB Storage  - $600");
					System.out.println("2. Vivo X80, 12GB RAM, 256GB Storage  - $800");
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
							System.out.println("You've selected: Vivo X80, 8GB RAM, 128GB Storage  - $600");
                            price = 600;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Vivo X80, 8GB RAM, 128GB Storage", price);
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
							System.out.println("You've selected: Vivo X80, 12GB RAM, 256GB Storage  - $800");
                            price = 800;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Vivo X80, 12GB RAM, 256GB Storage", price);
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

		public void vivoVSeriesModel() {
			System.out.println("1. Vivo V25 Series Mobile Specifications:");
			System.out.println("   - Processor: MediaTek Dimensity 900");
			System.out.println("   - RAM: 8GB/12GB");
			System.out.println("   - Storage: 128GB/256GB");
			System.out.println("   - Camera: 64MP + 8MP + 2MP");
			System.out.println("   - Price Range: $400 - $600");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Vivo V25 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your V Series variant:");
					System.out.println("1. Vivo V25, 8GB RAM, 128GB Storage  - $400");
					System.out.println("2. Vivo V25, 12GB RAM, 256GB Storage  - $600");
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
							System.out.println("You've selected: Vivo V25, 8GB RAM, 128GB Storage  - $400");
                            price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Vivo V25, 8GB RAM, 128GB Storage", price);
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
							System.out.println("You've selected: Vivo V25, 12GB RAM, 256GB Storage  - $600");
                            price = 600;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Vivo V25, 12GB RAM, 256GB Storage", price);
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

		public void vivoYSeriesModel() {
			System.out.println("1. Vivo Y75 Series Mobile Specifications:");
			System.out.println("   - Processor: MediaTek Helio G96");
			System.out.println("   - RAM: 6GB/8GB");
			System.out.println("   - Storage: 128GB");
			System.out.println("   - Camera: 50MP + 2MP + 2MP");
			System.out.println("   - Price Range: $200 - $300");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Vivo Y75 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Y Series variant:");
					System.out.println("1. Vivo Y75, 6GB RAM, 128GB Storage  - $200");
					System.out.println("2. Vivo Y75, 8GB RAM, 128GB Storage  - $300");
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
							System.out.println("You've selected: Vivo Y75, 6GB RAM, 128GB Storage  - $200");
                            price = 200;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Vivo Y75, 6GB RAM, 128GB Storage", price);
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
							System.out.println("You've selected: Vivo Y75, 8GB RAM, 128GB Storage  - $300");
                            price = 300;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Vivo Y75, 8GB RAM, 128GB Storage", price);
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

		public void vivoTSeriesModel() {
			System.out.println("1. Vivo T1 Series Mobile Specifications:");
			System.out.println("   - Processor: Qualcomm Snapdragon 778G");
			System.out.println("   - RAM: 6GB/8GB");
			System.out.println("   - Storage: 128GB");
			System.out.println("   - Camera: 64MP + 8MP + 2MP");
			System.out.println("   - Price Range: $300 - $400");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Vivo T1 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your T Series variant:");
					System.out.println("1. Vivo T1, 6GB RAM, 128GB Storage  - $300");
					System.out.println("2. Vivo T1, 8GB RAM, 128GB Storage  - $400");
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
							System.out.println("You've selected: Vivo T1, 6GB RAM, 128GB Storage  - $300");
                            price = 300;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Vivo T1, 6GB RAM, 128GB Storage", price);
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
							System.out.println("You've selected: Vivo T1, 8GB RAM, 128GB Storage  - $400");
                            price = 400;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Vivo T1, 8GB RAM, 128GB Storage", price);
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

		public void vivoZSeriesModel() {
			System.out.println("1. Vivo Z5 Series Mobile Specifications:");
			System.out.println("   - Processor: Qualcomm Snapdragon 712");
			System.out.println("   - RAM: 6GB/8GB");
			System.out.println("   - Storage: 64GB/128GB");
			System.out.println("   - Camera: 48MP + 8MP + 2MP");
			System.out.println("   - Price Range: $200 - $300");
            String choice;
			while(true) {
				System.out.print("Would you like to select the Vivo Z5 model? (yes/no): ");
				choice = scanner.next();
				if(choice.equalsIgnoreCase("yes")|| choice.equalsIgnoreCase("no")) break;
				else System.out.println(" Invalid Selection. ");
			}

				if (choice.equalsIgnoreCase("yes")) {
                    while(true){
					System.out.println("Select your Z Series variant:");
					System.out.println("1. Vivo Z5, 6GB RAM, 64GB Storage  - $200");
					System.out.println("2. Vivo Z5, 8GB RAM, 128GB Storage  - $300");
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
							System.out.println("You've selected: Vivo Z5, 6GB RAM, 64GB Storage  - $200");
                            price = 200;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Vivo Z5, 6GB RAM, 64GB Storage", price);
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
							System.out.println("You've selected: Vivo Z5, 8GB RAM, 128GB Storage  - $300");
                            price = 300;
							while(true) {
								System.out.println("!---Do you want to add this to cart---!(yes/no)");
								sc = scanner.next();
								if(sc.equalsIgnoreCase("yes") || sc.equalsIgnoreCase("no")) break;
								else System.out.println(" Invalid Selection. ");
							}
							if(sc.equalsIgnoreCase("yes")) {
								ct.addItem("Vivo Z5, 8GB RAM, 128GB Storage", price);
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
		int c = 1;
		for(int i = ran; i<=ran1; i++) {
		if(i==799){
				System.out.println(c+". iPhone 13, 128GB Storage  - $799");
				c++;
		}
		if(i==949){
				System.out.println(c+". iPhone 13, 256GB Storage  - $949");
				c++;
		}
		if(i==1099){
				System.out.println(c+". iPhone 13, 512GB Storage  - $1099");
				c++;
		}
		if(i==200){
				System.out.println(c+". Vivo Z5, 6GB RAM, 64GB Storage  - $200");
				c++;
		}
		if(i==300){	System.out.println(c+". Vivo Z5, 8GB RAM, 128GB Storage  - $300");c++;}
		if(i==300){
				System.out.println(c+". Vivo T1, 6GB RAM, 128GB Storage  - $300");
				c++;
		}
		if(i==400){	System.out.println(c+". Vivo T1, 8GB RAM, 128GB Storage  - $400");
		c++;
	}
		if(i==200){
				System.out.println(c+". Vivo Y75, 6GB RAM, 128GB Storage  - $200");
				c++;
		}
		if(i==300){
				System.out.println(c+". Vivo Y75, 8GB RAM, 128GB Storage  - $300");
				c++;
		}
		if(i==400){
				System.out.println(c+". Vivo V25, 8GB RAM, 128GB Storage  - $400");
				c++;
		}
		if(i==600){	System.out.println(c+". Vivo V25, 12GB RAM, 256GB Storage  - $600");
		c++;
	}
		if(i==600){
				System.out.println(c+". Vivo X80, 8GB RAM, 128GB Storage  - $600");
				c++;
		}
		if(i==800){
				System.out.println(c+". Vivo X80, 12GB RAM, 256GB Storage  - $800");
				c++;
		}
		if(i==500){
				System.out.println(c+". OnePlus 7T, 8GB RAM, 128GB Storage  - $500");
				c++;
		}
		if(i==600){	
			System.out.println(c+". OnePlus 7T, 12GB RAM, 256GB Storage  - $600");
			c++;
		}
		if(i==900){
				System.out.println(c+". OnePlus 10 Pro, 8GB RAM, 128GB Storage  - $900");
				c++;
		}
		if(i == 1100) {
			System.out.println(c + ". OnePlus 10 Pro, 12GB RAM, 256GB Storage - $1,100");
			c++;
		}
		if(i == 600) {
			System.out.println(c + ". OnePlus 8T, 8GB RAM, 128GB Storage - $600");
			c++;
		}
		if(i == 700) {
			System.out.println(c + ". OnePlus 8T, 12GB RAM, 256GB Storage - $700");
			c++;
		}
		if(i == 700) {
			System.out.println(c + ". OnePlus 9 Pro, 8GB RAM, 128GB Storage - $700");
			c++;
		}
		if(i == 900) {
			System.out.println(c + ". OnePlus 9 Pro, 12GB RAM, 256GB Storage - $900");
			c++;
		}
		if(i == 400) {
			System.out.println(c + ". OnePlus Nord 2, 8GB RAM, 128GB Storage - $400");
			c++;
		}
		if(i == 500) {
			System.out.println(c + ". OnePlus Nord 2, 12GB RAM, 256GB Storage - $500");
			c++;
		}
		if(i == 900) {
			System.out.println(c + ". Mi Mix 4, 8GB RAM, 128GB Storage - $900");
			c++;
		}
		if(i == 1200) {
			System.out.println(c + ". Mi Mix 4, 12GB RAM, 512GB Storage - $1200");
			c++;
		}
		if(i == 300) {
			System.out.println(c + ". Poco X3 Pro, 6GB RAM, 128GB Storage - $300");
			c++;
		}
		if(i == 450) {
			System.out.println(c + ". Poco X3 Pro, 8GB RAM, 256GB Storage - $450");
			c++;
		}
		if(i == 250) {
			System.out.println(c + ". Redmi Note 11 Pro, 6GB RAM, 128GB Storage - $250");
			c++;
		}
		if(i == 400) {
			System.out.println(c + ". Redmi Note 11 Pro, 8GB RAM, 256GB Storage - $400");
			c++;
		}
		if(i == 500) {
			System.out.println(c + ". Mi Note 10, 6GB RAM, 128GB Storage - $500");
			c++;
		}
		if(i == 700) {
			System.out.println(c + ". Mi Note 10, 8GB RAM, 256GB Storage - $700");
			c++;
		}
		if(i == 800) {
			System.out.println(c + ". Mi 11 Ultra, 8GB RAM, 256GB Storage - $800");
			c++;
		}
		if(i == 1200) {
			System.out.println(c + ". Mi 11 Ultra, 12GB RAM, 512GB Storage - $1200");
			c++;
		}
		if(i == 1800) {
			System.out.println(c + ". Galaxy Z Fold 3, 12GB RAM, 256GB Storage - $1800");
			c++;
		}
		if(i == 2000) {
			System.out.println(c + ". Galaxy Z Fold 3, 12GB RAM, 512GB Storage - $2000");
			c++;
		}
		if(i == 200) {
			System.out.println(c + ". Galaxy M32, 4GB RAM, 64GB Storage - $200");
			c++;
		}
		if(i == 300) {
			System.out.println(c + ". Galaxy M32, 6GB RAM, 128GB Storage - $300");
			c++;
		}
		if(i == 400) {
			System.out.println(c + ". Galaxy A72, 6GB RAM, 128GB Storage - $400");
			c++;
		}
		if(i == 500) {
			System.out.println(c + ". Galaxy A72, 8GB RAM, 256GB Storage - $500");
			c++;
		}
		if(i == 1200) {
			System.out.println(c + ". Galaxy Note 20 Ultra, 12GB RAM, 256GB Storage - $1200");
			c++;
		}
		if(i == 1400) {
			System.out.println(c + ". Galaxy Note 20 Ultra, 12GB RAM, 512GB Storage - $1400");
			c++;
		}
		if(i == 800) {
			System.out.println(c + ". Galaxy S22, 8GB RAM, 128GB Storage - $800");
			c++;
		}
		if(i == 1000) {
			System.out.println(c + ". Galaxy S22, 8GB RAM, 256GB Storage - $1000");
			c++;
		}
		if(i == 599) {
			System.out.println(c + ". iPhone 11, 64GB Storage - $599");
			c++;
		}
		if(i == 649) {
			System.out.println(c + ". iPhone 11, 128GB Storage - $649");
			c++;
		}
		if(i == 849) {
			System.out.println(c + ". iPhone 11, 256GB Storage - $849");
			c++;
		}
		if(i == 699) {
			System.out.println(c + ". iPhone 12, 64GB Storage - $699");
			c++;
		}
		if(i == 799) {
			System.out.println(c + ". iPhone 12, 128GB Storage - $799");
			c++;
		}
		if(i == 949) {
			System.out.println(c + ". iPhone 12, 256GB Storage - $949");
			c++;
		}
		if(i == 429) {
			System.out.println(c + ". iPhone SE, 64GB Storage - $429");
			c++;
		}
		if(i == 499) {
			System.out.println(c + ". iPhone SE, 128GB Storage - $499");
			c++;
		}
		if(i == 579) {
			System.out.println(c + ". iPhone SE, 256GB Storage - $579");
			c++;
		}
		if(i == 799) {
			System.out.println(c + ". iPhone 14, 128GB Storage - $799");
			c++;
		}
		if(i == 949) {
			System.out.println(c + ". iPhone 14, 256GB Storage - $949");
			c++;
		}
		if(i == 1099) {
			System.out.println(c + ". iPhone 14, 512GB Storage - $1099");
			c++;
		}
		
		}
		while(true){
		System.out.println("Enter Model Name(Without Space) which Mobile do you want.");
		String comp = scanner.next();
		if(comp.equalsIgnoreCase("iPhone13")) apple.appleIPhone13Model();
		if(comp.equalsIgnoreCase("VivoZ5")) vivo.vivoZSeriesModel();
		if(comp.equalsIgnoreCase("VivoT1")) vivo.vivoTSeriesModel();
		if(comp.equalsIgnoreCase("VivoY75")) vivo.vivoYSeriesModel();
		if(comp.equalsIgnoreCase("VivoV25")) vivo.vivoVSeriesModel();
		if(comp.equalsIgnoreCase("VivoX80")) vivo.vivoXSeriesModel();
		if(comp.equalsIgnoreCase("OnePlus7T")) onePlus.onePlus7SeriesModel();
		if(comp.equalsIgnoreCase("OnePlus10Pro")) onePlus.onePlus10SeriesModel();
		if(comp.equalsIgnoreCase("OnePlus8T")) onePlus.onePlus8SeriesModel();
		if(comp.equalsIgnoreCase("OnePlus9Pro")) onePlus.onePlus9SeriesModel();
		if(comp.equalsIgnoreCase("OnePlusNord2")) onePlus.onePlusNordModel();
		if(comp.equalsIgnoreCase("MiMix4")) xiaomi.miMixSeriesModel();
		if(comp.equalsIgnoreCase("PocoX3Pro")) xiaomi.miPocoSeriesModel();
		if(comp.equalsIgnoreCase("RedmiNote11Pro")) xiaomi.miRedmiSeriesModel();
		if(comp.equalsIgnoreCase("MiNote10")) xiaomi.miNoteSeriesModel();
		if(comp.equalsIgnoreCase("Mi11Ultra")) xiaomi.mi11SeriesModel();
		if(comp.equalsIgnoreCase("GalaxyZFold3")) samsung.samsungGalaxyZModel();
		if(comp.equalsIgnoreCase("GalaxyM32")) samsung.samsungGalaxyMModel();
		if(comp.equalsIgnoreCase("GalaxyA72")) samsung.samsungGalaxyAModel();
		if(comp.equalsIgnoreCase("GalaxyNote20Ultra")) samsung.samsungGalaxyNoteModel();
		if(comp.equalsIgnoreCase("GalaxyS22")) samsung.samsungGalaxySModel();
		if(comp.equalsIgnoreCase("iPhone11")) apple.appleIPhone11Model();
		if(comp.equalsIgnoreCase("iPhone12")) apple.appleIPhone12Model();
		if(comp.equalsIgnoreCase("iPhoneSE")) apple.appleIPhoneSEModel();
		if(comp.equalsIgnoreCase("iPhone14")) apple.appleIPhone14Model();


		if(comp.equalsIgnoreCase("iPhone13")||comp.equalsIgnoreCase("VivoZ5")||comp.equalsIgnoreCase("VivoT1")||comp.equalsIgnoreCase("VivoY75")||comp.equalsIgnoreCase("VivoV25")||comp.equalsIgnoreCase("VivoX80")) break;
		if(comp.equalsIgnoreCase("OnePlus7T")||comp.equalsIgnoreCase("OnePlus10Pro")||comp.equalsIgnoreCase("OnePlus8T")||comp.equalsIgnoreCase("OnePlus9Pro")||comp.equalsIgnoreCase("OnePlusNord2")) break;
		if(comp.equalsIgnoreCase("MiMix4")||comp.equalsIgnoreCase("PocoX3Pro")||comp.equalsIgnoreCase("RedmiNote11Pro")||comp.equalsIgnoreCase("MiNote10")||comp.equalsIgnoreCase("Mi11Ultra")) break;
		if(comp.equalsIgnoreCase("GalaxyZFold3")||comp.equalsIgnoreCase("GalaxyM32")||comp.equalsIgnoreCase("GalaxyA72")||comp.equalsIgnoreCase("GalaxyNote20Ultra")) break;
		if(comp.equalsIgnoreCase("GalaxyS22")||comp.equalsIgnoreCase("iPhone11")||comp.equalsIgnoreCase("iPhone12")||comp.equalsIgnoreCase("iPhoneSE")||comp.equalsIgnoreCase("iPhone14")) break;
	}
}
	   static Mobiles mobile = new Mobiles();
       static Mobiles.Apple apple = mobile.new Apple();
	   static Mobiles.Samsung samsung = mobile.new Samsung();
	   static Mobiles.Xiaomi xiaomi = mobile.new Xiaomi();
	   static Mobiles.OnePlus onePlus = mobile.new OnePlus();
	   static Mobiles.Vivo vivo = mobile.new Vivo();
	// Main method remains the same
	public static void main(String[] args) {

		// Creating instances of inner classes
		System.out.println("!-----Available Brands-----!");
		System.out.println("1.Apple\n2.Samsung Galaxy\n3.Xiaomi\n4.OnePlus\n5.Vivo\n 6.Budget Mobiles \n 7.Back");
		while(true) {
			String series = scanner.next();
			switch (series) {
			case "1":
			{
				// PrString the ASCII art pattern
	
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@%*#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@%==+%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@+=+@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@@@#+===++**+===+*@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@%=--------------=#@@@@@%-=@@#######%@@**@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@----------------@@@@@@@@%@@@##@@@@%#%@**@@%%@@@@@@@@@@@@@@%@@%%%@@@@@@%%@@@@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@%===============*@@@@@@@@-=@@##@@@@@##@***###*#@@%##%%##%@#-=+*+==%@%++##*+#@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@++++++++++++++++@@@@@@@@-=@@#######%@@**@@@@#*@%*%@@@@#*@#-#@@@#-*@++%%%%*+%@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@#****************#@@@@@@-=@@##@@@@@@@@**@@@@#*@%*%@@@@#*@#-#@@@#-*@++@@@@@@@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@@#****************%@@@@@-=@@##@@@@@@@@**@@@@#*@@%*#%%##%@#-#@@@#-*@#++#%*+*@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@@@###############@@@@@@@%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%@@@@@%@@@@@%%%@@@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@@@@@%%%%%%%%%%%%@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
				System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	
			}
				System.out.println("\n\n\n");
				apple.showSpecifications();
				break;
			case "2":
			{
				System.out.println("""
								   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@%****@@@@@@%%%%%@@@@@%%%%@@@@%%%%@@@@@%***@@@@@@%%@@@%%@@@@%%%@@@%%%@@@@@#**#@@@@@@@@@@@@
								   @@@@@@@@@@+..::..=@@@%.....*@@@% ...-@@-.. .#@@#...:..:@@%-..@@- .#@@- ..:#@:.:%@@+......=@@@@@@@@@@
								   @@@@@@@@@%:.:%@--+@@@+. -:.-%@@% .--.%@.:= .#@@= .+@=--%@%- .@@- .#@@- :=.+@: :%@%:..@@=..%@@@@@@@@@
								   @@@@@@@@@@*...:=@@@@@-. %=..#@@% .==.#%.-* .#@@%:..:=%@@@%- .@@- .#@@- :*::%:.:%@#: .@*+++%@@@@@@@@@
								   @@@@@@@@@@@@#-...=@@%:..@* .*@@% .++.--.=* .#@@@@%+...:%@%- .@@- .#@@- :%+.+:.:%@#: .@+:..#@@@@@@@@@
								   @@@@@@@@@%..-%@:.:*@+..-@#..-%@% .+@-..:@* .#@@-..*@=..=@@- .@@- .#@@- :#%-.:.:%@#:..@@=..#@@@@@@@@@
								   @@@@@@@@@@=..::..-@@-..*@%-..%@% .+@-..:@* .#@@#...:...%@@+..::..=@@@- :*@+...:%@@+...:..=@@@@@@@@@@
								   @@@@@@@@@@@@%%%%@@@@@%%@@@@%%@@@%%@@@%%@@@%%@@@@@%%%%%@@@@@@%%%%@@@@@@@@@@@@@@@@@@@@%%%%@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@@@@%.....=@@@@@@@@@@@@@@@:.-@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@@*..:+##-..:@@@@%+-+%%*#@: -@@@%+=+%%*#%#*#@@@%**%#*#@@@@%*#@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@*..#@@@@@@#@@@*..:-::. :%: -@*..:-::..-%@:.-%+..#@%.:*@@@..+@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@=.:@@@+.....-#..#@@@@+ :%: -#..#@@@@+.-%@@=...:%@@@*.-%@:.=@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@*..%@@%%%#..=#.:#@@@@* :%: -#.:#@@@@#.-%@@#. .+@@@@@+.==.:@@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@@+..-*##+..-@%=.:*%#+..:%: -%=.-*%#+..-%@+.:+-.-%@@@%-...%@@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@@@@=-...:-#@@@@*-...--.-%:.-@@*-...-=.-#-.-@@@+:.#@@@*:.#@@@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=.+@@@@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*.-%@@@@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#*%@@@@@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
								   @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
																																					 """);
			}
				System.out.println("\n\n\n");
				samsung.showSpecifications();
				break;
			case "3":
			{
				// PrStringthe ASCII art pattern
				System.out.println("=::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::=");
				System.out.println("=.                                                                                                .=");
				System.out.println("=.                                                                                                .=");
				System.out.println("=.                                                                                                .=");
				System.out.println("=.                                                                                                .=");
				System.out.println("=.                                                                                                .=");
				System.out.println("=.                                                                                                .=");
				System.out.println("=.    .-------------------------:.                                                                .=");
				System.out.println("=.    .=++++++++++++++++++++++++=.                                                                .=");
				System.out.println("=.    .=++++++++++++++++++++++++=.                                                                .=");
				System.out.println("=.    .=++++++++++++++++++++++++=.                                                                .=");
				System.out.println("=.    .=++++++++++++++++++++++++=.                                                                .=");
				System.out.println("=.    .=++++.         :==. :++++=.      -#*.  =#*..*#: :######*:  :*##*##+. .*#####*#####+. =#-   .=");
				System.out.println("=.    .=++++. .=++++=..==. :++++=.       .##-*#-  .*#:    ...:#* :##.   :##:.**.  -#*.  +#- =#-   .=");
				System.out.println("=.    .=++++. .=- .==..==. :++++=.        .+##.   .*#:..*###**## =#+    .*#:.**.  :#*.  +#- =#-   .=");
				System.out.println("=.    .=++++. .=- .==..==. :++++=.       .##-*#:  .*#:.*#:   .## :##.   :##:.**.  :#*.  +#- =#-   .=");
				System.out.println("=.    .=++++. .=- .==..==. :++++=.      -#*. .=#*..*#: :##****##  :*#**##+. .**.  :#*.  +#- =#-   .=");
				System.out.println("=.    .=++++===++==++==++===++++=.                        ....       ...                          .=");
				System.out.println("=.    .=++++++++++++++++++++++++=.                                                                .=");
				System.out.println("=.    .=++++++++++++++++++++++++=.                                                                .=");
				System.out.println("=.    .=++++++++++++++++++++++++=.                                                                .=");
				System.out.println("=.    .--------------------------.                                                                .=");
				System.out.println("=.                                                                                                .=");
				System.out.println("=.                                                                                                .=");
				System.out.println("=.                                                                                                .=");
				System.out.println("=.                                                                                                .=");
				System.out.println("=.                                                                                                .=");
				System.out.println("=.                                                                                                .=");
				System.out.println("=::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::=");
	
			}
				System.out.println("\n\n\n");
				xiaomi.showSpecifications();
				break;
			case "4":
			{
				System.out.println("####################################################################################################");
				System.out.println("####################################################################################################");
				System.out.println("####################################################################################################");
				System.out.println("##############################=-####################################################################");
				System.out.println("###################*------=#=-:.--##################################################################");
				System.out.println("###################*.*########=:#####*+*###**##**#******#****##**####**##**##*+*####################");
				System.out.println("###################*.*##+::###**####.:++.-#:.-#=.*+.++++*::==.=+.*##*.-#*:-*.=*-:*##################");
				System.out.println("###################*.*###::###=:###-.*##+.+::::=.*+....**::=-.=+.*##*.-#*:-#:...+###################");
				System.out.println("###################*.*###::###=:###+.+##-.#::*=..*+.####*:-####+.*##*:-#*.-=:*#+.*##################");
				System.out.println("###################*.*########=:#####+==+##++##++#*====+#++####*====*#+==*##*=-=*###################");
				System.out.println("###################*...........-####################################################################");
				System.out.println("####################################################################################################");
				System.out.println("####################################################################################################");
			}
				System.out.println("\n\n\n");
				onePlus.showSpecifications();
				break;
			case "5":
			{
				System.out.println("////////////////////////////////////////////////////////////////////////////////");
				System.out.println("///////////////////////////( )///////////////////////////////////////////////////");
				System.out.println("////////////////////////(//////////////////////(////////////////////////////////");
				System.out.println("//////////,  *//////*  .///   ///   ///////.  *//   ////////,  ,////////////////");
				System.out.println("/////////////  .//.  //////   /////,  *//   (///*  (/////////   ////////////////");
				System.out.println("///////////////    ////////   ////////    ////////*          .((////////////////");
				System.out.println("////////////////////////////////////////////////////////////////////////////////");
	
	
			}
				System.out.println("\n\n\n");
				vivo.showSpecifications();
				break;
			case "6":
				mobile.range();
			case "7":
			Promain Main = new Promain();
			Main.main(new String[]{});
			break ;

			default:
				System.out.println("Invalid choice. Please select a number between 1 and 6.");
			}
			if(series.equals("1")||series.equals("2")||series.equals("3")||series.equals("4")||series.equals("5")||series.equals("6")) break;
		}
	}
}
