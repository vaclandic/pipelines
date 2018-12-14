package configs.services

class AdapterSmdlp {
    public static final String NAME         = 'srv-adapter-smdlp';
    public static final String SDKNAME      = 'sdk-adapter-smdlp';
    public static final String PORT         = '8563';
    public static final String JAVA_VERSION = '10';

    def deployStructure = [
        dev: [
          deploy_servers: "dev2.trph.ru",
          stage: "dev",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18301,suspend=n",
          cpu_limit: "200",
          memory_limit: "1024",
          jolokia_port: "8088",
        ],
        test: [
          deploy_servers: "test2.trph.ru",
          stage: "test",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18301,suspend=n",
          cpu_limit: "200",
          memory_limit: "1024",
          jolokia_port: "8088",
        ],
        stand1: [
          deploy_servers: "stand1.trph.ru",
          stage: "stand1",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18301,suspend=n",
          cpu_limit: "200",
          memory_limit: "1024",
          jolokia_port: "8088",
        ],
        check: [
          deploy_servers: "check2.trph.ru",
          stage: "check",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18301,suspend=n",
          cpu_limit: "2000",
          memory_limit: "4096",
          jolokia_port: "8088",
        ],
        prod: [
          deploy_servers: "prod2.trph.ru",
          stage: "prod",
          debug_opts: "-Xdebug -Xrunjdwp:transport=dt_socket,server=y,address=0.0.0.0:18301,suspend=n",
          cpu_limit: "2000",
          memory_limit: "4096",
          jolokia_port: "8088",
        ]
    ]
}
