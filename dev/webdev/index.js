
let randomnum;
let max, min;
document.getElementById("btn").onclick = function () {
    min = Number(document.getElementById("min").value)
    max = Number(document.getElementById("max").value)
    randomnum =Math.floor(Math.random()*(max-min+1))+min
   // console.log(min)
   // console.log(max)
   document.getElementById("label").textContent=randomnum
    console.log(randomnum)

}
