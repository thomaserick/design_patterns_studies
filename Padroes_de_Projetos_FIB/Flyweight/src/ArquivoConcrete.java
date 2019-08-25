
public class ArquivoConcrete extends ArquivosFlyweight {
	
	public Arquivo file;
	 
    public ArquivoConcrete(String nome, String formato) {
    	file = new Arquivo(nome, formato);
    }

	@Override
	public void moverArquivo(String serverPath) {
		file.mostrarArquivo();
        System.out.println("Arquivo movido para "+ serverPath);
	}

}
