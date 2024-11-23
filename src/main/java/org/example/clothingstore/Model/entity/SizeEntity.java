package org.example.clothingstore.Model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;
@Data
@Entity
@Table(name = "Size", schema = "dbo", catalog = "SalesItems")
public class SizeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "size_name", nullable = true, length = 50)
    private String sizeName;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Date createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Date updatedAt;
    @Basic
    @Column(name = "status", nullable = true)
    private Boolean status;

    @OneToMany(mappedBy = "sizeBySizeId")
    private Collection<ProductSizeEntity> productSizesById;

}
