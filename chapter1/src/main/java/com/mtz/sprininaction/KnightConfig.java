package com.mtz.sprininaction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class KnightConfig {
	
	@Bean
	public Knight knight() {
		return new IronKnight(quest());
	}
	
	@Bean
	public Quest quest() {
		return new DragonQuest(System.out);
	}
	
	@Bean
	public SingForKnight singForKnight() {
		return new SingForKnight(System.out);
	}
	
	public KnightAspect knightAspect() {
		return new KnightAspect();
	}
}
