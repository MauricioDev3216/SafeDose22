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
│   └── br/safedose/controller/      # Controladores do sistema
│   ├── br/safedose/model/           # Classes modelo (Medicamento, Alerta, Histórico)
│   ├── br/safedose/view/            # Telas (Login, Cadastro, Alertas, Histórico)
│   └── br/safedose/dao/             # Classes de acesso a dados (DAO com SQLite ou JSON)
├── lib/                             # Bibliotecas externas (se houver)
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

<img width="500" height="500" alt="image" src="https://github.com/user-attachments/assets/54d765cb-342e-40d4-9918-041b79dba521" />
<img width="700" height="500" alt="image" src="https://github.com/user-attachments/assets/2bb4d340-e32a-4ba5-868e-ab0757ad2760" />
<img width="700" height="500" alt="image" src="https://github.com/user-attachments/assets/dcdf4a81-3fca-4b8a-a4dc-7892d6f44ffa" />
<img width="500" height="500" alt="image" src="https://github.com/user-attachments/assets/ec726ecc-076a-482c-b16e-ce4422b53c4b" />
<img width="500" height="500" alt="image" src="https://github.com/user-attachments/assets/e64640bd-c6dd-4a43-95a4-5eb7a7cd9065" />
<img width="500" height="500" alt="image" src="https://github.com/user-attachments/assets/238ee393-92fc-41d9-b8ec-2bb33b176a01" />
<img width="500" height="500" alt="image" src="https://github.com/user-attachments/assets/256ea110-358e-4456-8285-684259f9affd" />
<img width="800" height="500" alt="image" src="https://github.com/user-attachments/assets/efc405e9-e47d-40b0-9848-f742488400dc" />





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
