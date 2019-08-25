
public abstract class DocumentoPrototype {
	protected double tamanho;
    public abstract String exibirInfo();
    public abstract DocumentoPrototype clonar();
 
    public double getTamanho() {
        return tamanho;
    }
 
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
}
