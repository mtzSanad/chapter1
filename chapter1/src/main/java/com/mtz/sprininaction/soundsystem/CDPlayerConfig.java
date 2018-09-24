package com.mtz.sprininaction.soundsystem;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan
//ComponentScan(basePackages={"soundsystem", "video"})
//ComponentScan(basePackages={CDplayerConfig.class})
//This files is a configuration file for non boot application, this is used inested of XML 
//This files makes spring search in this package and any sub package for any class annotated with @component, @service, @Repository
public class CDPlayerConfig {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
	

		CDPlayer cd  = ctx.getBean(CDPlayer.class);
//		CDPlayer cd  = (CDPlayer) ctx.getBean("mybean");
		cd.play();
		cd.test();
	}
}
