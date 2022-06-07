package cl.aiep.java.catalogo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.aiep.java.catalogo.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
	// Retornara el nombre de la imagen correspondiente para su eliminacion
	@Query(value = "SELECT imagen FROM producto p WHERE p.id = ?", nativeQuery = true)
	String findImagenById(Long id);

}