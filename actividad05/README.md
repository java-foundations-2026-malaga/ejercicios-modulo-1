# Actividad 05

Corregir el nombre de la clase pública en el archivo.

## Objetivo

- Ejecutar el programa y comprobar que la salida coincide con la esperada.
- Utilizar Eclipse IDE para corregir el código.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Hola
```

## Instrucciones para Eclipse

1. Importa este proyecto en Eclipse como un proyecto Maven.
2. Abre `src/main/java/actividad05/Actividad05.java`.
3. Corrige el código si es necesario.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta los tests desde `src/test/java/actividad05/Actividad05Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- El workflow `Java CI` se ejecuta automáticamente en cada `push`.
- Si pasa, el repositorio está aprobado.
- Si falla, revisa los errores de compilación o los tests.
