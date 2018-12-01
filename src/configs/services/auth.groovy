package configs.services

class AuthConfig {
  public static final String NAME       = 'srv-auth';
  public static final String PORT       = '8443';
  public static final String DEBUG_PORT = '18284';
  public static final StrinG DEBUG_OPTS = "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:DEBUG_PORT,suspend=n"

  if (environment == "prod"){
      env.STAGE = 'prerelease'
      env.CPU_LIMIT = 200
      env.MEMORY_LIMIT = 1024
      env.JOLOKIA_PORT = 8087
     // env.JAVA_OPTIONS = "-Xmx512m"
      env.APP_VERSION = "release-${project.version.text()}"
  }
  else {
      env.STAGE = environment
      env.CPU_LIMIT = 200
      env.MEMORY_LIMIT = 1024
      env.JOLOKIA_PORT = 8087
     // env.JAVA_OPTIONS = "-Xmx512m"
      env.APP_VERSION = "${project.version.text()}"
  }

}
