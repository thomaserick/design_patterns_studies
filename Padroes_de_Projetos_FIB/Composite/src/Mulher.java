import java.util.ArrayList;

public class Mulher extends Pessoa {
	ArrayList<Pessoa> filhos = new ArrayList<Pessoa>();
	 
    public Mulher(String nome) {
        this.nome = nome;
    }
 
    @Override
    public void showNome() {
        System.out.println(nome);
        for (Pessoa filho : filhos) {
            filho.showNome();
        }
    }
 
    @Override
    public void terFilho(Pessoa novoFilho) {
        this.filhos.add(novoFilho);
    }
 
    @Override
    public Pessoa getFilho(String nome) throws Exception {
        for (Pessoa filho : filhos) {
            if (filho.getNome() == nome) {
                return filho;
            }
        }
        throw new Exception(this.nome + " não tem um filho chamado" + nome);
    }

}
