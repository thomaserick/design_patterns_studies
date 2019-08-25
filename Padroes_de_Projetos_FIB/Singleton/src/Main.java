
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexao c = Conexao.getInstance();
		System.out.println(c.toString());
		
		Conexao x = Conexao.getInstance();
		System.out.println(x.toString());
	}

}
