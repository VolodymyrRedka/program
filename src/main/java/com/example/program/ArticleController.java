package com.example.program;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
    public class ArticleController {
        private Map<Integer, String> articles = new HashMap<>();

        public ArticleController() {
            articles.put(1, "Привіт");
            articles.put(2, "Бувай");
        }

        @GetMapping("/articles")
        public Map<Integer, String> getAllArticles() {
            return articles;
        }

        @GetMapping("/articles/{id}")
        public String getArticleById(@PathVariable("id") int id) {
            return articles.get(id);
        }
    }


