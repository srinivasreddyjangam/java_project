package com.example.hotel_management_project.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.example.hotel_management_project.dto.PaymentDetails;
import com.example.hotel_management_project.entity.PaymentDetailsEntity;

@Component
public class PaymentDetailsModelMapper {
	
private final ModelMapper modelMapper = new ModelMapper();
	
	public PaymentDetails convertToDto(PaymentDetailsEntity entity) {
		return modelMapper.map(entity, PaymentDetails.class);
	}
	
	public PaymentDetailsEntity convertToEntity(PaymentDetails dto) {
		return modelMapper.map(dto, PaymentDetailsEntity.class);
	}

}
