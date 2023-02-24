package com.example.SQLRocks;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    //First  part in<> :with whom to connect
    //Second part in<>: data type of primary key




}
