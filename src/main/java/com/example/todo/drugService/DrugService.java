package com.example.todo.drugService;

import com.example.todo.model.Drug;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DrugService {

     Drug createDrug(Drug drug);

     List<Drug> viewAllDrug();
     public Drug getDrugById(Long drugId);
}
