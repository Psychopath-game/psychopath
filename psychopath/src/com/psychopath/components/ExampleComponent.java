package com.psychopath.components;

import com.psychopath.ces.Component;

public class ExampleComponent extends Component {
	String name = "Name";
	
	public String getName(){
		return name;
	}
	
	public void setName(String n){
		name = n;
	}
}
