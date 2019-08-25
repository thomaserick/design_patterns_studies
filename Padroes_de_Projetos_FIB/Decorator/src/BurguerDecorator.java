
public class BurguerDecorator extends Burguer {
	
	protected Comida burguerDecorado;

   public BurguerDecorator(Comida burguerDecorado) {
       this.burguerDecorado = burguerDecorado;
   }
}
