package servicesubscriberbakery;

import bakery_service_publisher.ServicePublichBakery;
import itemprofitcalculator.ItemProfitCalculator;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistration;
	private ServiceReference<?> serviceReference;

	public void start(BundleContext bundleContext) throws Exception {
    Scanner scan = new Scanner(System.in);
		
		int answer = 0;
		
	    try {
	        do {
	    		System.out.println();
	    		System.out.println("#################################################################");
	    		System.out.println("###    Welcome to  Bakery  Management Section                 ###");
	    		System.out.println("#################################################################");
	    		System.out.println();
	    		System.out.println();
	    		System.out.println("########################################");
	    		System.out.println("##                                    ##");
	    		System.out.println("##    1. View bakery items            ##");
	    		System.out.println("##    2. Calculate bakery Profit      ##");
	    		System.out.println("##                                    ##");
	    		System.out.println("##   99. Exit                         ##");
	    		System.out.println("##                                    ##");
	    		System.out.println("########################################");
	    		System.out.println();
	    		System.out.print("Enter Number: ");
	    		
	            answer = scan.nextInt();
	            switch (answer) {
	            
	                case 1: {
	                    this.serviceReference = bundleContext.getServiceReference(ServicePublichBakery.class.getName());
	                    final ServicePublichBakery servicePublichBakery = (ServicePublichBakery)bundleContext.getService(this.serviceReference);
	                    if (servicePublichBakery != null) {
	                    	servicePublichBakery.bakery();
	                        continue;
	                    }
	                    continue;
	                }
	                case 2: {
	                    this.serviceReference = bundleContext.getServiceReference(ItemProfitCalculator.class.getName());
	                    final ItemProfitCalculator itemProfitCalculator = (ItemProfitCalculator)bundleContext.getService(this.serviceReference);
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

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println();
		System.out.println("######################################################");
		System.out.println("###   Bakery Manager Logged Out                    ###");
		System.out.println("######################################################");
		System.out.println();
	}

}
