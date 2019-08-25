
public class DocxPrototype extends DocumentoPrototype {
	protected DocxPrototype(DocxPrototype docxPrototype) {
        this.tamanho = docxPrototype.getTamanho();
    }
 
    public DocxPrototype() {
        tamanho = 0.0;
    }
 
    @Override
    public String exibirInfo() {
        return "Documento em Docx cujo tamanho é " + getTamanho() + " MB";
    }
 
    @Override
    public DocumentoPrototype clonar() {
        return new DocxPrototype(this);
    }
}
