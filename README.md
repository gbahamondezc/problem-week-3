## Problema semana 3 SimpliRoute 
#### Adopcion de mascotas.


Diseñe e implemente un servicio para un refugio de animales que tiene perros y gatos.
Este refugio tiene la politica de entregar la mascota que lleva más tiempo en el refugio, la persona que quiere adoptar una mascota solo puede elegir si quiere un perro o un gato o cualquiera.
El sistema tiene que ser capaz de agregar un perro o un gato y entregar un perro, un gato o cualquiera (siempre siguiendo la regla de entregar el más antiguo).

**Ejemplo**
```
addDog dog1
addDog dog2
addDog dog3
addCat cat1
addCat cat2
addDog dog4
addCat cat3
addCat cat4

getDog -> dog1
getCat -> cat1
getPet -> dog2
getPet -> dog3
getPet -> cat2
getPet -> dog4
getPet -> cat3
getDog -> null
getCat -> cat4
getCat -> null
getPet -> null
```