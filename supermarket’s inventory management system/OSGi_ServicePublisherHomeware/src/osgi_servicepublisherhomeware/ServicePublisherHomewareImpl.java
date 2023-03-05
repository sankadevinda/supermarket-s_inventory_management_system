package osgi_servicepublisherhomeware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServicePublisherHomewareImpl implements ServicePublisherHomeware  {

	public void Homeware(){
		
		int answer = 0;
		
		do {
	        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			System.out.println();
	        System.out.println("Give a Number to Select Accessory Category :");
			System.out.println();
			System.out.println("######################################");
			System.out.println("#                                    #");
			System.out.println("#     1. Kitchenware                 #");
			System.out.println("#     2. Tools     			         #");
			System.out.println("#     3. Plastic ware                #");
			System.out.println("#     4. Books                       #");
			System.out.println("#     5. Textile                     #");
			System.out.println("#                                    #");
			System.out.println("#    99. Go Back                     #");
			System.out.println("#                                    #");
			System.out.println("######################################");
			System.out.println();
			System.out.print("Enter Number: ");
	        try {
	        	answer = Integer.parseInt(in.readLine());
	        }
	        catch (NumberFormatException e) {
	            e.printStackTrace();
	        }
	        catch (IOException e2) {
	            e2.printStackTrace();
	        }
	        switch (answer) {
	            case 1: {
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  Kitchenware                                          |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Coconut Scraper                                   |     KT0001     |      7000.00     |       12   	|");
					System.out.println("| Egg Seperator                       				|     KT0002     |      2500.00     |       15   	|");
					System.out.println("| Strain steel Large     							|     KT0003     |      1500.00     |       11      |");
					System.out.println("| Ceramic Cup    								 	|     KT0004     |      1675.00     |       15      |");
					System.out.println("| Ice Scoope              						 	|     KT0005     |      3450.00     |       14      |");
					System.out.println("| Cup Cake Pan Small           						|     KT0006     |      1000.00     |       16      |");
					System.out.println("| Bottle Opener             						|     KT0007     |       805.00     |       13      |");
					System.out.println("| Silicone Brush             						|     KT0008     |      3600.00     |       08      |");
					System.out.println("| Multi Peeler            							|     KT0009     |      1800.00     |       11      |");
					System.out.println("| Oven Glove                  						|     KT0010     |       600.00     |       15      |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
	                continue;
	            }
	            case 2: {
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("|                                         Tools                                                         |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| H & S Flat Spice Container Small                  |     PW0001     |     4500.00      |       15      |");
					System.out.println("| H & S Plastic Jar Hp 102                          |     PW0002     |     2250.00      |       25      |");
					System.out.println("| H & S Foodcontaine                                |     PW0003     |     7800.00      |       14      |");
					System.out.println("| H & S Plastic jar                                 |     PW0004     |     6450.00      |       18      |");
					System.out.println("| Atlas Lunch Box Snackkit small                    |     PW0005     |     22420.00     |       22      |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
	                continue;
	            }
	            case 3: {
					System.out.println();
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  Tools                                             |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price        |    Quantity   |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| ALDO BAERIEN Green Women's Earrings               |     FJ0001     |      1550.00      |       12      |");
					System.out.println("| ALDO BUTTERCUP White Women's Earrings             |     FJ0002     |      3550.00      |       16      |");
					System.out.println("| Cotton Collection Earrings by COCO                |     FJ0003     |      1290.00      |       22      |");
					System.out.println("| Cotton Collection Black White Earrings by COCO    |     FJ0004     |      1490.00      |       21      |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println();
	                continue;
	            }
	            case 4: {
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  BAGS                                                 |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Swarovski Bella Pierced Earrings Rhodium Plating  |     LJ0001     |     22900.00     |       11      |");
					System.out.println("| Swarovski Stone Bangle, White, Rhodium Plated     |     LJ0002     |     30900.00     |       14      |");
					System.out.println("| Swarovski Orbita Stud Octagon Cut Crystal         |     LJ0003     |     19500.00     |       15      |");
					System.out.println("| Swarovski Dulcis Cocktail Ring, Green             |     LJ0004     |     49750.00     |       17      |");
					System.out.println("| Vogue Symbolic Evil Eye Mixed Plating             |     LJ0005     |     30450.00     |       18      |");
					System.out.println("| Vogue Constella Braceletwhite, Gold-Tone Plated   |     LJ0006     |     67900.00     |       19      |");
					System.out.println("| Amanda Angelic Necklace, Blue, Rhodium Plated     |     LJ0007     |     35900.00     |       10      |");
					System.out.println("| Amanda Attract Cluster Pendant,Rhodium Plated     |     LJ0008     |     27250.00     |       18      |");
					System.out.println("| Mandala Dancing Swan Necklace, Rhodium Plated     |     LJ0009     |     37600.00     |       14      |");
					System.out.println("| Swarovski Rollerball Pen, Rose-Gold Tone Plated   |     LJ0010     |     17500.00     |       17      |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
	                continue;
	            }
	            case 5: {
					System.out.println();
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  BELTS                                                 |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |       Price       |    Quantity   |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Tumi Voyageur Just In Case Cordovan Tote          |     CB0001     |      7550.00      |       07      |");
					System.out.println("| Aldo Acera Women's City Handbags                  |     CB0002     |      6490.00      |       09      |");
					System.out.println("| Aldo Olerrasean Women's Dress Handbags            |     CB0003     |      11950.00     |       13      |");
					System.out.println("| Hemago Women's Crossbody Bag                      |     CB0004     |      8700.00      |       16      |");
					System.out.println("| David Jones Women's Green Crossbody Bag           |     CB0005     |      11200.00     |       06      |");
					System.out.println("| David Jones Womens Green Backpacks                |     CB0006     |      6950.00      |       04      |");
					System.out.println("| UCB Men's Blue School Style Backpack              |     CB0007     |      7350.00      |       15      |");
					System.out.println("| Fossil Men's Haskell Leather Workbag              |     CB0008     |      43920.00     |       05      |");
					System.out.println("| Fossil Men's Spo Leather Crossbody Bag            |     CB0009     |      27000.00     |       03      |");
					System.out.println("| Fossil Men's Buckner Nylon Crossbody Bag          |     CB0010     |      24000.00     |       12      |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println();
	                continue;
	            }
	            case 99: {
	                continue;
	            }
	            default: {
	            	System.out.println();
	                System.out.println("The number you entered is invalid!!!");
	                continue;
	            }
	        }
	    

		
			
		} while (answer != 99);
	};
}
