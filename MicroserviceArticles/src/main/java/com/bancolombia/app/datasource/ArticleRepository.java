package com.bancolombia.app.datasource;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bancolombia.app.entities.Article;

@Component
public class ArticleRepository {
	private final List<Article> lista = new ArrayList<>();
			
	public boolean insert(Article article) {
		return lista.add(article);
	}
	
	public List<Article> getAll() {
		return	lista;
	}

}
