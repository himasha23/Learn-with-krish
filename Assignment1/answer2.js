const arr = [22,25,29,28,23,24,27,26,21];

let array = [];

array = arr.sort(function(a, b){return a-b});

let missingnum = [];

let min = Math.min(...array); 

let max = Math.max(...array); 

var tempMax;

tempMax = min + 9;

for (let i = min; i < max; i++) 
{ 
	if (array.indexOf(i) < 0) 
	{
        missingnum.push(i); 
	} 
	
} 

if(missingnum.length < 1 && array[9] != tempMax)
{
    missingnum.push(tempMax);

}



for(var i=0;i<missingnum.length;i++)
{
		console.log(missingnum[i]);

}