package main.anotherpackage;

import util.InjectableClass;

public class OnlyInjectable {

	InjectableClass injectable;
	
	public OnlyInjectable(InjectableClass injectable) {
		this.injectable = injectable;
	}
}
