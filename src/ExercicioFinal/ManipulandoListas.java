package ExercicioFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ManipulandoListas {
        public static void main(String[] args) {
            List<String> nomes = new ArrayList<>();
            nomes.add("Juliana");
            nomes.add("Pedro");
            nomes.add("Carlos");
            nomes.add("Larissa");
            nomes.add("João");
            System.out.println("exercício 1 e 2");
            for(String nome: nomes){
                System.out.println(nome);
            }
            System.out.println("------------");

            nomes.set(2, "Roberto");
            System.out.println(nomes);
            System.out.println("------------");


            String posicao1 = nomes.get(1);
            System.out.println(posicao1);
            System.out.println("------------");

            nomes.remove(4);
            System.out.println(nomes);
            System.out.println("------------");


            int tamanhoDoArray = nomes.size();
            System.out.println(tamanhoDoArray);
            System.out.println("------------");

            String nomeParaProcurar = "Juliano";

            boolean procuraNome = nomes.contains(nomeParaProcurar);
            if (procuraNome){
                System.out.println("o nome " + nomeParaProcurar + " existe no array");
            }else{
                System.out.println("o nome " + nomeParaProcurar + " não existe!");
            }

            List <String> nomes2 = new ArrayList<>();
            nomes2.add("Ismael");
            nomes2.add("Rodrigo");

            nomes.addAll(nomes2);

            Collections.sort(nomes);
            System.out.println(nomes);

            boolean listaVazia = nomes.isEmpty();
            if (listaVazia){
                System.out.println("a lista está vazia");

            }else {
                System.out.println("a lista não está vazia");
            }



        }
}
