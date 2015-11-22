package com.ukmaSupport.dao.impl;

import com.ukmaSupport.dao.interfaces.RoleDao;
import com.ukmaSupport.models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component("roleDao")
public class RoleDaoImpl implements RoleDao {

    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public Role getById(int id) {
        String sql = "SELECT role FROM user_roles WHERE id = :id";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);

        return jdbcTemplate.queryForObject(sql, params, new RoleRowMapper());
    }

    @Override
    public int save(Role role) {
        String sql = "INSERT INTO user_roles (role) VALUE (:role)";

        KeyHolder keyHolder = new GeneratedKeyHolder();

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("role", role.getRole());

        jdbcTemplate.update(sql, params, keyHolder);

        return keyHolder.getKey().intValue();
    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM user_roles WHERE id = :id";

        MapSqlParameterSource params = new MapSqlParameterSource();
        params.addValue("id", id);

        jdbcTemplate.update(sql, params);
    }

    @Override
    public void delete(Role role) {
        delete(role.getId());
    }

    private static final class RoleRowMapper implements RowMapper<Role> {

        public Role mapRow(ResultSet rs, int rowNum) throws SQLException {
            Role role = new Role();
            role.setId(rs.getInt("id"));
            role.setRole(rs.getString("name"));
            return role;
        }

    }

}
