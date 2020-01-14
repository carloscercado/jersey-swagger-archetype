# Bienvenidos

Este arquetipo de Maven fue creado para facilitar la creación de APIs REST sobre Java. 
Se utiliza **Swagger** para la documentación automática del API e **Hibernate** para el manejo de persistencia. 


# Instalación y uso

Para crear un proyecto usando este arquetipo como base debe seguir los siguientes pasos.


```bat
git clone https://github.com/carloscercado/jersey-swagger-archetype.git \

cd jersey-swagger-archetype

mvn archetype:create-from-project

cd target\generated-sources\archetype

mvn install
```
Entonces, ya con estos comandos, habriamos clonado el proyecto, creado e instalado el arquetipo, para que forme parte de nuestro catalogo de arquetipos de Maven.

Ahora solo queda crear un proyecto usando este arquetipo.

```bat
mvn archetype:generate -Dfilter:com.kalosoftware:jersey-swagger-hibernate
```
Se abrirá una ventana interactiva y quedara el proyecto creado listo para ser desplegado.