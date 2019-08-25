
public class ProxyRFB extends RFB {
	protected boolean token;
	 
    public ProxyRFB(boolean token, double valorDocumento, double valorImposto, String cpfCnpj) {
        super(valorDocumento, valorImposto, cpfCnpj);
        this.token = token;
    }
 
    @Override
    public String pagarFisico() {
        if (tokenOk()) {
            return super.pagarFisico();
        }
        return null;
    }
 
    @Override
    public String pagarJuridico() {
        if (tokenOk()) {
            return super.pagarJuridico();
        }
        return null;
    }
 
    private boolean tokenOk() {
        return token;
    }
}
