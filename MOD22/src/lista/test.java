package lista;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class test {
    @Test
    public void testando() {
        List<Pessoa> lista = new Pessoa().listaPessoas();
//        lista.stream().forEach(feminino -> System.out.println(feminino.getNome()));
//        System.out.println("\n### Lista Feminina ###\n");
        lista.stream().
                filter(pessoa -> pessoa.getGenero().equals("Feminino"));
//                .forEach(feminino -> System.out.println(feminino.getNome()));
        for (Pessoa feminino : lista) {
            Assert.assertEquals("Feminino", feminino.getGenero());
        }
    }

    @Test
    public void testando2() {
        List<Pessoa> listaFeminino = new Pessoa().listaFeminino();
        for (Pessoa feminino : listaFeminino) {
            Assert.assertEquals("Feminino", feminino.getGenero());
        }
    }
}
