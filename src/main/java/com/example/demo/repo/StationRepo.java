package com.example.demo.repo;

import com.example.demo.model.StationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepo extends JpaRepository<StationModel, Long> {
}
