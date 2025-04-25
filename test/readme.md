# 📋 Sistema de Gerenciamento de Tarefas

Esta é uma aplicação web desenvolvida em **Spring Boot** no modelo **MVC**, com foco no gerenciamento de tarefas. O sistema permite criar, listar, atualizar e excluir tarefas com persistência em diferentes bancos de dados: **H2**, **MariaDB** e **MongoDB**.

---

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Data MongoDB
- Spring Boot DevTools
- Validation (Jakarta)
- Lombok
- H2 Database
- MariaDB
- MongoDB
- Maven

---

## 📦 Estrutura do Projeto

com.exemplo.tarefas ├── controller # Endpoints REST (Camada Controller) ├── service # Lógica de negócio (Camada Service) ├── repository # Persistência (Camada Repository) ├── model # Entidades (Camada Model) └── application.properties # Configuração do projeto

yaml
Copiar
Editar

---

## 📄 Funcionalidades

- ✅ Listar todas as tarefas
- ✅ Criar uma nova tarefa
- ✅ Atualizar uma tarefa existente
- ✅ Excluir uma tarefa
- ✅ Validação de dados (título, status, descrição)

---

## 🧪 Exemplos de Requisições

### ➕ Criar uma Tarefa (POST)
```http
POST /tarefas
Content-Type: application/json

{
  "titulo": "Estudar Spring Boot",
  "descricao": "Revisar conteúdo de JPA e MongoDB",
  "status": "Em andamento"
}
🔁 Atualizar uma Tarefa (PUT)
http
Copiar
Editar
PUT /tarefas/1
Content-Type: application/json

{
  "titulo": "Estudar Spring Boot com MongoDB",
  "descricao": "Revisar repositórios e perfis",
  "status": "Concluído"
}
🛠 Configuração dos Bancos de Dados
Você pode alternar entre os bancos de dados configurando o arquivo application.properties.

Exemplo para H2
properties
Copiar
Editar
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
Exemplo para MariaDB
properties
Copiar
Editar
spring.datasource.url=jdbc:mariadb://localhost:3306/tarefasdb
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.database-platform=org.hibernate.dialect.MariaDBDialect
Exemplo para MongoDB
properties
Copiar
Editar
spring.data.mongodb.uri=mongodb://localhost:27017/tarefasdb
✅ Como Executar
bash
Copiar
Editar
# Clone o projeto
git clone https://github.com/seu-usuario/seu-repo.git

# Navegue até a pasta
cd seu-repo

# Compile e execute o projeto
./mvnw spring-boot:run
📚 Sobre a Prova
Este projeto foi desenvolvido como parte de uma avaliação prática com o objetivo de aplicar o padrão MVC utilizando múltiplos tipos de persistência e boas práticas de desenvolvimento com Spring Boot.

✍️ Autor
David Mizrahy Neto
💼 LinkedIn
