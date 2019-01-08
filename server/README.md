# Docker

Initialized following this tutorial: http://guides.grails.org/grails-as-docker-container/guide/index.html

## production

To run the docker in production:

    docker run -p 8080:8080 heschoon/grails-angular-prototype
    
    
## Custom environment
    
Running the docker in another environment requires to give it as an environment variable:

    docker run -p 8080:8080 -e env=staging heschoon/grails-angular-prototype
    
Do not use quotes when passing the environment!