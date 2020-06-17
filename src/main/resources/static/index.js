angular.module('AutosApp', []).controller('AutosCtrl', function($http){
	var ctrl = this;
	ctrl.newAuto = {};
	ctrl.delAuto = {};
	
	ctrl.addAuto = function(auto){
		var req = {
				method : 'POST',
				url : '/Autos',
				headers : {
					'Content-Type' : 'application/json'
				},
				data : auto
		}
		$http(req).then(function(){
			ctrl.listAutos();
			ctrl.newAuto = {};
		}, function(){
			
		});
	};
	
	
	ctrl.listAutos = function(){
		var req = {
				method : 'GET',
				url : '/Autos',
				headers : {
					'Content-Type' : 'application/json'
				},
		}
		$http(req).then(function(result){
			ctrl.autos = result.data
		}, function(){
			
		});
	};
	
	ctrl.deleteAuto = function(auto){
		var req = {
				method : 'DELETE',
				url : '/Autos?id=' + auto.id,
				headers : {
					'Content-Type' : 'application/json'
				},
				//data : auto.id
		}
		$http(req).then(function(){
			ctrl.listAutos();
			//ctrl.delAuto = {};
		}, function(){
			
		});
	};
	
	
});