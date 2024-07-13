# api-rest-java
*Objetivos*
Desenvolvimento de uma API Rest
- CRUD (Create, Read, Update e Delete)
- Validações
- Paginação e ordenação

O objetivo deste projeto é usar o Spring Boot para desenvolver uma API Rest, 
com algumas funcionalidades. A ideia é desenvolver um CRUD, sendo as quatro 
operações fundamentais das aplicações: cadastro, listagem, atualização e exclusão de informações.

Resumindo é treinar e desenvolver e treinar um CRUD de uma API Rest usando o Spring Boot.

Vou também aplicar validações das informações que chegam na API, 
usando o Bean Validation. Depois, aqui será reforçado a utilização do conceito de paginação e 
ordenação das informações que a API vai devolver.

Tecnologias aplicadas:
    - Spring Boot 3
    - Java 17
    - Lombok
    - MySQL/ Flyway
    - JPA/Hibernate
    - Maven
    - Insomnia

Aplicação de algumas tecnologias, como Spring Boot 3, 
sendo a última versão disponibilizada pelo framework. 

Será utilizado, também, o Java 17 sendo a última versão LTS (Long-term support, em português "Suporte de longo prazo") 
que possui maior tempo de suporte disponível para o Java.

Será visto também recursos das últimas versões do Java para deixar o código mais simples. 
Utilizarei em conjunto com o projeto o Lombok, responsável por fazer a geração de códigos 
repetitivos, como getters, setters, toString, entre outros. 

Tudo via anotações para o código ficar menos verboso.

Usarei o banco de dados MySQL para armazenar as informações da API e junto com ele 
utilizarei a biblioteca Flyway. 

Isso para ter o controle do histórico de evolução do banco de dados, conceito chamado de Migration.

A camada de persistência da aplicação será feita com a JPA (Java Persistence API), 
com o Hibernate como implementação dessa especificação e usando os módulos do Spring Boot, 
para tornar esse processo o mais simples possível.

Usarei o Maven para gerenciar as dependências do projeto, e também para gerar o build da aplicação. 
Por último, focarei na API Rest (apenas no Back-end), não terei interface gráfica, 
como páginas HTML e nem Front-end e aplicativo mobile.

Mas para testar a API, usarei o Insomnia, sendo uma ferramenta usada para testes em API. 
Com ela, consego simular a requisição para a API e verificar se as funcionalidades implementadas estão funcionando.

Essas são as tecnologias que será utilizada ao longo deste projeto.
