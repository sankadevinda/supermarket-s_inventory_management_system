package osgi_servicesubscriberdairy;

import itemprofitcalculator.ItemProfitCalculator;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import osgi_servicepublisherdairy.ServicePublishDairy;

public class Activator implements BundleActivator {
	ServiceReference serviceReference;
	
	public void start(BundleContext context) throws Exception {
        Scanner scan = new Scanner(System.in);
		
		int answer = 0;
		
	    try {
	        do {
	    		System.out.println();
	    		System.out.println("#################################################################");
	    		System.out.println("###    Welcome to Dairy Inventory Management Section    ###");
	    		System.out.println("#################################################################");
	    		System.out.println();
	    		System.out.println();
	    		System.out.println("########################################");
	    		System.out.println("##                                    ##");
	    		System.out.println("##    1. View Dairy            ##");
	    		System.out.println("##    2. Calculate Dairy Profit   ##");
	    		System.out.println("##                                    ##");
	    		System.out.println("##   99. Exit                         ##");
	    		System.out.println("##                                    ##");
	    		System.out.println("########################################");
	    		System.out.println();
	    		System.out.print("Enter Number: ");
	            answer = scan.nextInt();
	            switch (answer) {
	                case 1: {
	                    this.serviceReference = context.getServiceReference(ServicePublishDairy.class.getName());
	                    final ServicePublishDairy servicePublishDairy = (ServicePublishDairy)context.getService(this.serviceReference);
	                    if (servicePublishDairy != null) {
	                    	servicePublishDairy.Dairy();
	                        continue;
	                    }
	                    continue;
	                }
	                case 2: {
	                    this.serviceReference = context.getServiceReference(ItemProfitCalculator.class.getName());
	                    final ItemProfitCalculator itemProfitCalculator = (ItemProfitCalculator)context.getService(this.serviceReference);
	                    if (itemProfitCalculator!= null) {
	                    	itemProfitCalculator.profit();
	                        continue;
	                    }
	                    continue;
	                }
	                case 99: {
	                    continue;
	                }
	                default: {
	                    System.out.println("Invalid number. Please choose a given service number.");
	                    continue;
	                }
	            }
	        } while (answer != 99);
	}catch (Exception ex) {
	    System.out.println("Exception occured."); 
	}
	    
	}
	
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println();
		System.out.println("######################################################");
		System.out.println("###   Dairy Inventory Manager Logged Out    ###");
		System.out.println("######################################################");
		System.out.println();
	}

}
