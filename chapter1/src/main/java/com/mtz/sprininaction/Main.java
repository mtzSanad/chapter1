package com.mtz.sprininaction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy(proxyTargetClass=true)
public class Main {

	public static void main(String[] args) {
		//Normal way without any configration
		DragonQuest dragonQuest = new DragonQuest(System.out);
		IronKnight ironKnight = new IronKnight(dragonQuest);
		ironKnight.fight();
		
		//Using configuration class
		KnightConfig knightConfig = new KnightConfig();
		knightConfig.knight().fight();
		
		//Using spring application context
		AnnotationConfigApplicationContext knightApplicationContent = new AnnotationConfigApplicationContext(knightConfig.getClass());
		Knight knight = knightApplicationContent.getBean(Knight.class);
		knight.fight();
		Quest quest = knightApplicationContent.getBean(Quest.class);
		quest.printQuest();

		knightApplicationContent.close();

	}

}
