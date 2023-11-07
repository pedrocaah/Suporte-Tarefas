package lista;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class test {
    @Test
    public void testando() {
        List<Pessoa> listaPessoas = new Pessoa().listaPessoas();
        Assert.assertEquals("Feminino", listaPessoas.stream().filter(pessoa -> pessoa.getGenero().equals("Feminino")));

        List<Pessoa> listaFeminina = new Pessoa().listaPessoas();
        Assert.assertEquals("Feminino", listaFeminina.stream().filter(pessoa -> pessoa.getGenero().equals("Feminino")));
    }
}
