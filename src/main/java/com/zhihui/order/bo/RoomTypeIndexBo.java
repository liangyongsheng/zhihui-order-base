package com.zhihui.order.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.dao.RoomTypeIndexDao;
import com.zhihui.order.model.RoomTypeIndexModel;

@Service
public class RoomTypeIndexBo extends BoBase {
	@Autowired
	private RoomTypeIndexDao roomTypeIndexDao;

	@Override
	public DaoBase getDao() {
		return this.roomTypeIndexDao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public RoomTypeIndexModel getById(long id) {
		return this.roomTypeIndexDao.getById(id);
	}

	public List<RoomTypeIndexModel> getByCondt(Integer roomTypeIndexId, String nameRelated) {
		return this.roomTypeIndexDao.getByCondt(roomTypeIndexId, nameRelated);
	}

}
