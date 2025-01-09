# Pet Shop Simples API Spring Boot 🐾  

Este é o **primeiro projeto** desenvolvido em **Spring Boot** como parte de uma jornada de aprendizado. Ele foi criado para entender os conceitos básicos de desenvolvimento de APIs REST, organização de código, padrão de projeto Singleton e integração com um banco de dados em memória (**H2 Database**).  

Por ser um projeto inicial, ele é **bem básico** e tem o foco principal em praticar conceitos fundamentais do framework Spring Boot. Futuramente, novas funcionalidades poderão ser adicionadas, e as práticas aprendidas aqui servirão como base para projetos mais robustos.  

---

## 🐶 O que o Projeto Faz?  

A **Pet Shop Simples API Spring Boot** permite:  
- **Cadastrar pets**: Adicionar um novo pet ao sistema com informações como nome, espécie e idade.  
- **Listar pets**: Ver todos os pets cadastrados na plataforma.  
- **Remover pets**: Excluir um pet específico da lista, utilizando seu ID.  

---

## 🛠️ Tecnologias Utilizadas  

- **Java 21**  
- **Spring Boot 3**  
- **Spring Data JPA**  
- **H2 Database** (banco de dados em memória)  
- **Maven**  
- **Postman** (para testes de API)  

---

## 🏗️ Estrutura do Projeto  

O projeto foi organizado com base em boas práticas de desenvolvimento, mesmo sendo um projeto inicial. A estrutura segue os padrões recomendados para aplicações Spring Boot:  

```plaintext  
src/main/java/com/petshop  
├── controller        # Controladores REST (responsáveis por expor os endpoints da API)  
├── model             # Modelos de dados que representam as entidades (ex.: Pet)  
├── repository        # Interface para persistência de dados (PetRepository)  
├── service           # Regras de negócio (PetService)  
├── singleton         # Implementação do padrão Singleton (PetSingleton)  
└── PetshopApplication.java  # Classe principal que inicializa a aplicação  
