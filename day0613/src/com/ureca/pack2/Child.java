package com.ureca.pack2;

import com.ureca.pack1.Parent;

public class Child extends Parent{
	void callTest() {
		super.m1();
		m1();
		m2();
//		m3();
//		m4();
	}
}
