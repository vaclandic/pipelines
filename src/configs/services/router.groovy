package configs.services

class Auth {
    public static final String NAME         = 'srv-router';
    public static final String PORT         = '8503';
    public static final String JAVA_VERSION = '10';

    def deployStructure = [
        dev: [
          deploy_servers: "dev2",
          stage: "dev",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18292,suspend=n",
          cpu_limit: "200",
          memory_limit: "1024",
          jolokia_port: "8082",
        ],
        test: [
          deploy_servers: "test2",
          stage: "test",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18292,suspend=n",
          cpu_limit: "200",
          memory_limit: "1024",
          jolokia_port: "8082",
        ],
        stand1: [
          deploy_servers: "stand1",
          stage: "stand1",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18292,suspend=n",
          cpu_limit: "200",
          memory_limit: "1024",
          jolokia_port: "8082",
        ],
        check: [
          deploy_servers: "check2",
          stage: "check",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18292,suspend=n",
          cpu_limit: "2000",
          memory_limit: "4096",
          jolokia_port: "8082",
        ],
        prod: [
          deploy_servers: "prod2",
          stage: "prod",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18292,suspend=n",
          cpu_limit: "2000",
          memory_limit: "4096",
          jolokia_port: "8082",
        ]
    ]
}
