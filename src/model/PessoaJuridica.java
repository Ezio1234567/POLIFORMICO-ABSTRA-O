package model;

public class PessoaJuridica extends Pessoa{

	public String RazaoSocial;
	public String getRazaoSocial() {
		return RazaoSocial;
	}
	
	public void setRazaoSocial(String razaoSocial) {
		this.RazaoSocial = razaoSocial;
	}
	
	public String RamoAtividade;
	public String getRamoAtividade() {
		return RamoAtividade;
	}
	
	public void setRamoAtividade(String ramoAtividade) {
		this.RamoAtividade = ramoAtividade;
	}
	
	public void senha() {
		System.out.println("Senha - PessoaJuridica");
	}
}
