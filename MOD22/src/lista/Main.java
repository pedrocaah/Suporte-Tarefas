package lista;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public void Stream() {
        List<Pessoa> lista = new Pessoa().listaPessoas();
        Stream<Pessoa> stream = lista.stream().filter(pessoa -> pessoa.getGenero().equals("Feminino"));

        Predicate<Pessoa> pred = pessoa -> pessoa.getGenero().equals("Feminino");
        Stream<Pessoa> stream1 = lista.stream().filter(pred);
    }
    public void Sorted() {
        List<Pessoa> lista = new Pessoa().listaPessoas();
        Stream<Pessoa> stream = lista.stream().filter(pessoa -> pessoa.getGenero().equals("Feminino")).
                sorted(Comparator.comparing(Pessoa::getNome));
    }
    public void Distinct() {
        List<Pessoa> lista = new Pessoa().listaPessoas();
        Stream<Pessoa> stream = lista.stream().distinct();
    }

    public static void main(String[] args) {
        List<Pessoa> lista = new Pessoa().listaPessoas();
        lista.stream().forEach(feminino -> System.out.println(feminino.getNome()));
        System.out.println("\n### Lista Feminina ###\n");
        lista.stream().
                filter(pessoa -> pessoa.getGenero().equals("Feminino"))
                .forEach(feminino -> System.out.println(feminino.getNome()));

    }


}