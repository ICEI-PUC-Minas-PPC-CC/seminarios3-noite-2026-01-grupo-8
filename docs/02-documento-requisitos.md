# 02 — Documento de Requisitos do Software

> **Grupo:** *GRUPO 8*  
> **Aplicação:** *Plataforma de Legendas em Tempo Real*  
> **Comunidade:** *TARSO DE COIMBRA*

---

## 1. Visão Geral

Esta plataforma de acessibilidade foi concebida para preencher a lacuna de comunicação em ambientes de aprendizado e eventos presenciais. O objetivo é garantir que a informação falada não se perca no ar, tornando-a acessível a todos em tempo real. Através de um fluxo contínuo de recepção sonora, o sistema acompanha o ritmo de palestrantes e docentes, traduzindo o áudio captado em uma interface de leitura fluida e imediata. É uma solução prática que prioriza a inclusão, permitindo que a audiência acompanhe o conteúdo de forma visual e textual, assegurando que o conhecimento seja transmitido com total clareza e sem exclusões.

## 2. Público-Alvo

| Campo | Informação |
| ------- | ----------- |
| Perfil dos usuários | Pessoas surdas (que utilizam ou não Libras) e pessoas com deficiência auditiva parcial. O perfil engloba estudantes universitários, alunos de cursos técnicos e profissionais que participam de reuniões e palestras presenciais ou híbridas. |
| Faixa etária | TODAS AS IDADES |
| Necessidades de acessibilidade | Tradução visual instantânea de estímulos sonoros (fala); interface com alto contraste para evitar fadiga visual; suporte a fontes escaláveis; e baixa latência na exibição do texto para garantir a sincronia com o orador |
| Nível de familiaridade com tecnologia | De Básico a Intermediário, a aplicação deve ser intuitiva (plug-and-play), exigindo apenas que o usuário saiba acessar um link ou ler um QR Code para entrar na sala de legendas, sem configurações complexas.|

> **Lembrete (Tarso de Coimbra):** Os usuários podem ter deficiência auditiva/surdez. A interface deve ser **visual, intuitiva e de baixa complexidade**. Priorize elementos visuais (imagens, ícones, cores) sobre texto extenso.

## 3. Requisitos Funcionais

| ID | Requisito | Prioridade | Origem da demanda |
| ---- | ---------- | :----------: | ------------------ |
| RF01 | Consumo Otimizado de Dados: A transmissão de texto via WebSockets deve ser leve, permitindo o funcionamento estável mesmo em redes móveis (3G/4G/5G) de baixa oscilação. | Alta | Efiencia;
| RF02 | Exibição de Legendas Instantâneas: A aplicação deve exibir o texto convertido na tela do usuário com atualização automática, sem necessidade de recarregar a página. | Alta | Reunião com Tarso de Coimbra;
| RF03 | Captação e Transmissão de Áudio: O sistema deve permitir que o palestrante ative o microfone para captar a fala e enviá-la ao processamento em tempo real. | Alta | Reunião com Tarso de Coimbra;
| RF04 | Indicador de Status de Conexão: O sistema deve exibir visualmente se o áudio está sendo captado e se a conexão com o servidor está ativa (status "Ao Vivo"). | Media | Feedback do Usuário;
| RF05 | Privacidade de Dados: O processamento de áudio deve ser efêmero, garantindo que as falas captadas não sejam armazenadas ou utilizadas para outros fins após a exibição do texto. | Media | Feedback do Usuário; 

## 4. Requisitos Não Funcionais

| ID | Requisito | Categoria |
| ---- | ---------- | ----------- |
| RNF01 | A aplicação deve ser acessível via navegador web | Acessibilidade |
| RNF02 | A interface deve ser simples e intuitiva | Usabilidade |
| RNF03 | A aplicação deve funcionar em dispositivos móveis | Compatibilidade |
| RNF04 | A latência da transcrição (fala -> texto) deve ser inferior a 2 segundos | Desempenho |
| RNF05 | A comunicação entre servidor e cliente deve ser feita via WebSockets | Confiabilidade |

## 5. Requisitos de Acessibilidade

- [ ] Interface predominantemente visual (ícones, cores, imagens)
- [x] Textos curtos e objetivos
- [x] Botões grandes e identificáveis
- [x] Contraste adequado de cores
- [ ] Compatível com Libras (se aplicável: vídeos, sinais, glossário)
- [x] Sem dependência de áudio para funcionalidades essenciais
- [ ] Outro: *(especificar)*

## 6. Tecnologias Escolhidas

| Componente | Tecnologia |
| ----------- | ----------- |
| Front-end | React (ou HTML/CSS/JS puro para simplicidade) |
| Back-end (se houver) | Java com Spring Boot |
| Banco de dados (se houver) | PostgreSQL |
| Hospedagem | Render ou Railway |
| Outras ferramentas | WebSockets (comunicação real-time) e Google Speech-to-Text API |

## 7. Protótipo / Wireframes

(https://modify-beluga-37826489.figma.site/)

## 8. Escopo Mínimo Viável (MVP)

(Quais funcionalidades compõem a versão mínima que pode ser entregue à comunidade?)

- [x] *(Transcrição de áudio para texto via API)*
- [x] *(ransmissão instantânea do texto para uma URL pública da sala)*
- [x] *(Interface de leitura com alto contraste e ajuste de fonte)*

## 9. Funcionalidades Desejáveis (se houver tempo)

- *(Adicionar o VLibras para aumentar a acessebilidade)*
- *(Exportar o texto da palestra/aula em formato PDF ao final)*
