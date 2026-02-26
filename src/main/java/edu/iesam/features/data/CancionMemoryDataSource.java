package edu.iesam.features.data;

import edu.iesam.features.domain.Cancion;
import java.util.List;
import java.util.ArrayList;
public class CancionMemoryDataSource {

        private static CancionMemoryDataSource instance;
        private List<Cancion> songs;

        private CancionMemoryDataSource() {
            songs = new ArrayList<>();
        }

        public static CancionMemoryDataSource getInstance() {
            if (instance == null) {
                instance = new CancionMemoryDataSource();
            }
            return instance;
        }

        public List<Cancion> getSongs() {
            return songs;
        }
    }

