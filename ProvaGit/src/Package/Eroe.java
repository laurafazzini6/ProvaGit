package Package;

public class Eroe {
	
	//private String nome;
	private int forza;
	private int saggezza;
	private int destrezza;
	
	//public String getNome() {
		//return nome;
	//}
	
	//public void setNome(String nome) {
		//this.nome = nome;
	//}
	public int getForza() {
		return forza;
	}
	public void setForza(int forza) {
		this.forza = forza;
	}
	public int getSaggezza() {
		return saggezza;
	}
	public void setSaggezza(int saggezza) {
		this.saggezza = saggezza;
	}
	public int getDestrezza() {
		return destrezza;
	}
	public void setDestrezza(int destrezza) {
		this.destrezza = destrezza;
	}
	
	public void sono() {
		
		System.out.println("Sono un eroe");
	}
	
	//public Eroe(String nome, int forza, int saggezza, int destrezza) {	     //questo è il metodo del costruttore, 
																			//è necessario senno il main non capisce 
																			//quello che deve fare
		//setNome(nome);
		//setForza(forza);
		//setSaggezza(saggezza);
		//setDestrezza(destrezza);
	//}
}