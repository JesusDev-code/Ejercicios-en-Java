package com.mycompany.sopadeletrass;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
//Jesus 
public class Sopadeletrass {
    // Variables globales
    static int intentos = 0;
    static int encontradas = 0;
    static int palabrasIncorrectas = 0;
    static int partidasganadas = 0;
    static String[][] usuarios = new String[10][5]; // Matriz para guardar hasta 10 usuarios con sus estadísticas
    static int usuario = -1;  // Indica si hay un usuario actual seleccionado (-1 no hay usuario activo)
    static int tamañoSopa = 10;  // Tamaño inicial 10x10
    
    public static void main(String[] args) {
        // Variables
        Scanner sc = new Scanner(System.in);
        String[][] tematicas = new String[10][5];
        String[] nombreTematicas = new String[10];
        String palabra, opcion;
        boolean opcionValida;

        //Colores
        String RESET = "\u001B[0m";
        String LILA = "\u001B[35m";
        String ROJO = "\u001B[31m";
        String AMARILLO = "\u001B[33m";
        
        // Inicializar temáticas
        tematicas[0] = new String[]{"KANT", "NIETZSCHE", "DESCARTES", "PLATON", "SENECA"}; // Filosofos
        tematicas[1] = new String[]{"CORTES", "PIZARRO", "ALMAGRO", "CERVANTES", "LEZO"}; // Personajes históricos españoles
        tematicas[2] = new String[]{"LORCA", "MACHADO", "GONGORA", "ALBERTI", "BECQUER"}; // Poetas españoles
        tematicas[3] = new String[]{"ALFONSO", "FERNANDO", "CARLOS", "FELIPE", "ISABEL"}; // Reyes españoles

        // Inicializar los nombres de las temáticas
        nombreTematicas[0] = "Filosofos";
        nombreTematicas[1] = "Personajes historicos espanholes";
        nombreTematicas[2] = "Poetas espanholes";
        nombreTematicas[3] = "Reyes espanholes";

        int[] numTematicas = {4};  // Iniciar con 4 temáticas predefinidas

        // Adquisición de datos
        do {
            System.out.println(LILA+"Bienvenido a su sopa de letras de confianza, lo mismo le divierte que le da dolor de cabeza."+RESET);
            System.out.println(" ¿Que desea hacer?");
            System.out.println(" Iniciar");
            System.out.println(" Crear usuario");
            if (usuario != -1) {
                System.out.println(" Ver estadisticas");
            }
            if (usuario != -1) {
                System.out.println(" Seleccion de usuario");
            }
            System.out.println(" Salir");
            System.out.println(AMARILLO+"Escriba la opcion: "+RESET);
            palabra = sc.nextLine();
            
            if (palabra.equalsIgnoreCase("iniciar")) {
                if (usuario == -1) {
                    System.out.println(ROJO+"Debe crear o seleccionar un usuario antes de iniciar el juego."+RESET);
                } else {
                    iniciarPrograma(tematicas, nombreTematicas, sc, numTematicas);
                }
            } 
            else if (palabra.equalsIgnoreCase("crear usuario")) {
                crearUsuario(sc);
            } 
            else if (palabra.equalsIgnoreCase("ver estadisticas")) {
                mostrarEstadisticas();
            } 
            else if (palabra.equalsIgnoreCase("Seleccion de usuario")) {
                mostrarListaUsuarios();
            }
            else if (palabra.equalsIgnoreCase("admin")) {
                System.out.println(LILA+"--Menu de administracion--"+RESET);
                System.out.println("Eliminar usuario");
                System.out.println("Modificar dificultad");
                
                opcionValida = false; 
                while (!opcionValida) {
                    System.out.print(AMARILLO+"Escribe una opcion: "+RESET);
                    opcion = sc.nextLine().strip(); // Leer entrada y eliminar espacios adicionales
            
                    if (opcion.equalsIgnoreCase("eliminar usuario")) {
                        eliminarUsuario(sc);
                        opcionValida = true;
                    } else if (opcion.equalsIgnoreCase("modificar dificultad")) {
                        subirDificultad(sc);
                        opcionValida = true;
                    } else {
                        System.out.println(ROJO+"Error: Opcion no valida. Intenta nuevamente."+RESET);
                    }
                }
            }
            else if (palabra.equalsIgnoreCase("salir")) {
                System.out.println(ROJO+"Saliendo del programa..."+RESET);
            } 
            else {
                System.out.println(ROJO+"Lo que ha introducido no corresponde con las opciones indicadas."+RESET);
            }
        } while (!palabra.equalsIgnoreCase("salir"));
    }

    public static void iniciarPrograma(String[][] tematicas, String[] nombreTematicas, Scanner sc, int[] numTematicas) {

        //Valores
        int opcionTematica;
        String[] palabras,palabrasDescubiertas;
        String nombreTematicaNueva,palabra;
        char[][] sopa;
        boolean[][] letrasEncontradas;
        boolean nombreExistente = false;
        boolean cancelado;
        boolean palabraRepetida;
        boolean palabraValida;
    
        //Colores
        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String AMARILLO = "\u001B[33m";
    
        //Seleccion de tematicas
        do {
            System.out.println("--- Selecciona una tematica ---");
            // Mostrar solo temáticas existentes
            for (int i = 0; i < numTematicas[0]; i++) { 
                System.out.println(i + "- " + nombreTematicas[i]);
            }
            // Opciones basadas en numTematicas[0]
            System.out.println(numTematicas[0] + ". Crear tu propia tematica");
            System.out.println((numTematicas[0] + 1) + ". Volver al menú principal");
            System.out.println((numTematicas[0] + 2) + ". Tematica aleatoria");
            System.out.print(AMARILLO + "Elige una opción: " + RESET);
            opcionTematica = opciones(sc);
            //sc.nextLine(); // Limpiar el buffer
    
            if (opcionTematica >= 0 && opcionTematica < numTematicas[0]) {
                System.out.println("Seleccionaste la temática: " + nombreTematicas[opcionTematica]);
                palabras = new String[5];
                System.arraycopy(tematicas[opcionTematica], 0, palabras, 0, 5); // Usar el índice directamente
                sopa = new char[tamañoSopa][tamañoSopa];
    
                System.out.println(VERDE+"Generando sopa de letras..."+RESET);
                generarSopaDeLetras(sopa, palabras);
                letrasEncontradas = new boolean[tamañoSopa][tamañoSopa];
                mostrarSopaDeLetras(sopa, letrasEncontradas);
                palabrasDescubiertas = new String[5];
    
                for (int i = 0; i < palabrasDescubiertas.length; i++) {
                    palabrasDescubiertas[i] = "";
                }
                encontradas = 0; 
                System.out.println(VERDE+"Empezando el juego..."+RESET);
                intentos++;
                usuarios[usuario][2] = String.valueOf(intentos); 
                jugarSopaDeLetras(sc, sopa, palabras, palabrasDescubiertas, "\033[31m", "\033[32m", "\033[0m", letrasEncontradas);
            } 
            else if (opcionTematica == numTematicas[0]) {
                System.out.println("Crear una nueva temática...");
                if (numTematicas[0] < tematicas.length) {
                    cancelado = false; 
            
                    do {
                        System.out.print(VERDE + "Ingresa el nombre de la nueva temática (o escribe 'cancelar' para cancelar): " + RESET);
                        nombreTematicaNueva = sc.nextLine();

                       
                        if (nombreTematicaNueva.equalsIgnoreCase("cancelar")) {
                            cancelado = true; 
                            System.out.println(ROJO + "La creación de la temática ha sido cancelada." + RESET);
                        }
            
                        // Restablecer la variable nombreExistente
                        nombreExistente = false;
            
                        // Verificar si el nombre ya existe
                        for (int i = 0; i < nombreTematicas.length; i++) {
                            if (nombreTematicas[i] != null && nombreTematicas[i].equalsIgnoreCase(nombreTematicaNueva)) {
                                nombreExistente = true;
                                System.out.println(ROJO + "Error: ya existe una temática con ese nombre. Intenta con otro." + RESET);
                            }
                        }
                        if (nombreTematicaNueva.contains(" ") || nombreTematicaNueva.isEmpty()) {
                            System.out.println(ROJO + "Error: Nombre inválido (sin espacios o vacío)." + RESET);
                            nombreExistente = true;
                        }
                    } while (nombreExistente && !cancelado); // Repetir hasta que el nombre sea válido o se haya cancelado
            
                    if (!cancelado) { 
                        // Si no se ha cancelado, creamos la nueva temática
                        nombreTematicas[numTematicas[0]] = nombreTematicaNueva;
                        System.out.println(VERDE + "Ingresa 5 palabras para la nueva temática (máximo 10 caracteres cada una, sin espacios):" + RESET);
                    
                        for (int i = 0; i < 5; i++) {
                            palabraValida = false; // Variable para controlar la salida del bucle
                    
                            do {
                                System.out.print(AMARILLO + "Ingrese la palabra " + (i + 1) + ": " + RESET);
                                palabra = sc.nextLine().trim().toUpperCase();
                    
                                palabraRepetida = false;
                    
                                // Verificar si la palabra ya fue ingresada en esta temática
                                for (int j = 0; j < i; j++) {
                                    if (tematicas[numTematicas[0]][j] != null && tematicas[numTematicas[0]][j].equals(palabra)) {
                                        palabraRepetida = true;
                                        System.out.println(ROJO + "Error: La palabra ya fue ingresada en esta temática. Inténtalo de nuevo." + RESET);
                                    }
                                }
                                
                                if (palabra.contains(" ") || palabra.isEmpty()) {
                                    System.out.println(ROJO + "Error: Nombre inválido (sin espacios o vacío)." + RESET);
                                    palabraRepetida = true;
                                }
                                // Verificar si la palabra contiene espacios o supera el límite de caracteres
                                if (palabra.contains(" ")) {
                                    System.out.println(ROJO + "Error: Solo se permite una palabra (sin espacios). Inténtalo de nuevo." + RESET);
                                } else if (palabra.length() > 10) {
                                    System.out.println(ROJO + "Error: La palabra debe tener como máximo 10 caracteres. Inténtalo de nuevo." + RESET);
                                } else if (palabraRepetida) {
                                    // Mensaje ya mostrado si la palabra está repetida
                                } else {
                                    // Si la palabra es válida, se guarda y se sale del bucle
                                    tematicas[numTematicas[0]][i] = palabra; 
                                    palabraValida = true; // Cambiar el estado para salir del bucle
                                }
                            } while (!palabraValida); // Continuar hasta que se ingrese una palabra válida
                        }
                    
                        numTematicas[0]++; // Incrementar el contador de temáticas
                        System.out.println(VERDE + "Temática creada con éxito." + RESET);
                    }
                } else {
                    System.out.println(ROJO + "No puedes agregar más temáticas." + RESET);
                }
            }
            else if (opcionTematica == numTematicas[0] + 1) {
                System.out.println("Volver al menú principal...");
            } 
            else if (opcionTematica == numTematicas[0] + 2) {  // Opción para temática aleatoria
                seleccionarTematicaAleatoria(tematicas, nombreTematicas, sc);
            } 
            else {
                System.out.println(ROJO+"Opción no válida. Inténtalo de nuevo."+RESET);
            }
        } while (opcionTematica != numTematicas[0] + 1);
    }
    
    public static void jugarSopaDeLetras(Scanner sc, char[][] letras, String[] palabrasSeleccionadas, 
    String[] palabrasDescubiertas, String RED, String GREEN, String RESET, boolean[][] letrasEncontradas) {

        // Valores
        String YELLOW = "\u001B[33m";
        boolean jugando = true, yaEncontrada;
        int filaInicio, colInicio, filaFin, colFin, fila, col;
        String palabraIntroducida;

        // Inicio de juego
        while (jugando) {
            // Mostrar las palabras que el jugador debe encontrar
            System.out.println(RED + "Palabras por encontrar:" + RESET);
            for (int i = 0; i < palabrasSeleccionadas.length; i++) {
                if (!palabraEncontrada(palabrasDescubiertas, palabrasSeleccionadas[i])) {
                    System.out.println(RED + palabrasSeleccionadas[i] + RESET);
                }
            }
            System.out.println(YELLOW + "Introduzca la palabra que cree haber encontrado (puede rendirse poniendo 'me rindo'): " + RESET);
            palabraIntroducida = sc.nextLine().toUpperCase();
            
            if (palabraIntroducida.equalsIgnoreCase("me rindo")) {
                jugando = false;
                System.out.println(RED + "Has decidido rendirte, tomate un zumo de naranja y vuelve a intentarlo." + RESET);
            }
            
            if (jugando) {
                // Verificar si la palabra está en la lista de palabras buscadas
                boolean palabraValida = palabraEsValida(palabraIntroducida, palabrasSeleccionadas);
                
                if (!palabraValida) {
                    System.out.println(RED + "La palabra no está en la lista de palabras buscadas." + RESET);
                } else {
                    System.out.println(GREEN + "Introduzca las coordenadas de Inicio:" + RESET);
                    System.out.println(YELLOW + "Primera coordenada: " + RESET);
                    filaInicio = leerCoordenada(sc);
                    System.out.println(YELLOW + "Segunda coordenada: " + RESET);
                    colInicio = leerCoordenada(sc);
                    System.out.println(GREEN + "Introduzca las coordenadas del final: " + RESET);
                    System.out.println(YELLOW + "Tercera coordenada: " + RESET);
                    filaFin = leerCoordenada(sc);
                    System.out.println(YELLOW + "Última coordenada: " + RESET);
                    colFin = leerCoordenada(sc);

                    if (verificarPalabra(letras, palabraIntroducida, filaInicio, colInicio, filaFin, colFin)) {
                        System.out.println(GREEN + "¡Palabra encontrada correctamente!" + RESET);
                        yaEncontrada = false;
                        
                        // Verificar si la palabra ya estaba descubierta
                        for (int j = 0; j < palabrasDescubiertas.length; j++) {
                            if (palabrasDescubiertas[j].equalsIgnoreCase(palabraIntroducida)) {
                                yaEncontrada = true;
                            }
                        }
                        
                        if (!yaEncontrada) {
                            if (encontradas == palabrasDescubiertas.length) {
                                palabrasDescubiertas = Arrays.copyOf(palabrasDescubiertas, palabrasDescubiertas.length + 1);
                            }
                            palabrasDescubiertas[encontradas] = palabraIntroducida;
                            encontradas++;
                            usuarios[usuario][4] = String.valueOf(encontradas);
                            System.out.println(GREEN + "¡Correcto! Has encontrado la palabra: " + palabraIntroducida + RESET);

                            // Marcar letras encontradas
                            for (int i = 0; i < palabraIntroducida.length(); i++) {
                                fila = filaInicio + i * (filaFin - filaInicio) / (palabraIntroducida.length() - 1);
                                col = colInicio + i * (colFin - colInicio) / (palabraIntroducida.length() - 1);
                                letrasEncontradas[fila][col] = true;
                            }
                        } else {
                            System.out.println(RED + "Ya habías encontrado esta palabra." + RESET);
                        }
                        
                        if (encontradas == palabrasSeleccionadas.length) {
                            partidasganadas++;
                            usuarios[usuario][1] = String.valueOf(partidasganadas);
                            System.out.println(GREEN + "¡Felicidades! Has encontrado todas las palabras." + RESET);
                            jugando = false;
                        }
                    } else {
                        palabrasIncorrectas++;
                        usuarios[usuario][3] = String.valueOf(palabrasIncorrectas);
                        System.out.println(RED + "Coordenadas incorrectas o palabra no encontrada. Inténtalo de nuevo." + RESET);
                    }
                }
                
                mostrarSopaDeLetras(letras, letrasEncontradas);
                }
        }
    }

    public static void crearUsuario(Scanner sc) {
        // Valores
        String nombreUsuario;
        boolean usuarioCreado = false; // Variable para rastrear si se creó un usuario
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String LILA = "\u001B[35m";
        boolean cancelar = false; // Variable para rastrear si se cancela la creación
        boolean nombreExistente;
    
        // Buscar un espacio vacío para el nuevo usuario
        int i = 0;
        while (i < usuarios.length && !usuarioCreado && !cancelar) {
            if (usuarios[i][0] == null) {  // Si el primer valor del usuario es null, significa que está vacío
                nombreExistente = false;
                do {
                    System.out.print(LILA+"Ingrese el nombre de usuario (o escriba 'cancelar' para salir): "+RESET);
                    nombreUsuario = sc.nextLine();
    
                    if (nombreUsuario.equalsIgnoreCase("cancelar")) {
                        cancelar = true; // Marcar como cancelada la creación
                    }
    
                    // Verificar si el nombre está vacío o contiene solo espacios
                    if (nombreUsuario.trim().isEmpty()) {
                        System.out.println(RED + "Error: el nombre de usuario no puede estar vacío o contener solo espacios. Intenta de nuevo." + RESET);
                    } else if (!cancelar) {
                        // Verificar si el nombre ya existe
                        nombreExistente = false;
                        for (int j = 0; j < usuarios.length; j++) {
                            if (usuarios[j][0] != null && usuarios[j][0].equalsIgnoreCase(nombreUsuario)) {
                                nombreExistente = true;
                            }
                        }
    
                        if (nombreExistente) {
                            System.out.println(RED + "Error: el nombre de usuario '" + nombreUsuario + "' ya existe. Intenta con otro nombre." + RESET);
                        } else if (nombreUsuario.length() > 10) {
                            System.out.println(RED + "Error: la palabra debe tener como máximo 10 caracteres. Intenta de nuevo." + RESET);
                        }
                    }
    
                } while (!cancelar && (nombreUsuario.trim().isEmpty() || nombreUsuario.length() > 10 || nombreExistente)); // Repetir hasta que el nombre sea válido
    
                if (!cancelar) {
                    // Asignar el nombre y las estadísticas del usuario
                    usuarios[i][0] = nombreUsuario; // Nombre del usuario en la primera columna
    
                    // Inicializamos las estadísticas del usuario
                    usuarios[i][1] = "0";  // intentos
                    usuarios[i][2] = "0";  // palabras encontradas
                    usuarios[i][3] = "0";  // palabras incorrectas
                    usuarios[i][4] = "0";  // partidas ganadas
                    usuario = i;  // Seleccionamos este usuario
                    System.out.println(GREEN + "Usuario creado con éxito: " + nombreUsuario + RESET);
                    usuarioCreado = true; // Indicamos que el usuario fue creado
                }
            }
            i++; // Incrementar el índice del bucle
        }
    
        if (cancelar) {
            System.out.println(RED + "Proceso de creación de usuario cancelado." + RESET);
        } else if (!usuarioCreado) {
            System.out.println(RED + "No se pueden crear más usuarios. Se alcanzó el límite." + RESET);
        }
    }

    public static void generarSopaDeLetras(char[][] letras, String[] palabras) {
        Random random = new Random();
        int fila, col, direccion;
        boolean colocada;

        // Llenar la matriz con espacios vacíos
        for (int i = 0; i < letras.length; i++) {
            Arrays.fill(letras[i], ' ');
        }

        // Insertar palabras en diferentes direcciones
        for (String palabra : palabras) {
            colocada = false;
            while (!colocada) {
                fila = random.nextInt(letras.length);
                col = random.nextInt(letras[0].length);
                direccion = random.nextInt(8); 

                // Comprobar si la palabra cabe en la dirección elegida
                if (puedeColocarPalabra(letras, fila, col, direccion, palabra)) {
                    colocarPalabra(letras, fila, col, direccion, palabra);
                    colocada = true;
                }
            }
        }

        // Rellenar los espacios vacíos con letras aleatorias
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < letras[i].length; j++) {
                if (letras[i][j] == ' ') {
                    letras[i][j] = (char) ('A' + random.nextInt(26)); // Genera una letra aleatoria de la A a la Z
                }
            }
        }
    }
    
    public static boolean palabraEncontrada(String[] palabrasDescubiertas, String palabra) {

        //Valores
        boolean encontrado = false;
        for (String p : palabrasDescubiertas) {
            if (p.equalsIgnoreCase(palabra)) {
                encontrado = true;  // Cambiamos a true si encontramos la palabra
            }
        }
        return encontrado;
    }
    
    public static boolean verificarPalabra(char[][] letras, String palabra, int filaInicio, int colInicio, int filaFin, int colFin) {
        //verificar si la palabra está en las coordenadas proporcionadas  
    
        //Valores
        int diffFila = filaFin - filaInicio,diffCol = colFin - colInicio,fila,col;
        boolean verificado = true; 
    
        if (Math.abs(diffFila) == palabra.length() - 1 || Math.abs(diffCol) == palabra.length() - 1) {
            for (int i = 0; i < palabra.length(); i++) {
                fila = filaInicio + i * (diffFila == 0 ? 0 : (diffFila > 0 ? 1 : -1));
                col = colInicio + i * (diffCol == 0 ? 0 : (diffCol > 0 ? 1 : -1));
                if (letras[fila][col] != palabra.charAt(i)) {
                    verificado = false; // Si alguna letra no coincide, marcamos como false
                }
            }
        } 
        else {
            verificado = false; // Si la diferencia de filas o columnas no coincide con la longitud de la palabra
        }
        return verificado; 
    }

    public static boolean puedeColocarPalabra(char[][] tablero, int fila, int columna, int direccion, String palabra) {
        int incrementoFila = 0, incrementoColumna = 0,nuevaFila,nuevaColumna;
        boolean sePuedeColocar = true; // Inicializamos la bandera como verdadera
    
        // Determinar los incrementos según la dirección
        switch (direccion) {
            case 0: incrementoFila = 0; incrementoColumna = 1; break;  // Horizontal derecha
            case 1: incrementoFila = 0; incrementoColumna = -1; break; // Horizontal izquierda
            case 2: incrementoFila = 1; incrementoColumna = 0; break;  // Vertical abajo
            case 3: incrementoFila = -1; incrementoColumna = 0; break; // Vertical arriba
            case 4: incrementoFila = 1; incrementoColumna = 1; break;  // Diagonal descendente (\)
            case 5: incrementoFila = -1; incrementoColumna = -1; break; // Diagonal ascendente (\ invertida)
            case 6: incrementoFila = -1; incrementoColumna = 1; break;  // Diagonal ascendente (/)
            case 7: incrementoFila = 1; incrementoColumna = -1; break;  // Diagonal descendente (/ invertida)
        }
    
        // Verificar que todas las posiciones de la palabra estén dentro de los límites
        for (int i = 0; i < palabra.length(); i++) {
            nuevaFila = fila + i * incrementoFila;
            nuevaColumna = columna + i * incrementoColumna;
    
            if (nuevaFila < 0 || nuevaFila >= tablero.length || nuevaColumna < 0 || nuevaColumna >= tablero[0].length ||
                (tablero[nuevaFila][nuevaColumna] != ' ' && tablero[nuevaFila][nuevaColumna] != palabra.charAt(i))) {
                sePuedeColocar = false; 
            }
        }
    
        return sePuedeColocar; // Devuelve si se puede o no colocar la palabra
    }

    public static void colocarPalabra(char[][] letras, int fila, int col, int direccion, String palabra) {
        // Valores iniciales
        int Fila = 0, Columna = 0;

        switch (direccion) {
            case 0: Fila = 0; Columna = 1; break;  // Horizontal derecha
            case 1: Fila = 0; Columna = -1; break; // Horizontal izquierda
            case 2: Fila = 1; Columna = 0; break;  // Vertical abajo
            case 3: Fila = -1; Columna = 0; break; // Vertical arriba
            case 4: Fila = 1; Columna = 1; break;  // Diagonal descendente (\)
            case 5: Fila = -1; Columna = -1; break; // Diagonal ascendente (\ invertida)
            case 6: Fila = -1; Columna = 1; break;  // Diagonal ascendente (/)
            case 7: Fila = 1; Columna = -1; break;  // Diagonal descendente (/ invertida)
        }

        // Colocar la palabra carácter por carácter
        for (int i = 0; i < palabra.length(); i++) {
            letras[fila + i * Fila][col + i * Columna] = palabra.charAt(i);
        }
    }

    public static void mostrarSopaDeLetras(char[][] letras, boolean[][] encontrados) { 

        // Colores 
        String RESET = "\033[0m";
        String LILA = "\u001B[35m";
        String ROJO = "\033[31m";
        String AZUL = "\u001B[34m";
    
        // Imprimir los números de las columnas
        System.out.print("    "); 
        for (int i = 0; i < letras[0].length; i++) {
            if (i < 10) {
                System.out.print(LILA + i + "  " + RESET); // Números de 1 dígito
            } else {
                System.out.print(LILA + i + " " + RESET);  // Números de 2 dígitos
            }
        }
        System.out.println(); 
    
        // Imprimir los asteriscos según las columnas
        System.out.print("    "); // Espacio inicial para alinear con las coordenadas de las columnas
        for (int i = 0; i < letras[0].length; i++) {
            System.out.print(LILA + "* "+" " + RESET); // Imprimir un asterisco por columna
        }
        System.out.println(); 
    
        // Imprimir las filas
        for (int i = 0; i < letras.length; i++) {
            if (i < 10) {
                System.out.print(LILA + i + " * " + RESET); // Números de fila de 1 dígito
            } else {
                System.out.print(LILA + i + "* " + RESET); // Números de fila de 2 dígitos
            }
            for (int j = 0; j < letras[i].length; j++) {
                if (encontrados[i][j]) {
                    // Si la letra está encontrada, se imprime en azul
                    System.out.print(AZUL + letras[i][j] + RESET + "  ");
                } else {
                    // Letras no encontradas en rojo
                    System.out.print(ROJO + letras[i][j] + RESET + "  ");
                }
            }
            System.out.println(); 
        }
    }
    
    public static void mostrarEstadisticas() {

        String RESET = "\u001B[0m";
        String AMARILLO = "\u001B[33m";
        System.out.println(AMARILLO+"Estadísticas de "+usuarios[usuario][0]+":");
        System.out.println(AMARILLO+"Partidas ganadas: " + usuarios[usuario][1]+RESET);
        System.out.println(AMARILLO+"Intentos realizados: " + usuarios[usuario][2]+RESET);
        System.out.println(AMARILLO+"Palabras incorrectas: " + usuarios[usuario][3]+RESET);
        System.out.println(AMARILLO+"Palabras correctas: " + usuarios[usuario][4]+RESET);
    }
    
    public static void seleccionarTematicaAleatoria(String[][] tematicas, String[] nombreTematicas, Scanner sc) {

        // Valores
        Random random = new Random();
        int numTematicasDisponibles = 0, contador = 0;
        int indiceAleatorio = 0; // Inicializarlo sin calcular aún
        char[][] sopa;
        boolean[][] letrasEncontradas;
        String[] palabrasDescubiertas, palabras;
        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String VERDE = "\u001B[32m";
    
        // Contar el número de temáticas disponibles
        for (int i = 0; i < nombreTematicas.length; i++) {
            if (nombreTematicas[i] != null) {
                numTematicasDisponibles++;
            }
        }
    
        // Si hay temáticas disponibles
        if (numTematicasDisponibles > 0) {
            // Generar un índice aleatorio dentro del rango de las temáticas disponibles
            indiceAleatorio = random.nextInt(numTematicasDisponibles);
            palabras = new String[5];
    
            // Buscar la temática seleccionada
            contador = 0;
            for (int i = 0; i < nombreTematicas.length; i++) {
                if (nombreTematicas[i] != null) {
                    if (contador == indiceAleatorio) {
                        System.arraycopy(tematicas[i], 0, palabras, 0, 5);
                        System.out.println("Tematica seleccionada: " + nombreTematicas[i]);
                    }
                    contador++;
                }
            }
    
            // Generar la sopa de letras con las palabras de la temática seleccionada
            sopa = new char[tamañoSopa][tamañoSopa];
            System.out.println(VERDE + "Generando sopa de letras..." + RESET);
            generarSopaDeLetras(sopa, palabras);
            letrasEncontradas = new boolean[tamañoSopa][tamañoSopa];
            mostrarSopaDeLetras(sopa, letrasEncontradas);
            palabrasDescubiertas = new String[5];
            for (int i = 0; i < palabrasDescubiertas.length; i++) {
                palabrasDescubiertas[i] = "";
            }
            System.out.println(VERDE + "Empezando el juego..." + RESET);
            intentos++;
            jugarSopaDeLetras(sc, sopa, palabras, palabrasDescubiertas, "\033[31m", "\033[32m", "\033[0m", letrasEncontradas);
        } else {
            System.out.println(ROJO + "No hay tematicas disponibles." + RESET);
        }
    }
     
    public static void eliminarUsuario(Scanner sc) {

        // Valores
        boolean hayUsuarios = false;
        int seleccion = -1;
        String confirmacion;
        boolean seleccionValida = false;
        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String entrada;
    
        // Verificar si hay usuarios en la lista
        System.out.println("Lista de usuarios:");
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null) { // Si el nombre del usuario no es null, lo mostramos
                System.out.println((i + 1) + ". " + usuarios[i][0]);
                hayUsuarios = true;
            }
        }
        if (!hayUsuarios) {
            System.out.println(ROJO + "No hay usuarios creados." + RESET);
        } else {
            // Pedir al jugador que seleccione un usuario a eliminar
            while (!seleccionValida) {
                System.out.print("Seleccione un usuario para eliminar (ingrese el número): ");
                entrada = sc.nextLine();
                if (esNumeroValido(entrada)) { // Verificar si la entrada es un número válido
                    seleccion = convertirStringANumero(entrada); // Convertir a número manualmente
                    if (seleccion > 0 && seleccion <= usuarios.length && usuarios[seleccion - 1][0] != null) {
                        seleccionValida = true; // Entrada válida, salir del bucle
                    } else {
                        System.out.println(ROJO + "Selección no válida. Intente de nuevo." + RESET);
                    }
                } else {
                    System.out.println(ROJO + "Debe ingresar un número válido." + RESET);
                }
            }
    
            // Confirmación antes de eliminar
            System.out.print("¿Está seguro de que desea eliminar el usuario " + usuarios[seleccion - 1][0] + "? (si/no): ");
            confirmacion = sc.nextLine();
            if (confirmacion.equalsIgnoreCase("si")) {
                // Limpiar los datos del usuario
                for (int j = 0; j < usuarios[seleccion - 1].length; j++) {
                    usuarios[seleccion - 1][j] = null;
                }
                // Si el usuario activo es el eliminado, reiniciar su estado
                if (usuario == seleccion - 1) {
                    usuario = -1;
                }
                System.out.println(VERDE + "Usuario eliminado con éxito." + RESET);
            } else {
                System.out.println(VERDE + "Eliminación de usuario cancelada." + RESET);
            }
        }
    }
    
    public static int convertirStringANumero(String entrada) {
        int numero = 0;
        for (int i = 0; i < entrada.length(); i++) {
            numero = numero * 10 + (entrada.charAt(i) - '0'); // Convertir carácter a número y acumular
        }
        return numero;
    }

    public static void mostrarListaUsuarios() {

        // Valores
        Scanner sc = new Scanner(System.in);
        boolean hayUsuarios = false, usuarioEncontrado;
        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String nombreSeleccionado;
        
        // Recorremos la matriz de usuarios
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0] != null) { // Si el nombre del usuario no es null, lo mostramos
                System.out.println(usuarios[i][0]);
                hayUsuarios = true;
            }
        }
    
        if (!hayUsuarios) {
            System.out.println(ROJO + "No hay usuarios creados." + RESET);
        } else {
            // Pedir al jugador que seleccione un usuario por nombre
            System.out.print("Seleccione un usuario para jugar (ingrese el nombre): ");
            nombreSeleccionado = sc.nextLine().trim(); // Leer nombre y eliminar espacios al principio y al final
            usuarioEncontrado = false;
            
            // Buscar el usuario en la lista
            for (int i = 0; i < usuarios.length; i++) {
                if (usuarios[i][0] != null && usuarios[i][0].equalsIgnoreCase(nombreSeleccionado)) {
                    usuario = i; // Guardamos el índice del usuario seleccionado
                    System.out.println("Usuario seleccionado: " + usuarios[usuario][0]);
                    usuarioEncontrado = true;
                }
            }
    
            // Si no se encuentra el usuario
            if (!usuarioEncontrado) {
                System.out.println(ROJO + "Selección no válida. El nombre de usuario no existe." + RESET);
            }
        }
    }
    
    public static void subirDificultad(Scanner sc) {

        // Valores
        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String dificultad;
        System.out.println("Elige el nuevo tamaño de la sopa de letras:");
        System.out.println("Escribe 'baja' para 10x10 (Tamaño inicial)");
        System.out.println("Escribe 'media' para 15x15 (Dificultad media)");
        System.out.println("Escribe 'alta' para 20x20 (Alta dificultad)");
    
        // Leemos la dificultad escrita
        dificultad = sc.nextLine().toLowerCase(); // Convertimos a minúsculas para evitar problemas con mayúsculas
    
        // Opciones
        if (dificultad.equals("baja")) {
            // Tamaño inicial 10x10
            tamañoSopa = 10;
            System.out.println(VERDE + "El tamaño de la sopa se ha cambiado a " + tamañoSopa + "x" + tamañoSopa + RESET);
        } else if (dificultad.equals("media")) {
            // Tamaño 15x15
            tamañoSopa = 15;
            System.out.println(VERDE + "El tamaño de la sopa se ha cambiado a " + tamañoSopa + "x" + tamañoSopa + RESET);
        } else if (dificultad.equals("alta")) {
            // Tamaño 20x20
            tamañoSopa = 20;
            System.out.println(VERDE + "El tamaño de la sopa se ha cambiado a " + tamañoSopa + "x" + tamañoSopa + RESET);
        } else {
            System.out.println(ROJO + "Opción no válida. El tamaño de la sopa no ha cambiado." + RESET);
        }
    }

    public static int leerCoordenada(Scanner sc) {
        // Valores
        String palabra;
        boolean esValido;
        int numero = 0;
        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
    
        do {
            System.out.println("Introduce un número entre 0 y " + (tamañoSopa - 1) + ":");
            palabra = sc.nextLine(); 
            esValido = esNumeroValido(palabra); 
            if (!esValido) {
                System.out.println(ROJO + "Entrada no válida. Introduzca un número entre 0 y " + (tamañoSopa - 1) + "." + RESET);
            } else {
                // Si la entrada es válida, convertir a número
                numero = convertirACifra(palabra);
            }
        } while (!esValido);
        return numero;
    }
    
    public static boolean esNumeroValido(String coord) {
        boolean esValido = true;
    
        if (coord == null || coord.isEmpty()) {
            esValido = false;
        } else {
            for (int i = 0; i < coord.length(); i++) {
                char c = coord.charAt(i);
                if (c < '0' || c > '9') { // Verificar si todos los caracteres son dígitos
                    esValido = false;
                }
            }
    
            if (esValido) {
                // Convertir a número y verificar si está en el rango de la sopa
                int numero = convertirACifra(coord);
                if (numero < 0 || numero >= tamañoSopa) {
                    esValido = false;
                }
            }
        }
        return esValido;
    }
    
    public static int convertirACifra(String coord) {
        int resultado = 0;
        for (int i = 0; i < coord.length(); i++) {
            resultado = resultado * 10 + (coord.charAt(i) - '0'); // Conversión manual
        }
        return resultado;
    }
    
    public static int opciones(Scanner sc) {
        // Valores
        String palabra;
        boolean esValido;
        int numero = 0;
        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        
        do {
            palabra = sc.nextLine(); 
            esValido = esNumeroValido2(palabra); // Verificar si es un número válido
        
            if (!esValido) {
                System.out.println(ROJO + "Entrada no válida. Introduzca un número válido." + RESET);
            } else {
                // Convertir la cadena a número de forma manual
                for (int i = 0; i < palabra.length(); i++) {
                    numero = numero * 10 + (palabra.charAt(i) - '0'); // Convertir cada dígito a número
                }
            }
        } while (!esValido);
        return numero;
    }
    
    public static boolean esNumeroValido2(String coord) {
        boolean esValido = true; 
        if (coord == null || coord.isEmpty()) {
            esValido = false; 
        } else {
            // Verificar si todos los caracteres son números
            for (int i = 0; i < coord.length(); i++) {
                char c = coord.charAt(i);
                if (c < '0' || c > '9') { // Si el carácter no está en el rango de '0' a '9', no es un número válido
                    esValido = false;
                }
            }
        }  
        return esValido; 
    }

    public static boolean palabraEsValida(String palabra, String[] palabrasSeleccionadas) {
        boolean encontrada = false;
        int i = 0;
        
        // Buscar hasta encontrar la palabra o recorrer todo el array
        while (i < palabrasSeleccionadas.length && !encontrada) {
            if (palabrasSeleccionadas[i].equalsIgnoreCase(palabra)) {
                encontrada = true;
            }
            i++;
        }
        
        return encontrada; // Solo un return aquí
    }
}
