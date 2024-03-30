abc097_a.clj
#########################################
#########################################
#########################################
#########################################
#########################################
(def a (read))
(def b (read))
(def c (read))
(def d (read))

(def ac (Math/abs (- a c)))
(def ab (Math/abs (- a b)))
(def bc (Math/abs (- b c)))
(defn check [target] (if (<= target d) true false))
(def resultac (check ac))
(def resultab (check ab))
(def resultbc (check bc))
(if (or resultac (and resultab resultbc)) (println "Yes") (println "No"))
#########################################
(let [a (read) b (read) c (read) d (read)
      ca (Math/abs (- a c))
      ab (Math/abs (- a b))
      bc (Math/abs (- b c))]
  (println (if (or (<= ca d)
                   (and (<= bc d) (<= ab d)))
             "Yes" "No"))
  	)
#########################################
(defn abs [a b]
  (if (>= a b)
      (- a b)
      (- b a)))

(defn solve [a b c d]
  (if (<= (abs a c) d)
      "Yes"
      (if (and (<= (abs a b) d) (<= (abs b c) d))
          "Yes"
          "No")))

(println (solve (read) (read) (read) (read)))

#########################################
(let [a (read) 
      b (read) 
      c (read) 
      d (read)
      ca (Math/abs (- a c))
      ab (Math/abs (- a b))
      bc (Math/abs (- b c))]
  (if (<= ca d)
    (println "Yes")
    (if (and (<= bc d) (<= ab d))
      (println "Yes")
        (println "No"))
  )
)
#########################################
