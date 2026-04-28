/*
const fs = require("fs");

//const files = fs.readdirSync("./");

//console.log(files);

const filesList = fs.readdir("$", function(err, files) {
    if (err) console.log("Error", err);
    else console.log("Result", files);
});

console.log(filesList);
*/

const EventEmitter = require("node:events");

const Logger = require("./logger");
const logger = new Logger();

//Register a Listener
logger.on("messageLogged", function(arg){
    console.log("Listener called", arg);
})

Logger.log("message");


//Raise an event
//emitter.emit("messageLogged", { id: 1, url: "http://"});