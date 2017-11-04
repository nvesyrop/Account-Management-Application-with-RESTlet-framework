package server; 
import org.restlet.resource.Get; 
import org.restlet.resource.Options; 
import org.restlet.resource.ServerResource; 
public class RootServerResource extends ServerResource { 
	@Get ("txt") 
	public String represent(){ 
	return " "; 
	}
	@Options ("txt") 
	public String describe(){ 
		throw new RuntimeException("Not yet implemented"); 
	}
} 
