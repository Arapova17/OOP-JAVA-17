package exception_handling.service;

import exception_handling.models.Agency;

public interface AgencyService {
    //TODO CRUD:
    String addAgency(Agency agency);
    Agency getAgencyById(long id);
    Agency[] getAllAgency();
    String updateAgencyById(long id, Agency newAgency);
    String deleteAgencyById(long id);
}
