package com.example.todo.controller;

import com.example.todo.drugService.DrugService;
import com.example.todo.model.ApiResponse;
import com.example.todo.model.Drug;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drugs")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class DrugController {
    private final DrugService drugService;

    @PostMapping
    public ResponseEntity<ApiResponse>  createDrug(@RequestBody Drug drug){
        Drug createdDrug = drugService.createDrug(drug);
        ApiResponse<Drug> apiResponse = new ApiResponse("success", createdDrug);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
    @GetMapping
    public ResponseEntity<ApiResponse> viewAllDrug(){
        List<Drug> drugList = drugService.viewAllDrug();
        ApiResponse<List<Drug>> apiResponse = new ApiResponse<>("success", drugList);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Drug>>  viewSingleDrug(@PathVariable("id") Long drugId){
            Drug found = drugService.getDrugById(drugId);
        ApiResponse<Drug> apiResponse = new ApiResponse<>(":success", found);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
