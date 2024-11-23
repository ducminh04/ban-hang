package org.example.clothingstore.Model.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "Customer", schema = "dbo", catalog = "SalesItems")
public class CustomerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "customer_id", nullable = false)
    private int customerId;
    @Basic
    @Column(name = "customer_code", nullable = true, length = 50)
    private String customerCode;
    @Basic
    @Column(name = "customer_name", nullable = true, length = 100)
    private String customerName;
    @Basic
    @Column(name = "gender", nullable = true)
    private Boolean gender;
    @Basic
    @Column(name = "phone", nullable = true, length = 20)
    private String phone;
    @Basic
    @Column(name = "email", nullable = true, length = 100)
    private String email;
    @Basic
    @Column(name = "birth_date", nullable = true)
    private Date birthDate;
    @Basic
    @Column(name = "username", nullable = true, length = 50)
    private String username;
    @Basic
    @Column(name = "password", nullable = true)
    private byte[] password;
    @Basic
    @Column(name = "created_at", nullable = true)
    private Date createdAt;
    @Basic
    @Column(name = "updated_at", nullable = true)
    private Date updatedAt;
    @Basic
    @Column(name = "status", nullable = true)
    private Boolean status;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public byte[] getPassword() {
        return password;
    }

    public void setPassword(byte[] password) {
        this.password = password;
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
        CustomerEntity that = (CustomerEntity) o;
        return customerId == that.customerId && Objects.equals(customerCode, that.customerCode) && Objects.equals(customerName, that.customerName) && Objects.equals(gender, that.gender) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && Objects.equals(birthDate, that.birthDate) && Objects.equals(username, that.username) && Arrays.equals(password, that.password) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(customerId, customerCode, customerName, gender, phone, email, birthDate, username, createdAt, updatedAt, status);
        result = 31 * result + Arrays.hashCode(password);
        return result;
    }
}
