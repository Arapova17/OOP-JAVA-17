package exception_handling.service;

import exception_handling.enums.HouseType;
import exception_handling.models.House;

public interface HouseService {
    String addHouseToAgency(long agencyId, House house);
    House getHouseByHouseType(long agencyId, HouseType houseType);
    House getAllHousesByAgency(long agencyId);
    String deleteHouseById(long id);
}
