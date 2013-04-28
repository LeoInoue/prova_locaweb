package br.com.locaweb;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Leonardo Inoue
 */

public class Cliente {
  private String nome;
	private String email;
	private int telefone;
	private Date dataCadastro;
	private long documento;

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

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public Date getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public long getDocumento() {
		return documento;
	}

	public void setDocumento(long documento) {
		this.documento = documento;
	}

	/**
	 * Método responsável pelo retorno das informações do cliente
	 */
	public void imprimeDetalhes() {
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("Telefone: " + telefone);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data de Cadastro: " + sdf.format(dataCadastro));
		System.out.println("Documento: " + documento);
		System.out.println("");
	}

}
