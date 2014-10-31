package DAO;

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

	// this is the modified setter method for the above JdbcTemplate
	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<Offers> getOffers() {

		/*
		 * MapSqlParameterSource params = new MapSqlParameterSource("name",
		 * "Kushal"); we can also do like: MapSqlParameterSource params = new
		 * MapSqlParameterSource(); params.addValue("name", "Kushal"); And we
		 * can have more than one params with different variables names and
		 * placeholder
		 */

		// return jdbc.query(sql, rowMapper);
		return jdbc.query("select * from offers", new RowMapper<Offers>() {

			public Offers mapRow(ResultSet rs, int rowNum) throws SQLException {
				Offers offer = new Offers();
				offer.setId(rs.getInt("id")); // id is the column name
				// from the // database and so is // name, // email and text
				offer.setName(rs.getString("name"));
				offer.setEmail(rs.getString("email"));
				offer.setText(rs.getString("text"));
				return offer;
			}

		});
	}

	public boolean delete(int id) {

		MapSqlParameterSource params = new MapSqlParameterSource("id", id);
		/*
		 * If you have used the NamedParameterJdbcTemplate and want to use the
		 * methods from the plain JdbcTemplate then do like: *
		 * jdbc.getJdbcOperations().whatevermethodyouwanttouse();
		 */
		return jdbc.update("delete from offers where id=:id", params) == 1;
	}

	public boolean create(Offers offer) {
		// this class is gonna look for properties in the bean which is gonna
		// match the placeholder
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

	/*
	 * @Transactional public int[] create(List<Offers> offer) {
	 * 
	 * SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(offer
	 * .toArray()); return jdbc .batchUpdate(
	 * "insert into offers (id,name, text,email) values(:id, :name,:text,:email)"
	 * , params); }
	 */

	public int[] create(List<Offers> offer) {

		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(offer
				.toArray());
		return jdbc
				.batchUpdate(
						"insert into offers (name, text,email) values(:name,:text,:email)",
						params);
	}

}

/*
 * public Offers getOffers(String name) { MapSqlParameterSource params = new
 * MapSqlParameterSource(); params.addValue("name", name);
 * 
 * 
 * And in the main app we can do like
 * 
 * Offers offer= offersDao.getOffers("Kushal"); System.out.println(offer);
 * 
 * Difference is we have used the queryForObject method to get one object only
 * 
 * 
 * // return jdbc.query(sql, rowMapper); return
 * jdbc.queryForObject("select * from offers where name=:name", params, new
 * RowMapper<Offers>() {
 * 
 * public Offers mapRow(ResultSet rs, int rowNum) throws SQLException { Offers
 * offer = new Offers(); offer.setId(rs.getInt("id")); // id is the column name
 * // from the // database and so is // name, // email and text
 * offer.setName(rs.getString("name")); offer.setEmail(rs.getString("email"));
 * offer.setText(rs.getString("text")); return offer; }
 * 
 * }); }
 */