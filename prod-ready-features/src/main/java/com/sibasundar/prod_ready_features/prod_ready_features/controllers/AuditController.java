package com.sibasundar.prod_ready_features.prod_ready_features.controllers;

import com.sibasundar.prod_ready_features.prod_ready_features.dto.PostDTO;
import com.sibasundar.prod_ready_features.prod_ready_features.entities.PostEntity;
import jakarta.persistence.EntityManagerFactory;
import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/audit")
public class AuditController {

    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Autowired
    private ModelMapper mapper;

    @GetMapping("/posts/{postId}")
    public List<PostDTO> getPostRevisions(@PathVariable Long postId) {
        AuditReader reader = AuditReaderFactory.get(entityManagerFactory.createEntityManager());

        List<Number> revisions = reader.getRevisions(PostEntity.class, postId);

        return revisions.stream()
                .map(revisionsNumber -> mapper.map(reader.find(PostEntity.class, postId, revisionsNumber), PostDTO.class))
                .toList();
    }
}