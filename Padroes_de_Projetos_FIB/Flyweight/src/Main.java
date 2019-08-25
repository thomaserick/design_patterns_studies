
public class Main {
	
	public static void main(String [] args) {
		FlyweightFactory factory = new FlyweightFactory();
		 
	    factory.getFlyweight(Files.PDF_2017).moverArquivo("ApolloServer@pasta/diretório");
	    factory.getFlyweight(Files.PDF_2017).moverArquivo("JupiterServer@pasta/diretório");
	    
	    System.out.println("\n");
	    factory.getFlyweight(Files.PDF_2019).moverArquivo("PlutoServer@pasta/diretório/novoDiretorio");
	    factory.getFlyweight(Files.PDF_2019).moverArquivo("JupiterServer@pasta/diretório");
	    factory.getFlyweight(Files.PDF_2019).moverArquivo("NeptuneServer@pasta/diretório");
	    
	    System.out.println("\n");
	    factory.getFlyweight(Files.FISCAL).moverArquivo("MercuryServer@pasta/diretório");
	}
}
