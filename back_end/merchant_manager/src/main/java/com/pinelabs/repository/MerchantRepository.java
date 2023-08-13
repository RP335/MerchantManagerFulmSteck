package com.pinelabs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pinelabs.model.Merchant;


//MerchantRepository.java
@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long> {
	@Query("SELECT m FROM Merchant m WHERE "
		       + "(:merchant_id IS NULL OR m.merchantId = :merchant_id) "
		       + "AND (:merchant_name IS NULL OR m.merchantName LIKE %:merchant_name%) "
		       + "AND (:merchant_email IS NULL OR m.merchantEmail LIKE %:merchant_email%) "
		       + "AND (:merchant_mobile IS NULL OR m.merchantMobile LIKE %:merchant_mobile%) "
		       + "AND (:merchant_business_category IS NULL OR m.merchantBusinessCategory LIKE %:merchant_business_category%)")
		List<Merchant> searchMerchants(
		    @Param("merchant_id") Integer merchantId,
		    @Param("merchant_name") String merchantName,
		    @Param("merchant_email") String merchantEmail,
		    @Param("merchant_mobile") String merchantMobile,
		    @Param("merchant_business_category") String merchantBusinessCategory
		);


}