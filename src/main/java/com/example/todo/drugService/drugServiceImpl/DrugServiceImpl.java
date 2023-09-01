package com.example.todo.drugService.drugServiceImpl;

import com.example.todo.drugService.DrugService;
import com.example.todo.exception.CustomException;
import com.example.todo.model.Drug;
import com.example.todo.repository.DrugRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class DrugServiceImpl implements DrugService {
    private final DrugRepository drugRepository;


    @Override
    public Drug createDrug(Drug drug){
        Drug newDrug = new Drug();
        newDrug.setName(drug.getName());
        newDrug.setBrand(drug.getBrand());
        newDrug.setCreatedDate(new Timestamp(System.currentTimeMillis()).toLocalDateTime());
        return drugRepository.save(newDrug);
    }
    @Override
    public List<Drug> viewAllDrug(){
        return drugRepository.findAll();
    }

    public Drug getDrugById(Long drugId){
       Optional<Drug> opt =  drugRepository.findById(drugId);
       if(opt.isPresent()){
           opt.get();
       }
       throw new CustomException("Drug with this id cannot be FounD: "+ drugId, HttpStatus.BAD_REQUEST);
    }

}
