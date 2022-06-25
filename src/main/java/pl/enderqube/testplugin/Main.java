package pl.enderqube.testplugin;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import pl.enderqube.shared.guice.DatabaseModule;
import pl.enderqube.shared.guice.RepositoryModule;
import pl.enderqube.shared.persistence.repositories.user.UserRepository;
import pl.enderqube.shared.persistence.repositories.user.UserRepositoryInterface;

public class Main {



    public static void main(String[] args) {

        Injector injector = Guice.createInjector(new DatabaseModule());
       UserRepositoryInterface repo = injector.getInstance(UserRepository.class);

        var all = repo.findAll();
        System.out.println(all.stream().count());
        for(var user: all) {
            System.out.println(user);
        }
    }
}
