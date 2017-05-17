public class Test{

	String nome = "Victor"; //variavel de instancia pode ser acessada pelo objeto referencia da instancia
	public static String nomeEstatico = " Victor Estatico ";// variavel de classe pode ser acessada pela referencia da classe
	public Test(){
		System.out.println(nome);
	}

	// shadowing o conceito de declarar duas variaveis dentro da mesma classe mas só é possivel devido ao fato
	// da mudança de escopo

	public void applyingShadowing(String nome){
		this.nome = nome;
	}
	
}