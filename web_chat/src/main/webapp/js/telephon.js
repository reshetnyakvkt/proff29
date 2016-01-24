/**
 * Created by 1 on 24.01.2016.
 */
var tariff = 1.50;
function Telephon(number, balance){
    this.number = number;
    this.balance = balance;

    this.call = function(minute){
        if (minute * tariff > this.balance){
            alert("Not enough money in the account =" + this.balance)
        } else (
            alert("Phone number " + this.number + ", speaking! Rest balance=" + (this.balance = this.balance - minute * tariff))
        )
    }
}

function App() {
    this.example = function (number) {
        switch (number) {
            /**Example № 1*/
            case 1:
                var mobileOne = new Telephon("050-666-66-66", 12);
                mobileOne.call(2);
                mobileOne.call(5);
                mobileOne.call(15);

                var mobileTwo = new Telephon("063-111-11-11", 35);
                mobileTwo.call(2);
                mobileTwo.call(15);
                mobileTwo.call(10);

                break;
        /**Example № 1*/
            case 2:
                var doc = document.documentElement;
                var doc_body = doc.getElementById("body");
                doc_body.write("1");
                doc_body.write("2");
                break;
        }
    }
}

var app = new App();
//app.example(1);
app.example(2);