package edu.iesam.features.presentation.domain;

public class DeleteAutorUseCase {

   private AutorRepository repository;

    public  DeleteAutorUseCase (AutorRepository repository) {
        this.repository = repository;
    }

    public void execute(String id) {
        repository.delete(id);
    }
}
