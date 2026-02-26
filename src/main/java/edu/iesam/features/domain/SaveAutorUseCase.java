package edu.iesam.features.domain;

public class SaveAutorUseCase {
    public class SaveAuthorUseCase {

        private final AutorRepository repository;

        public SaveAuthorUseCase(AutorRepository repository) {
            this.repository = repository;
        }

        public void execute(Autor autor) {
            repository.save(autor);
        }
    }
}
