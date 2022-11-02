package pl.enderqube.testplugin;

import com.google.inject.Provides;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import pl.enderqube.shared.i18n.MessageBundle;
import pl.enderqube.shared.i18n.MessageRepository;

import java.util.Locale;

public class Main {

    private static final ThreadLocal<EntityManager> ENTITY_MANAGER_CACHE
            = new ThreadLocal<EntityManager>();

    public static void main(String[] args) {

    }

}
