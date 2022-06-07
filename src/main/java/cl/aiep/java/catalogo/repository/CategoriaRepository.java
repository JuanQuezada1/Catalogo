package cl.aiep.java.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.aiep.java.catalogo.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
