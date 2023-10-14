//08th September
//another callback function example

function displayresult(para){
    console.log(para);
}

function calculate(x,y,mycallback){
    let sum = x+y;
    mycallback(sum);
}

calculate(23,14,displayresult);