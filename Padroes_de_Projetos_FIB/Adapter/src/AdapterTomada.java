
public class AdapterTomada extends TomadaDoisPinos {

	private TomadaTresPinos tomadaTresPinos;
	
	public AdapterTomada(TomadaTresPinos tomadaTresPinos) {
		this.tomadaTresPinos = tomadaTresPinos;
	}
	
	public void plugarTomadaDoisPinos() {
		tomadaTresPinos.plugarTomadaTresPinos();
	}
	
}