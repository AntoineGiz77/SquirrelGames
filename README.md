Software para la gestión de los juegos anuales organizados por **Squirrel Games**. Este sistema permite administrar los participantes, empleados (Pink Guards) y las pruebas, asegurando un desarrollo fluido y justo de las competencias.

## 📌 **Características Principales**

- **Gestión de ediciones anuales:** Administra los años, ubicaciones y eventos.
- **Administración de participantes:** Controla la inscripción, deudas y detecta infiltrados.
- **Jerarquía del personal:** Organiza los Pink Guards en diferentes rangos (Worker, Soldier, Manager).
- **Gestión de pruebas:** Permite simular pruebas, calcular el éxito y gestionar eliminaciones.
- **Validaciones y excepciones personalizadas:** Asegura que todas las reglas del juego sean respetadas mediante excepciones.

## 🚀 **Instalación**

### Prerrequisitos

Asegúrate de tener lo siguiente antes de instalar el sistema:

- **Java 23** o superior.

### Pasos de instalación

1. Clona el repositorio:
   ```bash
   git clone https://github.com/usuario/squirrel-games.git
   ```
2. Navega a la carpeta del proyecto:
   ```bash
   cd squirrel-games
   ```
3. Compila y ejecuta el programa:
   ```bash
   javac Main.java
   java Main
   ```

## 📚 **Uso del Sistema**

1. **Registrar una nueva edición de los juegos.**
2. **Agregar participantes y Pink Guards** (empleados).
3. **Asignar pruebas** y realizar simulaciones.
4. **Controlar eliminaciones** y verificar infiltrados.

## ❗ **Excepciones Implementadas**

El sistema maneja excepciones personalizadas para garantizar la validez de los datos y las reglas del juego:

- **DatoInvalidoException:** Se lanza cuando un dato ingresado no cumple con los requisitos.
- **IdentificadorUnicoException:** Impide duplicar identificadores únicos.
- **InfiltradoNoEliminableException:** No permite eliminar infiltrados en situaciones restringidas.
- **JugadorDuplicadoException:** Detecta intentos de añadir jugadores ya existentes.
- **PorcentajeInvalidoException:** Para cuando un porcentaje ingresado es inválido.
- **SimulacionNoPermitidaException:** Evita simulaciones en condiciones incorrectas.
- **SupervisorInvalidoException:** Controla asignaciones de supervisores no permitidas.

## 🏆 **Gestión de Juegos**

La clase `Juegos` se encarga de gestionar las ediciones anuales del evento, incluyendo:

- **Año** y **Ubicación** de la edición.
- **Lista de participantes** registrados.
- **Lista de Pink Guards** (empleados) asignados.
- **Lista de pruebas** que se realizarán.

### Métodos principales:

- `agregarParticipante(Participantes participante)`: Agrega un nuevo participante.
- `agregarPinkGuard(PinkGuard pinkGuard)`: Agrega un nuevo Pink Guard.
- `agregarPruebas(Pruebas prueba)`: Agrega una nueva prueba.
- Métodos `get` para acceder a la información de los juegos.

## 🛡️ **Jerarquía del Personal (Pink Guards)**

Los empleados están organizados en tres rangos:

- **Worker:** Nivel básico de los Pink Guards.
- **Soldier:** Guardias con mayor autoridad.
- **Manager:** Supervisores y gestores del equipo.

### Clases relacionadas con armas:

- **ArmasManager.java** (para Managers)
- **ArmasSoldier.java** (para Soldiers)

## 📁 **Estructura del Proyecto**

```
/squirrel-games
│── /src
│   ├── Main.java
│   ├── models/
│   ├── controllers/
│   ├── exceptions/
│   │   ├── DatoInvalidoException.java
│   │   ├── IdentificadorUnicoException.java
│   │   ├── InfiltradoNoEliminableException.java
│   │   ├── JugadorDuplicadoException.java
│   │   ├── PorcentajeInvalidoException.java
│   │   ├── SimulacionNoPermitidaException.java
│   │   ├── SupervisorInvalidoException.java
│   ├── guards/
│   │   ├── Worker.java
│   │   ├── Soldier.java
│   │   ├── Manager.java
│   │   ├── ArmasSoldier.java
│   │   ├── ArmasManager.java
│   ├── participants/
│   │   ├── Participantes.java
│   │   ├── EstadoParticipante.java
│   ├── juegos/
│   │   ├── Juegos.java
│   ├── pruebas/
│   │   ├── Pruebas.java
│   ├── utils/
│── /docs
│── README.md
│── .gitignore
```

## 🏰 **Tecnologías Utilizadas**

- **Java 23**
- **JUnit** (para pruebas unitarias)

## 📝 **Licencia**

Este proyecto está bajo la licencia **MIT**.

## 📞 **Contacto**

- 💙 GitHub: [https://github.com/sargon494](https://github.com/sargon494)
- 💙 GitHub: [https://github.com/AntoineGiz77](https://github.com/AntoineGiz77)
- 💙 GitHub: [https://github.com/Nestorrr11](https://github.com/Nestorrr11)
