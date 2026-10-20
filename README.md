Este programa está diseñado para modelar y gestionar la lectura y captura de datos codificados en productos o tickets mediante diferentes tecnologías de escaneo óptico (como lectores láser de barras y cámaras de códigos QR) utilizando polimorfismo, una interfaz común de lectura y una clase coordinadora de punto de venta mediante programación orientada a objetos (por ejemplo, en Java).

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la interfaz LectorOptico: Establece el contrato modular estándar que todo dispositivo de captura óptica debe cumplir, declarando el método abstracto fundamental String escanearCodigo().

Implementa clases concretas (EscanerLaser, CamaraQR): Heredan y ejecutan la interfaz adaptando la simulación de captura a sus respectivas tecnologías (como la emisión de un haz infrarrojo para códigos lineales de barras o el enfoque de una matriz bidimensional para códigos QR).

Diseña la clase PuntoVenta: Actúa como el coordinador o terminal comercial que mantiene una asociación con la abstracción del lector óptico (LectorOptico lectorActual), permitiendo procesar artículos y cambiar de periférico de lectura de manera dinámica en tiempo de ejecución.

Ejecuta la prueba polimórfica (main): Instancia un punto de venta, simula el paso de artículos alternando de forma intercambiable entre el escáner láser y la cámara QR, y muestra los códigos detectados por consola.
