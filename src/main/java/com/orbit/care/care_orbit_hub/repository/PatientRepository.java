package com.orbit.care.care_orbit_hub.repository;

import com.orbit.care.care_orbit_hub.projections.PatientProjections;
import com.orbit.care.care_orbit_hub.entity.PatientEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "patients", itemResourceRel = "patient", excerptProjection = PatientProjections.class, path = "patients")
public interface PatientRepository extends JpaRepository<PatientEntity, UUID> {

    public Page<PatientEntity> findByNameLikeIgnoreCaseAndIdNumberLikeIgnoreCaseAndCityLikeIgnoreCase(String name, String idNumber, String city, Pageable pageable);
}
