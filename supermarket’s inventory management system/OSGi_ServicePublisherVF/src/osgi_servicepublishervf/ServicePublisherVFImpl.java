package osgi_servicepublishervf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServicePublisherVFImpl implements ServicePublisherVF {

	@Override
	public void VegetablAndFruit() {
		int answer = 0;
		
		do {
	        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			System.out.println();
	        System.out.println("Give a Number to Select Vegetable Or Fruit Category :");
			System.out.println();
			System.out.println("######################################");
			System.out.println("#                                    #");
			System.out.println("#     1. Citrus                      #");
			System.out.println("#     2. Stone Fruit                 #");
			System.out.println("#     3. Marrow                      #");
			System.out.println("#     4. Root                        #");
			System.out.println("#     5. Allium                       #");
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
					System.out.println("|                                                 CITRUS                                                |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                       |    Model No    |      Price    |    Quantity     |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Oranges                           |     CT0001     |     370.00     |       12   	                    |");
					System.out.println("| Grapefruits                       |     CT0002     |     350.00     |       15   	                    |");
					System.out.println("| Mandarins                         |     CT0003     |     115.00     |       11                        |");
					System.out.println("| Limes                             |     CT0004     |     165.00     |       15                        |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
	                continue;
	            }
	            case 2: {
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("|                                        STONE FRUIT                                                    |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Nectarines                                        |     SF0001     |     450.00       |       15      |");
					System.out.println("| Apricots                                          |     SF0002     |     650.00       |       25      |");
					System.out.println("| Peaches                                           |     SF0003     |     800.00      |       14       |");
					System.out.println("| Plums                                             |     SF0004     |     450.00      |       18       |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
	                continue;
	            }
	            case 3: {
					System.out.println();
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  MARROW                                                |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price        |    Quantity   |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Pumpkin                                           |     MA0001     |      150.00       |       12      |");
					System.out.println("| Cucumber                                          |     MA0002     |      350.00       |       16      |");
					System.out.println("| Zucchini                                          |     MA0003     |      190.00       |       22      |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println();
	                continue;
	            }
	            case 4: {
					System.out.println();
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                 ROOT                                                  |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println("| Potato                                            |     RT0001     |     220.00     |       11        |");
					System.out.println("| Sweet Potato                                      |     RT0002     |     300.00     |       14        |");
					System.out.println("| Yam                                               |     RT0003     |     500.00     |       15        |");
					System.out.println("---------------------------------------------------------------------------------------------------------");
					System.out.println();
	                continue;
	            }
	            case 5: {
					System.out.println();
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("|                                                  ALLIUM                                                |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Product Name                                      |    Model No    |       Price       |    Quantity   |");
					System.out.println("----------------------------------------------------------------------------------------------------------");
					System.out.println("| Onion                                             |     CB0001     |      7550.00      |       07      |");
					System.out.println("| Garlic                                            |     CB0002     |      6490.00      |       09      |");
					System.out.println("| Shallot                                           |     CB0003     |      11950.00     |       13      |");
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
		
	}

}
