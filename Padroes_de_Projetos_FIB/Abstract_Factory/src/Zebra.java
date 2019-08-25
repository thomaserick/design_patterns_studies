
public class Zebra implements Animal {
	
	private AnimalCaracteristicasFactory caracs;
    private Superficie superficie;
    private Habilidade habilidade;
    private Mobilidade mobilidade;
    private Cor cor;

	public Zebra( AnimalCaracteristicasFactory caracs ) {
		this.caracs = caracs;
	}
	
	public void prepara() {
		superficie = caracs.criarSuperficie();
		habilidade = caracs.criarHabilidade();
		mobilidade = caracs.criarMobilidade();
		cor = caracs.criarCor();
	}
	
	@Override
	public String toString() {
		return "\nAnimal: "+this.getClass()+
				"\nSuperficie: "+superficie+
				"\nHabilidade: "+habilidade+
				"\nMobilidade: "+mobilidade+
				"\nCor: "+cor;
	}

}
