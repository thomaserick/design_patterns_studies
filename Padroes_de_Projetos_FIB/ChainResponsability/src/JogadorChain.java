
public abstract class JogadorChain {
	protected JogadorChain next;
    protected IdJogadores identificadorDoJogador;
 
    public JogadorChain(IdJogadores id) {
        next = null;
        identificadorDoJogador = id;
    }
 
    public void setNext(JogadorChain proxJog) {
        if (next == null) {
            next = proxJog;
        } else {
            next.setNext(proxJog);
        }
    }
    
    public void apostar(IdJogadores id) throws Exception {
        if (podeApostar(id)) {
        	aposta();
        } else {
            if (next == null) {
                throw new Exception("Jogador não está na mesa para apostar");
            }
            next.apostar(id);
        }
    }
     
    private boolean podeApostar(IdJogadores id) {
        if (identificadorDoJogador == id) {
            return true;
        }
        return false;
    }
     
    protected abstract void aposta();
}
