package edu.iesam.features.presentation.domain;

public class DeleteAlbumUseCase {

        private AlbumRepository repository;

        public DeleteAlbumUseCase(AlbumRepository repository) {
            this.repository = repository;
        }

        public void execute(String id) {
            repository.delete(id);
        }
    }

