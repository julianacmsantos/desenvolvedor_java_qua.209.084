package com.crud.javalanches.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.javalanches.models.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}