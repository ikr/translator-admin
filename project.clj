(defproject tmp "0.1.0-SNAPSHOT"
  :description "Web interface for translations administration. A part of Magomogo/translator family."
  :url "https://github.com/ikr/translator-admin"

  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-2138"]]

  :plugins [[lein-cljsbuild "1.0.2"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "tadmin"
              :source-paths ["src"]
              :compiler {
                :output-to "tadmin.js"
                :output-dir "out"
                :optimizations :none
                :source-map true}}]})
