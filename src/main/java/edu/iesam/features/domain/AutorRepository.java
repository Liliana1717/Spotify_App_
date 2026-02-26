package edu.iesam.features.domain;

import java.util.List;

public interface AutorRepository {

    void save(Autor autor);

    interface AuthorRepository {
        void save(Autor autor);

        void delete(String id);

        List<Autor> getAutors();
    }
}
