package com.example.demo.repo;
import com.example.demo.model.AdminModel;
import com.example.demo.model.TripModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TripRepository extends JpaRepository<TripModel, Long> {

   // Optional<TripModel> findById(Long Id);

}
