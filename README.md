# Agendamento de Consultas — Padrões de Projeto (RA2)

Sistema de console em Java para agendar consultas com psicólogos, aplicando 4 padrões GoF:
**Facade**, **Chain of Responsibility**, **Strategy** e **Observer**.

Design de Software — Engenharia de Software, PUCPR.
Equipe: Dias, Geovana, João e Tabatha.

## Requisitos

- Java 17 (JDK)
- Sem bibliotecas externas, sem Maven/Gradle

## Como executar

### IntelliJ
1. Abrir a pasta do projeto.
2. Clicar com o botão direito em `src` → **Mark Directory as → Sources Root**.
3. Rodar a classe `consultas.app.Main`.

### Terminal

Gerar a lista de arquivos:

- Linux/macOS:
```bash
  find src -name "*.java" > fontes.txt
```
- Windows:
```bat
  dir /s /b src\*.java > fontes.txt
```

Compilar e executar:
```bash
javac -encoding UTF-8 -d out @fontes.txt
java -cp out consultas.app.Main
```

## Menu

```
1 - Agendar consulta
2 - Listar consultas
3 - Ligar/desligar notificação ao paciente
4 - Demonstrar validação: tentar agendar de novo o horário da última consulta
0 - Sair
```

## Padrões e onde estão

| Padrão | Pacote | Classes principais |
|---|---|---|
| Facade | `consultas.facade` | `AgendamentoFacade` |
| Chain of Responsibility | `consultas.validacao` | `ValidadorAgendamento`, `ValidadorVinculo`, `ValidadorDataFutura`, `ValidadorDisponibilidade` |
| Strategy | `consultas.estrategia` | `EstrategiaOrdenacao`, `OrdemCronologica`, `PreferenciaTurno` |
| Observer | `consultas.notificacao` | `PublicadorAgendamento`, `ObservadorAgendamento`, `NotificadorPaciente` |

Durante a execução, cada etapa imprime uma linha com prefixo (`[Facade]`, `[Validação]`,
`[Agenda]`, `[Eventos]`, `[Notificação]`), mostrando cada padrão agindo.

## Limitações

- Os dados ficam em memória e se perdem ao fechar o programa.
- Não há bloqueio de consultas sobrepostas (mesmo psicólogo em clínicas diferentes, ou mesmo paciente).