package services;

import br.com.rpires.reflections.anotacao.cadastro.exception.TipoChaveNaoEncontradaException;
import domain.Cliente;

public interface IClienteService {

	Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

	Cliente buscarPorCPF(Long cpf);

	void excluir(Long cpf);

	void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
