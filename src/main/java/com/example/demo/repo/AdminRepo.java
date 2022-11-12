package com.example.demo.repo;

import com.example.demo.model.AdminModel;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepo extends JpaRepository<AdminModel, Long> {
  Optional<AdminModel> findAdminModelByUserNameAndPassword(String UserName, String Password);



 //   void deleteAdminModelById(String email , String password);

}
