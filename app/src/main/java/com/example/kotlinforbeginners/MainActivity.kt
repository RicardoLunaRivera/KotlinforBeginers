package com.example.kotlinforbeginners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.security.KeyStore
import java.util.function.LongUnaryOperator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Lección 1
        //variablesYConstantes()

        //Lección 2
        //tiposDeDatos()

        //Lección 3
        //sentenciaIf()

        //Leccion 4
        //sentenciaWhen()

        //Leccion 5
        arrays()
    }

    private fun variablesYConstantes(){
        //*** VARIABLES ***
        //nomenclatura camelCase
        var miVariable= "Hola Mundo"
        println(miVariable)

        //cambiar el valor de la variable
        /*
        * Solo se puede cambiar el valor si es del
        * mismo tipo, ejem String1 -> String2 = se puede
        *                   String -> Int = no se puede */
        miVariable = "Hello World"
        println(miVariable)


        //CONSTANTES
        /*Las constantes no pueden variar su valor durante
        toda a ejecución del programa */

        val myFirstconstant = "Soy una constante"

        println(myFirstconstant)
    }

    private fun tiposDeDatos(){
        /* TIPOS DE DATOS
        * String -> cadenas de texto
        *  Byte, Short, Int, Long-> para usar enteros
        *  Float, Double-> numeros con punto decimal
        * Booleanos -> sentencias verdadera o falsas
        * */

        //String
        val myString ="Hola"
        val myString2 = "World"
        // se pueden concatenar
        val myString3 = myString + " " +myString2
        println(myString3)

        //Enteros (Byte, Short, Int, Long)
        val myInt = 1
        val myInt2 = 2
        val myInt3 = myInt + myInt2
        println(myInt3)

        //Decimales (Float, Double)
        val myDouble = 2.52
        val myDouble2 = 10.25
        val myDouble3= 1 // Se puede sumar enteros y decimales
        val myDouble4 = myDouble+myDouble2+myDouble3
        println(myDouble4)

        //Booleanos (True False)
        val myBoolean = true
        val myBoolean2 =false
    }

    private fun sentenciaIf(){
        var mynumber = 9
        //Operadores condicionales
        // >, <, >=, <=, ==, !=

        if(mynumber<10) {
            println("$mynumber es menor que 10")
        }else{
            print("$mynumber es mayor que 10")
        }

        //Operadores lógicos
        // &&->y , ||->o , !->no
        mynumber = 7
        if((mynumber<=10 && mynumber>5) || mynumber ==53) {
            println("$mynumber es menor o igual que 10. mayor que 5 o es igual a 53")
        }else if (mynumber ==60){ print("$mynumber es igual a 60") }
        //Solo puede existir un IF y un ELSE, pero puede haber más e un un ELSE IF
        else{
            print("$mynumber es mayor que 10, menor o igual a 5 y no es a 53")
        }

    }

    private fun sentenciaWhen(){
        //When con String
        val country = "México"
        when(country) {
        //Se pueden escribir uno por uno
            "México"->{
                println("El idioma es Español")
            }
            "Colombia"->{
                println("El idioma es Español")
            }
            //Pero también se pueden escribir uno a lado del otro, si tienen el mismo valor
            "Chile","España"->{
                println("El idioma es Español")
            }
            "USA"->{
                println("El idioma es Inglés")
            }
            else ->{
                println("Ingresa un país válido")
            }
        }


        //When con INT

        val age= 10

        when(age){
            //Se pueden escribir uno por uno
            0,1,2 ->{
                println("Eres un bebé") }
            //Tambien puede ser por rangos
            in 3..10 ->{
                println("Eres un niño")}
            in 11..17 ->{
                println("Eres un adolecente")}
            in 18..69 ->{
                println("Eres un Adulto")}
            in 79..99 ->{
                println("Eres un Adulto mayor")}
            else ->{
                println("D:")
            }
        }
    }


    private fun arrays(){
        //Creación de Array
        val myArray= arrayListOf<String>()

        //Valores del array
        val apellidoPaterno ="Luna"
        val apellidoMaterno = "Rivera"
        val nombre = "Ricardo"

        //añadir elementos al array de uno en uno
        myArray.add(apellidoPaterno)
        myArray.add(apellidoMaterno)
        myArray.add(nombre)

        println(myArray)

        //Añadir un conjunto de datos
        myArray.addAll(listOf("Ingeniero en sistemas", "kotlin"))

        //Acceder a datos del array
        val myName = myArray[2]
        println(myName)

        //modificar datos
        myArray[4] = "Java/Kotlin"

        //Eliminar datos
        myArray.removeAt(0)

        //Recorrer datos del array
        myArray.forEach{
            println(it)
        }

        //Operaciones con Array
        //muestra cuantos elementos tiene
        myArray.count()
        //elimina los datos
        myArray.clear()

    }
}