package com.example.demo.service;


import antlr.Parser;
import com.example.demo.model.StationModel;
import com.example.demo.model.TripModel;
import com.example.demo.repo.StationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {

    private final StationRepo stationRepo;

    public StationService(StationRepo stationRepo) {
        this.stationRepo = stationRepo;
    }




    public StationModel addStation(StationModel station){
        return stationRepo.save(station);
    }

    public List<StationModel> findAllStations(){
        return stationRepo.findAll();
    }

    public StationModel updateStation(StationModel station){
        return stationRepo.save(station);
    }

    public void deleteStation(Long id){
        stationRepo.deleteById(id);
    }

}
