package entity;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_usuario")
	private Long id;
	
	@Column(name = "nome_Razao")
	private String nome;
	
	@Column(name = "email", unique = true)
	private String email;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "cep")
	private String cep;
	
	@Column(name = "rua")
	private String rua;
	
	@Column(name = "numero")
	private int numero;
	
	@Column(name = "cidade")
	private String cidade;
	
	@Column(name = "cpf", unique = true)
	private String cpf;
	
	@Column(name = "cnpj", unique = true)
	private String cnpj;
	
	@Column(name = "data_nasc")
	private LocalDate dataNasc;
	
	public Usuario() {
	}
	
	public Usuario(String nome, String email, String senha, String cep, String rua, int numero, String cidade, String cpf,
			String cnpj, LocalDate dataNasc) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cep = cep;
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.dataNasc = dataNasc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", cep=" + cep + ", rua=" + rua
				+ ", numero=" + numero + ", cidade=" + cidade + ", cpf=" + cpf + ", cnpj=" + cnpj + ", dataNasc="
				+ dataNasc + "]";
	}
}
