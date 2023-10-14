//08th September
//understanding Blocking

var fs = require('fs');
var data = fs.readFileSync('./input.txt');
// example to generate an error  
//var data = fs.readFileSync('./input.docx');
console.log(data.toString());
console.log(" -->The end<-- ");
