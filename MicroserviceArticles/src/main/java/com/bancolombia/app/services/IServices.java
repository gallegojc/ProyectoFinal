package com.bancolombia.app.services;

import java.util.List;

import com.bancolombia.app.entities.Article;

public interface IServices {
	boolean insert(Article article);
	List<Article> getAll();
}
