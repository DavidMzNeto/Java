# Peixaria do Neto - Loja virtual

<img width="300px" height="300px" src="https://github.com/DavidMzNeto/Java/blob/main/Peixaria/target/classes/static/Imagens/WhatsApp%20Image%202024-05-17%20at%2016.26.48.jpeg">

Contruir uma loja de peixes com cadastro, carrinho e validação de compra

## Tecnologias usadas

- Java 22
- Spring Boot
- PostgreeSQL

## Arquitetura

O projeto foi desenvolvido usando a arquitetura MVC, além de usar o Spring para criar as tabelas no banco de dados.

## Como usar

1. Acesse a página.
2. Selecione os produtos de sua escolha.
3. Verifique as informações e adicione ao carrinho.
4. Confira o carrinho e coloque a quantia desejada.
5. Selecione a forma de pagamento.
6. Conclua o pagamento.

<img alt="app" width="500px" height="275px" src="https://github.com/DavidMzNeto/Java/blob/main/Peixaria/target/classes/static/Imagens/WhatsApp%20Image%202024-06-22%20at%2014.10.09.jpeg"><img width="500px" height="275px" src="https://github.com/DavidMzNeto/Java/blob/main/Peixaria/target/classes/static/20240623_202604.gif">



## Dependências

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId> 
        <version>3.3.0</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>com.dev</groupId>
    <artifactId>Peixaria</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>Peixaria</name>
    <description>Demo project for Spring Boot</description>
    <properties>
        <java.version>17</java.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-security</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.thymeleaf.extras</groupId>
            <artifactId>thymeleaf-extras-springsecurity6</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>com.mysql</groupId>
            <artifactId>mysql-connector-j</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.security</groupId>
            <artifactId>spring-security-test</artifactId>
            <scope>test</artifactId>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>
