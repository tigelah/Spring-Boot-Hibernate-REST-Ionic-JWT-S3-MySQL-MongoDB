package br.com.rodrigo.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rodrigo.cursomc.domain.Category;
import br.com.rodrigo.cursomc.repositories.CategoryRepository;
import br.com.rodrigo.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public Category get(Integer id) {
		
		Optional<Category> obj = categoryRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Object not found: Id: " + id + ", Tipo: " + Category.class.getName()));
	}
}
