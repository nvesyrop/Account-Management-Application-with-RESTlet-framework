package server; 
import org.restlet.Application; 
import org.restlet.Restlet; 
import org.restlet.Server; 
import org.restlet.data.Protocol; 
import org.restlet.routing.Router; 
public class MailServerApplication extends Application { 
	public static void main(String[] args) throws Exception { 
		Server mailServer = new Server(Protocol.HTTP, 8111); 
		mailServer.setNext(new MailServerApplication()); 
		mailServer.start(); 
	}
	@Override 
	public Restlet createInboundRoot() { 
		Router router = new Router(getContext()); 
		router.attach("http://localhost:8111/", 
		RootServerResource.class); 
		router.attach("http://localhost:8111/accounts/", 
		AccountsServerResource.class); 
		router.attach("http://localhost:8111/accounts/{accountId}", 
		AccountServerResource.class); 
		return router; 
	} 
}
