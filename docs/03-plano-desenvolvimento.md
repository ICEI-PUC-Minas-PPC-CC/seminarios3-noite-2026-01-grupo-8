# 03 — Plano e Cronograma de Desenvolvimento

> **Grupo:** Grupo 8 (Noite)
> **Aplicação:** TranscreveAí - Legendas em Tempo Real com Acessibilidade

---

## 1. Divisão de Tarefas

| Integrante | Responsabilidades principais |
| :--- | :--- |
| Manuel  | Desenvolvimento Backend (Spring Boot), WebSockets e APIs de Áudio. |
| João Negrini | Desenvolvimento Frontend (HTML/JS) e Integração com VLibras. |
| Gabriel Francisco | Levantamento de Requisitos e Documentação Técnica. |
| Rafael Figueiredo | Prototipação no Figma e Gestão do Deploy (Nuvem). |

## 2. Cronograma de Desenvolvimento

| Semana | Período (dd/MM à dd/MM) | Atividade planejada | Responsável | Status |
| :------: | :--------- | :-------------------- | :-----------: | :------: |
| 1 | 18/02 à 25/02 | Formação do grupo | Todos | concluído |
| 2 | 26/02 à 04/03 | Contato com comunidade e Levantamento de demandas | Todos | concluído |
| 3 | 05/03 à 11/03 | Definição de requisitos | Todos | concluído |
| 4 | 12/03 à 18/03 | Prototipação / wireframes | Integrante 4 | concluído |
| 5 | 19/03 à 25/03 | Desenvolvimento — Sprint 1 | Todos | concluído |
| 6 | 26/03 à 01/04 | Desenvolvimento — Sprint 1 | Integrante 2 | concluído |
| 7 | 02/04 à 08/04 | Validação com a comunidade | Todos | concluído |
| 8 | 09/04 à 15/04 | Desenvolvimento — Sprint 2 | Integrantes 1 e 2 | iniciado |
| 9 | 16/04 à 22/04 | Desenvolvimento — Sprint 2 | Integrante 2 | iniciado |
| 10 | 23/04 à 29/04 | Testes e ajustes | Todos | iniciado |
| 11 | 30/04 à 06/05 | Deploy / hospedagem | Integrante 4 | iniciado |
| 12 | 07/05 à 13/05 | Validação final com a comunidade | Todos | iniciado |
| 13 | 14/05 à 20/05 | **Entrega presencial** | Todos | iniciado |
| 14 | 21/05 à 28/05 | Preenchimento dos relatórios APC | Todos | não iniciado |

## 3. Marcos (Milestones)

| Marco | Data prevista | Critério de conclusão |
| :--- | :------------: | :--- |
| Demandas levantadas | 04/03 | Registro de contato com a comunidade |
| Requisitos definidos | 11/03 | Documento `02-documento-requisitos.md` preenchido |
| Protótipo aprovado | 18/03 | Wireframes validados com a comunidade |
| MVP funcional | 25/04 | Funcionalidades mínimas operacionais |
| Deploy realizado | 06/05 | Aplicação acessível pela Internet |
| Entrega presencial | 16/05 | Software apresentado à comunidade |
| Relatórios APC | 28/05 | Relatório e autoavaliação preenchidos |

## 4. Estratégia de Desenvolvimento

### Ambiente de desenvolvimento
O ambiente de desenvolvimento utiliza o ecossistema Java com **Spring Boot** no backend e **JavaScript** puro no frontend para garantir leveza. O controle de versão é feito via **Git/GitHub**, e o editor principal é o **IntelliJ IDEA**.

### Estratégia de testes
A estratégia consiste em testes funcionais manuais realizados pelo grupo, focando na precisão da conversão de voz em texto em diferentes ambientes ruidosos e na correta sinalização do avatar **VLibras**.

### Estratégia de deploy
O deploy será realizado na plataforma **Render** para o serviço de backend (Java) e no **GitHub Pages** para a interface do usuário (frontend), garantindo que o software esteja disponível via URL pública.

## 5. Riscos e Mitigações

| Risco | Probabilidade | Impacto | Mitigação |
| :--- | :------------: | :-------: | :--- |
| Atraso no cronograma | Média | Alto | Reuniões semanais para acompanhamento |
| Dificuldade técnica | Baixa | Médio | Estudo dirigido de WebSockets e APIs |
| Comunidade indisponível | Média | Médio | Uso de formulários digitais alternativos |
| Infraestrutura no dia | Baixa | Alto | Teste antecipado do deploy e roteamento |

## 6. Comunicação do Grupo

| Canal | Finalidade |
| :--- | :--- |
| WhatsApp | Comunicação diária |
| GitHub Projects | Controle de tarefas |
| Google Meet | Reuniões semanais de alinhamento |
