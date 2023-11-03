import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ListaLucruriDeFacut {
    public ArrayList<String> getListaLucruriDeFacut() {
        ArrayList<String> listalucruridefacut = new ArrayList<>();
        listalucruridefacut.add("Fac mancare");
        listalucruridefacut.add("Fac curat");
        listalucruridefacut.add("Fac temele");
        return listalucruridefacut;
    }
    public HashSet<String> getSetDinLista(ArrayList<String> lista){
        HashSet<String> setdinlista = new HashSet<>();
        for (String elemente: lista){
            setdinlista.add(elemente);
        }
        return setdinlista;
    }
}
