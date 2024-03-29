//practiceA.clj
##################################
1
2 3
test
##################################
##################################
##################################
##################################
(println (str (+ (read) (read) (read)) " " (read)))
##################################
(let [a (Integer/parseInt (read-line))
      [b c] (map #(Integer/parseInt %) (str/split (read-line) #" "))
      s (read-line)]
  (println (+ a b c) s))
##################################
(ns atcoder
  (:require [clojure.string :refer [split]]
            [clojure.edn :as edn]))

(let [a (edn/read-string (read-line))
      [b c] (map edn/read-string (split (read-line) #" "))
      s (read-line)]
  (println (+ a b c) s))
##################################
(def input [])
(doseq [i (range 0 3)]
    (def input (conj input (read-line)))
)

(def a (Integer/parseInt (get input 0)))

(def input2 (clojure.string/split (get input 1) #" "))
(def b (Integer/parseInt (get input2 0)))
(def c (Integer/parseInt (get input2 1)))

(def s (get input 2))

(println (+ a b c) s)
##################################
(ns abs.practice-a
  (:require [clojure.string :as str]))

(defn answer [a b c s]
  (format "%d %s" (+ a b c) s))

(defn -main [& args]
  (let [a (Integer/parseInt (read-line))
      [b c] (map #(Integer/parseInt %) (str/split (read-line) #" "))
      s (read-line)]
  (println (answer a b c s))))

(when (= *file* (System/getProperty "babashka.file"))
  (apply -main *command-line-args*))

##################################
