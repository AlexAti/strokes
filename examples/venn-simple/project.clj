(defproject venn-simple "0.0.1-SNAPSHOT"
  :description "venn-simple"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.clojure/clojurescript "0.0-1878"]
                 [net.drib/strokes "0.5.1"]]
  :min-lein-version "2.0.0"
  :source-paths ["src/clj" "src/cljs"]

  :plugins [[lein-cljsbuild "0.3.3"]]

  :cljsbuild {:builds [{:source-paths ["src/cljs"]
                        :compiler { :output-to "public/out/venn-simple.js"
                                    :pretty-print true 
                                    :optimizations :simple}}]})
