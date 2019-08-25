
public class Compra {
	
	private Contabilidade cont;
	private Qualidade qualidade;
	private Logistica log;
	private Transportadora tansp;
	
	
	public Compra() {
		this.cont = new Contabilidade();
		this.qualidade = new Qualidade();
		this.log = new Logistica();
		this.tansp = new Transportadora();
	}
	
	public void comprar() {
		cont.pagar(100.00);
		qualidade.validar();
		log.embrulhar();
		tansp.movimentar();
		tansp.entregar();
	}
	
}
