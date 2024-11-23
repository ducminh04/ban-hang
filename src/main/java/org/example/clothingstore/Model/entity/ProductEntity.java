package org.example.clothingstore.Model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "Product", schema = "dbo", catalog = "SalesItems")
public class ProductEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "product_code", nullable = true, length = 50)
    private String productCode;
    @Basic
    @Column(name = "product_name", nullable = true, length = 255)
    private String productName;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    @Basic
    @Column(name = "price", nullable = true, precision = 2)
    private BigDecimal price;
    @Basic
    @Column(name = "discount_price", nullable = true, precision = 2)
    private BigDecimal discountPrice;
    @Basic
    @Column(name = "is_hot", nullable = true)
    private Boolean isHot;
    @Basic
    @Column(name = "quantity", nullable = true)
    private Integer quantity;
    @Basic
    @Column(name = "image", nullable = true, length = 255)
    private String image;
    @Basic
    @Column(name = "image_hover", nullable = true, length = 255)
    private String imageHover;
    @Basic
    @Column(name = "list_image", nullable = true, length = 255)
    private String listImage;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Date createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Date updatedAt;
    @Basic
    @Column(name = "status", nullable = true)
    private Boolean status;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    private CategoryEntity categoryEntity;
    @ManyToOne
    @JoinColumn(name = "manufacture_id", referencedColumnName = "id")
    private ManufacturerEntity manufacturerByManufacId;

    @OneToMany(mappedBy = "productByProductId")
    private Collection<ProductColorEntity> colorByColorId;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<ProductTagsEntity> tagsByTagsId;
    @OneToMany(mappedBy = "productByProductId")
    private Collection<ProductSizeEntity> sizeBySizeId;
}
