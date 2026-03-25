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
 