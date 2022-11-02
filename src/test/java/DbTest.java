import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import pl.enderqube.shared.model.DbModule;
import pl.enderqube.shared.model.User;
import pl.enderqube.shared.repository.UserRepository;

import java.sql.SQLException;

public class DbTest {

    @Test
    public void testDb() throws SQLException {
        Injector injector = Guice.createInjector(new DbModule());
        UserRepository userRepo = injector.getInstance(UserRepository.class);

        User example = new User();
        example.setId(1L);
        example.setName("AAAA");

        var retrieved = userRepo.find(1L).orElse(null);

        Assert.assertEquals(example.getId(), retrieved.getId());
    }
}
