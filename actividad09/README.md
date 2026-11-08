# Actividad 09

Crear un programa que imprima 1, 2 y 3 en líneas separadas.

## Objetivo

- Ejecutar el programa y comprobar que la salida coincide con la esperada.
- Utilizar Eclipse IDE para corregir el código.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
1
2
3
```

## Instrucciones para Eclipse

1. Importa este proyecto en Eclipse como un proyecto Maven.
2. Abre `src/main/java/actividad09/Actividad09.java`.
3. Corrige el código si es necesario.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta los tests desde `src/test/java/actividad09/Actividad09Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- El workflow `Java CI` se ejecuta automáticamente en cada `push`.
- Si pasa, el repositorio está aprobado.
- Si falla, revisa los errores de compilación o los tests.
