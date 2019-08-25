
public class AnimalCaracteristicasFactoryVoador extends AnimalCaracteristicasFactory {

	@Override
    public Superficie criarSuperficie() {
        return new SuperficiePenas();
    }

    @Override
    public Mobilidade criarMobilidade() {
        return new MobilidadeAsas();
    }

    @Override
    public Habilidade criarHabilidade() {
        return new HabilidadeVoar();
    }

    @Override
    public Cor criarCor() {
        return new CorMarrom();
    }
 
}
