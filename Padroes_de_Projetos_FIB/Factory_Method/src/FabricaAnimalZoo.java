
public class FabricaAnimalZoo extends FabricaAnimal {
	
	@Override
	public void criarAnimal(String especie) {
		switch (especie) {
			case "coruja":
				animal = new Coruja();
				break;
			case "peixe":
				animal = new Peixe();
				break;
		}	
	}
}
