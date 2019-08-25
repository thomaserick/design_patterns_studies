
public class Arquivo {

	public String nome, formato;
	 
    public Arquivo(String nome, String formato) {
    	this.nome = nome;
    	this.formato = formato;
    }
 
    public void mostrarArquivo() {
        System.out.println(nome+"."+formato);
    }
	
}
