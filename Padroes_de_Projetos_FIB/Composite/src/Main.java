
public class Main {

	public static void main(String[] args) {
		Pessoa crianca = new Mulher("girl");
		Pessoa mulher = new Mulher("Lara Croft");
		Pessoa homem = new Homem("Bruce Lee");
		Pessoa boy = new Homem("Little Boy");
		 	
		System.out.println("\nAdicionar filhos a um homem");
	    try {
	    	homem.terFilho(crianca);
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	    
	    System.out.println("\nAdicionar filhos a um outro homem");
	    try {
	    	boy.terFilho(crianca);
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
	    
	    System.out.println("\nAdicionar filhos a uma mulher");
	    try {
	    	mulher.terFilho(boy);
	    	mulher.terFilho(crianca);
	    	mulher.showNome();
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	    }
		 
		try {
	        System.out.println("\nMostrar Filho por nome");
	        mulher.getFilho(boy.getNome()).showNome();
		} catch (Exception e) {
		    e.printStackTrace();
		}

	}

}
