package configs.infra

class DeployStructure {

  public static final String
  def env_str = [
        dev: [
          deploy_servers: "dev2"
        ],
        test: [
          deploy_servers: "test2"
        ],
        prod: [
          deploy_servers: "test2"
        ]
      ]
    public static final String server = "Artifactory.newServer url: 'http://artifactory.trph.ru/artifactory', username: 'artifactory', password: 'Ieraipah1thu'"
    public static final String rtMaven = "Artifactory.newMavenBuild()"
    public static final string docker_reg = "docker.trph.ru"
}
