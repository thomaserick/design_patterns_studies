
public class Main {

	public static void main(String[] args) {
		JogadorChain jogadores = new JogadorA();
	    jogadores.setNext(new JogadorB());
	    jogadores.setNext(new JogadorC());
	    jogadores.setNext(new JogadorD());
	     
	    try {
	    	jogadores.apostar(IdJogadores.jogadorA);
	    	jogadores.apostar(IdJogadores.jogadorB);
	    	jogadores.apostar(IdJogadores.jogadorC);
	    	jogadores.apostar(IdJogadores.jogadorD);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	}

}
