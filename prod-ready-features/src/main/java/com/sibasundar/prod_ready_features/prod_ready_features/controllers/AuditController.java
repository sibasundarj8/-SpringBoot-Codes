package com.sibasundar.prod_ready_features.prod_ready_features.controllers;

import com.sibasundar.prod_ready_features.prod_ready_features.entities.PostEntity;
import jakarta.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/audit")
public class AuditController {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @GetMapping(path = "/posts/{postId}")
    List<PostEntity> getPostRevisions(@PathVariable Long postId) {
        return new ArrayList<>();
    }

}
