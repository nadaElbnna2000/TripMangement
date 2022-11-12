package com.example.demo.service;
import com.example.demo.model.AdminModel;
import com.example.demo.model.TripModel;
import com.example.demo.repo.TripRepository;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
//@Transactional
public class TripService {
    private final TripRepository tripRepo;



    @Autowired
    public TripService(TripRepository tripRepo) {
        this.tripRepo = tripRepo;
    }


    public TripModel addTrip(TripModel trip){
        return tripRepo.save(trip);
    }

    public List<TripModel> findAllTrips(){
        return tripRepo.findAll();
    }

    public TripModel updateTrip(TripModel trip){
      return tripRepo.save(trip);
    }



    public ResponseEntity<TripModel> updateTripById(Long Id , TripModel trip){

        TripModel getTrip = tripRepo.getById(Id);
        getTrip.setFromStation(trip.getFromStation());
        getTrip.setToStation(trip.getToStation());
        getTrip.setStartTime(trip.getStartTime());
        getTrip.setEndTime(trip.getEndTime());



        TripModel updatedTrip = tripRepo.save(getTrip);

        return ResponseEntity.ok().body(updatedTrip);
    }


    public TripModel getTripById(Long Id){

        Optional<TripModel> trip = tripRepo.findById(Id);
        if (trip.isPresent()){
            return trip.get();
        }

        throw  new RuntimeException("not found employee with that id");
    }

//    public TripModel updateTripById(Long Id , String start_time , String end_time , String from_station , String to_station){
//        return tripRepo.getById(Id)
//    }


//    public void updateTripById(Long Id , String start_time , String end_time , String from_station , String to_station){
//
//        TripModel trip = tripRepo.getById(Id);
//
//
//        if (start_time!=null && start_time.length() > 0 &&  !Objects.equals(trip.getStartTime() , start_time)){
//            trip.setStartTime(start_time);
//        }
//
//        if (end_time!=null &&  end_time.length() > 0 && !Objects.equals(trip.getEndTime() , end_time)){
//            trip.setEndTime(end_time);
//        }
//
//        if (from_station!=null&& from_station.length()>0 && !Objects.equals(trip.getFromStation() , from_station)){
//            trip.setFromStation(from_station);
//        }
//        if (to_station!=null&& to_station.length()>0 && !Objects.equals(trip.getToStation() , to_station)){
//            trip.setToStation(to_station);
//        }
//    }




//
//
//    public TripModel updateTrip2(Long  id){
//        return tripRepo.updateTripModelById(id);
//    }



    public void deleteTrip(Long id){
         tripRepo.deleteById(id);
    }

//    public TripModel findTripById(Long id){
//
//        return tripRepo.findTripById(id);
//    }
}
