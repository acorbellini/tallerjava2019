[![Run on Repl.it](https://repl.it/badge/github/acorbellini/tallerjava2019)](https://repl.it/github/acorbellini/tallerjava2019)

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

# Ejercicio 4: Encontrar el error usando un test

El objetivo en este caso es encontrar el error (supongamos, reportado por un usuario). Crear un test para evidenciar el error en Ejercicio4Test.java y luego solucionarlo.

# Ejercicio 5: Encontrar el error usando un test

El código no funciona como debería, la lista de strings no se imprime como el test espera. Además, falta considerar casos extremos para formatear correctamente (enviar un string, solo 2 strings, etc.).


Autor: Alejandro Corbellini

