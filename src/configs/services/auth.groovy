package configs.services

class AuthConfig {
  public static final String NAME       = 'srv-auth';
  public static final String PORT       = '8443';
  public static final String DEBUG_PORT = '18284';

  def  env_str = [
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
}
