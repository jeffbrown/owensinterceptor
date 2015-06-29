package owensinterceptor

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

class Application extends GrailsAutoConfiguration {

    @Override
    void doWithApplicationContext() {
        def interceptor = applicationContext.owenInterceptor
        def controllerToIntercept = applicationContext.grailsApplication.config.grails.owen.controllerToIntercept
        interceptor.match controller: controllerToIntercept
    }

    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}
