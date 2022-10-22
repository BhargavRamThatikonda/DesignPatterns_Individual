import java.io.IOException;


public class Ecommerce{
	
	
	public Ecommerce() throws IOException{
		boolean loginStatus;
		Facade facade = new Facade();
		loginStatus = facade.login();
		if (loginStatus) {
			facade.productOperation();
		}
	}
	

	public static void main(String[] args) throws IOException{
		System.out.println("Welcome to Ecommerce website");
		new Ecommerce();
	}

}
