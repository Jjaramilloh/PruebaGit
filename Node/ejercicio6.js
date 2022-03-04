/**
 * autor Jorge Jaramillo
 * escrito el dia 27 de septiembre de 2021
 */
const persona={
    nombre:"Vincent",
    apellido:"Rolong",
    edad:19,
    estatura:1.80,
    mostrar:function(){
        console.log("Nombre "+ this.nombre)
        console.log("Apellido: "+this.apellido)
        console.log("Edad "+ this.edad)
        console.log("Estatura "+this.estatura)
    }
}

persona.mostrar()