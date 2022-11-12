package com.example.demo.controller;


import com.example.demo.model.TripModel;
import com.example.demo.service.AdminService;
import com.example.demo.service.StationService;
import com.example.demo.service.TripService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/trip")
public class TripController {
    private final AdminService adminService;
    private final TripService tripService;

    private final StationService stationService;


    public TripController(AdminService adminService, TripService tripService, StationService stationService) {
        this.adminService = adminService;
        this.tripService = tripService;
        this.stationService = stationService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<TripModel>> getAllTrips(){

        List<TripModel> trips = tripService.findAllTrips();

        return new ResponseEntity<>(trips , HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<TripModel> addTrip(@RequestBody TripModel trip) {


        TripModel newTrip = tripService.addTrip(trip);
        return new ResponseEntity<>(newTrip, HttpStatus.CREATED);
    }

//    @PutMapping("/update")
//    public ResponseEntity<TripModel> updateTrip(@RequestBody TripModel trip){
//
//        TripModel updateTrip = tripService.updateTrip(trip);
//        return new ResponseEntity<>(updateTrip , HttpStatus.CREATED);
//    }
//



@PutMapping(path = "/update/{id}")
public void updateTrip(
        @PathVariable Long id ,
        @RequestBody TripModel trip

                                            ){
        tripService.updateTripById(id , trip);
}



    @GetMapping(path = "/all/{id}")
    public TripModel getTripById(
            @PathVariable Long id
    ){
       return tripService.getTripById(id);
    }


    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<Void> deleteTrip(@PathVariable Long id){
        tripService.deleteTrip(id);
      return new ResponseEntity<>(HttpStatus.OK);
    }
}
