package com.orbit.care.care_orbit_hub.repository;

import com.orbit.care.care_orbit_hub.entity.MedicalAppointmentEntity;
import com.orbit.care.care_orbit_hub.entity.SpecializationEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "specializations", itemResourceRel = "specialization",  path = "specializations")
public interface SpecializationsRepository extends JpaRepository<SpecializationEntitiy, UUID> {

}
