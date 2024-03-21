package org.example.dao;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.domain.Article;
import org.example.domain.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
@RequiredArgsConstructor
public class ArticleDao {
    private final SessionFactory session;
public Article save(Article article ){
    session.getCurrentSession()
            .persist(article);
    return article;
}
    public Article getById(long id){
        return session.getCurrentSession()
                .get(Article.class, id);
    }

    public void delete(long id){
        session.getCurrentSession()
                .remove(getById(id));
    }
    public List<Article> getAll(){
        return session.getCurrentSession()
                .createQuery("from User", Article.class)
                .list();
    }
}
