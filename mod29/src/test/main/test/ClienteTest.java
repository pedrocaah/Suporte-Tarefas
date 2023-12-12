package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import dao.ClienteDAO;
import dao.IClienteDAO;
import domain.Cliente;


public class ClienteTest {

	@Test
	public void cadastrarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Pedro Oliveira");
		
		Integer qtd = dao.cadastrar(cliente);
		assertTrue(qtd == 1);
		
		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteBD);
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());
		
		Integer qtdDel = dao.excluir(clienteBD);
		assertNotNull(qtdDel);	
	
		
		Cliente clienteBT = dao.buscarTodos(cliente.getCodigo());
		IClienteDAO bt = new ClienteDAO();
		
		Cliente clienteSA = new Cliente();
		cliente.setCodigo("01");
		cliente.setNome("Pedro Oliveira");
		Integer countCad = bt.cadastrar(cliente);
		assertTrue(countCad == 1);
	
		
		Integer att = dao.Atualizar(clienteBD);
		assertTrue(att == 1);
	}
}
