spring-mongo-rest-seed
======================

using springmvc, maven, mongo, and jetty to build a spring-based mongo-driven restful seed project


### Usage

1. Install & Run

        git clone https://github.com/yaoyi/spring-mongo-rest-seed.git
        cd server
        mvn compile
        mvn jetty:run

2. Test

        ➜ ~  curl -v -H "Content-Type: application/json" -X POST -d '{"name":"book_1"}' http://localhost:8080/api/v1/book
        ....
        < Location: http://localhost:8080/api/v1/book/51ab826a6796cd91387b2064
        < Content-Length: 0
        < Server: Jetty(7.6.10.v20130312)
        <
        * Connection #0 to host localhost left intact
        * Closing connection #0
        
        ➜  ~  curl -H "Content-Type: application/json" http://localhost:8080/api/v1/book/51ab826a6796cd91387b2064
        {"name":"book_1"}%
