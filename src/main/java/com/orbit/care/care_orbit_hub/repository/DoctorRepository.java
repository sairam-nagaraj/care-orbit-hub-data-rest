package com.orbit.care.care_orbit_hub.repository;

import com.orbit.care.care_orbit_hub.entity.DoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "doctors", itemResourceRel = "doctor",  path = "doctors")
public interface DoctorRepository extends JpaRepository<DoctorEntity, UUID> {
}
