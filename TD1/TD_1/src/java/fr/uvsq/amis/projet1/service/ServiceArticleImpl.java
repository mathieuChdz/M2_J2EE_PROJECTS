package fr.uvsq.amis.projet1.service;

import fr.uvsq.amis.projet1.modele.Article;
import fr.uvsq.amis.projet1.repository.ArticleDao;
import fr.uvsq.amis.projet1.repository.ArticleDaoImpl;

import java.util.List;

public class ServiceArticleImpl implements ServiceArticle{

    ArticleDao dao = new ArticleDaoImpl();

    @Override
    public boolean ajoute(Article article) {
        return dao.insert(article);
    }

    @Override
    public boolean delete(Article article) {
        return false;
    }

    @Override
    public boolean isValide(Article article) {
        return false;
    }

    @Override
    public List<Article> findAll() {
        return dao.findAll();
    }
}
