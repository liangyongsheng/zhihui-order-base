package com.zhihui.order.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.model.OrderModel;

@Repository
public class OrderDao extends DaoBase {
	private String selectText = "select "//
			+ "orderId,partnerId,outerOrderSn,outerOrderName,chainId,roomTypeId,mebId,num,arrEndOfDay, "//
			+ "depEndOfDay,reserveTime,earlyArrTime,lastArrTime,channelSellerId,sellerId, "//
			+ "message,flag,createTime,createOprtId,lastReviseTime,lastReviseOprtId, "//
			+ "innRemark,remark "//
			+ "from `order` ";

	@SuppressWarnings("unchecked")
	@Override
	public OrderModel getById(long id) {
		String sql = this.selectText + " where flag > 0 and orderId = " + id + "";
		List<OrderModel> tmp = this.executeFind(sql, OrderModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

	public List<OrderModel> getByMebId(long mebId) {
		String sql = this.selectText + " where flag > 0 and mebId = " + mebId + "";
		List<OrderModel> tmp = this.executeFind(sql, OrderModel.class);
		return tmp == null ? new ArrayList<OrderModel>() : tmp;
	}
}
