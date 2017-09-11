package com.demo.common;

import java.util.List;

import javax.faces.model.ListDataModel;

import org.primefaces.model.SelectableDataModel;

import com.demo.common.entity.IdEntity;

public class CommonDataModel<T extends IdEntity> extends ListDataModel<T> implements SelectableDataModel<T> {

	public CommonDataModel(List<T> data) {
		super((List<T>)data);
	}

	@Override
	public T getRowData(String key) {
		List<T> entities = (List<T>) getWrappedData();
		long id = Long.parseLong(key);
		for (T entity : entities) {
			if (entity.getId() == id ) {
				return (T) entity;
			}
		}
		return null;
	}

	@Override
	public Object getRowKey(T entity) {
		return entity.getId();
	}
}
