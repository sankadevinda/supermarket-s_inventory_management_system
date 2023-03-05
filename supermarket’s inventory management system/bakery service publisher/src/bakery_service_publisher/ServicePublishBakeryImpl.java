package bakery_service_publisher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ServicePublishBakeryImpl implements ServicePublichBakery{
	
         public void bakery(){
	int answer = 0;
	
	do {
        final BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		System.out.println();
        System.out.println("Select bakery items :");
		System.out.println();
		System.out.println("######################################");
		System.out.println("#                                    #");
		System.out.println("#     1.Bread                        #");
		System.out.println("#     2.Cake                         #");
		System.out.println("#     3.Cookise                      #");
		System.out.println("#     4.Buns                         #");
		System.out.println("#     5.More items                   #");
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
				System.out.println("|                                                  Bread                                                |");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println("| Flat bread                                        |     BR0001     |     370.00       |       12   	|");
				System.out.println("| French bread                                      |     BR0002     |     2250.00      |       15   	|");
				System.out.println("| Bread Roll                                        |     BR0003     |     115.00       |       11      |");
				System.out.println("| Baguette                                          |     BR0004     |     16750.00     |       15      |"); 
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println();
                continue;
            }
            case 2: {
				System.out.println();
				System.out.println("--------------------------------------------------------------------------------------------------------");
				System.out.println("|                                                  Cake                                                |");
				System.out.println("--------------------------------------------------------------------------------------------------------");
				System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity  |");
				System.out.println("--------------------------------------------------------------------------------------------------------");
				System.out.println("| VANNILA FLAVOUR                                   |     CK0001     |     450.00      |       15      |");
				System.out.println("| BUTTERSCOTCH FLAVOUR                              |     CK0002     |     225.00      |       25      |");
				System.out.println("| PINEAPPLE FLAVOUR                                 |     CK0003     |     780.00      |       14      |");
				System.out.println("| STRAWBERRY FLAVOUR                                |     CK0004     |     650.00      |       18      |");
				System.out.println("| GULKAND FLAVOR                                    |     CK0005     |    2240.00      |       22      |");
				System.out.println("| RASMALAI FLAVOUR                                  |     CK0006     |    3800.00      |       21      |");
				System.out.println("| ROSE FLAVOUR                                      |     CK0007     |     830.00      |       13      |");
				System.out.println("| CHOCOLATE GANACH                                  |     CK0008     |    5100.00      |       17      |");
				System.out.println("| FULL CHOCOLATE                                    |     CK0009     |    1200.00      |       12      |");
				System.out.println("| BRIBIE DOLL CAKE                                  |     CK0010     |    8600.00      |       18      |");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println();
                continue;
            }
            case 3: {
				System.out.println();
				System.out.println("----------------------------------------------------------------------------------------------------------");
				System.out.println("|                                                  cookise                                               |");
				System.out.println("----------------------------------------------------------------------------------------------------------");
				System.out.println("| Product Name                                      |    Model No    |      Price        |    Quantity   |");
				System.out.println("----------------------------------------------------------------------------------------------------------");
				System.out.println("| THIN MINTS                                        |     CO0001     |      1550.00      |       12      |");
				System.out.println("| TREFOILO                                          |     CO0002     |      3550.00      |       16      |");
				System.out.println("| SAMOAS                                            |     CO0003     |      1290.00      |       22      |");
				System.out.println("| S'MORES                                           |     CO0004     |      1490.00      |       21      |");
				System.out.println("| TOFFEE-TASTIC                                     |     CO0005     |      4420.00      |       33      |");
				System.out.println("| RASPBERRY RALLY                                   |     CO0006     |      1650.00      |       14      |");
				System.out.println("| LEMON-UPS                                         |     CO0007     |      2950.00      |       14      |");
				System.out.println("| PB SANDWICH                                       |     CO0008     |      2320.00      |       17      |");
				System.out.println("| PB PATTIES                                        |     CO0009     |      3950.00      |       13      |");
				System.out.println("| CARAMEL CHOC CHIP                                 |     CO0010     |      4150.00      |       16      |");
				System.out.println("----------------------------------------------------------------------------------------------------------");
				System.out.println();
                continue;
            }
            case 4: {
				System.out.println();
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println("|                                                  Buns                                                 |");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println("| Product Name                                      |    Model No    |      Price       |    Quantity   |");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println("| BURGER BUNS                                       |     BN0001     |     220.00       |       11      |");
				System.out.println("| HOT DOG BUNS                                      |     BN0002     |     300.00       |       14      |");
				System.out.println("| SUBMARINE BREAD BUNS                              |     BN0003     |    1500.00       |       15      |");
				System.out.println("| SWEET BUNS                                        |     BN0004     |     100.00       |       17      |");
				System.out.println("| CREAM BUNS                                        |     BN0005     |     150.00       |       18      |");
				System.out.println("| TEA BUNS                                          |     BN0006     |     50.00        |       19      |");
				System.out.println("---------------------------------------------------------------------------------------------------------");
				System.out.println();
                continue;
            }
            case 5: {
				System.out.println();
				System.out.println("----------------------------------------------------------------------------------------------------------");
				System.out.println("|                                              More items                                                |");
				System.out.println("----------------------------------------------------------------------------------------------------------");
				System.out.println("| Product Name                                      |    Model No    |       Price       |    Quantity   |");
				System.out.println("----------------------------------------------------------------------------------------------------------");
				System.out.println("| CHOCOLATE CROISSANTS                              |     IM0001     |       550.00      |       07      |");
				System.out.println("| BUTTER CROISSANTS                                 |     IM0002     |       490.00      |       09      |");
				System.out.println("| VOL AU VENT                                       |     IM0003     |       950.00      |       13      |");
				System.out.println("| VIENNA ROLLS                                      |     IM0004     |       870.00      |       16      |");
				System.out.println("| KONDA KAVUM                                       |     IM0005     |       200.00     |       06       |");
				System.out.println("| ATHIRASA                                          |     IM0006     |       150.00      |       04      |");
				System.out.println("| MUNG KAVUM                                        |     IM0007     |       150.00      |       15      |");
				System.out.println("| PIZZA                                             |     IM0008     |      1920.00     |       05       |");
				System.out.println("| TORTILLA                                          |     IM0009     |      2700.00     |       03       |");
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
