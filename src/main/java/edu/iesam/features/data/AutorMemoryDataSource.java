package edu.iesam.features.data;

import edu.iesam.features.domain.Autor;

import java.util.ArrayList;
import java.util.List;

public class AutorMemoryDataSource {
    private static AutorMemoryDataSource instance;
    private List<Autor> autor;

    public static AutorMemoryDataSource getInstance() {
        if (instance == null) {
            instance = new AutorMemoryDataSource();
        }
        return instance;
    }

    private void AutorMemoryDataSource() {
        autor = new ArrayList<>();
    }

    public List<Autor> getAutors() {
        return autor;
    }

}
