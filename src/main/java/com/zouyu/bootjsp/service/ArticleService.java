package com.zouyu.bootjsp.service;

import com.zouyu.bootjsp.model.Article;

import java.util.List;

public interface ArticleService {

    Article getArticleById(Integer id);

    List<Article> getArticleList();

    int add(Article article);

    int update(Integer id, Article article);

    int delete(Integer id);
}
