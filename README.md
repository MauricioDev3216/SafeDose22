# 🩺 SafeDose – Sistema de Gestão de Medicamentos

O **SafeDose** é um sistema desktop desenvolvido em **Java** com **Swing**, projetado para ajudar usuários a **organizar o uso de medicamentos de forma segura**, definindo **horários**, e acompanhando o **histórico de uso**.

Seu foco principal é a **acessibilidade e praticidade**, oferecendo uma interface limpa, botões grandes e alertas claros — ideal para idosos, cuidadores e qualquer pessoa que deseje um controle confiável sobre sua rotina de medicação.

---

## 📌 Funcionalidades

* [x] Cadastro de medicamentos
* [x] Definição de horários e frequência
* [x] Histórico de medicação
* [x] Interface acessível e intuitiva
* [x] Armazenamento local com opção de banco de dados

---

## 🎯 Tecnologias Utilizadas

* ☕ **Java SE**
* 🧱 **Java Swing** (interface gráfica)
* 🧰 **IDE recomendada:** NetBeans ou IntelliJ IDEA
* 💾 **Banco de Dados:** SQLite (ou `.txt/.json` na versão simplificada)

---

## 🛠️ Como Usar

1. Clone o repositório:

   ```bash
   git clone https://github.com/SeuUsuario/SafeDose.git
   ```
2. Abra o projeto no **NetBeans** (ou sua IDE favorita)
3. Compile e execute a classe principal `SafeDoseMain.java`
4. Cadastre seus medicamentos e defina os horários para receber alertas personalizados

---

## 📁 Estrutura do Projeto

```
SafeDose/
├── src/
│   └── br/ulbra/controller/         # Controladores do sistema
│   │  └── CuidadorController.java
│   │  └── MedicoController.java
│   │  └── MedicoController.java  
│   ├── br/ulbra/DAO/              # Classes modelo (Medicamento, Alerta, Histórico)
│   │   └── AbstractDAO.java 
│   │   └── CrudRepository.java
│   │   └── HistóricoMedDAO.java 
│   │   └── MedicamentoDAO.java
│   │   └── MedicoDAO.java
│   │   └── RotinaDAO.java
│   │   └── UsuarioDAO.java
│   ├── br/ulbra/Model/               # Telas (Login, Cadastro, Alertas, Histórico)
│   │   └── HistóricoMed.java 
│   │   └── Medicamento.java
│   │   └── Medico.java
│   │   └── Rotina.java
│   │   └── RotinaMedicamento.java
│   │   └── Usuario.java
│   └── br/ulbra/View/                # Classes de acesso a dados (DAO com SQLite ou JSON)
│   │   └── CadastrMedicoView.java 
│   │   └── CuidadorView.java
│   │   └── DashboardCuidadorView.java
│   │   └── DashboardPacienteView.java 
│   │   └── LoginView.java 
│   │   └── MedciamentoscadastroView.java
│   │   └── MedicoView.java
│   │   └── PacientecadastroView.java 
│   │   └── PerfilPacienteView.java 
│   │   └── RotinasView.java
├── lib/                             # Bibliotecas externas
│   └── Driver JBDC do MySQL - mysql-connector-java-5.1.23-bin.jar
│   └── Layout Absoluto -AbsoluteLayout.jar
│   └── JDK 1.8 (Defaut)
└── assets/                          # Sons, ícones e imagens do sistema
```

---

## 🖥️ Telas do Sistema

O **SafeDose** possui uma interface desenvolvida em **Java Swing**, com foco em **acessibilidade, clareza e facilidade de uso**.

## 🧑‍⚕️ Tela de Cadastro de Médico

Permite registrar informações de médicos vinculados ao sistema.

### **Campos disponíveis:**
* ID  
* Especialidade  
* Nome do médico  
* CRM  
* Telefone  
* Email  

### **Funcionalidades:**
* Salvar, editar, excluir e listar registros  
* Exibição organizada em tabela com todos os médicos cadastrados  

### **Diferenciais:**
* Interface simples e objetiva  
* Permite integração direta com o cadastro de medicamentos  
---

## 🧓 Tela de Cadastro de Cuidador

Destinada ao registro de cuidadores responsáveis pelos pacientes.

### **Campos disponíveis:**
* ID  
* Nome  
* Email  
* Endereço  
* Telefone  
* Data de Nascimento  
* Senha  

### **Funcionalidades:**
* Inserir, editar, excluir e listar cuidadores  
* Visualização em tabela completa  

### **Diferenciais:**
* Campos claros e bem organizados  
* Ideal para controle de responsáveis e profissionais de apoio  
---

## 👩‍🦰 Tela de Cadastro de Paciente

Permite o registro completo dos pacientes acompanhados no sistema.

### **Campos disponíveis:**
* ID  
* Nome  
* Email  
* Endereço  
* Telefone  
* Data de Nascimento  
* Senha  

### **Funcionalidades:**
* Salvar, editar, listar, limpar e excluir registros  
* Visualização em tabela dinâmica  

### **Diferenciais:**
* Interface intuitiva e padronizada  
* Facilita o controle e atualização de dados pessoais  
---

## 💊 Tela de Cadastro de Medicamentos

Permite registrar novos medicamentos e vincular a médicos e pacientes.

### **Campos disponíveis:**
* Médico ID  
* Usuário ID  
* Medicamento  
* Observações  

### **Funcionalidades:**
* Adicionar, editar, excluir e listar medicamentos  
* Exibição organizada em tabela com todos os registros  

### **Diferenciais:**
* Integração direta com os cadastros de médico e paciente  
* Foco em simplicidade e clareza no uso  
---

## 🗂️ Tela de Menu de Cadastros

Centraliza o acesso às principais telas do sistema.

### **Opções disponíveis:**
* Pacientes  
* Rotina  
* Medicamentos  
* Médicos  
* Cuidadores  

### **Funcionalidades:**
* Acesso rápido às telas de cadastro  
* Campos de atalho configuráveis  

### **Diferenciais:**
* Navegação prática e centralizada  
* Design limpo e coerente com o restante do sistema  

## 🧠 Metodologia de Desenvolvimento

O projeto **SafeDose** foi desenvolvido com base na metodologia ágil **Scrum**, garantindo entregas incrementais e colaboração contínua entre os membros da equipe.
https://lucas2007branco-1761586304066.atlassian.net/jira/software/projects/SCRUM/boards/1

### 🧩 Papéis no Time

* **Scrum Master:** [Lucas Santos]
* **Product Owner (PO):** [Antônio Lesnik]
* **Desenvolvedores:**

  * [Pedro Algayer]
  * [Arthur Postringer]
  * [Arthur de Brito]
  * [Mauricio de Campos]

---

## 🧪 WireFrame (Protótipos das Telas)
<img width="413" height="306" alt="image" src="https://github.com/user-attachments/assets/f84b6f1b-db55-4f56-8ab7-5082109d9f8d" />
<img width="405" height="303" alt="image" src="https://github.com/user-attachments/assets/35c3a909-5b2a-442a-bd89-65c70990a830" />
<img width="543" height="561" alt="image" src="https://github.com/user-attachments/assets/4f90f633-0e32-4e91-a7d0-583d01b6674b" />
<img width="646" height="375" alt="image" src="https://github.com/user-attachments/assets/02102296-fbe2-4d6a-8859-aaa5ac495376" />
<img width="618" height="430" alt="image" src="https://github.com/user-attachments/assets/bb227929-b6d8-4f85-9e69-d14c480ed1cc" />
<img width="514" height="494" alt="image" src="https://github.com/user-attachments/assets/636a2859-a490-48ac-8067-b82e31a5c41a" />
<img width="805" height="515" alt="image" src="https://github.com/user-attachments/assets/f22c99a5-556c-46c7-beec-17b5953311ac" />
<img width="403" height="339" alt="image" src="https://github.com/user-attachments/assets/45a8da03-dc02-45a5-a7ab-69f52bc70dc0" />




## Diagramas

**Diagrama de Casos de Uso**



<img width="624" height="784" alt="image" src="https://github.com/user-attachments/assets/8e33fa2d-204e-407a-a4cd-505e2c0911a8" />



**Diagrama de Classes**


**Diagrama de Classes Usuario e suas relações**
<img width="1226" height="856" alt="image" src="https://github.com/user-attachments/assets/baf45cfa-25d8-4908-a69a-13b85a00748e" />


**Diagrama de Classes Rotinas, Medico, Medicamento e suas relações**
<img width="1310" height="861" alt="image" src="https://github.com/user-attachments/assets/2da356ac-c167-4b21-a8fc-ee2be7593551" />



## 🏫 Contexto Acadêmico

O **SafeDose** foi desenvolvido como parte do **Curso Técnico em Informática** do
**Colégio São Lucas**, com o objetivo de aplicar conceitos de:

* **Programação Orientada a Objetos (POO)**
* **Banco de Dados e DAO**
* **Interface Gráfica (Java Swing)**
* **Usabilidade e Acessibilidade Digital**

---

## 💡 Ideia Central

O **SafeDose** nasceu com a missão de **aumentar a segurança e a autonomia dos usuários na administração de medicamentos**, oferecendo uma solução simples, confiável e acessível para o cuidado diário com a saúde.
