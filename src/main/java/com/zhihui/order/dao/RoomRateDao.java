package com.zhihui.order.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.model.RoomRateModel;

@Repository
public class RoomRateDao extends DaoBase {
	private String selectText = "select "//
			+ "roomRateId,partnerId,chainId,roomTypeId,outerRoomrateSn,outerRoomrateName, "//
			+ "endOfDay,retailPrice,price,quota, "//
			+ "createTime,createOprtId,lastReviseTime,lastReviseOprtId,remark "//
			+ "from room_rate ";

	@SuppressWarnings("unchecked")
	@Override
	public RoomRateModel getById(long id) {
		String sql = this.selectText + " where roomRateId = " + id + "";
		List<RoomRateModel> tmp = this.executeFind(sql, RoomRateModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

	public RoomRateModel getByRoomTypeIdEndOfDay(int partnerId, int chainId, int roomTypeId, Date endDfDay) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String sql = this.selectText + " where partnerId = " + partnerId //
				+ " and chainId = " + chainId //
				+ " and roomTypeId = " + roomTypeId //
				+ " and endOfDay = '" + df.format(endDfDay) + "'";
		List<RoomRateModel> tmp = this.executeFind(sql, RoomRateModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

	public List<RoomRateModel> getCondt() {
		List<RoomRateModel> rs = new ArrayList<RoomRateModel>();
		return rs;
	}
}
