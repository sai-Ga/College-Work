//08th September
//understanding NonBlocking
const fs = require('fs');
//to throw an error we can simply misspell the filename
fs.readFile('./input.txt','utf-8',(err,data)=>{  // to avoid Binary code output
    if(err){
        console.log(err);
    }
    else{
        console.log(data);
    }
});
console.log(" -->The end<-- ");