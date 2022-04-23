package com.pfe.backend.services.impl;

import com.pfe.backend.dao.entity.MetricsDao;
import com.pfe.backend.dao.entity.Metrics;
import com.pfe.backend.services.mapper.MetricsMapper;
import com.pfe.backend.services.model.MetricsDTO;
import com.pfe.backend.services.model.MetricsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetricsServiceImpl implements MetricsService {
    private final MetricsDao metricsDao;

    @Override
    public MetricsDTO add(MetricsDTO metricsDTO) {
        return MetricsMapper.mapToDTO(metricsDao.add(MetricsMapper.mapToEntity(metricsDTO)));
    }

    @Override
    public List<MetricsDTO> findAll() {
        return null;
    }

    @Override
    public MetricsDTO findLatest(Metrics metrics) {
        return null;
    }
}
