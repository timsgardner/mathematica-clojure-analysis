(ns clj-test-project.core
  (:require [clojure.pprint :as pprint]
            [clojure.repl :as repl]))

(defn f-1 [x] x)

(defn f-2 [x]
  {::type :some-type
   :value (f-1 x)})

(defn f-3 [x]
  (merge (f-2 x) {:should-be (f-1 x)}))
