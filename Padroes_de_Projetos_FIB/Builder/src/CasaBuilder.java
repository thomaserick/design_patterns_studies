
public abstract class CasaBuilder {
	
	protected Casa casa;
	 
    public CasaBuilder() {
    	casa = new Casa();
    }
 
    public abstract void buildPreco();
    public abstract void buildAnoConstrucao();
 
    public Casa getCasa() {
        return casa;
    }
}
