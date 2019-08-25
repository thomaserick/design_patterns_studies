
public abstract class FabricaAnimal {
	
	protected Animais animal;
	
	public abstract void criarAnimal(String especie);
	
	public Animais receber() {
		return animal;
	}
}
