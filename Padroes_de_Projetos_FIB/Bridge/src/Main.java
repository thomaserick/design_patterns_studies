
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavegadorAbstract browser = new NavegadorIE(new WebsiteFIB());
		browser.estruturar();
		browser = new NavegadorFirefox(new WebsiteFIB());
		browser.estruturar();
		
		browser = new NavegadorIE(new WebsiteUol());
		browser.estruturar();
	}

}
