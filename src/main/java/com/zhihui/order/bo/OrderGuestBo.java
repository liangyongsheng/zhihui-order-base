package com.zhihui.order.bo;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.dao.OrderGuestDao;
import com.zhihui.order.model.OrderGuestModel;

@Service
public class OrderGuestBo extends BoBase {
	@Autowired
	private OrderGuestDao orderGuestDao;

	@Override
	public DaoBase getDao() {
		return this.orderGuestDao;
	}

	@SuppressWarnings("unchecked")
	@Override
	public OrderGuestModel getById(long id) {
		return this.orderGuestDao.getById(id);
	}

	public OrderGuestModel add(OrderGuestModel orderGuestModel) {
		if (orderGuestModel.getContactGender() == null)
			orderGuestModel.setContactGender(1);
		if (orderGuestModel.getLastReviseTime() == null)
			orderGuestModel.setLastReviseTime(new Timestamp((new Date()).getTime()));
		if (orderGuestModel.getLastReviseOprtId() == null)
			orderGuestModel.setLastReviseOprtId(orderGuestModel.getCreateOprtId());
		this.orderGuestDao.add(orderGuestModel);
		return orderGuestModel;
	}

	public OrderGuestModel update(OrderGuestModel orderGuestModel) {
		orderGuestModel.setLastReviseTime(new Timestamp((new Date()).getTime()));
		this.orderGuestDao.update(orderGuestModel);
		return orderGuestModel;
	}

	public List<OrderGuestModel> getByOrderId(long orderId) {
		return this.orderGuestDao.getByOrderId(orderId);
	}
}
