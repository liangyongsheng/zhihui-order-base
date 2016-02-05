package com.zhihui.order.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.model.BrandIndexModel;

@Repository
public class BrandIndexDao extends DaoBase {
	private String selectText = "select brandIndexId,name,createTime,remark from city_index ";

	@SuppressWarnings("unchecked")
	@Override
	public BrandIndexModel getById(long id) {
		String sql = this.selectText + " where brandIndexId = " + id + "";
		List<BrandIndexModel> tmp = this.executeFind(sql, BrandIndexModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

	public BrandIndexModel getByName(String name) {
		String sql = this.selectText + " where name = '" + name + "'";
		List<BrandIndexModel> tmp = this.executeFind(sql, BrandIndexModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

	public List<BrandIndexModel> getByCondt(Integer brandIndexId, String nameRelated) {
		List<BrandIndexModel> rs = new ArrayList<BrandIndexModel>();
		String sql = this.selectText + " where  1 = 1 ";
		if (brandIndexId != null)
			sql += "and brandIndexId = " + brandIndexId + " ";
		if (nameRelated != null)
			sql += "and name like '%" + nameRelated + "%' or '" + nameRelated + "' like concat('%',name,'%')";
		List<BrandIndexModel> tmp = this.executeFind(sql, BrandIndexModel.class);
		rs = tmp == null ? rs : tmp;
		return rs;
	}

}
