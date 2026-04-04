package com.sibasundar.prod_ready_features.prod_ready_features.entities.base;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

@MappedSuperclass
@Getter
@Setter
@Audited
public class AuditableUserEntity extends AuditableTimeEntity {

    @CreatedBy
    String createdBy;

    @LastModifiedBy
    String updatedBy;
}