package com.zhihui.order.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.model.RoomTypeModel;

@Repository
public class RoomTypeDao extends DaoBase {
	private String selectText = "select "//
			+ "roomTypeId,partnerId,chainId,outerRoomTypeSn,outerRoomTypeName,roomTypeIndexId, "//
			+ "createTime,createOprtId,lastReviseTime,lastReviseOprtId,remark "//
			+ "from room_type ";

	@SuppressWarnings("unchecked")
	@Override
	public RoomTypeModel getById(long id) {
		String sql = this.selectText + " where roomTypeId = " + id + "";
		List<RoomTypeModel> tmp = this.executeFind(sql, RoomTypeModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

	public RoomTypeModel getByOuterRoomTypeSn(int parnterId, int chainId, String outerRoomTypeSn) {
		String sql = this.selectText + " where partnerId = " + parnterId + " and chainId = " + chainId + " and outerRoomTypeSn = '" + outerRoomTypeSn + "'";
		List<RoomTypeModel> tmp = this.executeFind(sql, RoomTypeModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

}
