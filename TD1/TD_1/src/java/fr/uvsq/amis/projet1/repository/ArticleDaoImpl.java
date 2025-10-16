package fr.uvsq.amis.projet1.repository;

import fr.uvsq.amis.projet1.modele.Article;
import fr.uvsq.amis.projet1.modele.Login;

import java.util.ArrayList;
import java.util.List;

public class ArticleDaoImpl implements ArticleDao{

    private List<Article> listArticles = new ArrayList<Article>();

    public ArticleDaoImpl(){
    }

    @Override
    public boolean insert(Article article) {

        /*
        for (Article articleItem : listArticles) {
            if (articleItem.getNom().equals(article.getNom())) { //On incrémente juste de 1
                articleItem.setQuantite(articleItem.getQuantite() + 1);
                return true;
            }
        }
        */

        //On a un new article
        listArticles.add(article);
        return true;
    }


    @Override
    public boolean existe(Article article) {
        for(Article articleItem : listArticles){
            if (articleItem.getNom().equals(article.getNom())){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Article> findAll() {
        return listArticles;
    }
}
