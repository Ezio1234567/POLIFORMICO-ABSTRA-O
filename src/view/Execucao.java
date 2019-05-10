package view;

import model.Pessoa;
import model.PessoaFisica;
import model.PessoaJuridica;

public class Execucao {
    public static void main(String args[]) {
    	//Pessoa pessoa = new Pessoa();
    	PessoaFisica pf = new PessoaFisica();
    	PessoaJuridica pj = new PessoaJuridica();
    	
    	pf.setNome("Ezio Paceheco Neto");
    	System.out.println(pf.getNome());
    	pf.senha();
    	
    	pj.setRazaoSocial("Alfabra Elevadores");
    	System.out.println(pj.getRazaoSocial());
    	pj.senha();
    }
}
