//15th September
var http = require('http');
http.createServer(function(req,res){

res.writeHead(200,{'Content-Type':'text/html'});
res.write('Hello World.....');
res.end();

}).listen(8080);
console.log("Node.js web server is running at port:8080");