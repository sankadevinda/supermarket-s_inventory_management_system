package osgi_maininventorymanager;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;


import osgi_servicepublisherdairy.ServicePublishDairy;
import osgi_servicepublishervf.ServicePublisherVF;


public class Activator implements BundleActivator {
	ServiceReference serviceReference;
	@Override
	public void start(BundleContext context) throws Exception {
	Scanner scan = new Scanner(System.in);
		
		int answer = 0;
		
        try {
            do {
        		System.out.println();
        		System.out.println("#############################################################################");
        		System.out.println("###     Welcome to Supermarket Inventory Management Section     ###");
        		System.out.println("#############################################################################");
        		System.out.println();
        		System.out.println();
        		System.out.println("################################");
        		System.out.println("##                                       ##");
        		System.out.println("## 1.View Dairy Products                 ##");
        		System.out.println("## 2.View Fruits and Vegetables Products ##");
        		System.out.println("## 3.View Homeware Products              ##");
        		System.out.println("## 4.View Bakery Products                ##");
        		System.out.println("## 5.Calculate Item Profit               ##");
        		System.out.println("##                                       ##");
        		System.out.println("##   99. Exit                            ##");
        		System.out.println("##                                       ##");
        		System.out.println("################################");
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
                    	this.serviceReference = context.getServiceReference(ServicePublisherVF.class.getName());
	                    final ServicePublisherVF servicePublisherVF = (ServicePublisherVF)context.getService(this.serviceReference);
	                    if (servicePublisherVF != null) {
	                    	servicePublisherVF.VegetablAndFruit();
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
        System.out.println("Exception occured. ");
	}
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
	}

}
