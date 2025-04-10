package booking_service.service;

import booking_service.models.Management;
import exception_handling.models.Agency;

public interface ManagementService {
    String addManagement(Management management);
    Management getManagementById(long id);
    Management[] getAllManagement();
    String updateManagementById(long id, Management newManagement);
    String deleteManagementById(long id);
}
