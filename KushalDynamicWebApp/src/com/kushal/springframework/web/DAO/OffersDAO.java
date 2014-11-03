package com.kushal.springframework.web.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("offersDao")
public class OffersDAO {

	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<Offers> getOffers() {

		return jdbc.query("select * from offers", new RowMapper<Offers>() {

			public Offers mapRow(ResultSet rs, int rowNum) throws SQLException {
				Offers offer = new Offers();
				offer.setId(rs.getInt("id"));
				offer.setName(rs.getString("name"));
				offer.setEmail(rs.getString("email"));
				offer.setText(rs.getString("text"));
				return offer;
			}

		});
	}

	public boolean delete(int id) {

		MapSqlParameterSource params = new MapSqlParameterSource("id", id);

		return jdbc.update("delete from offers where id=:id", params) == 1;
	}

	public boolean create(Offers offer) {

		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(
				offer);
		return jdbc
				.update("insert into offers (name, text,email) values(:name,:text,:email)",
						params) == 1;

	}

	public boolean update(Offers offer) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(
				offer);

		return jdbc
				.update("update offers set name=:name, email=:email, text=:text where id=:id",
						params) == 1;
	}

	public int[] create(List<Offers> offer) {

		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(offer
				.toArray());
		return jdbc
				.batchUpdate(
						"insert into offers (name, text,email) values(:name,:text,:email)",
						params);
	}

}
