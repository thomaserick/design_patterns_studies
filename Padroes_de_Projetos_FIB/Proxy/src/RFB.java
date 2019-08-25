
public class RFB {
	private double valorDocumento;
    private double valorImposto;
    private String cpfCnpj;
    public static final boolean VALIDO=true;
    public static final boolean INVALIDO = false;;
 
    public RFB(double valorDocumento, double valorImposto, String cpfCnpj) {
    	this.valorDocumento = valorDocumento;
    	this.valorImposto = valorImposto;
    	this.cpfCnpj = cpfCnpj;
    }
 
    public String pagarFisico() {
        return "CPF: "+ cpfCnpj +" Valor pago: " + valorDocumento;
    }
 
    public String pagarJuridico() {
    	 return "CNPJ: "+ cpfCnpj +" Valor pago: " + valorDocumento;
    }
    
}
