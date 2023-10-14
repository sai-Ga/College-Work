//04th September
const message = function(){

    console.log("Hello...........");
}

setTimeout(message,3000);
//Call back using arrow function
setTimeout(() => {
    console.log("Called from arrow function");
}, 3500);