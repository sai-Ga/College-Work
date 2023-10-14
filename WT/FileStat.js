const fs=require('fs');
console.log('Going to get the file info');
fs.stat('input.txt',function(err,stats){
    if(err){
        console.error(err);
    }
    else{
        console.log(stats);
        console.log('Got file info successfully!');

        console.log('isFile ? '+stats.isFile());
        console.log('isDirectory ? '+stats.isDirectory());
    }
});