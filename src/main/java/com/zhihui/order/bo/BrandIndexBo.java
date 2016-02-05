package com.zhihui.order.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.dao.BrandIndexDao;
import com.zhihui.order.model.BrandIndexModel;

@Service
public class BrandIndexBo extends BoBase {
	@Autowired
	private BrandIndexDao brandIndexDao;

	@Override
	public DaoBase getDao() {
		return this.brandIndexDao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public BrandIndexModel getById(long id) {
		return this.brandIndexDao.getById(id);
	}

	public List<BrandIndexModel> getByCondt(Integer brandIndexId, String nameRelated) {
		return this.brandIndexDao.getByCondt(brandIndexId, nameRelated);
	}

}
