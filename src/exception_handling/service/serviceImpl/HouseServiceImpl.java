package exception_handling.service.serviceImpl;

import exception_handling.database.Database;
import exception_handling.enums.HouseType;
import exception_handling.exception.MyException;
import exception_handling.models.Agency;
import exception_handling.service.HouseService;
import exception_handling.models.House;

public class HouseServiceImpl implements HouseService {
    int houseCount = 0;


    @Override
    public String addHouseToAgency(long agencyId, House house) {
        try {
            for (Agency agency : Database.agencies) {
                if (agency.id() == agencyId) {
                    House[] currentHouses = agency.houses();
                    currentHouses[houseCount++] = house;
                    return "Success!";
                }
            }
        } catch (MyException e) {
            return e.getMessage();
        }
        return null;
    }

    @Override
    public House getHouseByHouseType(long agencyId, HouseType houseType) {
        try {
            for (Agency agency : Database.agencies) {
                if (agency.id() == agencyId) {
                    for (House house : agency.houses()) {
                        if (house.houseType() == houseType) {
                            return house;
                        }
                    }
                }
            }
        }catch (MyException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public House getAllHousesByAgency(long agencyId) {
        try {
            for (Agency agency : Database.agencies) {
                if (agency.id() == agencyId) {
                    return agency.houses()[houseCount++];
                }
            }
        }catch (MyException e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public String deleteHouseById(long id) {
        int indexToDelete = - 1;
        for (Agency agency : Database.agencies){
            for (int i = 0; i < agency.houses().length; i++) {
                if (agency.houses()[i].id() == id){
                    indexToDelete = i;
                    break;
                }
            }

            if (indexToDelete == - 1){
                return "House with id " + id + " not found";
            }

            House[] newHouses = new House[agency.name().length()];
            for (int i = 0, j = 0; i < agency.houses().length; i++) {
                if (i != indexToDelete){
                    newHouses[j++] = agency.houses()[i];
                }
            }

        }
        return "";
    }
}