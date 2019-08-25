
public class JogadorC extends JogadorChain {
	
	public JogadorC() {
        super(IdJogadores.jogadorC);
    }
 
    @Override
    protected void aposta() {
    	System.out.println("Jogador C faz aposta");
    }
}
