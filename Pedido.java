package br.com.locaweb;

/**
 * @author Leonardo Inoue
 */
public class Pedido {

  private Cliente cliente;
	private String tipoProduto;
	private int quantidade;
	private double valorUnitario;
	private int aliquota;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getTipoProduto() {
		return tipoProduto;
	}

	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getAliquota() {
		return aliquota;
	}

	public void setAliquota(int aliquota) {
		this.aliquota = aliquota;
	}

	public Pedido(Cliente cliente) {
		this.cliente = cliente;
	}
}
