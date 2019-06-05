package com.product.spring.model.shop.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.product.spring.model.shop.dto.ProductDTO;

@Repository
public class ProductDAOImpl implements ProductDAO {

	/* 의존성 주입 */
	@Inject
	SqlSession sqlSession;
	
	@Override
	public List<ProductDTO> listProduct() {
		return sqlSession.selectList("product.list_product");
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
