
public class JogadorE extends JogadorChain {
	
	public JogadorE() {
        super(IdJogadores.jogadorE);
    }
 
    @Override
    protected void aposta() {
    	System.out.println("Jogador E faz aposta");
    }
}
