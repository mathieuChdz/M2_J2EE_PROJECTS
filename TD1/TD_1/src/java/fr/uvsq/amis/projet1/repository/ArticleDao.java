package fr.uvsq.amis.projet1.repository;


import fr.uvsq.amis.projet1.modele.Article;

import java.util.List;

public interface ArticleDao {
    public boolean insert(Article article);
    public boolean existe(Article article);
    public List<Article> findAll();
}
