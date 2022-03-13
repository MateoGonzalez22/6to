arr1 = [3,4,5,6]
arr2 = [4,2,7,6,5,5]

function sum(...args){
    var total = 0
    args.forEach(element => {
        element.forEach(i => {  
            total = total + i
        });
    });
    return total
}

console.log(sum(arr1, arr2))





