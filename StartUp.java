package br.com.locaweb;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.locaweb.mock.BuscaClientes;

/**
 * @author Leonardo Inoue
 */
public class StartUp {

  public static void main(String[] args) {
		
		// Trecho solicitado no exercício 1.1
		List<Cliente> clientes = BuscaClientes.getClientes();
		for (int i = 0; i < clientes.size(); i++) {
			Cliente cliente = clientes.get(i);
			System.out.println("Cliente: ");
			cliente.imprimeDetalhes();
			NotaFiscal nota = new NotaFiscal(cliente);
			System.out.println("Nota Fiscal: #" + (i + 1));
			nota.imprimeDetalhes();
		}
		// Fim - Exercício 1.1

		// Exercicio 1.2 - Chamando método de criação de nota fiscal
		Cliente novoCliente = new Cliente();
		novoCliente.setNome("Leonardo");
		novoCliente.setEmail("leonardo@leonardo.com.br");
		novoCliente.setTelefone(44445555);
		novoCliente.setDataCadastro(new Date());
		novoCliente.setDocumento(1010101010);

		NotaFiscal novaNotaFiscal = new NotaFiscal(novoCliente);
		novaNotaFiscal.criaNotaFiscal(novoCliente);

		System.out.println("# Teste do método criaNotaFiscal #");
		novaNotaFiscal.getCliente().imprimeDetalhes();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data de Emissão: "
				+ sdf.format(novaNotaFiscal.getDataEmissao()));
		System.out.println("Valor Imposto: R$ "
				+ novaNotaFiscal.getValorImposto());
		System.out.println("Valor Bruto: R$ " + novaNotaFiscal.getValorBruto());
		// Fim - Exercicio 1.2
	}

}
