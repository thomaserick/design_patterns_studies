
public class Main {

	public static void main(String[] args) {
		Comida burguer = new BurguerDecorado(new Burguer());
	    burguer.prepare();
	}

}
