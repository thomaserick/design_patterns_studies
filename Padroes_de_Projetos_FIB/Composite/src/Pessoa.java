
public abstract class Pessoa {
	protected String nome;
	 
    public void showNome() {
        System.out.println(nome);
    }
 
    public String getNome() {
        return nome;
    }
 
    public void terFilho(Pessoa filho) throws Exception {
        throw new Exception(nome + " não pode ter filhos - Somente mulheres podem engravidar");
    }
 
    public Pessoa getFilho(String nomeFilho) throws Exception {
        throw new Exception(" O homem e por isso, não esteve em gestação - não localizada lista de filhos");
    }
}
