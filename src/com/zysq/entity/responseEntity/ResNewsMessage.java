package com.zysq.entity.responseEntity;

import com.zysq.entity.Article;

import java.util.List;

/**
 * Created by rose_sunshine on 16/3/21.
 */
public class ResNewsMessage {
    private int ArticleCount;
    private List<Article> Articles;

    public int getArticleCount() {
        return ArticleCount;
    }

    public void setArticleCount(int articleCount) {
        ArticleCount = articleCount;
    }

    public List<Article> getArticles() {
        return Articles;
    }

    public void setArticles(List<Article> articles) {
        Articles = articles;
    }
}
