package br.com.rodrigo.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/category")
public class CategoryResource {
	
	
	@RequestMapping(method = RequestMethod.GET)
	public String list() {
		return "REST func";
	}
}
