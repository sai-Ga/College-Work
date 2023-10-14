//step 1 importing events
const events = require("events");
//step 2 creating an Event emitter object
var eventEmitter = new events.EventEmitter();
//write a funtion of event 1
function listener1(){
    console.log("Event received by Listener1");
}
//write a function of event 2
function listener2(){
    console.log("Event received by Listener2");
}
//Step3 adding listener using addListener or on
//bind the 'write'event with the listenr2 function
eventEmitter.addListener("write",listener1);
eventEmitter.on("write",listener2);

//step4 emitting event
eventEmitter.emit("write");
console.log(eventEmitter.listenerCount("write"));


//step5 removing listener
eventEmitter.removeListener("write", listener1);
console.log("listener 1 is removed");

console.log(eventEmitter.listenerCount("write"));
console.log(" -->The end<-- ")