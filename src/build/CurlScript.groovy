package build

def StartWithFunction(){
	stage('build'){
		sh 'curl -X POST http://sureshcr862.mylabserver.com:8080/job/TestS3Project/doDelete --user co23400:273377c5912b65de7facaa1e85f2bd40'
		println "Job Succesful"
		
	}
	
	
}




