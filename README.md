<h1>Trabalho WEB - Spring-boot</h1>

Para rodar é necessario alterar o **application.properties** que esta configurado para utilizar o **Postgres**, caso queiram outro banco e necessario modificar algumas coisas, caso utilizem o postgres é necessario apenas mudar o nome de usuario
e senha e alterar o nome do seu banco do postgres.

<h2>Exemplo</h2>
spring.datasource.driver-class-name=org.postgresql.Driver <br/>
spring.datasource.username=**alterar para nome do usuario do postgres** <br/>
spring.mvc.view.prefix=/WEB-INF/views/ <br/>
spring.mvc.view.suffix=.jsp <br/>
spring.datasource.password=**alterar para senha do usuario do postgres** <br/>
spring.datasource.url=jdbc\:postgresql\://localhost/**nome do banco criado no postgres** <br/>
spring.jpa.hibernate.ddl-auto=update <br/>



Após a alteracao e necessario apenas rodar o "GestaoFestaApplication".
