package edu.iesam.features.data;

import edu.iesam.features.domain.Autor;
import edu.iesam.features.domain.AutorRepository;

import java.util.List;

public class AutorDataRepository implements AutorRepository.AuthorRepository {

    @Override
    public void save(Autor autor) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public List<Autor> getAutors() {
        return null;
    }
}
