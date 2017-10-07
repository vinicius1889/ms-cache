# Microservice Crypto

Esse projeto foi desenhado para realizar o hashing do cpf do usuario. Utilizamos
AES-256-CBC

-------------
Ambiente
-------------

> - **porta** 5500
> - **context** /api/crypto


-------------
Variáveis
-------------

> - environment
> - encrypt.key= (hex)
> - encrypt.iv= (hex)


-------------
Run
-------------

#### Local

Para rodar o projeto localmente, devemos rodar o comando **gradle bootRun**

#### Produção

Para rodar o projeto em produção, devemos usar o comando gradle build.
O projeto **(.jar)** estará disponível dentro da pasta build/libs.

> - gradle build
> - java -jar projeto.jar
  

#### Documentação dos serviços

Para visualizar o a documentação criada pelo swagger:

http://[server]/[context-path]/swagger-ui.html