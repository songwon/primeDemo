package com.demo.system.a.a01;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;

import org.primefaces.event.TabChangeEvent;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.common.CommonDataModel;
import com.demo.common.entity.Car;
import com.demo.system.a.a01.assistant.A01Bag;

@ManagedBean
@ViewScoped
public class A01Page implements Serializable{

	@Autowired
	private A01Bag bag;

	//TODO init
	@PostConstruct
	public void init() {
		System.out.println(bag.getActiveTabIndex());
		bag.setActiveTabIndex(0);
	}

	public void onTabChange(TabChangeEvent event) {
		if(!Arrays.asList("詳細","新規").contains(event.getTab().getTitle())) {
			bag.setVisableDetailTab(false);
		}
		System.out.println("index:" + bag.getActiveTabIndex());
		System.out.println("index:" + bag.isVisableDetailTab());
	}

	public void doSearch() {
		List<Car> carList = createCars();


	    bag.setDataModel(new CommonDataModel<Car> (carList) );

	    bag.setActiveTabIndex(1);
	}

	public void doDetail() {
		bag.setVisableDetailTab(true);
		bag.setActiveTabIndex(bag.getActiveTabIndex()+1);
	}

	private List<Car> createCars() {
		List<Car> carList = new ArrayList<>();

		for (int i=1; i<= 100; i++) {
			carList.add(new Car((long)i, "車"+ i, 100*i,LocalDate.of(2017,7,7) ));
		}

		return carList;
	}


	//TODO @Autowired
	public A01Bag getBag() {
		return bag;
	}

	public void setBag(A01Bag bag) {
		this.bag = bag;
	}

}