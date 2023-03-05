package osgi_servicepublisherhomeware;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {

	ServiceRegistration serviceRegistration;
	@Override
	public void start(BundleContext context) throws Exception {
		
		final ServicePublisherHomeware ServiceDairy = new ServicePublisherHomewareImpl();
		this.serviceRegistration = context.registerService(ServicePublisherHomeware.class.getName(), (Object)ServiceDairy, null);
		System.out.println();
		System.out.println("######################################");
		System.out.println("###      Homeware Products      ###");
		System.out.println("###     Stock Status : In Stock    ###");
		System.out.println("######################################");
		System.out.println();
	}
	
	@Override
	public void stop(BundleContext context) throws Exception {
		this.serviceRegistration.unregister();
		System.out.println();
		System.out.println("######################################");
		System.out.println("###       Homeware Products       ###");
		System.out.println("###   Stock Status : Out of Stock  ###");
		System.out.println("######################################");
		System.out.println();
	}

}
