(ns swarm-coding.core
  (:use [clojure.pprint :only [pprint pp]]))




(def input-example
  {:simplest {:en       
              :fr       [[[0 1] "Bonjour Monsieur"]]
              :expected [[[0 1] "Bonjour Monsieur"]]}
   :simple   {:en       [[[1 2] "Hello Sir"]]
              :fr       [[[0 1] "Bonjour Monsieur"]]
              :expected [[[1 2] "Bonjour Monsieur"]]}
   :simplex  {:en       [[[1 2] "Hello Sir"]]
              :fr       [[[0 1] "Les oiseaux chantent"]]
              :expected [[[1 2] ""]]}})


[1 :a :x]
[2 :b :y]
[3 :c :z]
[4 :d :w]






{:seq1 [:a :b :c :d]
 :seq2 [:x :y :z :w]
 }

{[:a :x] false
 [:a :y] true}

{:?    [true  nil nil nil]
 :seq1 [:a    :b  :c  :d]
 :seq2 [:y    :z  :w ]
 }

;; there will be a find declage fn

{[:c :w] false
 [:b :z] true}


(defn solve
  [m] (map (fn [e f] [(first e) (second f)])
       (:en m)
       (:fr m)))

