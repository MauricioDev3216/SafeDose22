# 🩺 SafeDose – Sistema de Gestão de Medicamentos

O **SafeDose** é um sistema desktop desenvolvido em **Java** com **Swing**, projetado para ajudar usuários a **organizar o uso de medicamentos de forma segura**, definindo **horários**, recebendo **alertas sonoros e visuais** e acompanhando o **histórico de uso**.

Seu foco principal é a **acessibilidade e praticidade**, oferecendo uma interface limpa, botões grandes e alertas claros — ideal para idosos, cuidadores e qualquer pessoa que deseje um controle confiável sobre sua rotina de medicação.

---

## 📌 Funcionalidades

* [x] Cadastro de medicamentos
* [x] Definição de horários e frequência
* [x] Alertas sonoros e visuais
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

### ⏰ Tela de Alertas

Quando chega o horário programado, o sistema exibe uma **notificação visual e sonora**, contendo o nome do medicamento e a dosagem.

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

## 🗄️ Banco de Dados

O **SafeDose** utiliza o **SQLite** (ou arquivos `.json`/`.txt` para iniciantes) para armazenar dados localmente.

### Estrutura do Banco

```sql
CREATE TABLE medicamento (
  id_medicamento INTEGER PRIMARY KEY AUTOINCREMENT,
  nome TEXT NOT NULL,
  dosagem TEXT,
  frequencia TEXT,
  horarios TEXT,
  inicio_tratamento TEXT,
  fim_tratamento TEXT
);

CREATE TABLE historico (
  id_historico INTEGER PRIMARY KEY AUTOINCREMENT,
  id_medicamento INTEGER,
  data_hora TEXT,
  status TEXT, -- "Tomado" ou "Adiado"
  FOREIGN KEY (id_medicamento) REFERENCES medicamento(id_medicamento)
);
```

---

## 🧠 Metodologia de Desenvolvimento

O projeto **SafeDose** foi desenvolvido com base na metodologia ágil **Scrum**, garantindo entregas incrementais e colaboração contínua entre os membros da equipe.

### 🧩 Papéis no Time

* **Scrum Master:** [Seu Nome]
* **Product Owner (PO):** [Nome do PO]
* **Desenvolvedores:**

  * [Dev 1]
  * [Dev 2]
  * [Dev 3]
  * [Dev 4]

---

## 🧪 Mockups (Protótipos das Telas)

*(Substitua pelos prints reais do projeto quando disponíveis)*

```markdown
<img width="800" alt="Tela de Cadastro" src="https://github.com/user-attachments/assets/exemplo1.png" />
<img width="800" alt="Tela de Alerta" src="https://github.com/user-attachments/assets/exemplo2.png" />
<img width="800" alt="Tela de Histórico" src="https://github.com/user-attachments/assets/exemplo3.png" />
```

---

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
