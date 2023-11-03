import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ListaLucruriDeFacut listaLucruriDeFacut = new ListaLucruriDeFacut();
        ArrayList<String> lista = listaLucruriDeFacut.getListaLucruriDeFacut();
        System.out.println(lista);
        ListaLucruriDeFacut set = new ListaLucruriDeFacut();
        System.out.println(set.getSetDinLista(lista));
        Map<String, String> dictionar = new HashMap<>();
        dictionar.put("caine", "dog");
        dictionar.put("pisica", "cat");
        for (Map.Entry<String, String> entry: dictionar.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }
    }
}