package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.dao.ArticleDao;
import org.example.dao.UserDao;
import org.example.domain.Article;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleDao articleDao;
    private final PasswordEncoder passwordEncoder;

    public Article saveArticle;
}
