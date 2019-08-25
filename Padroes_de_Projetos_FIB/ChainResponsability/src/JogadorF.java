
public class JogadorF extends JogadorChain {
	
	public JogadorF() {
        super(IdJogadores.jogadorF);
    }
 
    @Override
    protected void aposta() {
        System.out.println("Jogador F faz aposta");
    }
}
