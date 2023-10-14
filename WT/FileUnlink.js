var fs = require('fs')

fs.unlink('./input1.txt',function(err){
    if (err)
        console.log(err)
    else 
        console.log('File Deleted!!');
});