package booking_service.service.serviceImpl;

import booking_service.database.Database;
import booking_service.models.Management;
import booking_service.service.ManagementService;
import exception_handling.exception.MyException;

public class ManagementServiceImpl implements ManagementService {
    int managementCount = 0;
    @Override
    public String addManagement(Management management) {
        try{
            Database.managements[managementCount++] = management;
            return "Success!";
        }catch (MyException e){
            return e.getMessage();
        }

    }

    @Override
    public Management getManagementById(long id) {
        try{
            for (Management management : Database.managements){
                if (management.id() == id){
                    return management;
                }
            }
        }catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Management[] getAllManagement() {
        try{
            return Database.managements;
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String updateManagementById(long id, Management newManagement) {
        try{
            for (int i = 0; i < Database.managements.length; i++) {
                if (Database.managements[i].id() == id){
                    Database.managements[i].setManagementName(newManagement.managementName());
                    return "Management updated successfully";
                }

            }
            return "Management with id " + id + " not found";
        }catch (MyException e){
            return e.getMessage();
        }

    }

    @Override
    public String deleteManagementById(long id) {
        try {
            int indexToDelete = -1;
            for (int i = 0; i < Database.managements.length; i++) {
                if (Database.managements[i].id() == id) {
                    indexToDelete = i;
                    break;
                }
            }

            if (indexToDelete == -1) {
                return "Management with id " + id + " not found";
            }

            Management[] newManagement = new Management[Database.managements.length - 1];
            for (int i = 0, j = 0; i < Database.managements.length; i++) {
                if (i != indexToDelete) {
                    newManagement[j++] = Database.managements[i];
                }
            }

            Database.managements = newManagement;
            return "Management delete successfully!";
        } catch (MyException e) {
            return e.getMessage();
        }
    }

}
