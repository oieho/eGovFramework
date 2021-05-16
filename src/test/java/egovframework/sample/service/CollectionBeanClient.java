package egovframework.sample.service;

import java.util.Properties;
import java.util.Set;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import egovframework.sample.service.impl.CollectionBean;

public class CollectionBeanClient {
	public static void main(String[] args) throws Exception {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("egovframework/spring/context-common.xml");
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		Properties addressList = bean.getAddressList();
		System.out.println("< 주소 목록 >");
		Set<Object> keys = addressList.keySet();
		for (Object key : keys) {
			System.out.println(key + "의 주소 : " + addressList.get(key));
		}
		factory.close();
	}

}
