package daos;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import entities.Usuario;
import entities.UsuarioEnum;
import jakarta.persistence.EntityManager;
import utils.JpaUtils;

public class UsuarioDao {
	private static final Logger logger = LogManager.getLogger(UsuarioDao.class);
	private static EntityManager em;

	public UsuarioDao() {
		em = JpaUtils.getEM("hibernateMySQL");
	}

	public UsuarioDao(String persitenceUnitName) {
		em = JpaUtils.getEM("hibernateMySQL");
	}
	public static void cargaInicial() {
		logger.debug("Empezando carga inicial de datos");

		UsuarioEnum[] usuarioEnum = UsuarioEnum.values();
		try {
			em.getTransaction().begin();
			for (UsuarioEnum users : usuarioEnum) {
				Usuario usuario = new Usuario(users.getNombre(), 
						users.getApellidos(), 
						users.getDni(),
						users.getUser(), 0, null, null, 0, null);
				em.persist(usuario);
			}
			em.getTransaction().commit();

		} catch (Exception e) {
			logger.error("Error al insertar usuarios " + e.getMessage());
			em.getTransaction().rollback();
		}

		logger.debug("Termina");
	}
	public static List<Usuario> listarUsuarios() {
		logger.debug("Listando usuarios");
		List<Usuario> usuarios = em.createQuery("from Usuario", Usuario.class).getResultList();
		usuarios.forEach(usuario -> logger.trace(usuario));// Método Referencia

		logger.debug("Numero de alumnos" + usuarios.size());
		return usuarios;
	}
	
	public static Usuario buscarPorId(Long id) {
		logger.debug("buscarPorId " + id);
		Usuario usuario = em.find(Usuario.class, id);

		logger.debug("Usuario encontrado " + usuario);
		return usuario;
	}


}
