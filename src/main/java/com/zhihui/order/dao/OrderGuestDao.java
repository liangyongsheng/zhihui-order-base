package com.zhihui.order.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.model.OrderGuestModel;

@Repository
public class OrderGuestDao extends DaoBase {
	private String selectText = " select "//
			+ "orderGuestId,orderId,contactName,contactGender,contactMobile, "//
			+ "createTime,createOprtId,lastReviseTime,lastReviseOprtId,remark "//
			+ "from order_guest ";

	@SuppressWarnings("unchecked")
	@Override
	public OrderGuestModel getById(long id) {
		String sql = this.selectText + " where orderGuestId = " + id + "";
		List<OrderGuestModel> tmp = this.executeFind(sql, OrderGuestModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

	public List<OrderGuestModel> getByOrderId(long orderId) {
		String sql = this.selectText + " where orderId = " + orderId + "";
		List<OrderGuestModel> tmp = this.executeFind(sql, OrderGuestModel.class);
		return tmp == null ? new ArrayList<OrderGuestModel>() : tmp;
	}
}
