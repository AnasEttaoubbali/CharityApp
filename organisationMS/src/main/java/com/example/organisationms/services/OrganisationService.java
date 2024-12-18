package com.example.organisationms.services;

import com.example.organisationms.dtos.OrganisationDTORequest;
import com.example.organisationms.dtos.OrganisationDTOResponse;
import com.example.organisationms.entities.Organisation;

import java.util.List;

public interface OrganisationService {
    List<Organisation> findOrganisations();
    OrganisationDTOResponse addOrganisation(OrganisationDTORequest organisationDTORequest);
    OrganisationDTOResponse updateOrganisation(Long id,OrganisationDTORequest organisationDTORequest);
    void deleteOrganisation(Long id);
}
