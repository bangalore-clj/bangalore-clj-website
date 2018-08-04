(defproject bangalore-clojure-group "0.1.0"
            :description "Website of Bangalore Clojure users group."
            :url "https://bangalore-clj.github.io"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.9.0"]
                           [ring/ring-devel "1.6.3"]
                           [compojure "1.6.0"]
                           [ring-server "0.5.0"]
                           [cryogen-markdown "0.1.7"]
                           [cryogen-core "0.1.61"]]
            :plugins [[lein-ring "0.9.7"]]
            :main bangalore-clojure-group.core
            :ring {:init bangalore-clojure-group.server/init
                   :handler bangalore-clojure-group.server/handler})
