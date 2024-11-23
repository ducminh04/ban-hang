package org.example.clothingstore.Model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
@Data
@Entity
@Table(name = "product_color")
public class ProductColorEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "color_id", referencedColumnName = "id")
    private ColorEntity colorByColorId;
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private ProductEntity productByProductId;
}
