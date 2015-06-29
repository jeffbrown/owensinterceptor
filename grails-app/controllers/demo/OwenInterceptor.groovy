package demo


class OwenInterceptor {

    public OwenInterceptor() {
        match controller: 'demo'
    }
    
    boolean before() {
        if(grailsApplication) {
            println 'grailsApplication was found'
        } else {
            println 'No grailsApplication was found'
        }

        true
    }
}
