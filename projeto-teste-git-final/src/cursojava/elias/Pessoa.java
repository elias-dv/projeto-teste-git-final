package cursojava.elias;

import java.util.Date;

public class Pessoa {

	private String nome;
	
	private String sobrenome;
	
	private int idade;
	
	private Date datanasciment;
	
	
	public Date getDatanasciment() {
		return datanasciment;
	}

	public void setDatanasciment(Date datanasciment) {
		this.datanasciment = datanasciment;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
}
