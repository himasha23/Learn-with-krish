let array = [22,25,29,28,21,24,27,26,30]
;
let missingnum = [];



let min = Math.min(...array); 

let max = Math.max(...array); 



for (let i = min; i < max; i++) { 


	if (array.indexOf(i) < 0) 
	{
		

missingnum.push(i); 



	} 


} 



for(var i=0;i<missingnum.length;i++){

    
		console.log(missingnum[i]);

	
}
