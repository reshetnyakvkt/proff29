var myApp = angular.module('jQuiz',[]);

myApp.controller('QuestionController',

    function($scope){

        $scope.score=0;
        $scope.answer=5;
        $scope.subject="";

        $scope.incrementScore = function(){
            $scope.score++;
        };

        $scope.calculateScore = function(answer, rightAnswer){
            if (answer == rightAnswer)
                $scope.incrementScore(); //$scope.score++;
            else $scope.score--;
        };

        $scope.questions = [

            {text:'Which of the following does not extend java.util.Collection?',
                a1:'Vector',
                a2:'Hashtable',
                a3:'ArrayList',
                a4:'TreeSet',
                r:2
            },
            {text:'Which of the following collection classes is synchronized?',
                a1:'Vector',
                a2:'Hashtable',
                a3:'LinkedHashMap',
                a4:'none of the above',
                r:2
            },
            {text:'How many abstract methods are there in the interface Runnable?',
                a1:'1',
                a2:'2',
                a3:'3',
                a4:'there are no abstract methods in the interface Runnable',
                r:1
            }
        ];

    }
);