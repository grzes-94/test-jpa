package pl.enderqube.testplugin;

import com.google.inject.Inject;
import pl.enderqube.shared.persistence.repositories.user.UserRepository;

public class Plugin {

    @Inject
    private UserRepository repository;

    void run() {
        System.out.println(repository.findAll());
    }
}
