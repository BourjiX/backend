package com.pfe.backend.services.mapper;

import com.pfe.backend.dao.entity.Metrics;

import com.pfe.backend.services.model.MetricsDTO;



public class MetricsMapper {

    public static Metrics mapToEntity(MetricsDTO metricsDTO){
        if (metricsDTO==null){
            return null;
        }
        Metrics metrics =new Metrics();
        metrics.getDate();
        metrics.getTemp();
        metrics.getHum();
        metrics.isGaz();
        metrics.isSon();
        return metrics;
    }
    public static MetricsDTO mapToDTO(Metrics metrics){
        if (metrics==null){
            return null;
        }
       MetricsDTO metricsDTO =new MetricsDTO();
        metricsDTO.getTemp();
        metricsDTO.getHum();
        metricsDTO.isGaz();
        metricsDTO.isSon();
        return metricsDTO;
    }

}
