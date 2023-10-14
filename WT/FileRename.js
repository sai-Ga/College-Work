const fs=require('fs');
fs.rename('LoremIpsum.txt','input.txt',function(err){// if file is renamed you cannot run the same program it will throw error
    if(err){
        console.error(err);
    }
    else{
        console.log('File renamed successfully ');
    }
});