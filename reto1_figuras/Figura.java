/**
 * Reto 1 · Figuras con perímetro
 * Se amplía la jerarquía sellada de la sección 1.9 con Cuadrado.
 * Al agregarlo a "permits", el compilador exige actualizar TODOS los
 * switch exhaustivos (area() y perimetro()) en Main: eso es exhaustividad.
 */
public sealed interface Figura permits Circulo, Rectangulo, Triangulo, Cuadrado {
}
