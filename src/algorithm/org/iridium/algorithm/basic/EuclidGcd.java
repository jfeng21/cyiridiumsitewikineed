package org.iridium.algorithm.basic;

public class EuclidGcd {

	public static void main(String[] args) {
		EuclidGcd e = new EuclidGcd();
		System.out.println(e.calculateGcd(20, 30));
		System.out.println(e.calculateGcd2(20, 30));
	}

	//非遞歸實現
	int calculateGcd(int m, int n) {
		if (m < n) {
			int a = m;
			m = n;
			n = a;
		}
		int r = m % n;
		while (r != 0) {
			m = n;
			n = r;
			r = m % n;
		}
		return n;
	}

	//遞歸實現
	int calculateGcd2(int m, int n) {
		if (m < n) {
			int a = m;
			m = n;
			n = a;
		}
		int r = m % n;
		if (r != 0) {
			m = n;
			n = r;
			r = calculateGcd2(m, n);
		}
		return n;
	}
}
