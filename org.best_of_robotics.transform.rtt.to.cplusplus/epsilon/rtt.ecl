rule MatchPackages
	match left : Left!Package
	with right : Right!Package {
	
	compare : true
}

rule MatchTaskContext
	match left : Left!TaskContext
	with right : Right!TaskContext {
	
	compare : left.name = right.name
	//also compare type?
}

rule MatchActivity
	match left : Left!Activity
	with  right : Right!Activity {
	
	compare : false
}

rule MatchConnectionPolicy
	match left : Left!ConnectionPolicy
	with right : Right!ConnectionPolicy {
	
	compare : false	
}

