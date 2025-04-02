package exception_handling.service.serviceImpl;

import exception_handling.database.Database;
import exception_handling.exception.MyException;
import exception_handling.models.Agency;
import exception_handling.service.AgencyService;

public class AgencyServiceImpl implements AgencyService {
    int agencyCount = 0;

    @Override
    public String addAgency(Agency agency) {
        try{
            Database.agencies[agencyCount++] = agency;
            return "Success!";
        }catch (MyException e){
            return e.getMessage();
        }

    }

    @Override
    public Agency getAgencyById(long id) {
        try {
            for (Agency agency : Database.agencies) {
                if (agency.id() == id) {
                    return agency;
                }
            }

        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Agency[] getAllAgency() {
        try {
            return Database.agencies;
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String updateAgencyById(long id, Agency newAgency) {
        try {
            for (int i = 0; i < Database.agencies.length; i++) {
                if (id == Database.agencies[i].id()) {
                    Database.agencies[i].setName(newAgency.name());
                    Database.agencies[i].setAddress(newAgency.address());
                    Database.agencies[i].setFoundationDate(newAgency.foundationDate());
                    return "Agency updated successfully";
                }
            }
            return "Agency with id " + id + " not found";
        } catch (MyException e) {
            return e.getMessage();
        }
    }

    @Override
    public String deleteAgencyById(long id) {
        try {
            int indexToDelete = -1;
            for (int i = 0; i < Database.agencies.length; i++) {
                if (Database.agencies[i].id() == id) {
                    indexToDelete = i;
                    break;
                }
            }

            if (indexToDelete == -1) {
                return "Agency with id " + id + " not found";
            }

            Agency[] newAgencies = new Agency[Database.agencies.length - 1];
            for (int i = 0, j = 0; i < Database.agencies.length; i++) {
                if (i != indexToDelete) {
                    newAgencies[j++] = Database.agencies[i];
                }
            }

            Database.agencies = newAgencies;
            return "Agency delete successfully!";
        } catch (MyException e) {
            return e.getMessage();
        }
    }
}
