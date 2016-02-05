package com.zhihui.order.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.dao.ChainDao;
import com.zhihui.order.model.ChainModel;

@Service
public class ChainBo extends BoBase {
	@Autowired
	private ChainDao chainDao;

	@Override
	public DaoBase getDao() {
		return this.chainDao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ChainModel getById(long id) {
		return this.chainDao.getById(id);
	}

	public List<ChainModel> getByCondt(Integer brandId, Integer cityId, Integer chainId, String nameRelated) {
		return this.chainDao.getByCondt(brandId, cityId, chainId, nameRelated);
	}
}
