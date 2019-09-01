package br.com.rodrigo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rodrigo.cursomc.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	
}
