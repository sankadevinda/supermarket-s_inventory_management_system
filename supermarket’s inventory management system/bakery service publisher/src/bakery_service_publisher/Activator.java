package bakery_service_publisher;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistration;

	public void start(BundleContext context) throws Exception {
		final ServicePublichBakery servicePublichBakery = new ServicePublishBakeryImpl();
		this.serviceRegistration = context.registerService(ServicePublichBakery.class.getName(), (Object)servicePublichBakery, null);
	    System.out.println();
		System.out.println("######################################");
		System.out.println("###      Bakery Products           ###");
		System.out.println("###     Stock Status : In Stock    ###");
		System.out.println("######################################");
		System.out.println();
	}

	public void stop(BundleContext context) throws Exception {
		this.serviceRegistration.unregister();
		System.out.println();
		System.out.println("######################################");
		System.out.println("###       Bakery Products          ###");
		System.out.println("###   Stock Status : Out of Stock  ###");
		System.out.println("######################################");
		System.out.println();
	}

}
