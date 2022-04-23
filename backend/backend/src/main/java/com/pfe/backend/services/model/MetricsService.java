package com.pfe.backend.services.model;

import com.pfe.backend.dao.entity.Metrics;
import com.pfe.backend.services.model.MetricsDTO;
import java.util.List;

public interface MetricsService {

    MetricsDTO add(MetricsDTO metricsDTO);

    List<MetricsDTO> findAll();

    MetricsDTO findLatest(Metrics metrics);

}
