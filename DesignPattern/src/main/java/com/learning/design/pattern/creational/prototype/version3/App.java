package com.learning.design.pattern.creational.prototype.version3;

import java.util.ArrayList;
import java.util.List;

public class App {

	public  static void main(String[] arg) {
		F16 f16 = new F16(new ArrayList<>());
		f16.loadData();
		
		F16 newF16 = (F16)f16.clone();
		List<String> newActions = newF16.getActions();
		newActions.add("new Action Added");
	}
}
