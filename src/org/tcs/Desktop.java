package org.tcs;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop size: 14'");
	}
	public static void main(String[] args) {
		Desktop d= new Desktop();
		d.computerModel();
		d.desktopSize();
	}

}
