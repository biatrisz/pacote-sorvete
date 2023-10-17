package pacote;

public class Principal {

	public static void main(String[] args) {
		Produto produto = new Produto (4322, "óculos", 300.0);
		System.out.println("Produto:");
		System.out.println("id: "+ produto.getId());
		System.out.println("nome: "+ produto.getNome());
		System.out.println("preco: " + produto.getPreco());	
				
		Sorvete sorvete = new Sorvete (10,"óculos", 300.0, 4322 );
		System.out.println("Sorvete:");
		System.out.println("TemAdequada: " + sorvete.getTempAdequada());
		System.out.println("id: "+ sorvete.getId());
		System.out.println("nome: "+ sorvete.getNome());
		System.out.println("preco: " + sorvete.getPreco());	

		Camisa camisa = new Camisa (10, "óculos", 300.0, "amarelo", "lã","tamanho");
		System.out.println("Camisa:");
		System.out.println("cor: " + camisa.getCor());
		System.out.println("tecido: " + camisa.getTecido());
		System.out.println("tamanho: " + camisa.getTamanho());
		System.out.println("id: "+ camisa.getId());
		System.out.println("nome: "+ camisa.getNome());
		System.out.println("preco: " + camisa.getPreco());	
				
	}

}
