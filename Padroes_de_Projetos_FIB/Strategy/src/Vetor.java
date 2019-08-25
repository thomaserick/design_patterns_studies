import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Vetor {
	
	public List<Integer> list;
	public static final int TAMANHO=10;
	
	public void gerarLista() {
		 list = new ArrayList<Integer>();
		Random rand = new Random();
		for(int i=0; i < TAMANHO; i++) {
			list.add(rand.nextInt());
		}
	}
	public void setLista(List<Integer> lista) {
		 list = lista;
	}
	public List<Integer> getLista() {
		return list;
	}
	
	public abstract void percorrerLista();
}
