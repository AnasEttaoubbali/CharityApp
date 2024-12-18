package com.example.organisationms.mappers;

import com.example.organisationms.dtos.OrganisationDTOResponse;
import com.example.organisationms.entities.Organisation;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OrganisationMapper {
    public OrganisationDTOResponse fromOrganisation(Organisation organisation){
        OrganisationDTOResponse organisationDTOResponse = new OrganisationDTOResponse();
        BeanUtils.copyProperties(organisation,organisationDTOResponse);
        return organisationDTOResponse;
    }
}
