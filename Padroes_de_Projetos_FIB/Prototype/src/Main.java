
public class Main {

	public static void main (String [] args) {
		PdfPrototype pdfProtipo = new PdfPrototype();
		DocxPrototype docxProtipo = new DocxPrototype();
		 
	    DocumentoPrototype pdfNovo = pdfProtipo.clonar();
	    pdfNovo.setTamanho(4.5);	   
	    DocumentoPrototype pdfMaisNovo = pdfProtipo.clonar();
	    pdfMaisNovo.setTamanho(10.1);
	    DocumentoPrototype docx = docxProtipo.clonar();
	    docx.setTamanho(20.8);
	 
	    System.out.println(pdfNovo.exibirInfo());
	    System.out.println(pdfMaisNovo.exibirInfo());
	    System.out.println(docx.exibirInfo());
	}

}
