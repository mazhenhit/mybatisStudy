/**
 * @file_name: SqlSessionFactory.java
 */
package com.zhenma.xmlsqlsessionfactory;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * @author: Mz
 * @time: 2016年11月13日-下午8:44:33
 * @Description: 从 XML 中构建 SqlSessionFactory
 */
public class XmlSqlSessionFactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String resource = "config/config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

		SqlSession session = sqlSessionFactory.openSession();
		MsgInfo msgInfo = null;

		try {
			msgInfo = (MsgInfo) session.selectOne("com.zhenma.xmlsqlsessionfactory.MsgInfoMapper.selectMsgInfo", 1);
			System.out.println(msgInfo.toString());
		} finally {
			session.close();
		}
	}

}
