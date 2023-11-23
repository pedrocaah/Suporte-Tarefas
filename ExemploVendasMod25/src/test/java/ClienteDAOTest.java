import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.rpires.reflections.anotacao.cadastro.exception.TipoChaveNaoEncontradaException;
import dao.ClienteDaoMock;
import dao.IClienteDAO;
import domain.Cliente;

public class ClienteDAOTest {
	
	private IClienteDAO clienteDao;
	
	private Cliente cliente;
	
	public ClienteDAOTest() {
		clienteDao = new ClienteDaoMock();
	}
	
	@Before
	public void init() throws TipoChaveNaoEncontradaException {
		Cliente cliente = new Cliente();
		cliente.setCpf(1234567890L);
		cliente.setNome("Pedro");
		cliente.setCidade("São Paulo");
		cliente.setEnd("End");
		cliente.setEstado("SP");
		cliente.setNumero(10);
		cliente.setTel(11999999999L);
		clienteDao.cadastrar(cliente);
	}
	
	@Test
	public void pesquisarCliente() {
		Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
		
		Assert.assertNotNull(clienteConsultado);
	}
	
	@Test
	public void salvarCliente( ) throws TipoChaveNaoEncontradaException {
		Boolean retorno = clienteDao.cadastrar(cliente);
		Assert.assertTrue(retorno);
	}
	@Test
	public void excluirCliente() {
		clienteDao.excluir(cliente.getCpf());
	}
	@Test
	public void alterarCliente() throws TipoChaveNaoEncontradaException {
		cliente.setNome("Pedro Oliveira");
		clienteDao.alterar(cliente);
		Assert.assertEquals("Pedro Oliveira", cliente.getNome());
	}
}
