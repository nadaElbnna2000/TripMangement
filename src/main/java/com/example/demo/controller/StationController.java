package com.example.demo.controller;


import com.example.demo.model.StationModel;
import com.example.demo.model.TripModel;
import com.example.demo.service.StationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/station")
public class StationController {


    private final StationService stationService;


    public StationController(StationService stationService) {
        this.stationService = stationService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<StationModel>> getAllStations(){

        List<StationModel> stations = stationService.findAllStations();

        return new ResponseEntity<>(stations , HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<StationModel> addStation(@RequestBody StationModel station){

        StationModel newStation = stationService.addStation(station);

        return new ResponseEntity<>(newStation , HttpStatus.CREATED);

    }





    @PutMapping("/update")
    public ResponseEntity<StationModel> updateStation(@RequestBody StationModel station){

        StationModel updatedStation = stationService.updateStation(station);
        return new ResponseEntity<>(updatedStation , HttpStatus.CREATED);
    }



//
//
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<?> deleteTrip(@PathVariable("id") Long id){
//
//       tripService.deleteTrip(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }



    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<Void> deleteStation(@PathVariable Long id){
        stationService.deleteStation(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
