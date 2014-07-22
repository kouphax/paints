(defproject paints "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [liberator "0.10.0"]
                 [compojure "1.1.3"]
                 [ring/ring-core "1.2.1"]
                 [ring/ring-jetty-adapter "1.1.0"]
                 [ring-cors "0.1.4"]]
  :min-lein-version "2.0.0"
  :main paints.core
  :profiles { :uberjar { :aot :all
                         :uberjar-name "paints.jar" } })
