package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenacaoNumeros  {
    private List<Integer> numeros;



    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
            List<Integer> ordemCrescente = new ArrayList<>(numeros);
            Collections.sort(ordemCrescente, new ComparatorCrescente());
           return ordemCrescente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> ordemDecrescente = new ArrayList<>(numeros);
        Collections.sort(ordemDecrescente, new ComparatorDecrescente());
        return ordemDecrescente;
    }

//    public List<Integer> ordenarDescendente() {
//        List<Integer> ordemDecrescente = new ArrayList<>(numeros);
//        ordemDecrescente.sort(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer a, Integer b) {
//                return b - a;
//            }
//        });
//        return ordemDecrescente;
//
//    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(9);

        System.out.println(ordenacaoNumeros.numeros);
        System.out.println("Numeros em ordem crescente? " + ordenacaoNumeros.ordenarAscendente());
        System.out.println("Numeros em ordem decrescente? " + ordenacaoNumeros.ordenarDescendente());

    }
}

class ComparatorCrescente implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return a - b;
    }
}

class ComparatorDecrescente implements Comparator<Integer> {

    @Override
    public int compare(Integer a, Integer b) {
        return b - a;
    }
}
