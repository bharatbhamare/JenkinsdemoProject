package com.example.Jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.jmx.export.MBeanExporter;

@SpringBootApplication
public class JenkinsdemoApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(JenkinsdemoApplication.class, args);
	}
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(JenkinsdemoApplication.class);
    }

  @Bean
	 public MBeanExporter exporter()
	 {
	     final MBeanExporter exporter = new MBeanExporter();
	     exporter.setAutodetect(true);
	     exporter.setExcludedBeans("dataSource");
	     return exporter;
	 }
}
