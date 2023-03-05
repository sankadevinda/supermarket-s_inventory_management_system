package osgi_servicepublisherdairy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServicePublishDairyImpl implements ServicePublishDairy{
	
	public void Dairy() {
	
	int answer = 0;
	
	do {
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println();
        System.out.println("Give a Number to Select Dairy Category :");
		System.out.println();
		System.out.println("######################################");
		System.out.println("#                                    #");
		System.out.println("#     1. Milk                        #");
		System.out.println("#     2. Butter                      #");
		System.out.println("#     3. Yogurt                      #");
		System.out.println("#     4. Cheese                      #");
		System.out.println("#     5. Ice Cream                   #");
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
				System.out.println("|                                                  MILK                                                 |");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println("| Product Name                                      |    Model No   |      Price     |    Quantity      |");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println("| Nut  Milk                                         |     M0001     |     370.00     |       12   	    |");
				System.out.println("| Soy  Milk                                         |     M0002     |     220.00     |       15         |");
				System.out.println("| Oat  Milk                                         |     M0003     |     110.00     |       11         |");
				System.out.println("| Rice Milk                                         |     M0004     |     175.00     |       15         |");
				System.out.println("| Pea  Milk                                         |     M0005     |     434.00     |       14         |");
				System.out.println("| Cow  Milk                                         |     M0006     |     500.00     |       16         |");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println();
                continue;
            }
            case 2: {
				System.out.println();
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println("|                                                    BUTTER                                             |");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println("| Product Name                                      |    Model No   |      Price      |    Quantity     |");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println("| Unsalted      Butter                              |     B0001     |     450.00      |       15        |");
				System.out.println("| Salted        Butter                              |     B0002     |     250.00      |       25        |");
				System.out.println("| Sweet Cream   Butter                              |     B0003     |     700.00      |       14        |");
				System.out.println("| Cultured      Butter                              |     B0004     |     450.00      |       18        |");
				System.out.println("| Clarified     Butter                              |     B0005     |     242.00      |       22        |");
				System.out.println("| Organic       Butter                              |     B0006     |     800.00      |       21        |");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println();
                continue;
            }
            case 3: {
				System.out.println();
				System.out.println("----------------------------------------------------------------------------------------------------------");
				System.out.println("|                                                  YOGURT                                                |");
				System.out.println("----------------------------------------------------------------------------------------------------------");
				System.out.println("| Product Name                                      |    Model No    |      Price        |    Quantity   |");
				System.out.println("----------------------------------------------------------------------------------------------------------");
				System.out.println("| Plain      Yogurt                                 |     Y0001      |      150.00       |       12      |");
				System.out.println("| Frozen     Yogurt                                 |     Y0002      |      550.00       |       16      |");
				System.out.println("| Probiotic  Yogurt                                 |     Y0003      |      290.00       |       22      |");
				System.out.println("| Strawberry Yogurt                                 |     Y0004      |      190.00       |       21      |");
				System.out.println("| Peach      Yogurt                                 |     Y0005      |      420.00       |       33      |");
				System.out.println("| Almond     Yogurt                                 |     Y0006      |      650.00       |       14      |");
				System.out.println("----------------------------------------------------------------------------------------------------------");
				System.out.println();
                continue;
            }
            case 4: {
				System.out.println();
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println("|                                                  CHEESE                                               |");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println("| Blue       Cheese                                 |     C0001      |     2290.00     |       11       |");
				System.out.println("| Bocconcini Cheese                                 |     C0002      |     2290.00     |       14       |");
				System.out.println("| Brie       Cheese                                 |     C0003      |     1500.00     |       15       |");
				System.out.println("| Burrata    Cheese                                 |     C0004      |     9750.00     |       17       |");
				System.out.println("| Camembert  Cheese                                 |     C0005      |     3450.00     |       18       |");
				System.out.println("| Cheddar    Cheese                                 |     C0006      |     690.00      |       19       |");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println();
                continue;
            }
            case 5: {
				System.out.println();
				System.out.println("----------------------------------------------------------------------------------------------------------");
				System.out.println("|                                                  ICE CREAM                                             |");
				System.out.println("----------------------------------------------------------------------------------------------------------");
				System.out.println("| Product Name                                      |    Model No    |       Price       |    Quantity   |");
				System.out.println("----------------------------------------------------------------------------------------------------------");
				System.out.println("| Vanilla        Ice Cream                          |     I0001      |      550.00      |       07       |");
				System.out.println("| Chocolate      Ice Cream                          |     I0002      |      490.00      |       09       |");
				System.out.println("| Strawberry     Ice Cream                          |     I0003      |      1950.00     |       13       |");
				System.out.println("| Chocolate Chip Ice Cream                          |     I0004      |      700.00      |       16       |");
				System.out.println("| Butter Pecan   Ice Cream                          |     I0005      |      1200.00     |       06       |");
				System.out.println("| Matcha         Ice Cream                          |     I0006      |      950.00      |       04       |");
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

