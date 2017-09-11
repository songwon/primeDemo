package com.demo.system.a.a01;

import java.awt.Event;

import javax.annotation.ManagedBean;
import javax.faces.view.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.system.a.a01.assistant.A01Bag;

@ManagedBean
@ViewScoped
public class A01Page {

	@Autowired
	private A01Bag bag;

	//TODO init
//	@PostConstruct
//	public void init() {
//		System.out.println(bag.getActiveTabIndex());
//		bag.setActiveTabIndex(0);
//	}


	public void onTabChange(Event e) {
		int index = bag.getActiveTabIndex();
		System.out.println(index);
	}

	//TODO @Autowired
	public A01Bag getBag() {
		return bag;
	}

	public void setBag(A01Bag bag) {
		this.bag = bag;
	}

}