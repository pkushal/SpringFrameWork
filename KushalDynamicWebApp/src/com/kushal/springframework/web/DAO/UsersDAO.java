package com.kushal.springframework.web.DAO;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("usersDao")
public class UsersDAO {

	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	@Transactional
	public boolean create(User user) {

		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(
				user);

		jdbc.update(
				"insert into users (username, password, email, enabled) values(:username, :password, :email, :enabled)",
				params);
		return jdbc
				.update("insert into authorities (username, authority) values(:username,:authority)",
						params) == 1;

	}

	public boolean exists(String username) {
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("username", username);
		
		return jdbc.queryForObject("select count(*) from users where username=:username", param, Integer.class)>0; 
	}
}
