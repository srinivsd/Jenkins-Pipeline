package build

def StartWithFunction(){
	stage('DeleteJob'){
		sh 'curl -X POST http://sureshcr862.mylabserver.com:8080/job/LOB2/doDelete --user co23400:273377c5912b65de7facaa1e85f2bd40'
		println "Deleted Job Succesfully"
		StartWithSecond()
		
	}
def StartWithSecond(){
	stage('Create Job'){
		sh 'curl -X POST curl -X POST http://sureshcr862.mylabserver.com:8080/job/Job1_pipeline/createItem?name=DaiSummaJob  --user co23400:273377c5912b65de7facaa1e85f2bd40'
		println "Created Job Succesful"
		
	}	
	
}




