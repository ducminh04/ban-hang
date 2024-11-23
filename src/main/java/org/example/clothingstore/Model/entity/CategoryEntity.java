package org.example.clothingstore.Model.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "Category", schema = "dbo", catalog = "")
public class CategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "category_name", nullable = true, length = 100)
    private String categoryName;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Date createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Date updatedAt;
    @Basic
    @Column(name = "parent_id", nullable = true)
    private Integer parentId;
    @Basic
    @Column(name = "images", nullable = true, length = 255)
    private String images;
    @Basic
    @Column(name = "on_home", nullable = true)
    private Boolean onHome;
    @Basic
    @Column(name = "on_menu", nullable = true)
    private Boolean onMenu;
    @Basic
    @Column(name = "status", nullable = true)
    private Boolean status;
    @OneToMany(mappedBy = "categoryEntity")
    private Collection<ProductEntity> productEntities;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public Boolean getOnHome() {
        return onHome;
    }

    public void setOnHome(Boolean onHome) {
        this.onHome = onHome;
    }

    public Boolean getOnMenu() {
        return onMenu;
    }

    public void setOnMenu(Boolean onMenu) {
        this.onMenu = onMenu;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return id == that.id && Objects.equals(categoryName, that.categoryName) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(parentId, that.parentId) && Objects.equals(images, that.images) && Objects.equals(onHome, that.onHome) && Objects.equals(onMenu, that.onMenu) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, categoryName, createdAt, updatedAt, parentId, images, onHome, onMenu, status);
    }
}
