var fs = require('fs')

fs.appendFile('./input.txt',"Avada Kedavra",function(err){
    if (err)
        console.log(err)
    else 
        console.log('Appended to input.txt');
});