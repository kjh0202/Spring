package com.product.spring.model.shop.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.product.spring.model.shop.dto.ProductDTO;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<ProductDTO> listProduct() {
		return sqlSession.selectList("product.list_product");
		//product 와 list_product는 mapper의 이름임.
	}

	@Override
	public ProductDTO detailProduct(int product_id) {
		return null;
	}

	@Override
	public void updateProduct(ProductDTO dto) {
	}

	@Override
	public void deleteProduct(int product_id) {
	}

	@Override
	public void insertProduct(ProductDTO dto) {
	}

	@Override
	public String fileInfo(int product_id) {
		return null;
	}

}
