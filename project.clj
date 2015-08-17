(defproject condense/freactive.core "0.2.2"
  :description "Generic reactive atoms, expressions, cursors"
  :url "https://github.com/condense/freactive.core"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies
  [[org.clojure/clojure "1.7.0"]
   [org.clojure/clojurescript "1.7.107" :scope "provided"]
   [org.clojure/data.avl "0.0.12"]]
  :source-paths ["src/clojure"]
  :javac-options ["-Xlint:unchecked"]
  :java-source-paths ["src/java"])
