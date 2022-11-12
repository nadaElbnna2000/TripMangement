package com.example.demo.service;

import com.example.demo.model.AdminModel;
import com.example.demo.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Optional;


@Service
public class AdminService {


    private final AdminRepo adminRepo;

    @Autowired
    public AdminService(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }



    public AdminModel signUp(AdminModel admin){
        return adminRepo.save(admin);
    }










    public boolean SignIn(AdminModel admin)  {
        Optional<AdminModel> adminModelOptional = adminRepo.findAdminModelByUserNameAndPassword(admin.getUserName() , admin.getPassword());
        if (adminModelOptional.isPresent()){
            return true;
        } else {
            throw new IllegalStateException("wrong crediantials");
        }
    }

//
//
//    public void deleteAdmin(Long Id){
//        boolean exists = adminRepo.existsById(Id);
//
//        if (exists){
//            adminRepo.deleteById(Id);
//
//        } else {
//            throw new IllegalStateException("Admin With that id is not exists");
//        }
//    }



}
