package com.zhihui.order.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.dao.CityIndexDao;
import com.zhihui.order.model.CityIndexModel;

@Service
public class CityIndexBo extends BoBase {
	@Autowired
	private CityIndexDao cityIndexDao;

	@Override
	public DaoBase getDao() {
		return this.cityIndexDao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public CityIndexModel getById(long id) {
		return this.cityIndexDao.getById(id);
	}

	public List<CityIndexModel> getByCondt(Integer cityIndexId, String nameRelated) {
		return this.cityIndexDao.getByCondt(cityIndexId, nameRelated);
	}

}
