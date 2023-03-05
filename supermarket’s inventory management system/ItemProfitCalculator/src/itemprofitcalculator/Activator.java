package itemprofitcalculator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;



public class Activator implements BundleActivator {
	ServiceRegistration serviceRegistration;
	@Override
	public void start(BundleContext context) throws Exception {
		 final ItemProfitCalculator itemProfitCalculator = new ItemProfitCalculatorImpl();
	        this.serviceRegistration = context.registerService(ItemProfitCalculator.class.getName(), (Object) itemProfitCalculator, null);
	System.out.println();
	System.out.println("###########################################");
	System.out.println("###      Profit Calculator Started      ###");
	System.out.println("###########################################");
	System.out.println();
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		this.serviceRegistration.unregister();
		System.out.println();
		System.out.println("###########################################");
		System.out.println("###      Profit Calculator Stopped      ###");
		System.out.println("###########################################");
		System.out.println();
	}

}
