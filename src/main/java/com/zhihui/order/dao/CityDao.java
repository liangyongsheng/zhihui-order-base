package com.zhihui.order.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zhihui.core.hibernate.DaoBase;
import com.zhihui.order.model.CityModel;

@Repository
public class CityDao extends DaoBase {
	private String selectText = "select "//
			+ "cityId,partnerId,outerCitySn,outerCityName, cityIndexId, "//
			+ "createTime,createOprtId,lastReviseTime,lastReviseOprtId,remark "//
			+ "from city ";

	@SuppressWarnings("unchecked")
	@Override
	public CityModel getById(long id) {
		String sql = this.selectText + " where id = " + id + "";
		List<CityModel> tmp = this.executeFind(sql, CityModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}

	public List<CityModel> getByPartnerId(int partnerId) {
		// XXX 记得
		String sql = this.selectText + " where partnerId = " + partnerId + " and cityId = 7";
		List<CityModel> rs = this.executeFind(sql, CityModel.class);
		return rs;
	}

	public CityModel getByOuterCitySn(int parnterId, String outerCitySn) {
		String sql = this.selectText + " where partnerId = " + parnterId + " and outerCitySn = '" + outerCitySn + "'";
		List<CityModel> tmp = this.executeFind(sql, CityModel.class);
		if (tmp == null || tmp.size() <= 0)
			return null;
		else
			return tmp.get(0);
	}
}
