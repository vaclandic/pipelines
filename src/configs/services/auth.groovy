package configs.services

class AuthConfig {
  public static final String NAME       = 'srv-auth';
  public static final String PORT       = '8443';
  public static final StrinG DEBUG_OPTS = "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18284,suspend=n";
}
