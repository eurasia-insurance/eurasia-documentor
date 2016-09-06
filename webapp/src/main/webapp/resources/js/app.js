
(function ($, ng) {
    'use strict';

    var app = ng.module('app', ['ngAnimate']);


    app.controller('main', ['$scope', function ($scope) {

        console.log(123);
        $scope.insurcase = false;
        $scope.condstumb = false;
        $scope.showmobilemenu = false;
        
        $scope.showconds = function (){

        }
    }]);



})(jQuery, angular);
