abc070_b.clj
##############################
##############################
##############################
##############################
##############################
##############################
(defn input []
  (->> (clojure.string/split (read-line) #"\s")
    (map #(Integer/parseInt %))))

(defn TwoSwithches [[A B C D]]
  (let [t (- (min B D) (max A C))]
    (if (pos? t) t 0)))

(-> (input)
  TwoSwithches
  println)
##############################
(ns temp.core
  (:gen-class) )

(set! *unchecked-math* true)

(defn solver [a b c d]
  (max 0 (- (min b d) (max a c))) )

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (-> (solver (clojure.edn/read) (clojure.edn/read) (clojure.edn/read) (clojure.edn/read))
      println ) )

(-main)
##############################
(def a (read))
(def b (read))
(def c (read))
(def d (read))
(def t (max (- (min b d) (max a c)) 0))
(println t)
##############################
