package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pessoa {

    public String nome;
    public String genero;

    public Pessoa() {

    }

    public Pessoa (String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }

    public List<Pessoa> listaPessoas() {
        Pessoa pessoa1 = new Pessoa("Julia", "Feminino");
        Pessoa pessoa2 = new Pessoa("Pedro", "Masculino");
        Pessoa pessoa3 = new Pessoa("Jorge", "Masculino");
        Pessoa pessoa4 = new Pessoa("Verenna", "Feminino");
        Pessoa pessoa5 = new Pessoa("Henrique", "Masculino");
        Pessoa pessoa6 = new Pessoa("Laura", "Feminino");
        return List.of(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5,pessoa6);
    }
    public List<Pessoa> listaFeminino() {
        Pessoa feminino1 = new Pessoa("Julia", "Feminino");
        Pessoa feminino2 = new Pessoa("Verenna", "Feminino");
        Pessoa feminino3 = new Pessoa("Laura", "Feminino");
        return List.of(feminino1,feminino2,feminino3);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(genero, pessoa.genero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(genero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", genero='").append(genero).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
