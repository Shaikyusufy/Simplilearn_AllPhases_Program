package com.hibernate.pro;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.product.EProduct;

public class HibernateUtill {

		public static SessionFactory beginSessionFactory() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(EProduct.class);
		
		
		//Step 2
		SessionFactory sf = cfg.buildSessionFactory();
		return sf;
		
	}
	}


