package org.acme;

import java.util.logging.Logger;

import io.quarkus.runtime.ShutdownEvent;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;

@ApplicationScoped
public class AppLifeCicleBean {
    private static final Logger LOGGER = Logger.getLogger("ListnerBean");

    void onStart(@Observes StartupEvent evt){
        LOGGER.info("La app esta iniciando...");
    }

    void onStop(@Observes ShutdownEvent evt){
        LOGGER.info("La app se esta cerrrando...");
    }
}
