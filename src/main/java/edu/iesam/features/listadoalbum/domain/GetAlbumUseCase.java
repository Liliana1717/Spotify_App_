package edu.iesam.features.listadoalbum.domain;

import java.util.List;

public class GetAlbumUseCase {

    private final AlbumRepository repository;

    public GetAlbumUseCase(AlbumRepository repository) {
        this.repository = repository;
    }

    public List<Album> execute() {
        return repository.getAlbums();
    }
}

