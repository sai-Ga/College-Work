//15th September
var http = require('http'); // Import Node. js core module
var server = http.createServer (function (req, res) {
if (req.url == '/') {    
res .writeHead (200,{ 'Content-Type': 'text/html' });
res.write(

'<html lang="en"> <head><meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1.0"><meta http-equiv="X-UA-Compatible" content="ie=edge"><title>My Website</title></head><body><main><h1>Welcome to My Website</h1>  </main>	<script src="index.js"></script></body></html>');
res.end();
}
else if(req.url == '/contact'){
res .writeHead (200,{ 'Content-Type': 'text/html' });
res.write(
    '<html lang="en"> <head><meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1.0"><meta http-equiv="X-UA-Compatible" content="ie=edge"><title>My Website</title></head><body><main><h1>Contact Us</h1>  </main></body></html>'
)
res.end();
}

else if (req.url == '/admin') {
        res.writeHead(200, { 'Content-Type': 'text/html'});
        res.write('<html lang="en"> <head><meta charset="UTF-8"><meta name="viewport" content="width=device-width, initial-scale=1.0"><meta http-equiv="X-UA-Compatible" content="ie=edge"><title>My Website</title></head><body><main><h1>Admin Page</h1>  </main></body></html>'); 
        res.end();
        }
} 

res.end('Invalid Request!');

});
server.listen (5000); 
console.log('server is running..');


