package com.pinelabs.controller;

import com.pinelabs.dto.MerchantDTO;
import com.pinelabs.model.Merchant;
import com.pinelabs.service.MerchantService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@ComponentScan(basePackages = "com.pinelabs.controller")

@RestController
@CrossOrigin(origins = "http://localhost:3000")

@RequestMapping("/merchants")
public class MerchantController {

    private final MerchantService merchantService;

    @Autowired
    public MerchantController(MerchantService merchantService) {
        this.merchantService = merchantService;
    }
    
    @GetMapping("/search")
    public ResponseEntity<List<Merchant>> searchMerchants(@ModelAttribute MerchantDTO searchCriteria) {
    	//Integer merchantId = null;
//        if (searchCriteria.getMerchantId() != null && !searchCriteria.getMerchantId().isEmpty()) {
//            merchantId = Integer.parseInt(searchCriteria.getMerchantId());
//        }
    	//int merchantId = Integer.parseInt(searchCriteria.getMerchantId());
        List<Merchant> searchResults = merchantService.searchMerchants(searchCriteria);
        return ResponseEntity.ok(searchResults);
    }

    @GetMapping("/all")
    public ResponseEntity<List<MerchantDTO>> getAllMerchants() {
        List<MerchantDTO> allMerchants = merchantService.getAllMerchants(); // Implement this in your service
        return ResponseEntity.ok(allMerchants);
    }


    @PostMapping("/enroll")
    public ResponseEntity<Merchant> enrollMerchant(@RequestBody MerchantDTO merchantDTO) {
        Merchant enrolledMerchant = merchantService.enrollMerchant(merchantDTO);
        return ResponseEntity.ok(enrolledMerchant);
    }

    // Add more API methods for other CRUD operations
    // ...

}
