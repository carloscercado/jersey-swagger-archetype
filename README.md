# Bienvenidos

Este arquetipo de Maven fue creado para facilitar la creación de APIs REST sobre Java. 
Se utiliza **Jersey** para la creación de los servicios web,  **Swagger** para la documentación automática del API e **Hibernate** para el manejo de persistencia. 


## Instalación y uso

Para crear un proyecto usando este arquetipo, primero debe instalar el arquetipo en el catalogo de arquetipos de Maven local, para esto debe seguir los siguientes pasos:


```bat
git clone https://github.com/carloscercado/jersey-swagger-archetype.git 

cd jersey-swagger-archetype

mvn archetype:create-from-project

cd target\generated-sources\archetype

mvn install
```
Entonces, ya con estos comandos, habriamos clonado el proyecto, creado e instalado el arquetipo.

Ahora solo queda crear un proyecto basandonos en el.

```bat
cd ..

mvn archetype:generate -Dfilter:com.kalosoftware:jersey-swagger-hibernate
```
Se abrirá una ventana interactiva, donde debemos introducir nuestro **GroupId**, **ArtifactId**, **version** y demas datos, hecho esto quedara el proyecto creado listo para ser desplegado.