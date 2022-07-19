package ExemplosCollections;

import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {

        System.out.println("\t Ordem aleatoria \t");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("JJ", new Livro("Star Wars",500));
            put("Token", new Livro("Senhor dos aneis",1500));
            put("Oda", new Livro("One Piece",20000));
        }};
        for(Map.Entry<String, Livro> livro:meusLivros.entrySet()){
            System.out.println(livro.getKey()+ " - " + livro.getValue().getNome());
        }

        System.out.println("\t Ordem de Inserção\t");
        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("JJ", new Livro("Star Wars",500));
            put("Token", new Livro("Senhor dos aneis",1500));
            put("Oda", new Livro("One Piece",20000));
        }};
        for(Map.Entry<String, Livro> livro:meusLivros1.entrySet()){
            System.out.println(livro.getKey()+ " - " + livro.getValue().getNome());
        }

        System.out.println("\t Ordem alfabética autores\t");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for(Map.Entry<String, Livro> livro:meusLivros2.entrySet()){
            System.out.println(livro.getKey()+ " - " + livro.getValue().getNome());
        }

        System.out.println("\t Ordem alfabética nomes dos livros\t");
        Set<Map.Entry<String,Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for(Map.Entry<String, Livro> livro:meusLivros3){
            System.out.println(livro.getKey()+ " - " + livro.getValue().getNome());
        }

    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
class ComparatorNome implements Comparator<Map.Entry<String,Livro>>{

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}