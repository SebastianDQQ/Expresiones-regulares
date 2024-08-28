MAIN:
-Descripción
El programa Main es una herramienta que valida cadenas de texto utilizando un conjunto de expresiones regulares predefinidas.
El programa recibe una cadena como argumento desde la línea de comandos y verifica si coincide con alguna de las siguientes expresiones regulares:
   - "Hola mundo": Busca la frase exacta "Hola mundo".
   - "Hola mundo" (cualquier combinación de mayúsculas y minúsculas): Busca la frase "Hola mundo" en cualquier combinación de letras mayúsculas y minúsculas.
   - Palabras clave: Busca las palabras "Java", "Python", "Go", "Pascal" o "Perl".
   - Correo de la Universidad de Sonora: Valida correos electrónicos con los dominios @unison.mx o @uson.mx.
   - Nombre de archivo con prefijo ISI: Valida nombres de archivos que comiencen con "ISI", seguidos de 4 dígitos (año), un dígito que puede ser 1 o 2, y tengan una extensión .txt o .csv (por ejemplo, ISI2022-2.csv).
-Explicación del Código
  - Entrada de Datos: El programa recibe una cadena como argumento desde la línea de comandos.
  - Validación: La cadena se compara con varias expresiones regulares en un bucle. Cada expresión tiene un mensaje asociado que se muestra si la cadena coincide con esa expresión.
  - Salida: Si la cadena coincide con alguna expresión, el programa imprime el mensaje correspondiente y termina. Si no hay coincidencias, el programa indica que la cadena no es válida.
