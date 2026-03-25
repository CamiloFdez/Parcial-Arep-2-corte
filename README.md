# Parcial-Arep-2-corte

# Problem context: 
Conjetura de Collatz
La conjetura de Collatz dice que si usted crea una secuencia de números, a partir de cualquier entero positivo, siguiendo las reglas descritas abajo, siempre la secuencia terminará en le número 1. Esta conjetura aún no se ha demostrado.
 
Las reglas son:
 f(n)=n/2
 si n es par.
f(n)=3n+1
 si n es impar.
La secuencia se construye a partir de un número dado k
 así:
a0=k
ai=f(ai−1)
Por ejemplo, dato el número k=13
  la secuencia sería:

13→40→20→10→5→16→8→4→2→1

Detalles adicionales de la arquitectura y del API
Servicio REST para construcción de la secuencia de Collatz, el servicio puede ser GET o POST. El servicio recibe el número inicial en la variable del query con el nombre "value".

Ejemplo de una llamado:
 
http://amazonxxx.x.xxx.x.xxx:{port}/collatzsequence?value=13
 
Salida. El formato de la salida y la respuesta debe ser un JSON con el siguiente formato
 
{</div> <div> </div> <div> "operation": "collatzsequence",</div> <div> </div> <div> "input":  13,</div> <div> </div> <div> "output":  "13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1"</div> <div> </div> <div>}

## Prueba en local 

Para la prueba en local debemos ejecutar los 2 servicios del proxy y del math en diferentes terminales 

![image](https://github.com/CamiloFdez/Parcial-Arep-2-corte/blob/main/images/localhost.png)
 
Como podemos ver en la foto al momento de correr la url asignada y poner al final un numero nos da la respuesta del numero de collatz con toda la secuencia del mismo, despues de eso creamos un index.html y ya con eso nos queda una interfaz como esta:

![image](https://github.com/CamiloFdez/Parcial-Arep-2-corte/blob/main/images/index.png)

Si nosotros hacemos caer algun servicio o los 2 en este caso aparece de esta manera:

![image](https://github.com/CamiloFdez/Parcial-Arep-2-corte/blob/main/images/parando.png)


## AWS Deployment

Para el despliegue de aws primero debemos crear las instancias de cada servicio que en este caso es para el proxy y el servicio math.

![image](https://github.com/CamiloFdez/Parcial-Arep-2-corte/blob/main/images/creandoInstancias.png)

Aca como podemos ver creamos todas las instancias, ahora lo que vamos a hacer es configurar la seguridad de cada una de ellas para guardar los puertos, aca tenemos la seguridad de cada uno de ellos:

Proxy: 

![image](https://github.com/CamiloFdez/Parcial-Arep-2-corte/blob/main/images/seguridadProxy.png)

Math:

![image](https://github.com/CamiloFdez/Parcial-Arep-2-corte/blob/main/images/seguridadMath.png)

Despues lo que haremos es conectar las maquinas por medio de ssh con sus respectivas keys:

![image](https://github.com/CamiloFdez/Parcial-Arep-2-corte/blob/main/images/awsconnect.png)

Ahora se descarga git, maven y java para cada una de las maquinas:

Java:

![image](https://github.com/CamiloFdez/Parcial-Arep-2-corte/blob/main/images/awsjavains.png)

Maven y git:

![image](https://github.com/CamiloFdez/Parcial-Arep-2-corte/blob/main/images/awsgitmavn.png)



https://github.com/user-attachments/assets/863d794f-1d1c-4f58-a189-46e2037deb8c


# Video
Aca se adjuntara la URL del video: 
