package com.pindi.CursoMC.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

import com.pindi.CursoMC.domain.Categoria;




@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	@RequestMapping(method = RequestMethod.GET)
	
	public List<Categoria> listar() {
		
		Categoria cat1= new Categoria(1,"Informática");
		Categoria cat2= new Categoria(2,"Escritorio");
		
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista;
	}
}
