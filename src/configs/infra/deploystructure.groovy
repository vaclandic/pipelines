package configs.infra

class DeployStructure {
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
    public static final String docker_reg = "docker.trph.ru"

    def services = [  
      'trph-app-primitive-build-pipeline': [
        'name': 'trph-app-primitive-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_primitive'
      ],
      'trph-camundadispatcher-phase2-pipeline': [
        'name': 'trph-camundadispatcher-pipeline',
        'tocken': 'cho4reboodi5Ooghoo9ohbui'
      ],
      'trph-sdk-auth-pipeline': [
        'name': 'trph-auth-sdk-pipeline',
        'tocken': 'equietiBeishighoon6ThaThi_authsdk'
      ],
      'trph-sdk-documentor-pipeline': [
        'name': 'trph-documentor-sdk-pipeline',
        'tocken': 'equietiBeishighoon6ThaThi_authdocumentor'
      ],
      'trph-sdk-processor-pipeline': [
        'name': 'trph-processor-sdk-pipeline',
        'tocken': 'equietiBeishighoon6ThaThi_processorsdk'
      ],
      'trph-sdk-repository-pipeline': [
        'name': 'trph-repository-sdk-pipeline',
        'tocken': 'equietiBeishighoon6ThaThi_repositorysdk'
      ],
      'trph-sdk-logger-pipeline': [
        'name': 'trph-logger-sdk-pipeline',
        'tocken': 'equietiBeishighoon6ThaThi_loggersdk'
      ],
      'trph-sdk-translator-pipeline': [
        'name': 'trph-translator-sdk-pipeline',
        'tocken': 'equietiBeishighoon6ThaThi_translatorsdk'
      ],
      'trph-sdk-security-pipeline': [
        'name': 'trph-sdk-security-pipeline',
        'tocken': 'equietiBeishighoon6ThaThi_securitysdk'
      ],
      'trph-sdk-router-pipeline': [
        'name': 'trph-router-sdk-pipeline',
        'tocken': 'equietiBeishighoon6ThaThi_routersdk'
      ],
      'trph-sdk-frontier-pipeline': [
        'name': 'trph-frontier-sdk-pipeline',
        'tocken': 'equietiBeishighoon6ThaThi_frontiersdk'
      ],
      'trph-sdk-prirecognition-pipeline': [
        'name': 'trph-sdk-prirecognition-pipeline',
        'tocken': 'equietiBeishighoon6ThaThi_prirecognitionsdk'
      ],
      'trph-sdk-dictionaries-pipeline': [
        'name': 'trph-dictionaries-sdk-pipeline',
        'tocken': 'equietiBeishighoon6ThaThi_dictionariessdk'
      ],
      'trph-sdk-dispatcher-pipeline': [
        'name': 'trph-dispatcher-sdk-pipeline',
        'tocken': 'equietiBeishighoon6ThaThi_dispatchersdk'
      ],
      'trph-sdk-backender-pipeline': [
        'name': 'trph-backender-sdk-pipeline',
        'tocken': 'equietiBeishighoon6ThaThi_backendersdk'
      ],
      'trph-sdk-signer-pipeline': [
        'name': 'trph-signer-sdk-pipeline',
        'tocken': 'equietiBeishighoon6ThaThi_signersdk'
      ],
      'trph-srv-sample-build-pipeline': [
        'name': 'trph-srv-sample-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_sample'
      ],
      'trph-srv-callbacker-build-pipeline': [
        'name': 'trph-srv-callbacker-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_callbacker'
      ],
      'trph-srv-camunda-build-pipeline': [
        'name': 'trph-srv-camunda-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_camunda'
      ],
      'trph-srv-auth-build-pipeline': [
        'name': 'trph-srv-auth-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_auth'
      ],
      'trph-srv-prirecogniton-build-pipeline': [
        'name': 'trph-srv-prirecognition-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_prirecognition'
      ],
      'trph-srv-dictionaries-build-pipeline': [
        'name': 'trph-srv-dictionaries-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_dictionaries'
      ],
      'trph-srv-signer-build-pipeline': [
        'name': 'trph-srv-signer-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_signer'
      ],
      'trph-srv-security-build-pipeline': [
        'name': 'trph-srv-security-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_security'
      ],
      'trph-srv-router-build-pipeline': [
        'name': 'trph-srv-router-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_router'
      ],
      'trph-srv-logger-build-pipeline': [
        'name': 'trph-srv-logger-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_logger'
      ],
      'trph-srv-frontier-build-pipeline': [
        'name': 'trph-srv-frontier-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_frontier'
      ],
      'trph-srv-processor-build-pipeline': [
        'name': 'trph-srv-processor-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_processor'
      ],
      'trph-srv-documentor-build-pipeline': [
        'name': 'trph-srv-documentor-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_documentor'
      ],
      'trph-srv-dispatcher-build-pipeline': [
        'name': 'trph-srv-dispatcher-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_dispatcher'
      ],
      'trph-srv-translator-build-pipeline': [
        'name': 'trph-srv-translator-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_translator'
      ],
      'trph-srv-repository-build-pipeline': [
        'name': 'trph-srv-repository-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_repository'
      ],
      'trph-srv-backender-build-pipeline': [
        'name': 'trph-srv-backender-pipeline',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_backender'
      ],
      'srv-smdlp-adapter': [
        'name': 'srv-smdlp-adapter',
        'tocken': 'MTkXmv8PXBURygSU6SRnjNCH_smdlp_adapter'
      ]
    ]
}
