
public abstract class NavegadorAbstract {
	protected Website site; //implementado
	  
    public NavegadorAbstract(Website s) {
    	site = s;
    }
 
    public void opcaoFavoritos(String descricao) {
    	site.opcaoFavoritos(descricao);
    }
 
    public void opcaoHistorico(String descricao) {
    	site.opcaoHistorico(descricao);
    }
    
    public void opcaoCache(String descricao) {
    	site.opcaoCache(descricao);
    }
 
    public abstract void estruturar();
}
