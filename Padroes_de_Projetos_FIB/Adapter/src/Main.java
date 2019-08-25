
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TomadaTresPinos tomadaTrePinos = new TomadaTresPinos();
		AdapterTomada adapter = new AdapterTomada(tomadaTrePinos);
		adapter.plugarTomadaDoisPinos();
	}

}
