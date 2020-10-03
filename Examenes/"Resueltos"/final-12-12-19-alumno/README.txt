## Antes de empezar
 
a.Crear un proyecto nuevo desde su IDE llamandolo final-chanchito-original. Una vez creado copiar todas las carpetas con clases de este zip.
b.Crear un proyecto nuevo desde su IDE llamandolo final-chanchito-alumno. Una vez creado copiar todas las carpetas con clases de este zip.
c.Trabajar SIEMPRE sobre el proyecto final-chanchito-alumno


## IMPORTANTE

Para aprobar este examen el/la alumno/a debe entregar una solución integral y completa que resuelva el problema dado, demostrando un alto dominio de POO, así como también de UML.
En este sentido cualquiera de las siguientes situaciones conlleva a la desaprobación AUTOMATICA del examen integrador:

	1. NO entregar código desarrollado por el propio/a alumno/a.
	2. NO entregar diagramas UML o diagrams con errores GROSEROS de notación.
	3. NO detallar los principios y problemas de diseño que presenta el código entregado.


## Consignas

1) El modelo de dominio pertenece a la conocida historia del lobo y los 3 chanchitos. Lea y ejecute BosqueTest. Luego analice el modelo otorgado y conteste:

	a) ¿Qué potenciales problemas de diseño encuentra en el codigo? Enumérelos explicando PARA CADA UNO de ellos porqué considera que representan un problema de diseño.
	b) ¿Se viola algún(os) principio(s) de diseño ? ¿Cual(es)? 

2) 	En base a los items que ud. detalle en el punto (1) realice una mejora de disenio total del proyecto que ademas incluya esta nueva parte de la historia:
 	
 		"El lobo frustrado con no poder derribar la casa de cemento, decide ir a una tienda y comprarse un TALADRO ROTOPERCUTOR capaz de destruir la casa de cemento"
		
		a) Realice PRIMERO un diagrama de clases A MANO ALZADA de como sera su nuevo disenio incorporando esta ultima parte de la historia.
		b) Realice ahora en codigo dicha mejora de disenio incorporando la ultima parte de la historia tambien


3)	a) Explique el concepto de PERSISTENCIA en POO.
	b) ¿Que tipos de persistencia conoce?
	c) ¿Como la implementan JAVA y SMALLTALK?

4) Lecturas obligatorias: A determinar por el examinador.
---------------------------------------------------------------------------
RESOLUCION

1) El primer error que veo, es que el pquete de Test esta en la misma carpeta del modelo: tendrian que ir en carpetas separadas.
- el unico test que hay NO es unitario, hay mas de un assert dentro de el, lo que dificulta saber qu� esta fallando en caso
de que el test no pase.
-el uso de numeros magicos esta mal visto como practica de dise�o, queda desprolijo. lo mejor seria tener un atributo Material
que sea una clase abstracta, y que cada material sepa sus caracteristicas.
-la accion de que el lobo ataque una casa, no deberia estar ubicada en la clase Bosque: el bosque solo deberia tener la UNICA responsabilidad
de tener casas (no cumple principio de responsabidad unica)
-los if�s anidados violan el tell, don�t ask: lo que se hace es, realizar una accion seg�n el tipo de clase que sea. eso deberia resolverse
mediante polimorfismo, eliminando los condicionales.
-la herramienta debe ser una clase abstracta, que tenga tantas clases herederas como cantidad herramientas tenga el lobo, y asi seria mas
facil cumplir el principio de Open Closed: abierto para extension, pero cerrado para modificaciones: si quiero agregar una nueva herramienta,
deberia modificar la clase Herramienta, cosa q viola este principio. Lo correcto seria crear clases nuevas q sean herederas de Herramienta.
SUPUESTO: el taladro peude romper todas las casas.

3) PERSISTENCIA: caracteristica que puede tener un dato o estado que le permite sobrevivir al proceso que lo creo.
Un programa orientado a objetos debe permitir q los objetos persistan para mantener "su vida mas alla de la vida del programa".
Gracias a la persistencia, un objeto puede conservar su estado en un medio de almacenamiento permanente.
PERSISTENCIA NATIVA: provista por la plataforma. Resuelve referencias circulares, no es extensible ni portable a otros lenguajes
PERSISTENCIA NO NATIVA: programada a mano o provista por una biblioteca externa. Es mas compleja, pero mas versatil

Java implementa de forma nativa la persistencia.
