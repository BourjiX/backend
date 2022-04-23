package com.pfe.backend.dao.repository;


import com.pfe.backend.dao.entity.Metrics;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MetricsRepository extends JpaRepository<Metrics,Long> {
    List<Metrics> findAll();
}
