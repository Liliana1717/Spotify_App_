package edu.iesam.features.listadoalbum.data;

import edu.iesam.features.listadoalbum.domain.Album;
import edu.iesam.features.listadoalbum.domain.AlbumRepository;

import java.util.ArrayList;
import java.util.List;

public class AlbumDataRepository implements AlbumRepository {

    private final List<Album> albums = new ArrayList<>();

    public AlbumDataRepository() {
        albums.add(new Album("1", "Hybrid Theory", 2000));
        albums.add(new Album("2", "Back in Black", 1980));
    }

    @Override
    public List<Album> getAlbums() {
        return albums;
    }

    @Override
    public void delete(String id) {
        albums.removeIf(album -> album.getId().equals(id));
    }
}

