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
│   │   └── ConsultaDAO.java 
│   │   └── CrudRepository.java
│   │   └── HistóricoMedDAO.java 
│   │   └── MedicamentoDAO.java
│   │   └── MedicoDAO.java
│   │   └── RotinaDAO.java
│   │   └── UsuarioDAO.java
│   ├── br/ulbra/Model/               # Telas (Login, Cadastro, Alertas, Histórico)
│   │   └── Consulta.java 
│   │   └── HistóricoMed.java 
│   │   └── Medicamento.java
│   │   └── Medico.java
│   │   └── Rotina.java
│   │   └── RotinaMedicamento.java
│   │   └── Usuario.java
│   └── br/ulbra/View/                # Classes de acesso a dados (DAO com SQLite ou JSON)
│   │   └── CadastrMedicoView.java 
│   │   └── ConsultasView.java 
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

### 💊 Tela de Cadastro de Medicamento

Permite registrar novos medicamentos com detalhes completos:

* Nome do medicamento
* Dosagem (ex: 500mg)
* Frequência (ex: 1x ao dia, a cada 8h)
* Horários específicos (ex: 08:00, 14:00, 22:00)
* Início e término do tratamento

**Funcionalidades:**

* Adicionar, editar e remover medicamentos
* Listagem completa com informações atualizadas

---


**Opções disponíveis:**

* ✅ **Tomei** – confirma a medicação e registra no histórico
* 🔁 **Adiar 10 minutos** – reprograma o alerta automaticamente

**Diferenciais:**

* Alertas suaves e personalizados
* Sistema de notificações integrado ao histórico

---

### 📅 Tela de Histórico

Permite acompanhar os medicamentos tomados e pendentes, com registros diários e filtragem por data.

**Funcionalidades:**

* Histórico completo de medicação
* Consulta de dias anteriores
* Exportação opcional em **PDF** ou **CSV** para uso médico

---

### 👵 Modo Acessível

Interface otimizada para todos os públicos:

* Botões grandes e cores de alto contraste
* Fontes legíveis e ícones intuitivos (💊 cápsula, ⏰ relógio, ✅ check)
* Navegação simples e fluida

---


## 🧠 Metodologia de Desenvolvimento

O projeto **SafeDose** foi desenvolvido com base na metodologia ágil **Scrum**, garantindo entregas incrementais e colaboração contínua entre os membros da equipe.
https://lucas2007branco-1761586304066.atlassian.net/jira/software/projects/SCRUM/boards/1

### 🧩 Papéis no Time

* **Scrum Master:** [\Lucas Santos]
* **Product Owner (PO):** [Antônio Lesnik]
* **Desenvolvedores:**

  * [Pedro Algayer]
  * [Arthur Postringer]
  * [Arthur de Brito]
  * [Mauricio de Campos]

---

## 🧪 WireFrame (Protótipos das Telas)
<img width="543" height="561" alt="image" src="https://github.com/user-attachments/assets/4f90f633-0e32-4e91-a7d0-583d01b6674b" />
<img width="646" height="375" alt="image" src="https://github.com/user-attachments/assets/02102296-fbe2-4d6a-8859-aaa5ac495376" />
<img width="618" height="430" alt="image" src="https://github.com/user-attachments/assets/bb227929-b6d8-4f85-9e69-d14c480ed1cc" />
<img width="554" height="497" alt="image" src="https://github.com/user-attachments/assets/46d4f092-5aaa-45eb-8ce6-74bcfcc7ad36" />


## Diagramas

**Diagrama de Casos de Uso**
<img width="1477" height="1600" alt="image" src="https://github.com/user-attachments/assets/1e17fbbb-7072-4469-ba71-651adb44d21e" />


**Diagrama de Classes**


**Diagrama de Classes Usuario e suas relações       ATUALIZAR O VIEW**
<img width="1129" height="714" alt="image" src="https://github.com/user-attachments/assets/c29a173b-aa8f-422d-9f8c-cd902bfc6181" />



## 🏫 Contexto Acadêmico

O **SafeDose** foi desenvolvido como parte do **Curso Técnico em Informática** do
**Colégio São Lucas**, com o objetivo de aplicar conceitos de:

* **Programação Orientada a Objetos (POO)**
* **Banco de Dados e DAO**
* **Interface Gráfica (Java Swing)**
* **Usabilidade e Acessibilidade Digital**

---

## 👨‍💻 Autores

* **Scrum Master:** [Lucas Santos]
* **Product Owner (PO):** [Antônio Lesnik]
* **Desenvolvedores:**

  * [Pedro Algayer]
  * [Arthur Postringer]
  * [Mauricio de Campos]
  * [Arthur de Brito]

---

## 💡 Ideia Central

O **SafeDose** nasceu com a missão de **aumentar a segurança e a autonomia dos usuários na administração de medicamentos**, oferecendo uma solução simples, confiável e acessível para o cuidado diário com a saúde.
