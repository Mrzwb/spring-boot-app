package com.chinauicom.bluesky.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * 基础属性配置
 *
 * @author zhouwb 2017-11-16
 *
 */
@Configuration
@ConfigurationProperties(prefix = "spring.cu")
public class BaseConfig {
	private List<String> servers = new ArrayList<String>();

	public List<String> getServers() {
		return this.servers;
	}

	@Value("@{spring.cu.port}")
	private String port;

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

}
