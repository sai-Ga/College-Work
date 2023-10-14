const fs=require('fs');
fs.open('input.txt','r+',function(err){// 'r+' is read mode to open file in read mode,
                                        //'w+' is to open file in write mode
    if(err){
        console.error(err);
    }
    else{
        console.log('File Opened Successfully');
    }
}); 