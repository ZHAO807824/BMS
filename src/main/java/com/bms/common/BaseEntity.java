package com.bms.common;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 通用实体类
 * 
 * @author zhao
 *
 */
public abstract class BaseEntity {
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 工具方法
	 * 
	 * @param list
	 *            实体集合
	 * @return Map<ID,Entity>
	 */
	public static <T extends BaseEntity> Map<Long, T> idEntityMap(Collection<T> list) {
		Map<Long, T> map = new HashMap<Long, T>();
		if (null == list || 0 == list.size()) {
			return map;
		}
		for (T entity : list) {
			map.put(entity.getId(), entity);
		}
		return map;
	}

	
	@Override
	public String toString() {
		return "BaseEntity [id=" + id + "]";
	}

}
