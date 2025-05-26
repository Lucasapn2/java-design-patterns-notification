
#  Sistema de Envio de Mensagens com Design Patterns (Java)

Este projeto demonstra a aplicação prática de **Padrões de Projeto (Design Patterns)** em Java, como parte de um desafio da **DIO - Digital Innovation One**.

---

##  Objetivo

Criar um sistema de envio de mensagens simuladas (E-mail, SMS e WhatsApp) utilizando os seguintes padrões de projeto:

-  **Strategy** – para definir o tipo de envio dinamicamente.
-  **Factory** – para instanciar a estratégia de envio com base em uma string.
-  **Singleton** – para garantir uma única instância do serviço de envio.

---

##  Estrutura do Projeto

```
design-patterns-mensagens/
├── src/
│   ├── Main.java
│   ├── NotificationStrategy.java
│   ├── EmailNotification.java
│   ├── SmsNotification.java
│   ├── WhatsAppNotification.java
│   ├── NotificationFactory.java
│   └── NotificationService.java
```
---

## 💡 Exemplo de Saída

```
Enviando E-MAIL: Olá, bem-vindo ao nosso sistema!
Enviando SMS: Você tem um novo código de verificação.
Enviando WhatsApp: Seu pedido foi entregue com sucesso!
```

---

##  Padrões Utilizados

###  Strategy
Permite trocar dinamicamente o tipo de envio sem alterar a lógica principal.

###  Factory
Cria objetos com base em uma entrada (`email`, `sms`, `whatsapp`).

###  Singleton
Garante que o `NotificationService` tenha apenas uma instância em todo o sistema.
