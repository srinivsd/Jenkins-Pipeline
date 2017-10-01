package build

def StartWithFuncton(){
	println "This is the first step"
	a = "Apple"
	RunSecondFunction(a)
}

def RunSecondFunction(a){
	println a
	checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/gabrielf/maven-samples.git']]])
	bat "mvn clean install"
}
