# 📂 Código-Fonte da Aplicação

> O código completo do projeto TranscreveAí está dividido nas pastas `/backend` (Java Spring Boot) e `/frontend` (Interface Web e VLibras) dentro deste diretório `src/`.

---

## Informações do Projeto

| Campo | Informação |
|-------|-----------|
| Nome da aplicação | *TranscreveAí* |
| Tecnologias utilizadas | *Java 17, Spring Boot, WebSockets, HTML, JS, Web Speech API e VLibras* |
| URL em produção | *(preencher, se hospedado)* |

## Como Executar Localmente

1. **Clone o repositório**

git clone <https://github.com/ICEI-PUC-Minas-PPC-CC/seminarios3-noite-2026-01-grupo-8.git>

2. **Execute o Backend**
Abra a pasta src/backend na sua IDE (como o VS Code) e execute a classe principal DemoApplication.java. O servidor iniciará na porta 8080.

3. **Execute o Frontend**
Abra a pasta src/frontend e inicie o arquivo index.html utilizando a extensão Live Server (obrigatório para evitar bloqueios de CORS).

4. **Testando**
Clique em "Iniciar Transcrição" e autorize o uso do microfone no navegador.
```

## Estrutura do Código
src/
├── backend/
│   ├── src/main/java/com/example/demo/
│   │   ├── TranscreveHandler.java
│   │   └── WebSocketConfig.java
│   └── pom.xml
└── frontend/
├── index.html
``


*(Java 17, Spring Boot, WebSockets, HTML, JS, Web Speech API e VLibra)*

## Deploy

*(Descreva como foi feito o deploy e onde a aplicação está hospedada.)*
