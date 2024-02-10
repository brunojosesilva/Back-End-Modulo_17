
public class App {

    public static void main(String args[]) {
        ListaCarros<Carro> listaCarros = new ListaCarros<>();
        listaCarros.adicionarCarro(new Fusca("Wv", "Fusca", "Passeio"));
        listaCarros.adicionarCarro(new Ferrari("Ferrario", "Ferrari", "Passeio"));
        
        listaCarros.imprimirLista();
    }
}