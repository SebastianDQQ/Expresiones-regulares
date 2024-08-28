import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("java RegexValidator <cadena_a_validar>");
            return;
        }

        String input = args[0];
        String[][] regexAndMessages = {
                {"\\bHola mundo\\b", "La cadena es una expresión regular exacta de 'Hola mundo'."},
                {"\\b[hH][oO][lL][aA] [mM][uU][nN][dD][oO]\\b", "La cadena coincide con 'Hola mundo' en cualquier combinación de mayúsculas y minúsculas."},
                {"\\b(Java|Python|Go|Pascal|Perl)\\b", "La cadena tiene una de las palabras: 'Java', 'Python', 'Go', 'Pascal', 'Perl'."},
                {"^[a-zA-Z0-9._%+-]+@(unison\\.mx|uson\\.mx)$", "La cadena es un correo válido de la Universidad de Sonora."},
                {"^ISI\\d{4}-[12]\\.(txt|csv)$", "La cadena es un nombre de archivo válido con el prefijo 'ISI'."}
        };

        boolean isValid = false;
        for (String[] regexAndMessage : regexAndMessages) {
            String regex = regexAndMessage[0];
            String message = regexAndMessage[1];
            if (Pattern.matches(regex, input)) {
                System.out.println(message);
                isValid = true;
                break;
            }
        }
        if (!isValid) {
            System.out.println("La cadena no es válida con ninguna de las expresiones regulares definidas.");
        }
    }
}