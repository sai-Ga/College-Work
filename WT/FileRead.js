var fs = require('fs')

fs.readFile('./input.txt','utf-8',(err,data)=>{
    if(err){
        console.log(err);
    }
    else{
        console.log(data);
    }
    
})
console.log(" -->The end<-- ");