
public class EdiculaBuilder extends CasaBuilder{

	//Operações são implementadas nestes métodos
	@Override
    public void buildPreco() {
        casa.preco = 60000.00;
    }
 
    @Override
    public void buildAnoConstrucao() {
    	casa.anoConstrucao = 2017;
    }
}
