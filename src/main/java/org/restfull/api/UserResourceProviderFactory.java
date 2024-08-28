package org.restfull.api;


import org.keycloak.models.KeycloakSession;
import org.keycloak.models.KeycloakSessionFactory;
import org.keycloak.services.resource.RealmResourceProvider;
import org.keycloak.services.resource.RealmResourceProviderFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import org.keycloak.Config;


public class UserResourceProviderFactory implements RealmResourceProviderFactory {
    private static final Logger logger = LoggerFactory.getLogger(UserResourceProviderFactory.class);

    @Override
    public RealmResourceProvider create(KeycloakSession session) {
        return new UserResourceProvider(session);
    }

    @Override
    public String getId() {
        return "api";
    }

    @Override
    public void init(Config.Scope config) {
        logger.info(getId() + "@@@@@");
    }

    @Override
    public void postInit(KeycloakSessionFactory factory) {}

    @Override
    public void close() {}

}
