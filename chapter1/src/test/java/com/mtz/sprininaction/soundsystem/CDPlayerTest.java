package com.mtz.sprininaction.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={CDPlayerConfig.class})
//@ActiveProfiles("dev")
public class CDPlayerTest {

	@Rule
	public final StandardOutputStreamLog log =new StandardOutputStreamLog();
	
//	@Qualifier("mybean") // this will also work bean name or bean qualifier
	@Autowired
	@Qualifier("mycd") // use the qualifier or @Primary in bean it self
	private CompactDisc cd;
//	private CompactDisc cd = new CDPlayer(new DependanceImplementation()); Autowire do this	
	
	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void play() {
		cd.play();
		assertEquals("Calling a dependancy!!!", log.getLog());
		
	}
}
