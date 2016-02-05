package com.zhihui.order.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.model.OrderPriceModel;

@Repository
public class OrderPriceDao extends DaoBase {
	private String selectText = " select "//
			+ "orderPriceId,orderId,endOfDay,price, "//
			+ "createTime,createOprtId,lastReviseTime,lastReviseOprtId,remark "//
			+ "from order_price ";

	@SuppressWarnings("unchecked")
	@Override
	public OrderPriceModel getById(long id) {
		String sql = this.selectText + " where orderPriceId = " + id + "";
		List<OrderPriceModel> tmp = this.executeFind(sql, OrderPriceModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}
}
