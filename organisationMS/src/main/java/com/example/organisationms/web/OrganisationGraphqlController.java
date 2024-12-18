package com.example.organisationms.web;

import com.example.organisationms.dtos.OrganisationDTORequest;
import com.example.organisationms.dtos.OrganisationDTOResponse;
import com.example.organisationms.entities.Organisation;
import com.example.organisationms.repos.OrganisationRepo;
import com.example.organisationms.services.OrganisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
@Controller
public class OrganisationGraphqlController {
    @Autowired
    private OrganisationRepo organisationRepo;
    private OrganisationService organisationService;
    @QueryMapping
    private List<Organisation> organisations(){

        return organisationRepo.findAll();
    }
    @QueryMapping(name = "organisation")
    private Organisation organisationById(@Argument Long id){
        return organisationRepo.findById(id)
                .orElseThrow(()-> new RuntimeException("Organisation not found"));
    }
    @MutationMapping
    private OrganisationDTOResponse addOrganisation(@Argument OrganisationDTORequest organisationDTORequest){
        return organisationService.addOrganisation(organisationDTORequest);
    }
    @MutationMapping
    private OrganisationDTOResponse updateOrganisation(@Argument Long id,@Argument OrganisationDTORequest organisationDTORequest){
        return organisationService.updateOrganisation(id,organisationDTORequest);
    }
    @MutationMapping
    private void deleteOrganisation(@Argument Long id){
        organisationService.deleteOrganisation(id);
    }
}