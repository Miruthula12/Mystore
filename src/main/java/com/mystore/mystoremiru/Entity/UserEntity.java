package com.mystore.mystoremiru.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="users")
public class UserEntity{
    @Id
    @Column(name="id")
    private int user_id;
    @Column(name="name")
    private String user_name;

}