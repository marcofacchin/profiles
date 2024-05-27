package be.vdab.profiles;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import javax.sql.DataSource;

@DataJpaTest
public class DataSourceTest {
    private final DataSource dataSource;

    public DataSourceTest(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Test
    void databaseNaam() throws Exception {
        try (var connection = dataSource.getConnection()) {
            System.out.println(connection.getCatalog());
        }
    }
}
