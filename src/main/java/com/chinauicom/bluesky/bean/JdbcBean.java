package com.chinauicom.bluesky.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class JdbcBean extends Aware<JdbcTemplate>{

	@Autowired
	public JdbcBean(JdbcTemplate jdbcTemplate) {
		super(jdbcTemplate);
	}

}
