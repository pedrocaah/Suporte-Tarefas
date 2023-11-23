import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.rpires.reflections.anotacao.cadastro.exception.TipoChaveNaoEncontradaException;
import dao.ClienteDaoMock;
import dao.IClienteDAO;
import domain.Cliente;
import services.ClienteService;
import services.IClienteService;

public class ClienteServiceTest {
	
	private IClienteService clienteService;
	
	private Cliente cliente;
	
	public ClienteServiceTest() {
		IClienteDAO dao = new ClienteDaoMock();
		clienteService = new ClienteService(dao);
	}
	
	@Before
	public void init() {
		Cliente cliente = new Cliente();
		cliente.setCpf(1234567890L);
		cliente.setNome("Pedro");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(11999999999L);
		
	}
	
	@Test
	public void pesquisarCliente() {
		
		Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente( ) throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteService.salvar(cliente);
		Assert.assertTrue(retorno);
	}
	@Test
	public void excluirCliente() {
		clienteService.excluir(cliente.getCpf());
	}
	
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Pedro Oliveira");
		clienteService.alterar(cliente);
		
		Assert.assertEquals("Pedro Oliveira", cliente.getNome());
	}
}
