(defproject nl.openweb/graphql-endpoint "0.1.0-SNAPSHOT"
  :plugins [[walmartlabs/shared-deps "0.2.8"]]
  :dependencies [[crypto-password "0.2.1"]
                 [com.stuartsierra/component "1.0.0"]
                 [com.walmartlabs/lacinia-pedestal "0.15.0" :exclusions [com.fasterxml.jackson.core/jackson-core]]
                 [org.apache.logging.log4j/log4j-slf4j-impl "2.14.0"]]
  :dependency-sets [:clojure :money nl.openweb/topology]
  :main nl.openweb.graphql-endpoint.core
  :profiles {:uberjar {:omit-source  true
                       :aot          [nl.openweb.graphql-endpoint.core]
                       :uberjar-name "ge-docker.jar"}
             :viz     {:dependencies [[walmartlabs/system-viz "0.4.0"]]
                       :main         nl.openweb.graphql-endpoint.viz}})
