package br.com.locaweb;

import java.util.Date;
import java.util.List;

import br.com.locaweb.mock.BuscaPedidos;

/**
 * @author Leonardo Inoue
 */
public class NotaFiscal {
  private Cliente cliente;
	private List<Pedido> pedidos;
	private Date dataEmissao;
	private double valorBruto;
	private double valorImposto;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Date getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Date dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public double getValorBruto() {
		return valorBruto;
	}

	public void setValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
	}

	public double getValorImposto() {
		return valorImposto;
	}

	public void setValorImposto(double valorImposto) {
		this.valorImposto = valorImposto;
	}

	public NotaFiscal(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Método responsável pelo retorno das informações da nota fiscal
	 */
	public void imprimeDetalhes() {

		pedidos = BuscaPedidos.getPedidos(this.cliente);

		for (Pedido pedido : pedidos) {
			System.out.println("Tipo do Produto: " + pedido.getTipoProduto());
			System.out.println("Quantidade: " + pedido.getQuantidade());
			System.out.println("Alíquota: " + pedido.getAliquota() + "%");
			System.out.println("Valor Unitário: R$ "
					+ pedido.getValorUnitario());
			System.out.println("Valor Total: R$ " + pedido.getQuantidade()
					* pedido.getValorUnitario());
			System.out.println("");
		}
		System.out
				.println("-----------------------------------------------------------------------------------");
	}

	/**
	 * Método responsável pela criação da nota fiscal a partir de um cliente
	 */
	public void criaNotaFiscal(Cliente cliente) {
		this.dataEmissao = new Date();
		// Simulando uma consulta ao BD a partir de um cliente
		this.pedidos = BuscaPedidos.getPedidos2(cliente);
		for (Pedido pedido : pedidos) {
			// Alíquota 0 não entra na NF 
			if (pedido.getAliquota() != 0) {
				this.valorImposto += (pedido.getQuantidade() * pedido
						.getValorUnitario()) * (pedido.getAliquota() / 100d);
				this.valorBruto += pedido.getQuantidade()
						* pedido.getValorUnitario();
			}
		}
	}
}
