package com.example.demo.controller;


import com.example.demo.model.AdminModel;
import com.example.demo.model.StationModel;
import com.example.demo.model.TripModel;
import com.example.demo.service.AdminService;
import com.example.demo.service.StationService;
import com.example.demo.service.TripService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/admin")
public class AdminController {

    private final AdminService adminService;
    private final TripService tripService;

    private final StationService stationService;


    public AdminController(AdminService adminService, TripService tripService, StationService stationService) {
        this.adminService = adminService;
        this.tripService = tripService;
        this.stationService = stationService;
    }



    @PostMapping("/signUp")
    public ResponseEntity<AdminModel> signUp(@RequestBody AdminModel user){
        AdminModel newAdmin = adminService.signUp(user);
        newAdmin.setId(user.getId());
        return new ResponseEntity<>(newAdmin , HttpStatus.CREATED);
    }

    @PostMapping("/logIn")
    public void signIn(@RequestBody AdminModel admin)  {
        adminService.SignIn(admin);
    }
//
//    @GetMapping("/getTrips")
//    public ResponseEntity<List<TripModel>> getAllTrips(){
//
//        List<TripModel> trips = tripService.findAllTrips();
//
//        return new ResponseEntity<>(trips , HttpStatus.OK);
//    }
//
//    @PostMapping("/addTrip")
//    public ResponseEntity<TripModel> addTrip(@RequestBody TripModel trip) {
//
//        TripModel newTrip = tripService.addTrip(trip);
//        return new ResponseEntity<>(newTrip, HttpStatus.CREATED);
//    }
//
//    @PutMapping("/updateTrip")
//
//    public ResponseEntity<TripModel> updateTrip(@RequestBody TripModel trip){
//
//        TripModel updateTrip = tripService.updateTrip(trip);
//        return new ResponseEntity<>(updateTrip , HttpStatus.OK);
//    }
//
//
////
////    @PutMapping("/updateTrip/{id}")
////
////    public ResponseEntity<TripModel> updateTrip(@PathVariable Long id){
////
////        TripModel updateTrip = tripService.updateTrip(id);
////        return new ResponseEntity<>(updateTrip , HttpStatus.OK);
////    }
////
//
//
//
//
//
//    @DeleteMapping(path = "/deleteTrip/{id}")
//    public ResponseEntity<Void> deleteTrip(@PathVariable Long id){
//        tripService.deleteTrip(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @GetMapping("/getStations")
//    public ResponseEntity<List<StationModel>> getAllStations(){
//
//        List<StationModel> stations = stationService.findAllStations();
//
//        return new ResponseEntity<>(stations , HttpStatus.OK);
//    }
//
//
//    @PostMapping("/addStation")
//    public ResponseEntity<StationModel> addStation(@RequestBody StationModel station){
//
//        StationModel newStation = stationService.addStation(station);
//
//        return new ResponseEntity<>(newStation , HttpStatus.CREATED);
//
//    }
//
//
//    @PutMapping("/updateStation")
//    public ResponseEntity<StationModel> updateStation(@RequestBody StationModel station){
//
//        StationModel updatedStation = stationService.updateStation(station);
//        return new ResponseEntity<>(updatedStation , HttpStatus.CREATED);
//    }
//
//
//
//
//    @DeleteMapping(path = "/deleteStation/{id}")
//    public ResponseEntity<Void> deleteStation(@PathVariable Long id){
//        stationService.deleteStation(id);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }

}
