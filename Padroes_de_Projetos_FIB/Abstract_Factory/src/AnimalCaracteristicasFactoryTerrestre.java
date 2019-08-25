
public class AnimalCaracteristicasFactoryTerrestre extends AnimalCaracteristicasFactory {

	@Override
    public Superficie criarSuperficie() {
        return new SuperficiePelo();
    }

    @Override
    public Mobilidade criarMobilidade() {
        return new MobilidadePatas();
    }

    @Override
    public Habilidade criarHabilidade() {
        return new HabilidadeCorrer();
    }

    @Override
    public Cor criarCor() {
        return new CorBrancoPreto();
    }
 
}
