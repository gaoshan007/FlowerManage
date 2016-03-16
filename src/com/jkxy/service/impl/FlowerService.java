package com.jkxy.service.impl;

import java.util.List;

import com.jkxy.dao.IFlowerDAO;
import com.jkxy.model.Flower;
import com.jkxy.service.IFlowerService;

public class FlowerService implements IFlowerService{
	private IFlowerDAO flowerDAO;
	

	public IFlowerDAO getFlowerDAO() {
		return flowerDAO;
	}


	public void setFlowerDAO(IFlowerDAO flowerDAO) {
		this.flowerDAO = flowerDAO;
	}


	@Override
	public List getNewFlower() {
		return flowerDAO.getNewFlower();
	}


	@Override
	public List getFlowerByCatalogidPaging(int catalogid, int currentPage,
			int pageSize) {
		
		return flowerDAO.getFlowerByCatalogidPaging(catalogid, currentPage, pageSize);
	}


	@Override
	public int getTotalByCatalog(int catalogid) {
		return flowerDAO.getTotalByCatalog(catalogid);
	}


	@Override
	public Flower getFlowerById(int id) {
		return flowerDAO.getFlowerById(id);
	}


	@Override
	public boolean addOrUpdateFlower(Flower flower) {
		return flowerDAO.addOrUpdateFlower(flower);
	}


	@Override
	public List getAllFlower() {
		return flowerDAO.getAllFlower();
	}


	@Override
	public boolean deleteFlowerById(int id) {
		return flowerDAO.deleteFlowerById(id);
	}

}
