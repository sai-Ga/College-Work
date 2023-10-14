//15th September
var http = require('http');
var server = http.createServer(function(req,res){

    res.write("Hello World!!!");
    res.end();
});
server.listen(5000);
console.log("Node.js web server is running at port:5000");