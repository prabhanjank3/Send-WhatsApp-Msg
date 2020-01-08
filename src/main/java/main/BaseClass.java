package main;

import java.io.IOException;

import exceldataprovider.WhatsappDataProvider;

public class BaseClass {

	protected static WhatsappDataProvider dp;
	public BaseClass() throws IOException {
		dp = new WhatsappDataProvider();
	}
}
