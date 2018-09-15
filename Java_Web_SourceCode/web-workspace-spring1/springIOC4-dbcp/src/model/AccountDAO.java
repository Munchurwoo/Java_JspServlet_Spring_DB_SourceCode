package model;

import javax.sql.DataSource;

public interface AccountDAO {

	void setDataSource(DataSource dataSource);

	AccountVO findAccountById(String id);

}