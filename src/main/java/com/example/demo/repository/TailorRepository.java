package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Tailor;

public interface TailorRepository extends JpaRepository<Tailor, Number> {

}
