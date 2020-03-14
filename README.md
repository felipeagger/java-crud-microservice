# java-crud-microservice
Java Spring API Rest

CRUD Microservice in Java with Spring Boot &amp; Postgres.

# Subir a Aplicacao com Docker:
  Acesse a raiz do repositorio e rode: 
  
```  
  make docker  
```

# Dependencias

Spring-Web, DevTools, Spring-Data-JPA e Postgres-Driver.


# Requisitos :

Deixar as Porta (8088, 5432) do seu host local livre.

# Endereços e Rotas

Java Spring API = http://127.0.0.1:8088/

GET http://127.0.0.1:8088/user

GET http://127.0.0.1:8088/user/:id

DELETE http://127.0.0.1:8088/user/:id

POST http://127.0.0.1:8088/user -> Body

PUT http://127.0.0.1:8088/user/:id -> Body

Body:

``` 
{
   "name": "Username"
}
``` 


# Links/Observações

Para Utilizar Docker é necessario ter instalado:

```  
  Docker: https://www.docker.com/

  Docker-Compose: https://docs.docker.com/compose/
  
```  
