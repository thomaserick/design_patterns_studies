
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FabricaAnimal vet = new FabricaAnimalVet();
		vet.criarAnimal("coruja");
        Animais animal = vet.receber();    
        System.out.println(animal.toString());

        FabricaAnimal zoo = new FabricaAnimalZoo();
        zoo.criarAnimal("peixe");
        animal = zoo.receber();
        System.out.println(animal.toString());
	}

}
