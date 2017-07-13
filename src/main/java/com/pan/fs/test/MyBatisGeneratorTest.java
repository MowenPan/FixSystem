/**
 * @Title: MyBatisGeneratorTest.java
 * @Package: com.pan.fs.test
 * @Description:
 * @Author: Pan
 * @Date: 2017年7月13日
 */
package com.pan.fs.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

/**
 * @ClassName: MyBatisGeneratorTest
 * @Description: 用于生成MyBatis相关配置文件
 * @author Pan
 * @date 2017年7月13日
 *
 */
public class MyBatisGeneratorTest {
	public static void main(String[] args) throws Exception {
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configFile = new File("generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
	}
}
