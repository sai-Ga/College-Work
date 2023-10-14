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
  var sql = "INSERT INTO customers (name, address) VALUES ?";
  var values = [
    ['Wayne Inc','Gotham 99'],
    ['Stark Industries','Hollywood 45']
  ];
  con.query(sql, [values],function (err, result) {
    if (err) throw err;
    console.log("Records Inserted");
  });
});