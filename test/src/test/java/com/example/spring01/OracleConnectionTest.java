package com.example.spring01;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OracleConnectionTest {
	/*오라클 연동 구문
	root-context.xml에서도 바꿔즘 */
	private static final Logger logger = LoggerFactory.getLogger(OracleConnectionTest.class);
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin@localhost:1521/orcl";
	private static final String USER = "spring";
	private static final String PW = "1234";
	
	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);
		try(Connection conn = DriverManager.getConnection(URL,USER,PW)) {
			logger.info("오라클에 연결되었습니다");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
