package br.com.rodrigo.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.rodrigo.cursomc.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
