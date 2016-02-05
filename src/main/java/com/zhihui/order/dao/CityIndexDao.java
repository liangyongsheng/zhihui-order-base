package com.zhihui.order.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.model.CityIndexModel;

@Repository
public class CityIndexDao extends DaoBase {
	private String selectText = "select cityIndexId,name,createTime,remark from city_index ";

	@SuppressWarnings("unchecked")
	@Override
	public CityIndexModel getById(long id) {
		String sql = this.selectText + " where cityIndexId = " + id + "";
		List<CityIndexModel> tmp = this.executeFind(sql, CityIndexModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

	public CityIndexModel getByName(String name) {
		String sql = this.selectText + " where name = '" + name + "'";
		List<CityIndexModel> tmp = this.executeFind(sql, CityIndexModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

	public List<CityIndexModel> getByCondt(Integer cityIndexId, String nameRelated) {
		List<CityIndexModel> rs = new ArrayList<CityIndexModel>();
		String sql = this.selectText + " where  1 = 1 ";
		if (cityIndexId != null)
			sql += "and cityIndexId = " + cityIndexId + " ";
		if (nameRelated != null)
			sql += "and name like '%" + nameRelated + "%' or '" + nameRelated + "' like concat('%',name,'%')";
		List<CityIndexModel> tmp = this.executeFind(sql, CityIndexModel.class);
		rs = tmp == null ? rs : tmp;
		return rs;
	}
}
