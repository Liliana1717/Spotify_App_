package edu.iesam.features.presentation.domain;

public class SaveCancionUseCase {


        private CancionRepository repository;

        public SaveCancionUseCase(CancionRepository repository) {
            this.repository = repository;
        }

        public void execute(Cancion cancion) {
            repository.save(cancion);
        }
    }

