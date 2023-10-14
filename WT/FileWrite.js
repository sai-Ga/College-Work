var fs = require('fs')

fs.writeFile('./input.txt','Hello World!!',function(err){
    if (err)
        console.log(err)
    else 
        console.log('Writen to input.txt');
});