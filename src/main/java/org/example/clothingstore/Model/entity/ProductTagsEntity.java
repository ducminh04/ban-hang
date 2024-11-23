package org.example.clothingstore.Model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
@Data
@Entity
@Table(name = "product_tags", schema = "dbo", catalog = "SalesItems")
public class ProductTagsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @ManyToOne
    @JoinColumn(name = "tags_id", referencedColumnName = "id")
    private TagsEntity tagsByTagsId;
    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private ProductEntity productByProductId;

}
