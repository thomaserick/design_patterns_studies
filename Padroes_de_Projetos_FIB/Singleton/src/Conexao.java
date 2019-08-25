
public class Conexao {
	//variável estática
		private static Conexao conn;
		
		//Construtor privado 
		private Conexao() {
			
		}
		
		
		//Método estático para coletar a instância
		public static Conexao getInstance() {
			if (conn == null)
				conn = new Conexao();
			return conn;
		}
}
