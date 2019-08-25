
public class JogadorB extends JogadorChain {
	
	public JogadorB() {
        super(IdJogadores.jogadorB);
    }
 
    @Override
    protected void aposta() {
    	System.out.println("Jogador B faz aposta");
    }
}
