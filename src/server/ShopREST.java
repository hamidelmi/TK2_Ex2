package server;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/shop")
public class ShopREST {
	private static ProductManager pm;

	public ShopREST() {
		if (pm == null) {
			pm = new ProductManager();
			pm.addProduct(new Product("Apple", 1300, 10));
			pm.addProduct(new Product("IBM", 1300, 10));
			pm.addProduct(new Product("HP", 1300, 10));
		}
	}

	@GET
	@Path("/register/{userName}")
	@Produces(MediaType.TEXT_PLAIN)
	public String register(@PathParam("userName") String userName) {
		return pm.addUser(userName).toString();
	}

	@GET
	@Path("/list")
	@Produces(MediaType.TEXT_PLAIN)
	public String getList() {
		return pm.toString();
	}

	@GET
	@Path("/order/{productName}")
	@Produces(MediaType.TEXT_PLAIN)
	public String order(@PathParam("productName") String productName) {
		boolean result = pm.decreaseAmout(productName);
		if (result)
			return "order succeed!";
		else
			return "order failed!";
	}
}