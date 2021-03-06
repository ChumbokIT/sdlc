import jenkins.model.Jenkins

println "Creating seed job from /usr/share/jenkins/JobBuilderJenkinsConfig.xml"
new File("/usr/share/jenkins/JobBuilderJenkinsConfig.xml").withInputStream { stream ->
    Jenkins.instance.createProjectFromXML("JobBuilder", stream)
}

println "Creating seed job from /usr/share/jenkins/AutoJobBuilderJenkinsConfig.xml"
new File("/usr/share/jenkins/AutoJobBuilderJenkinsConfig.xml").withInputStream { stream ->
    Jenkins.instance.createProjectFromXML("AutoJobBuilder", stream)
}

println "Creating seed job complete."