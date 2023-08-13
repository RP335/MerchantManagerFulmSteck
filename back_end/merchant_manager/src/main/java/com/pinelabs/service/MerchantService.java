package com.pinelabs.service;

import com.pinelabs.dto.MerchantDTO;
import com.pinelabs.model.Merchant;
import com.pinelabs.repository.MerchantRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

@ComponentScan(basePackages = "com.pinelabs.service")

@Service
public class MerchantService {

    private final MerchantRepository merchantRepository;

    @Autowired
    public MerchantService(MerchantRepository merchantRepository) {
    	System.out.println("here 1");
        this.merchantRepository = merchantRepository;
    }
    public List<MerchantDTO> getAllMerchants() {
        List<Merchant> merchants = merchantRepository.findAll();
        return merchants.stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    private MerchantDTO convertToDTO(Merchant merchant) {
        MerchantDTO merchantDTO = new MerchantDTO();
        merchantDTO.setMerchantId(merchant.getMerchantId());
        merchantDTO.setMerchantName(merchant.getMerchantName());
        merchantDTO.setMerchantMobile(merchant.getMerchantMobile());
        merchantDTO.setMerchantEmail(merchant.getMerchantEmail());
        merchantDTO.setMerchantBusinessCategory(merchant.getMerchantBusinessCategory());
        // Set other properties as needed
        return merchantDTO;
    }

    
    public List<Merchant> searchMerchants(MerchantDTO searchCriteria) {
        // Perform validation or any required business logic here
        
        // Call the repository method with the search criteria
        return merchantRepository.searchMerchants(
            searchCriteria.getMerchantId(),
            searchCriteria.getMerchantName(),
            searchCriteria.getMerchantEmail(),
            searchCriteria.getMerchantMobile(),
            searchCriteria.getMerchantBusinessCategory()
        );
    }

    public Merchant enrollMerchant(MerchantDTO merchantDTO) {
        // Convert MerchantDTO to Merchant entity
        Merchant merchant = new Merchant();
        merchant.setMerchantId(merchantDTO.getMerchantId());
        merchant.setMerchantName(merchantDTO.getMerchantName());
        merchant.setMerchantMobile(merchantDTO.getMerchantMobile());
        merchant.setMerchantEmail(merchantDTO.getMerchantEmail());
        merchant.setMerchantBusinessCategory(merchantDTO.getMerchantBusinessCategory());

        // Save the merchant using the repository
        return merchantRepository.save(merchant);
    }

    // Add more methods for other CRUD operations
    // ...
}
