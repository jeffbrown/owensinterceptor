package demo

import grails.core.support.GrailsConfigurationAware
import grails.config.Config

class OwenInterceptor implements GrailsConfigurationAware {

    void setConfiguration(Config cfg) {
        def controllerToIntercept = cfg.grails.owen.controllerToIntercept
        match controller: controllerToIntercept

        // initialize whatever other properties necessary
    }

    boolean before() {
        println 'Interceptor Running...'
        true
    }
}
