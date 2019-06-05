package com.product.spring.model.shop.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.product.spring.model.shop.dao.ProductDAO;
import com.product.spring.model.shop.dto.ProductDTO;

@Service
public class ProductServiceImpl implements ProductService {

	@Inject
	ProductDAO productDao;
	
	@Override
	public List<ProductDTO> listProduct() {
		return productDao.listProduct();
	}

	@Override
	public ProductDTO detailProduct(int product_id) {
		return null;
	}

	@Override
	public void updateProduct(ProductDTO dto) {

	}

	@Override
	public void deleteProduct(ProductDTO dto) {

	}

	@Override
	public void insertProduct(ProductDTO dto) {

	}

	@Override
	public String fileInfo(int product_id) {
		return null;
	}

}
