package com.zhihui.order.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.dao.RoomRateDao;
import com.zhihui.order.model.RoomRateModel;

@Service
public class RoomRateBo extends BoBase {
	@Autowired
	private RoomRateDao roomRateDao;

	@Override
	public DaoBase getDao() {
		return this.roomRateDao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public RoomRateModel getById(long id) {
		return this.roomRateDao.getById(id);
	}

	public List<RoomRateModel> getCondt() {
		return this.roomRateDao.getCondt();
	}

}
