
public class JogadorD extends JogadorChain {
	
	public JogadorD() {
        super(IdJogadores.jogadorD);
    }
 
    @Override
    protected void aposta() {
    	System.out.println("Jogador D faz aposta");
    }
}
