package com.nelioalves.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//controlador rest
@RequestMapping(value="/categorias")//end point rest de categorias
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)//get obtém dados
	public String listar() {
		return "REST está funcionando!";
		
	}

}
