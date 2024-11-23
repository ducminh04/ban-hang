package org.example.clothingstore.Model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "Color")
public class ColorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "color_name", nullable = true, length = 50)
    private String colorName;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Date createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Date updatedAt;
    @Basic
    @Column(name = "status", nullable = true)
    private Boolean status;

    @OneToMany(mappedBy = "colorByColorId")
    private Collection<ProductColorEntity> productColorsById;

}
