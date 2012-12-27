package org.iridium.dp.decorator;

public class Car {
	// 启动
	public void init() {
		System.out.println("汽车启动了");
	}

	// 刹车
	public void stop() {
		System.out.println("刹车");
	}

	// “汽车”本身还有其他很多方法，暂就不写了。
}
