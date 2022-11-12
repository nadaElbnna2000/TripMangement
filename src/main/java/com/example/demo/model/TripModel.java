package com.example.demo.model;

import org.hibernate.annotations.JoinColumnOrFormula;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.io.Serializable;


@Entity
public class TripModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Nullable
   private Long Id;

   private   String startTime;

    private String endTime;
    private String fromStation;

    private String toStation;


    public TripModel() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getFromStation() {
        return fromStation;
    }

    public void setFromStation(String fromStation) {
        this.fromStation = fromStation;
    }

    public String getToStation() {
        return toStation;
    }

    public void setToStation(String toStation) {
        this.toStation = toStation;
    }

    public TripModel(Long Id, String startTime, String endTime, String fromStation, String toStation) {
        this.Id = Id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.fromStation = fromStation;
        this.toStation = toStation;
    }


//    @Override
//    public String toString(){
//
//        return "TripModel{" +
//                "Id=" +Id +
//                " , startTime='" + startTime + '\''+
//                " , endTime='" + endTime + '\''+
//
//                " , fromStation='" + fromStation + '\''+
//                " , toStation='" + toStation + '\''+
//                '}';
//
//    }
}
