package configs.services

class Auth {
    public static final String NAME         = 'srv-auth';
    public static final String PORT         = '8443';
    public static final String JAVA_VERSION = '10';

    def deployStructure = [
        dev: [
          deploy_servers: "dev2",
          stage: "dev",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18284,suspend=n"",
          cpu_limit: "200",
          memory_limit: "1024",
          jolokia_port: "8087",
        ],
        test: [
          deploy_servers: "test2",
          stage: "test",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18284,suspend=n"",
          cpu_limit: "200",
          memory_limit: "1024",
          jolokia_port: "8087",
        ],
        stand1: [
          deploy_servers: "stand1",
          stage: "stand1",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18284,suspend=n"",
          cpu_limit: "200",
          memory_limit: "1024",
          jolokia_port: "8087",
        ]
    ]
}
