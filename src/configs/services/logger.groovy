package configs.services

class Logger {
    public static final String NAME         = 'srv-logger';
    public static final String PORT         = '8553';
    public static final String JAVA_VERSION = '10';

    def deployStructure = [
        dev: [
          deploy_servers: "dev2.trph.ru",
          stage: "dev",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18297,suspend=n",
          cpu_limit: "200",
          memory_limit: "1024",
          jolokia_port: "8077",
        ],
        test: [
          deploy_servers: "test2.trph.ru",
          stage: "test",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18297,suspend=n",
          cpu_limit: "200",
          memory_limit: "1024",
          jolokia_port: "8077",
        ],
        stand1: [
          deploy_servers: "stand1.trph.ru",
          stage: "stand1",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18297,suspend=n",
          cpu_limit: "200",
          memory_limit: "1024",
          jolokia_port: "8077",
        ],
        check: [
          deploy_servers: "check2.trph.ru",
          stage: "check",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18297,suspend=n",
          cpu_limit: "2000",
          memory_limit: "4096",
          jolokia_port: "8077",
        ],
        prod: [
          deploy_servers: "prod2.trph.ru",
          stage: "prod",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18297,suspend=n",
          cpu_limit: "2000",
          memory_limit: "4096",
          jolokia_port: "8077",
        ]
    ]
}
