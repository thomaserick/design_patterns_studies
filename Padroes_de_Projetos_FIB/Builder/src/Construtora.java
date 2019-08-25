
public class Construtora {
	protected CasaBuilder construtura;
	 
    public Construtora(CasaBuilder construtura) {
        this.construtura = construtura;
    }
 
    public void construirCasa() {
    	construtura.buildPreco();
    	construtura.buildAnoConstrucao();
    }
 
    public Casa getCasa() {
        return construtura.getCasa();
    }
}
