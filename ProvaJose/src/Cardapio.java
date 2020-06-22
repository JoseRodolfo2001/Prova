import java.util.ArrayList;

public class Cardapio {
	public String nome;
	ArrayList<String> itens = new ArrayList<String>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<String> getItens() {
		return itens;
	}
	public void setItens(ArrayList<String> itens) {
		this.itens = itens;
	}
}
