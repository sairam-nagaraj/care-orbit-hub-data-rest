package com.orbit.care.care_orbit_hub.projections;

import com.orbit.care.care_orbit_hub.entity.PatientEntity;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "patientExcerpt", types = {PatientEntity.class})
public interface PatientProjections {

    String getName();

    String getIdNumber();

    Integer getAge();

    String getCity();

}
