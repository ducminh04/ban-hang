package org.example.clothingstore.Model.entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "Employee")
public class EmployeeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "employee_code", nullable = true, length = 50)
    private String employeeCode;
    @Basic
    @Column(name = "name", nullable = true, length = 100)
    private String name;
    @Basic
    @Column(name = "phone", nullable = true, length = 15)
    private String phone;
    @Basic
    @Column(name = "email", nullable = true, length = 100)
    private String email;
    @Basic
    @Column(name = "gender", nullable = true, length = 10)
    private String gender;
    @Basic
    @Column(name = "address", nullable = true, length = 200)
    private String address;
    @Basic
    @Column(name = "username", nullable = true, length = 50)
    private String username;
    @Basic
    @Column(name = "password", nullable = true, length = 50)
    private String password;
    @Basic
    @Column(name = "photo", nullable = true)
    private byte[] photo;
    @Basic
    @Column(name = "position", nullable = true, length = 50)
    private String position;
    @Basic
    @Column(name = "birth_date", nullable = true)
    private Date birthDate;
    @Basic
    @Column(name = "status", nullable = true, length = 50)
    private String status;
    @Basic
    @Column(name = "ward", nullable = true, length = 50)
    private String ward;
    @Basic
    @Column(name = "district", nullable = true, length = 50)
    private String district;
    @Basic
    @Column(name = "city", nullable = true, length = 50)
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWard() {
        return ward;
    }

    public void setWard(String ward) {
        this.ward = ward;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return id == that.id && Objects.equals(employeeCode, that.employeeCode) && Objects.equals(name, that.name) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && Objects.equals(gender, that.gender) && Objects.equals(address, that.address) && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Arrays.equals(photo, that.photo) && Objects.equals(position, that.position) && Objects.equals(birthDate, that.birthDate) && Objects.equals(status, that.status) && Objects.equals(ward, that.ward) && Objects.equals(district, that.district) && Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(id, employeeCode, name, phone, email, gender, address, username, password, position, birthDate, status, ward, district, city);
        result = 31 * result + Arrays.hashCode(photo);
        return result;
    }
}
