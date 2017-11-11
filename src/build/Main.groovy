package build

def StartWithFuncton(){
	println "This is the first step"
	a = "Apple"
	RunSecondFunction(a)
}

def RunSecondFunction(a){
	println a
	stage('build'){
		checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/gabrielf/maven-samples.git']]])
			withEnv(['MAVEN_HOME=/opt/apache-maven-3.5.2']) {
    			sh 'mvn -version'
}
		
	}

}
