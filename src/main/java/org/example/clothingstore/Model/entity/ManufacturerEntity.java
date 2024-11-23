package org.example.clothingstore.Model.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "manufacturer", schema = "dbo", catalog = "SalesItems")
public class ManufacturerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "manufac_name", nullable = true, length = 50)
    private String manufacName;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Date createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Date updatedAt;
    @Basic
    @Column(name = "status", nullable = true)
    private Boolean status;

    @OneToMany(mappedBy = "manufacturerByManufacId")
    private Collection<ProductEntity> productById;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacName() {
        return manufacName;
    }

    public void setManufacName(String manufacName) {
        this.manufacName = manufacName;
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
        ManufacturerEntity that = (ManufacturerEntity) o;
        return id == that.id && Objects.equals(manufacName, that.manufacName) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, manufacName, createdAt, updatedAt, status);
    }
}
