var mysql = require('mysql2');

var con = mysql.createConnection({
  host: "localhost",
  user: "root",
  password: "",
  database: "mydb"
});

con.connect(function(err) {
  if (err) throw err;
  console.log("Connected!");
  var sql = "UPDATE customers SET address= 'Gotham' WHERE address= 'Gotham 45'";
  con.query(sql,function (err, result) {
    if (err) throw err;
    console.log("Records Updated");
  });
});