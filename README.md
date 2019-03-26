# Ejercicio 1: Error de Java

El ejercicio intenta imprimir por pantalla el string "A B". A es el valor de data y B es el valor asociado a la clave test en el mapa.

# Ejercicio 2: Error de Lógica y Eficiencia

Encontrar el camino más largo hasta la hoja sin contar repetidos.
```
4
1 4
2 1 2
```
debería dar 4: 4->1->2->3

```
4
1 4
1 1 2
1
```
debería dar 2: 4->1

El ejercicio tiene 2 errores: No funciona y es ineficiente para árboles grandes.

# Ejercicio 3: Error de memoria

 El ejercicio crea 50k+1 hijos de un objeto padre y luego crea un nuevo padre sobrescribiendo la variable que referencia al padre anterior. A dicho nuevo padre le asigna 50k nuevos hijos.
La ejecución termina con 100001 hijos en lugar de 50001 hijos, es decir, 50k hijos de más.

Autor: Alejandro Corbellini

