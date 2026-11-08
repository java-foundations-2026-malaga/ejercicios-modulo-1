
# Curso Oracle Java Foundations 2026

Esta colección contiene 20 actividades autocorregibles diseñadas para alumnos que usan Eclipse IDE con Java 21, Maven y Git.

## Estructura de la solución

- Cada actividad es un proyecto Maven independiente.
- Cada proyecto contiene código base, tests JUnit 5 y un workflow de GitHub Actions.

## Instalación

1. Instala Java 21 (OpenJDK o Temurin).
2. Instala Eclipse IDE para Java Developers.
3. Instala Maven si quieres usarlo desde la línea de comandos.
4. Instala Git.

## Importar un proyecto Maven en Eclipse

1. Abre Eclipse.
2. Ve a `File > Import...`.
3. Selecciona `Maven > Existing Maven Projects` y haz clic en `Next`.
4. Selecciona la carpeta raíz del proyecto (por ejemplo `actividad01`).
5. Marca el proyecto que aparece y haz clic en `Finish`.

## Ejecutar programas Java en Eclipse

1. En el `Package Explorer`, abre `src/main/java` y selecciona la clase `ActividadNN`.
2. Haz clic derecho en la clase.
3. Elige `Run As > Java Application`.

## Ejecutar tests en Eclipse

1. Haz clic derecho en el proyecto o en la clase de test dentro de `src/test/java`.
2. Selecciona `Run As > JUnit Test`.
3. Eclipse mostrará resultados verdes si el test pasa o rojos si falla.

## Commit y push desde Eclipse

1. Abre la vista `Git Staging` (`Window > Show View > Other... > Git > Git Staging`).
2. Arrastra los archivos modificados desde `Unstaged Changes` a `Staged Changes`.
3. Escribe un mensaje de commit.
4. Haz clic en `Commit and Push`.

## Interpretar GitHub Actions

1. En GitHub, entra en el repositorio.
2. Ve a la pestaña `Actions`.
3. Selecciona el flujo de trabajo `Autocorrección` y la ejecución de tu rama.
4. Si el workflow pasa, el ejercicio está aprobado.
5. Si falla, revisa los tests y el mensaje de error.

## Ejemplo de flujo de trabajo para el profesor

- Revisa los repositorios de la organización `java-foundations-2026-malaga`.
- En la pestaña `Actions`, filtra por rama (`Branch`) para ver las entregas de cada alumno.
- Un estado verde significa que el código pasó los tests.
- Un estado rojo significa que el alumno debe corregir el ejercicio.

## Cómo entregar las actividades

La rama `main` está protegida: contiene los enunciados originales y no se puede modificar.
Cada alumno trabaja en **su propia rama**, con su nombre.

1. Clona el repositorio:
   `git clone https://github.com/java-foundations-2026-malaga/REPOSITORIO.git`
2. Crea tu rama con tu nombre y apellido, en minúsculas y sin tildes ni espacios (por ejemplo `juan-perez`):
   `git checkout -b juan-perez`
   (En Eclipse: botón derecho sobre el proyecto > `Team > Switch To > New Branch...`).
3. Importa en Eclipse la carpeta `actividadNN` que vayas a hacer (`File > Import... > Maven > Existing Maven Projects`), resuélvela y comprueba los tests con `Run As > JUnit Test`.
4. Haz commit y sube **tu rama**:
   `git add .` → `git commit -m "Actividad NN"` → `git push -u origin juan-perez`
   (En Eclipse: `Git Staging` > `Commit and Push...`).
5. En la pestaña **Actions** del repositorio verás el resultado de la autocorrección de cada actividad que hayas modificado: ✅ aprobada o ❌ con los errores.

Si al hacer push te aparece un error sobre `main`, es que estás en la rama equivocada: cambia a tu rama con `git checkout juan-perez`.
