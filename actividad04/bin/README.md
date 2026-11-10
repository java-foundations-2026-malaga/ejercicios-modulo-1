# Actividad 04

Corregir un programa con llaves desbalanceadas.

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
2. Abre `src/main/java/actividad04/Actividad04.java`.
3. Corrige el código si es necesario.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta los tests desde `src/test/java/actividad04/Actividad04Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
