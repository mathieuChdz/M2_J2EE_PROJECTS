package fr.uvsq.amis.projet1.service;

import fr.uvsq.amis.projet1.modele.Article;

import java.util.List;

public interface ServiceArticle {

    public boolean ajoute(Article article);
    public boolean delete(Article article);
    public boolean isValide(Article article);
    public List<Article> findAll();
}
