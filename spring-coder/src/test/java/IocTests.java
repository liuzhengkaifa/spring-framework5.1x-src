import com.lz.coder.UserBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Properties;

import static org.springframework.context.ConfigurableApplicationContext.CONFIG_LOCATION_DELIMITERS;

/**
 * @author liuzheng
 * @date 2022年07月26日 9:33
 * @Description TODO
 */
public class IocTests {

	/**
	 * refresh:550, AbstractApplicationContext
	 *  AbstractApplicationContext#refresh()
	 *
	 */

	@Test
	public void testIoc(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		UserBean bean = applicationContext.getBean(UserBean.class);
		System.out.println("bean = " + bean);
	}

	@Test
	public void testResource(){

		String[] strings = StringUtils.tokenizeToStringArray("classpath:application-context.xml---classpath:application-others.xml", CONFIG_LOCATION_DELIMITERS);
		for (int i = 0; i < strings.length; i++) {
			System.out.println("i = " + strings[i]);
		}
	}

}
