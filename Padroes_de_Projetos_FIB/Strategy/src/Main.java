
public class Main {

	public static void main(String[] args) {
		System.out.println("\n ASC");
		Iterator iterador = new Iterator(Iterator.ASC);
		iterador.geraLista();
		iterador.percorreLista();
		
		System.out.println("\n DESC");
		Iterator outroIterador = new Iterator(Iterator.DESC);
		outroIterador.setLista(iterador.getLista());
		outroIterador.percorreLista();
	}

}
