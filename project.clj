(defproject ampere/freactive.core "0.2.1"
  :description "Generic reactive atoms, expressions, cursors"
  :url "https://github.com/ul/freactive.core"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies
  [[org.clojure/clojure "1.7.0-RC1"]
   [org.clojure/clojurescript "0.0-3308" :scope "provided"]
   [org.clojure/data.avl "0.0.12"]]
  :source-paths ["src/clojure"]
  :javac-options ["-Xlint:unchecked"]
  :java-source-paths ["src/java"])
