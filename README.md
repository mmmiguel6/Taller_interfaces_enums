# Taller de Interfaces y Enums en Java

Este repositorio contiene la resolución completa de los **4 laboratorios guiados** y los **5 retos** propuestos en el capítulo *"Interfaces y Enums en Java"* de Programación Orientada a Objetos.

Cada ejercicio está organizado como un **módulo independiente** de IntelliJ IDEA, con su propio `Main.java` como punto de entrada, así que se pueden compilar y ejecutar por separado sin que se mezclen entre sí.

## 📋 Requisitos

- JDK 21 o superior (el código usa `records`, `sealed interfaces` y `switch` con patrones).
- IntelliJ IDEA (Community o Ultimate) — opcional, también compila con `javac` desde la terminal.

## 📂 Estructura del proyecto

| Carpeta | Descripción |
|---|---|
| `lab1_playlist` | **Laboratorio 1** · Ordena una playlist usando `Comparable`, `Comparator` y `Predicate`. |
| `lab2_pasarela` | **Laboratorio 2** · Pasarela de pagos polimórfica (tarjeta de crédito, billetera digital, efectivo y criptomoneda). |
| `lab3_semaforo` | **Laboratorio 3** · Enum `Semaforo` con transiciones de estado y cálculo de duración del ciclo. |
| `lab4_cafeteria` | **Laboratorio 4 (integrador)** · Sistema de pedidos de una cafetería con enums, records, interfaces funcionales y una máquina de estados. |
| `reto1_figuras` | **Reto 1** · Interfaz sellada `Figura` con cálculo de área y perímetro usando `switch` con patrones de récord. |
| `reto2_baraja` | **Reto 2** · Generación y barajado de una baraja española de 48 cartas con enums. |
| `reto3_calculadora` | **Reto 3** · Enum `Operador` cuyo comportamiento se define con lambdas (`DoubleBinaryOperator`) en lugar de cuerpos por constante. |
| `reto4_promociones` | **Reto 4** · Interfaz funcional `Promocion` con un método `default` que combina varios descuentos sin superar el subtotal. |
| `reto5_permisos` | **Reto 5** · Enum `Rol` con `EnumSet<Permiso>` para modelar permisos de acceso por rol. |

## ▶️ Cómo ejecutar cada ejercicio

### Opción A · Desde IntelliJ IDEA

1. Clona este repositorio y ábrelo en IntelliJ (`File > Open`).
2. En el árbol de proyecto, entra a la carpeta del ejercicio que quieras probar.
3. Abre su `Main.java`.
4. Haz clic en la flecha verde ▶ junto a `public static void main` (o usa el atajo `Ctrl+Shift+F10`).

### Opción B · Desde la terminal

```bash
git clone https://github.com/mmmiguel6/Taller_interfaces_enums.git
cd Taller_interfaces_enums/nombre_de_la_carpeta
javac *.java
java Main
```

## 🧑‍💻 Autor

Miguel — Taller de Interfaces y Enums, Programación Orientada a Objetos.
