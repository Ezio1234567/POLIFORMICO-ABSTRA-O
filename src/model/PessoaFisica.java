package model;

public class PessoaFisica extends Pessoa{

	public String Nome;
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	
	
	public String Idade;
	public String getIdade() {
		return Idade;
	}
	
	public void setIdade(String Idade) {
		this.Idade = Idade;
	}
	
	public void senha() {
		System.out.println("Senha - PessoaFisica");
	}

	public void setRazaoSocial(String string) {
		// TODO Auto-generated method stub
		
	}
}
