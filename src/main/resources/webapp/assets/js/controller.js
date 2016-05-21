var helloApp = angular.module('helloApp', []);

helloApp.controller('HelloCtrl', function ($scope, $http) {
  $scope.sayHello = function(){
     $http.get('http://localhost:8080/api/hello-world?name=' + $scope.name).success(function(data) {
         angular.fromJson(data);
         $scope.result = data.content;
       });

  }
});