package br.com.locaweb.mock;

import java.util.ArrayList;
import java.util.List;

import br.com.locaweb.Cliente;
import br.com.locaweb.Pedido;

/**
 * @author Leonardo Inoue
 */
public class BuscaPedidos {

  /**
	 * Método responsável pelo retorno de todos pedidos cadastrados para um
	 * determinado cliente. Dados fake simulando consulta ao BD
	 */
	public static List<Pedido> getPedidos(Cliente cliente) {

		List<Pedido> listaPedidos = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			listaPedidos.add(criaPedidoFake(cliente, i));
		}

		return listaPedidos;
	}

	/**
	 * Método responsável por popular com dados fake
	 */
	private static Pedido criaPedidoFake(Cliente cliente, int indice) {
		Pedido pedido = new Pedido(cliente);
		pedido.setCliente(cliente);

		if (indice == 0) {
			pedido.setTipoProduto("Hospedagem de Sites");
			pedido.setQuantidade(1);
			pedido.setValorUnitario(49.90);
			pedido.setAliquota(0);
		} else if (indice == 1) {
			pedido.setTipoProduto("Servidor Cloud");
			pedido.setQuantidade(3);
			pedido.setValorUnitario(150.00);
			pedido.setAliquota(5);
		} else {
			pedido.setTipoProduto("Loja Virtual");
			pedido.setQuantidade(4);
			pedido.setValorUnitario(120.00);
			pedido.setAliquota(5);
		}

		return pedido;
	}

	/**
	 * Método responsável pelo retorno de todos pedidos cadastrados para um
	 * determinado cliente. Simulando consulta ao BD
	 */
	public static List<Pedido> getPedidos2(Cliente cliente) {

		List<Pedido> listaPedidos = new ArrayList<>();

		Pedido novoPedido = new Pedido(cliente);
		novoPedido.setTipoProduto("Hospedagem de Sites");
		novoPedido.setQuantidade(5);
		novoPedido.setValorUnitario(49.90);
		novoPedido.setAliquota(0);
		listaPedidos.add(novoPedido);

		Pedido novoPedido2 = new Pedido(cliente);
		novoPedido2.setTipoProduto("Loja Virtual");
		novoPedido2.setQuantidade(2);
		novoPedido2.setValorUnitario(120.00);
		novoPedido2.setAliquota(5);
		listaPedidos.add(novoPedido2);

		return listaPedidos;
	}

}
