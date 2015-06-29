package demo

class OwenInterceptor {

    boolean before() {
        println 'Interceptor Running...'
        true
    }
}
