package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String nome;
	private String cpf;
	private String endereco;
	private String sexo;
	private boolean deficiencia;
	private boolean idade_de_risco;
	private List<Locacao> locacoes;

	public Cliente() {
		this.locacoes = new ArrayList<Locacao>();
	}

	
	public Cliente(int id, String nome, String cpf, String endereco, String sexo, boolean deficiencia, boolean idade_de_risco, List<Locacao> locacoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.sexo = sexo;
		this.deficiencia = deficiencia;
		this.idade_de_risco = idade_de_risco;
		this.locacoes = locacoes;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public boolean getDeficiencia() {
		return deficiencia;
	}
	
	public void setDeficiencia(boolean deficiencia) {
		this.deficiencia = deficiencia;
	}
	
	public boolean getIdadeDeRisco() {
		return idade_de_risco;
	}
	
	public void setIdadeDeRisco(boolean idade_de_risco) {
		this.idade_de_risco = idade_de_risco;
	}
	
	public List<Locacao> getLocacoes() {
		return locacoes;
	}

	public void setLocacoes(List<Locacao> locacoes) {
		this.locacoes = locacoes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nome + "," + cpf + "," + endereco + "," + sexo + "," + deficiencia + "," + idade_de_risco;
	}
}
