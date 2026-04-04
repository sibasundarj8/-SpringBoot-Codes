package com.sibasundar.prod_ready_features.prod_ready_features.entities;

import com.sibasundar.prod_ready_features.prod_ready_features.entities.base.AuditableUserEntity;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;

@Entity
@Table(name = "posts")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Audited
public class PostEntity extends AuditableUserEntity {
    private String title;
    private String description;
}