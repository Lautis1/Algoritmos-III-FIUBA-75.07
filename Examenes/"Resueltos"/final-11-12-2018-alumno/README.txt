Antes de empezar
================
 
1. Crear un proyecto nuevo desde su IDE llamandolo final-13-12-18-original. Una vez creado copiar todas las carpetas con clases de este zip.
2. Crear un proyecto nuevo desde su IDE llamandolo final-13-12-18-alumno. Una vez creado copiar todas las carpetas con clases de este zip.
3. Trabajar SIEMPRE sobre el proyecto final-13-12-18-alumno.

Consignas
=========

1. Leer las pruebas del archivo Pruebas.java y analizar la implementación propuesta.
2. Identifique potenciales problemas de diseño en el código. Enumérelos en una hoja y justifique por qué considera que representan
	 un problema de diseño.
3. ¿Se viola algún principio de diseño? ¿Cuál(es)?
4. En base a los items que detalló en el punto (2) realice una mejora de diseño total del proyecto que además incluya la posibilidad
	de de agregar un cupón que bonifique el envío a domicilio local (es decir, el envío dentro del país pasaría a ser gratis si
	se aplica ese cupón).
5. Realice un diagrama de clases a mano alzada de cómo sería su nuevo diseño.
6. Realice por lo menos un diagrama de secuencia (a mano alzada) de la o las situaciones que considere relevantes.
7. Puede modificar todo el código (de la solución y de las pruebas), agregando y/o quitando todas las clases que 
	considere apropiadas, justificando cada decisión.
###########################################################################################
RESOLUCION

CLASE CUPON: es un simple enumerador donde se tienen guardados los cupones. Esto no es una buena practica de POO y es desprolijo,
por lo que se deberian separar todos los cupones en distintas clases.

CLASE ENVIO INTERNACIONAL: numero magico "1.2" no es una buena practica de dise�o. deberia ser un atributo privado/protegido d esa clase.
(lo mismo en clase envio local)

La clase de pruebas esta en el mismo paquete que las clases fuente: se debe meter en otro paquete solo para pruebas para tener
un bajo acoplamiento y una alta cohesion para dar una vision glboal del sistema, y se aisla la complejidad del codigo de la fuente en un
paquete distinto.

Me parece buena idea manejar a los productos con Strings, ya que sino, habria q tener una clase para cada pedido, y una tienda
puede tener muchisimos pedidos, lo q resultaria en muchisimas clases, y no seria porlijo.

Voy a modelar los pedidos como una entidad aparte, y en la tienda los guardo en un array de Pedidos. Cada pedido va a tener un codigo ID para
distinguirlos, un listado de productos y un precio.

En la clase TiendaOnline se viola el principio de unica responsabilidad, ya que se encarga de agregar productos al pedido, cuando el pedido
es el encargado de eso, asi como de agregar cupones.

Tambien se viola el principio de openClosed, ya que si quiero agregar un nuevo cupon, debo modificar la clase cupon (agregando el nuevo al
enum) y agregar una rama al condicional if de la clase TiendaOnline, cuando esto se deberia solucionar solamente creando una clase para
el nuevo cupon y que el se encargue de responder los mensajes a su manera.

Las pruebas no son unitarias y tienen nombres poco informativos: separar pruebas, testear cosas peque�as y ponerles nombres bien claros
que con solo leer el nombre, ya sepas de que se encarga esa prueba.

El nombre de la tienda se podria pasar por parametro para evitar metodos getters y setters.
	