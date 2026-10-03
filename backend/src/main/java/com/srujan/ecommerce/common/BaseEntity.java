package com.srujan.ecommerce.common;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseEntity {//abstact class means you cant write new baseentity

    @Id//mark id as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)//this tell database to genarate the ID automatically
    private Long id;//private no other class can acces , only access through the grtters and setters

    @CreationTimestamp//hibernate , automatically updates this field every time the row is modified
    @Column(name = "created_at", updatable = false)//tellls hibernate : never modify this column after insert
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
//no @entity classes exist yet ,so nothing new is created .But once we create the user entity next
//,and it extends BaseEntity , the user table will have id ,created_at,updated_at automatically
