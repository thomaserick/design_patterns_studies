
public class FabricaAnimalZoo extends FabricaAnimal {

	@Override
	 public void criarAnimal( String tipo, String carac ){
		 if( tipo.equals("coruja") ){
            animal = new Coruja( getCaracteristicas(carac) );
        }
        else if( tipo.equals("zebra") ){
            animal = new Zebra( getCaracteristicas(carac) );
        }
        else if( tipo.equals("tubarão") ){
            animal = new Tubarao( getCaracteristicas(carac) );
        }
    }
}
