
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {

    private static SessionFactory sessionFactory;

    static {
        try {
            // Create Configuration object
            Configuration configuration = new Configuration();

            // Add annotated class
            configuration.addAnnotatedClass(Employee.class);

            // Set Hibernate properties for Derby
            configuration.setProperty("hibernate.connection.driver_class", "org.apache.derby.jdbc.EmbeddedDriver");
            configuration.setProperty("hibernate.connection.url", "jdbc:derby:HRDB;create=true"); // Creates DB if not exist
            configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.DerbyDialect");
            configuration.setProperty("hibernate.show_sql", "true");
            configuration.setProperty("hibernate.hbm2ddl.auto", "update"); // Creates or updates schema automatically

            // Build SessionFactory
            sessionFactory = configuration.buildSessionFactory();
        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("SessionFactory creation failed!");
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
