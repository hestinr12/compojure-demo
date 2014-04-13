(defproject demo "0.1.0"
  :description "A simple web app for learning Compojure and lein-elastic-beanstalk"
  :url "www.notsureyet.com"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [ring/ring-json "0.3.1"]]
  :plugins [[lein-ring "0.8.10"]
            [lein-elastic-beanstalk "0.2.8-SNAPSHOT"]]
  :ring {:handler demo.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
