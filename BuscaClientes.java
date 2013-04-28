package br.com.locaweb.mock;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.locaweb.Cliente;

/**
 * @author Leonardo Inoue
 */
public class BuscaClientes {

  /**
	 * Método responsável pelo retorno de todos clientes cadastrados. Dados fake
	 * simulando consulta ao BD
	 */
	public static List<Cliente> getClientes() {

		List<Cliente> listaClientes = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			listaClientes.add(criaClienteFake(i));
		}

		return listaClientes;
	}

	/**
	 * Método responsável por popular com dados fake
	 */
	private static Cliente criaClienteFake(int indice) {
		Cliente cliente = new Cliente();
		cliente.setNome("Cliente" + indice);
		cliente.setEmail("email" + indice + "@email.com.br");
		cliente.setTelefone(Integer.parseInt("1234567" + indice));
		cliente.setDataCadastro(new Date());
		cliente.setDocumento(Long.parseLong("987654321" + indice));

		return cliente;
	}

}
