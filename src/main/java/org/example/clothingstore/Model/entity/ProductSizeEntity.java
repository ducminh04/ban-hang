package org.example.clothingstore.Model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
@Data
@Entity
@Table(name = "product_size", schema = "dbo", catalog = "SalesItems")
public class ProductSizeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "size_id", referencedColumnName = "id")
    private SizeEntity sizeBySizeId;
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private ProductEntity productByProductId;

}
