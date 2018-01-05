package com.wujie.server;

import javax.jws.WebService;

@WebService
public interface TestServerInf {

	public void ping(String pong);
}
