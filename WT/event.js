//08th September
//understanding events;addListener;emit;on;eventRemove
const EventEmitter = require('events');
var eventEmitter = new EventEmitter();
eventEmitter.on('myEvent',(msg)=>{
    console.log(msg);
});

eventEmitter.emit('myEvent','First Event');
//addListener, removeListener & listenerCount pending to be reminded <--- finished './event2.js'
