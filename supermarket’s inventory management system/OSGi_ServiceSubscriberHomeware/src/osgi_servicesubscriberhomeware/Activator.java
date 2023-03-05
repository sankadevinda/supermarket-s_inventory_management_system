package osgi_servicesubscriberhomeware;


import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import itemprofitcalculator.ItemProfitCalculator;
import osgi_servicepublisherhomeware.ServicePublisherHomeware;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;
	
	@Override
	public void start(BundleContext context) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		int answer = 0;
		
	    try {
	        do {
	    		System.out.println();
	    		System.out.println("#################################################################");
	    		System.out.println("###    Welcome to Homeware Inventory Management Section    ###");
	    		System.out.println("#################################################################");
	    		System.out.println();
	    		System.out.println();
	    		System.out.println("########################################");
	    		System.out.println("##                                    ##");
	    		System.out.println("##    1. View Homeware            ##");
	    		System.out.println("##    2. Calculate Homeware Profit   ##");
	    		System.out.println("##                                    ##");
	    		System.out.println("##   99. Exit                         ##");
	    		System.out.println("##                                    ##");
	    		System.out.println("########################################");
	    		System.out.println();
	    		System.out.print("Enter Number: ");
	            answer = scanner.nextInt();
	            switch (answer) {
	                case 1: {
	                    this.serviceReference = context.getServiceReference(ServicePublisherHomeware.class.getName());
	                    final ServicePublisherHomeware servicePublishHomeware = (ServicePublisherHomeware)context.getService(this.serviceReference);
	                    if (servicePublishHomeware != null) {
	                    	servicePublishHomeware.Homeware();
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
	}
	    System.out.println("Exception occured.");
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
	}

}
