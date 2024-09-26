package com.orbit.care.care_orbit_hub.repository;

import com.orbit.care.care_orbit_hub.entity.MedicalAppointmentEntity;
import com.orbit.care.care_orbit_hub.projections.PatientProjections;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.UUID;
@RepositoryRestResource(collectionResourceRel = "appointments", itemResourceRel = "appointment",  path = "appointments")
public interface MedicalAppointmentRepository extends JpaRepository<MedicalAppointmentEntity, UUID> {

}
