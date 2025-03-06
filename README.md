Software para la gestión de los juegos anuales organizados por **Squirrel Games**. Este sistema permite administrar los participantes, empleados (Pink Guards) y las pruebas, asegurando un desarrollo fluido y justo de las competencias.

## **Características Principales**

- **Gestión de ediciones anuales:** Administra los años, ubicaciones y eventos.
- **Administración de participantes:** Controla la inscripción, deudas y detecta infiltrados.
- **Jerarquía del personal:** Organiza los Pink Guards en diferentes rangos (Worker, Soldier, Manager).
- **Gestión de pruebas:** Permite simular pruebas, calcular el éxito y gestionar eliminaciones.
- **Validaciones y excepciones personalizadas:** Asegura que todas las reglas del juego sean respetadas mediante excepciones.

## **Instalación**

### Prerrequisitos

Asegúrate de tener lo siguiente antes de instalar el sistema:

- **Java 23** o superior.

### Pasos de instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/usuario/squirrel-games.git
   ```
2. Navega a la carpeta del proyecto:
   cd squirrel-games

3. Compila el proyecto usando javac:
   javac -d bin -cp src $(find src -name "*.java")

4. Ejecuta el programa:
   java -cp bin squirrelGames.Main

## **Uso del Sistema**

1. **Registrar una nueva edición de los juegos.**
2. **Agregar participantes y empleados (Pink Guards).**
3. **Asignar pruebas** y realizar simulaciones.
4. **Controlar eliminaciones** y verificar infiltrados.

## **Excepciones Implementadas**

El sistema maneja excepciones personalizadas para garantizar la validez de los datos y las reglas del juego:

- **InfiltradoNoEliminableException:** No permite eliminar infiltrados en situaciones restringidas.
- **JugadorDuplicadoException:** Detecta intentos de añadir jugadores ya existentes.
- **PorcentajeInvalidoException:** Para cuando un porcentaje ingresado es inválido.
- **SimulacionNoPermitidaException:** Evita simulaciones en condiciones incorrectas.
- **SupervisorInvalidoException:** Controla asignaciones de supervisores no permitidas.

## **Gestión de Juegos**

La clase `Juegos` se encarga de gestionar las ediciones anuales del evento, incluyendo:

- **Año** y **Ubicación** de la edición.
- **Lista de participantes** registrados.
- **Lista de Pink Guards** (empleados) asignados.
- **Lista de pruebas** que se realizarán.

### Métodos principales:

- `agregarParticipante(Participantes participante)`: Agrega un nuevo participante.
- `agregarPinkGuard(PinkGuard pinkGuard)`: Agrega un nuevo Pink Guard.
- `agregarPruebas(Pruebas pruebas)`: Agrega una nueva prueba.
- Métodos `get` para acceder a la información de los juegos.

## **Jerarquía del Personal (Pink Guards)**

Los empleados están organizados en tres rangos:

- **Worker:** Nivel básico de los Pink Guards.
- **Soldier:** Guardias con mayor autoridad.
- **Manager:** Supervisores y gestores del equipo.

### Clases relacionadas con armas:

- **ArmasManager.java** (para Managers)
- **ArmasSoldier.java** (para Soldiers)

## **Estructura del Proyecto**

```
SquirrelGames
│── JRE System Library [jre]
│── src
│   ├── squirrelGames
│   │   ├── Main.java
│   │   ├── exceptions
│   │   │   ├── InfiltradoNoEliminableException.java
│   │   │   ├── JugadorDuplicadoException.java
│   │   │   ├── PorcentajeInvalidoException.java
│   │   │   ├── SimulacionNoPermitidaException.java
│   │   │   ├── SupervisorInvalidoException.java
│   │   ├── integrantesJuego
│   │   │   ├── EstadoParticipante.java
│   │   │   ├── Participantes.java
│   │   │   ├── PinkGuard.java
│   │   │   ├── pinkGuardsRanks
│   │   │   │   ├── ArmasManager.java
│   │   │   │   ├── ArmasSoldier.java
│   │   │   │   ├── Manager.java
│   │   │   │   ├── Soldier.java
│   │   │   │   ├── Worker.java
│   │   ├── juegos
│   │   │   ├── Juegos.java
│   │   ├── pruebas
│   │   │   ├── Pruebas.java
│── Cobertura de código (Porcentaje de cobertura)
│   ├── jacoco-resources
│   ├── SquirrelGames
│   ├── index.html
│   ├── jacoco-sessions.html
│── doc (Documentación y Javadoc)
│   ├── squirrelGames
│── test (Pruebas Unitarias)
│   ├── squirrelGames
│   │   ├── integrantesJuego
│   │   ├── juegos
│   │   ├── pruebas
│── pom.xml
│── README.md

```

## **Tecnologías Utilizadas**

- **Java 23**
- **JUnit5** (para pruebas unitarias)
- **Maven**
- **Jira** (para organización del proyecto)
- **Discord** (para comunicación)
- **Intellij Community Edition**
- **Visual Studio Code**
- **Github Desktop**
- **GitKraken Desktop**

## **Contacto**

- 💙 GitHub: Felipe - [https://github.com/sargon494](https://github.com/sargon494)
- 💙 GitHub: Antoine - [https://github.com/AntoineGiz77](https://github.com/AntoineGiz77)
- 💙 GitHub: Nestor - [https://github.com/Nestorrr11](https://github.com/Nestorrr11)
- 💙 GitHub: David - [https://github.com/DavidPP161](https://github.com/DavidPP161)