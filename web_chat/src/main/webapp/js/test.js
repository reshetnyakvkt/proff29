/**
 * Created by 1 on 24.01.2016.
 */

function Class(){
    this.field = 12;
    this.method = function(){
        this.field = 45;
    }

    this.function_onclick = function(){
        alert('1')
    }
}

var obj = new Class();
var vector = new Array(3);
/**prototype*/
var sub = Object.create(obj);
sub.__proto__ = vector;
alert(sub.field);

