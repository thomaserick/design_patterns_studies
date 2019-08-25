
public abstract class FabricaAnimal {
	protected Animal animal;

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
    
    public AnimalCaracteristicasFactory getCaracteristicas( String carac ){
        if( carac.equals("terrestre") ){
            return new AnimalCaracteristicasFactoryTerrestre();
        }else if( carac.equals("aquatico") ){
            return new AnimalCaracteristicasFactoryAquatico();
        }
        return new AnimalCaracteristicasFactoryVoador();
    }
	
    public Animal entregar() {
    	return animal;
    }
}
