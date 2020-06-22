import java.awt.List;
import java.util.ArrayList;

public class Estabelecimento {
	ArrayList<Cardapio> Cardapio = new ArrayList<Cardapio>();
	public String addCardapio;
	
	public ArrayList<Cardapio> getCardapio() {
		return Cardapio;
	}
	public void setCardapio(ArrayList<Cardapio> cardapio) {
		Cardapio = cardapio;
	}
	public String nome;
	public String getAddCardapio() {
		return addCardapio;
	}
	public void setAddCardapio(String addCardapio) {
		this.addCardapio = addCardapio;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
		
	}
	
	


