package com.bancolombia.app.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancolombia.app.datasource.ArticleRepository;
import com.bancolombia.app.entities.Article;

@Service
public class ServicesImpl implements IServices{
	@Autowired
	private ArticleRepository repositorio;

	@Override
	public boolean insert(Article article) {
		// TODO Auto-generated method stub
		return repositorio.insert(article);
	}

	@Override
	public List<Article> getAll() {
		// TODO Auto-generated method stub
		return repositorio.getAll();
	}

}
