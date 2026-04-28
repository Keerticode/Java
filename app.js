const path = require("path")

var pathObj = path.parse(__filename);

console.log(pathObj)  ;

const os = require("os");

var osType = os.type();

var totalMemory = os.totalmem();
var freeMemory = os.freemem();


console.log(osType);
console.log(totalMemory);
console.log(freeMemory);
