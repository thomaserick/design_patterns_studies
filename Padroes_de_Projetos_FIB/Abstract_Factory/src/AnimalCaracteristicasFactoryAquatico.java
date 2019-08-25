
public class AnimalCaracteristicasFactoryAquatico extends AnimalCaracteristicasFactory{
	
	@Override
    public Superficie criarSuperficie() {
        return new SuperficiePele();
    }
    @Override
    public Mobilidade criarMobilidade() {
        return new MobilidadeNadadeiras();
    }
    @Override
    public Habilidade criarHabilidade() {
        return new HabilidadeNadar();
    }
    @Override
    public Cor criarCor() {
        return new CorCinza();
    }
}
