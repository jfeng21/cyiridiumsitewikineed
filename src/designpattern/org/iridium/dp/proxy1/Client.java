package org.iridium.dp.proxy1;

public class Client {

	public static void main(String[] args) {
		Subject helo = new Proxy();
		helo.doAction();
	}

}
