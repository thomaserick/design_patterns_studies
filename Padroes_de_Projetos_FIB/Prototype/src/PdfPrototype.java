
public class PdfPrototype extends DocumentoPrototype {
	protected PdfPrototype(PdfPrototype pdfPrototype) {
        this.tamanho = pdfPrototype.getTamanho();
    }
 
    public PdfPrototype() {
        tamanho = 0.0;
    }
 
    @Override
    public String exibirInfo() {
        return "Documento em PDF cujo tamanho é " + getTamanho() + " MB";
    }
 
    @Override
    public DocumentoPrototype clonar() {
        return new PdfPrototype(this);
    }
}
