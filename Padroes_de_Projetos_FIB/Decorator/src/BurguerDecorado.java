
public class BurguerDecorado extends BurguerDecorator {

	public BurguerDecorado(Comida burguerDecorado) {
        super(burguerDecorado);
    }
 
	@Override
	public void prepare() {
		burguerDecorado.prepare();
    	this.bacon();
    	this.catupiry();
    	this.salada();
    }
 
    
	public void bacon() {
		System.out.println("Adicionando bacon");
	}
	public void catupiry() {
		System.out.println("Adicionando catupiry");
	}
	public void salada() {
		System.out.println("Adicionando salada");
	}
}
