# Default Microservices skelton

Esse projeto é feito para ser um skelton simples das configuração padrão dos microserviços com:

  - Aspecto
  - Log (Logback com fluentd para visualizar no kibana)
  - Server Undertown
  - Exemplo de configuração dos Beans
  - Schedule (Crons)
  - Repository
  - Swagger  
  - JMS usando SQS  
  - Segurança com keycloak
  
# Logs

Os logs serão vistos no console e no kibana 

# Importante

  - Por favor, troque o nome do projeto nos arquivos de configuração
  - Não esqueça de trocar as informações no arquivo de propriedade em src/main/resources


Você também deverá trocar a url do Github:
  - git remote set-url
  
Para visualizar o a documentação criada pelo swagger:

http://[server]/[context-path]/swagger-ui.html