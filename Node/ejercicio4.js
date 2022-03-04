/**
 * autor Jorge Jaramillo
 * escrito el dia 27 de septiembre de 2021
 */

var x=4
const funcion1=()=>{
    let y=3
    console.log(x)
    console.log(y)
    x=x+2
}

const funcion2=()=>{
    console.log(x)
    console.log(y) /** y no esta definido porque es una variable local de funcion1 */
}


funcion1()
funcion2()