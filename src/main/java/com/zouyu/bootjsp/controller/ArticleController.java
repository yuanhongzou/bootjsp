package com.zouyu.bootjsp.controller;

import com.zouyu.bootjsp.commen.JsonResult;
import com.zouyu.bootjsp.model.Article;
import com.zouyu.bootjsp.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @RequestMapping("/getArticleById")
    public JsonResult getArticleById(Integer id) {
        JsonResult jsonResult = new JsonResult();
        try {
            Article article = articleService.getArticleById(id);
            jsonResult.setStatus("ok");
            jsonResult.setResult(article);
        } catch (Exception e) {
            jsonResult.setStatus("error");
            jsonResult.setResult(e.getClass().getName()+":"+e.getMessage());
            e.printStackTrace();
        }
        return jsonResult;
    }

    @RequestMapping("/getArticleList")
    public JsonResult getArticleList() {
        JsonResult jsonResult = new JsonResult();
        try {
            List<Article> articleList = articleService.getArticleList();
            jsonResult.setStatus("ok");
            jsonResult.setResult(articleList);
        } catch (Exception e) {
            jsonResult.setStatus("error");
            jsonResult.setResult(e.getClass().getName()+":"+e.getMessage());
            e.printStackTrace();
        }
        return jsonResult;
    }

    @RequestMapping("/add")
    public JsonResult add(Article article) {
        JsonResult jsonResult = new JsonResult();
        try {
            int i = articleService.add(article);
            if (i < 0) {
                jsonResult.setResult(i);
                jsonResult.setStatus("fail");
            } else {
                jsonResult.setResult(i);
                jsonResult.setStatus("ok");
            }
        } catch (Exception e) {
            jsonResult.setStatus("error");
            jsonResult.setResult(e.getClass().getName()+":"+e.getMessage());
            e.printStackTrace();
        }
        return jsonResult;
    }

    @RequestMapping("/update")
    public JsonResult update(Integer id, Article article) {
        JsonResult jsonResult = new JsonResult();
        try {
            int i = articleService.update(id,article);
            if (i < 0) {
                jsonResult.setResult(i);
                jsonResult.setStatus("fail");
            } else {
                jsonResult.setResult(i);
                jsonResult.setStatus("ok");
            }
        } catch (Exception e) {
            jsonResult.setStatus("error");
            jsonResult.setResult(e.getClass().getName()+":"+e.getMessage());
            e.printStackTrace();
        }
        return jsonResult;
    }

    @RequestMapping("/delete")
    public JsonResult delete(Integer id) {

        JsonResult jsonResult = new JsonResult();
        try {
            int i = articleService.delete(id);
            if (i < 0) {
                jsonResult.setResult(i);
                jsonResult.setStatus("fail");
            } else {
                jsonResult.setResult(i);
                jsonResult.setStatus("ok");
            }
        } catch (Exception e) {
            jsonResult.setStatus("error");
            jsonResult.setResult(e.getClass().getName()+":"+e.getMessage());
            e.printStackTrace();
        }
        return jsonResult;

    }


}
