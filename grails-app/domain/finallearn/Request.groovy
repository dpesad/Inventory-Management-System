package finallearn

import grails.rest.*

@Resource(uri='/request')
class Request {
    String requestname
    String val
    static constraints = {
    }
}
