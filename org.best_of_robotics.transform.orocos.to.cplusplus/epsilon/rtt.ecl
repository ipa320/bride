rule MatchPackages
	match left : Left!Package
	with right : Right!Package {
	
	compare : true
}

rule MatchTaskContext
	match left : Left!TaskContext
	with right : Right!TaskContext {
	
	compare : left.name = right.name
	
}

