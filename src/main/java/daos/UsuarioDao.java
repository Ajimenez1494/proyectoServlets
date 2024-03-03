package daos;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.persistence.EntityManager;

public class UsuarioDao {
	private static final Logger logger = LogManager.getLogger(UsuarioDao.class);
	private static EntityManager em;

	public UsuarioDao() {
		em = JpaUtil.getEM("hibernateMySQL");
	}

	public UsuarioDao(String persitenceUnitName) {
		em = JpaUtil.getEM("hibernateMySQL");
	}
}
