package com.demo.system.a.a01.assistant;

import java.io.Serializable;
import java.util.List;

import javax.annotation.ManagedBean;

import com.demo.common.CommonDataModel;
import com.demo.common.entity.Car;

@ManagedBean
public class A01Bag implements Serializable{

	private int activeTabIndex;
	private boolean visableDetailTab=false;

	private CommonDataModel<Car> dataModel;
	private List<Car> carList;

	public int getActiveTabIndex() {
		return activeTabIndex;
	}

	public void setActiveTabIndex(int activeTabIndex) {
		this.activeTabIndex = activeTabIndex;
	}

	public boolean isVisableDetailTab() {
		return visableDetailTab;
	}

	public void setVisableDetailTab(boolean visableDetailTab) {
		this.visableDetailTab = visableDetailTab;
	}

	public CommonDataModel<Car> getDataModel() {
		return dataModel;
	}

	public void setDataModel(CommonDataModel<Car> dataModel) {
		this.dataModel = dataModel;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}



}