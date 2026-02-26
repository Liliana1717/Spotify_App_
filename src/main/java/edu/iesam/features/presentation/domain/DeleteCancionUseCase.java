package edu.iesam.features.presentation.domain;

public class DeleteCancionUseCase {
        private CancionRepository repository;

        public DeleteCancionUseCase(CancionRepository repository) {
            this.repository = repository;
        }

        public void execute(String id) {
            repository.delete(id);
        }
}
