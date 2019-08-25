
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaAnimal animalZoo = new FabricaAnimalZoo();
		animalZoo.criarAnimal("zebra", "terrestre");
        Animal animal = animalZoo.entregar();
        animal.prepara();
        System.out.println(animal.toString());
        
        FabricaAnimal animalVet = new FabricaAnimalVet();
        animalVet.criarAnimal("tubarão", "aquatico");
        animal = animalVet.entregar();
        animal.prepara();
        System.out.println(animal.toString());
        
        animalZoo = new FabricaAnimalVet();
        animalVet.criarAnimal("coruja", "voador");
        animal = animalVet.entregar();
        animal.prepara();
        System.out.println(animal.toString());
	}

}
