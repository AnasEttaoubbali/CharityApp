package com.example.organisationms.repos;

import com.example.organisationms.entities.Organisation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganisationRepo extends JpaRepository<Organisation,Long> {
}
