package edu.iesam.features.listadoalbum.domain;
import java.util.List;
public interface AlbumRepository {
    List<Album> getAlbums();
    void delete(String id);
}
