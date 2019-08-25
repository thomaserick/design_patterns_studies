
public class JogadorA extends JogadorChain {
	
	public JogadorA() {
        super(IdJogadores.jogadorA);
    }
 
    @Override
    protected void aposta() {
        System.out.println("Jogador A faz aposta");
    }
}
