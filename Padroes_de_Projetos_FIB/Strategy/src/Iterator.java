import java.util.List;

public class Iterator {
	public static final int ASC = 1;
	public static final int DESC = 2;
	protected double salarioBase;
	protected int metodo;
	protected Vetor metodoDeIteracao;

	public Iterator(int metodo) {
		switch (metodo) {
		case ASC:
			metodoDeIteracao = new VetorAsc();
			metodo = ASC;
			break;
		case DESC:
			metodoDeIteracao = new VetorDesc();
			metodo = DESC;
			break;
		default:
			throw new RuntimeException("Método não encontrado :/");
		}
	}
	
	public void geraLista() {
		metodoDeIteracao.gerarLista();
	}
	public void setLista(List<Integer> lista) {
		metodoDeIteracao.setLista(lista);
	}
	public List<Integer> getLista() {
		return metodoDeIteracao.getLista();
	}
	
	public void percorreLista() {
		metodoDeIteracao.percorrerLista();
	}
}
