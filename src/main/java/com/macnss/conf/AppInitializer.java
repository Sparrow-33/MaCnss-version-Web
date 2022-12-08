package com.macnss.conf;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{
               PersistenceJpaConfig.class
        };
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{
             WebAppConfig.class
        };
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
