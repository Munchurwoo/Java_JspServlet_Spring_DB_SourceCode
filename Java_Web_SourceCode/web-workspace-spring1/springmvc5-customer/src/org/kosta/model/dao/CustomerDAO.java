package org.kosta.model.dao;

import java.util.List;

import org.kosta.model.vo.CustomerVO;

public interface CustomerDAO {
	public CustomerVO findCustomerById(String id);

	public List<CustomerVO> findCustomerByAddress(String address);

	public void registerCustomer(CustomerVO vo);
}
