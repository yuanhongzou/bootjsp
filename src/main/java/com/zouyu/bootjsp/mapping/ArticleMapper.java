package com.zouyu.bootjsp.mapping;

import com.zouyu.bootjsp.model.Article;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ArticleMapper {
    @Select("SELECT * FROM article WHERE id = #{id}")
    Article getArticleById(Integer id);

    @Select("SELECT * FROM article")
    List<Article> getArticleList();

    @Insert("insert into article(contents, title) values(#{contents}, #{title})")
    int add(Article article);

    @Update("UPDATE article SET contents = #{article.contents} , title = #{article.title} WHERE id = #{id}")
    int update(@Param("id") Integer id, @Param("article") Article article);

    @Delete("DELETE from article where id = #{id} ")
    int delete(Integer id);
}
