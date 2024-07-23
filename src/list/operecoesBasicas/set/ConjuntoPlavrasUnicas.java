package list.operecoesBasicas.set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPlavrasUnicas {

    private Set<PalavrasUnicas> palavrasSet;

    public ConjuntoPlavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavra (String palavra) {
        palavrasSet.add(new PalavrasUnicas(palavra));
    }

    public void removerPalavra(String palavra)  {
        PalavrasUnicas palavrasUnicas = null;
            for (PalavrasUnicas p: palavrasSet){
                if(p.getPalavrasUnicas().equalsIgnoreCase(palavra))
                    palavrasUnicas = p;
        }
        palavrasSet.remove(palavrasUnicas);
    }

    public void verificarPalavra(String palavra){
        for (PalavrasUnicas p: palavrasSet){
            if (p.getPalavrasUnicas().equals(palavra)){
                System.out.println("A palavra"+ palavra + " esta presente no conjunto.");;
                break;
            } else {
                System.out.println("A palavra "+ palavra + " nao esta presente no conjunto.");
                break;
            }
        }
    }

    public void exibirPalavrasUnicas(){
        if (!palavrasSet.isEmpty()){
            System.out.println(palavrasSet);
        } else {
            System.out.println("O conjunto de palavras esta vazio.");
        }
    }

    public static void main(String[] args)  {
        ConjuntoPlavrasUnicas conjuntoPlavrasUnicas = new ConjuntoPlavrasUnicas();

        conjuntoPlavrasUnicas.adicionarPalavra("Macaco");
        conjuntoPlavrasUnicas.adicionarPalavra("Banana");
        conjuntoPlavrasUnicas.adicionarPalavra("Jose");
        conjuntoPlavrasUnicas.adicionarPalavra("Lucas");
        conjuntoPlavrasUnicas.adicionarPalavra("Jaqueta");
        conjuntoPlavrasUnicas.adicionarPalavra("Maria");

        conjuntoPlavrasUnicas.removerPalavra("Jaqueta");

        conjuntoPlavrasUnicas.verificarPalavra("Macaco");

        conjuntoPlavrasUnicas.exibirPalavrasUnicas();



    }
}
