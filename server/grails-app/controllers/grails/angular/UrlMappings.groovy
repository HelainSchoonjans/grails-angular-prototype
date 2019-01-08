package grails.angular

class UrlMappings {

    static mappings = {
        "/application"(controller: 'application', action:'index')
        "/"(uri: "/index.html")
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
