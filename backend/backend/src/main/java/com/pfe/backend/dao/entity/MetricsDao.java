package com.pfe.backend.dao.entity;

import java.util.List;

public interface MetricsDao {
    Metrics add(Metrics metrics);

    List<Metrics> findAll();

   Metrics findLatest(Metrics metrics);
}
