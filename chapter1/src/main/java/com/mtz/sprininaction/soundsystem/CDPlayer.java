package com.mtz.sprininaction.soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component("mybean") // this is used to change bean default name
@Qualifier("mycd") // this is used for qualifiers
@Primary
@PropertySource("classpath:application.properties")
//@Scope(ConfigurableBeanFactory)
public class CDPlayer implements CompactDisc {
	private String title ="Playing Amr Diab New Songs!!";
	private DependancyInterface di ;
	@Autowired
	private Environment env;
	@Value("${test.welcome}") String m;
	
	@Autowired
	public CDPlayer(DependancyInterface di) {
		this.di = di;
	}
	
	@Override
	public void play() {
//		System.out.println(title);
		di.doSomthing();
	}
	
	public void test() {
		System.out.println(env.getProperty("test.welcome"));
//		System.out.println(m);
	}
	
}
