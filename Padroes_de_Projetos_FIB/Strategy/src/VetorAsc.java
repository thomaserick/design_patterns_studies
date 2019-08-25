public class VetorAsc extends Vetor {

	@Override
	public void percorrerLista() {
		for(int i=0; i < TAMANHO; i++) {
			System.out.println("Posição "+i+" - Valor "+ list.get(i));
		}
	}

}
