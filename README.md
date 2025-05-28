# FTC Robotics – Alpha Technology #17739

Este repositório contém a reconstrução da lógica de programação utilizada pela equipe **Alpha Technology #17739** na competição **FIRST Tech Challenge (FTC)**, com base em documentação técnica, portfólio de engenharia e formulário do Prêmio de Controle.

## 🧠 Visão Geral

O projeto contempla a implementação de um robô competitivo com funcionalidades autônomas e teleoperadas, utilizando:

- Programação em Java
- Controle de movimento com encoders
- Identificação de objetos com TensorFlow Lite
- Controle fuzzy para lançamento de argolas
- Controle PID para ajustes de movimentação
- Reconhecimento de cores para posicionamento final

## 📂 Estrutura do Projeto

ftc-alpha-technology/
├── README.md
├── LICENSE
├── docs/
│ ├── Portfolio.pdf
│ ├── PremioControle.docx
│ └── CadernoEngenharia_Parte2.docx
├── src/
│ └── org/firstinspires/ftc/teamcode/
│ ├── RobotHardware.java
│ ├── AutonomousOpMode.java
│ ├── TeleOpMode.java
│ ├── PIDController.java
│ ├── FuzzyController.java
│ └── VisionRecognition.java

## 🚀 Funcionalidades

- **Autonomous Mode**: Identifica argolas na arena e executa ações como lançamento de discos, entrega do gol pêndulo e estacionamento usando sensores.
- **TeleOperated Mode**: Controle total do robô com ajustes finos, toggle de motores e ativação inteligente de servos.
- **Fuzzy Logic Controller**: Controle inteligente de RPM no lançador.
- **PID Controller**: Controle de precisão baseado em malha fechada.
- **Vision System**: Reconhecimento de padrões com TensorFlow para tomada de decisão autônoma.

## 🧰 Tecnologias e Bibliotecas

- Java (FTC SDK)
- TensorFlow Lite (FTC-integrado)
- Color Sensor & Encoders
- IDE: Android Studio

## 📄 Documentação

Veja a pasta `docs/` para o caderno de engenharia, formulário do prêmio de controle e o portfólio do projeto.

## 👨‍💻 Créditos

Reconstruído por [Pedro Otavio Nascimento Campos de Oliveira](https://github.com/pedrootavio), com base no trabalho desenvolvido pela equipe Alpha Technology #17739.

## 📜 Licença

Este projeto está licenciado sob os termos da [MIT License](./LICENSE).
