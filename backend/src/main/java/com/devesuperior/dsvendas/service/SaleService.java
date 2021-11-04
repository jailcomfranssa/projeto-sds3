package com.devesuperior.dsvendas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devesuperior.dsvendas.dto.SaleDTO;
import com.devesuperior.dsvendas.dto.SaleSuccessDTO;
import com.devesuperior.dsvendas.dto.SaleSumDTO;
import com.devesuperior.dsvendas.entities.Sale;
import com.devesuperior.dsvendas.repositories.SaleRepository;
import com.devesuperior.dsvendas.repositories.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repository;
	@Autowired
	private SellerRepository sellerRepository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageble){
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageble);
		return result.map(x -> new SaleDTO(x));
		
	}
	
	@Transactional(readOnly = true)
	public List<SaleSumDTO> amountGroupedBySeller() {
		return repository.amountGroupedBySeller();
	}
	
	@Transactional(readOnly = true)
	public List<SaleSuccessDTO> successGroupedBySeller() {
		return repository.successGroupedBySeller();
	}

}





























