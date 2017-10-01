package build

def StartWithFuncton(){
	println "This is the first step"
	a = "Apple"
	RunSecondFunction(a)
}

def RunSecondFunction(a){
	println a
	bat "mvn clean install"
}
