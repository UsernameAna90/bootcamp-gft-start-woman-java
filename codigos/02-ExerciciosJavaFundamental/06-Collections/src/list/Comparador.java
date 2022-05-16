package list;

import set.Serie;
import java.util.Comparator;

public class Comparador implements Comparator<Serie> {

    @Override
    public int compare(Serie serie1, Serie serie2) {
        return serie1.getGenero().compareTo(serie2.getGenero());
    }
}
