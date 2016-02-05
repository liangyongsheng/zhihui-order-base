package com.zhihui.order.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.model.RoomTypeIndexModel;

@Repository
public class RoomTypeIndexDao extends DaoBase {
	private String selectText = "select roomTypeIndexId,name,createTime,remark from room_type_index ";

	@SuppressWarnings("unchecked")
	@Override
	public RoomTypeIndexModel getById(long id) {
		String sql = this.selectText + " where roomTypeIndexId = " + id + "";
		List<RoomTypeIndexModel> tmp = this.executeFind(sql, RoomTypeIndexModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

	public RoomTypeIndexModel getByName(String name) {
		String sql = this.selectText + " where name = '" + name + "'";
		List<RoomTypeIndexModel> tmp = this.executeFind(sql, RoomTypeIndexModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

	public List<RoomTypeIndexModel> getByCondt(Integer roomTypeIndexId, String nameRelated) {
		List<RoomTypeIndexModel> rs = new ArrayList<RoomTypeIndexModel>();
		String sql = this.selectText + " where 1 = 1 ";
		if (roomTypeIndexId != null)
			sql += "and roomTypeIndexId = " + roomTypeIndexId + " ";
		if (nameRelated != null)
			sql += "and name like '%" + nameRelated + "%' or '" + nameRelated + "' like concat('%',name,'%')";
		List<RoomTypeIndexModel> tmp = this.executeFind(sql, RoomTypeIndexModel.class);
		rs = tmp == null ? rs : tmp;
		return rs;
	}
}
