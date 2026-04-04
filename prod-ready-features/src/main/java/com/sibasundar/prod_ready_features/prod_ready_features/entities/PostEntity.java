package com.sibasundar.prod_ready_features.prod_ready_features.entities;

import com.sibasundar.prod_ready_features.prod_ready_features.entities.base.AuditableUserEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PostEntity extends AuditableUserEntity {
    private String title;
    private String description;
}