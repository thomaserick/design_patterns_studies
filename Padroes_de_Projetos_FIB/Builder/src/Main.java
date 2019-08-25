
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Construtora construtora = new Construtora(new SobradoBuilder());	 
		construtora.construirCasa();
	    Casa casa = construtora.getCasa();
	    System.out.println(casa);
	 
	    System.out.println();
	 
	    construtora = new Construtora(new MansãoBuilder());	 
		construtora.construirCasa();
	    casa = construtora.getCasa();
	    System.out.println(casa);
	    
	    System.out.println();
		 
	    construtora = new Construtora(new EdiculaBuilder());	 
		construtora.construirCasa();
	    casa = construtora.getCasa();
	    System.out.println(casa);
	}

}
