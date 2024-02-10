

import java.util.ArrayList;
import java.util.List;

public class ListaCarros <T extends Carro> {

    private List<T> listaDeCarros;

    public ListaCarros(){
        listaDeCarros = new ArrayList<>();
    }

    public void adicionarCarro(T Carro){
            listaDeCarros.add(Carro);
    }

    public void imprimirLista(){
        for(T carro : listaDeCarros){
            System.out.println(carro.getFabricante()+ " " + carro.getModelo() + " " +
                    carro.getTipo());
        }
    }
}