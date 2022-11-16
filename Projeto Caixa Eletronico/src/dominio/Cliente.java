package dominio;

import java.util.Calendar;
import java.util.Date;

public class Cliente {

	// Atributos
	private long cpf;
	private String nome;
	private String email;
	private Date dataNascimento;

	// Construtor que inicializar os atributos da classe Cliente
	public Cliente() {
		System.out.print("\n Cliente: Executando o metodo Construtor Padrao");
		this.cpf = 0;
		this.nome = "";
		this.email = "";
		this.dataNascimento = Calendar.getInstance().getTime();
	}

	public Cliente(long cpf, String nome, String email, Date dataNascimento) {
		System.out.print("\n Cliente: Executando o metodo Construtor Parametrizado");
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCpf() {
		return cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email
				+ ", dataNascimento=" + dataNascimento + "]";
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (cpf ^ (cpf >>> 32));
		result = prime * result
				+ ((dataNascimento == null) ? 0 : dataNascimento.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (cpf != other.cpf)
			return false;
		if (dataNascimento == null) {
			if (other.dataNascimento != null)
				return false;
		} else if (!dataNascimento.equals(other.dataNascimento))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
