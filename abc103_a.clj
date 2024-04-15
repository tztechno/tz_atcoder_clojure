abc103_a.clj
######################################
######################################
######################################
######################################
######################################
######################################
######################################
(let [a (read) b (read) c (read)
      ab (Math/abs (- a b)) bc (Math/abs (- b c)) ca (Math/abs (- c a))]
  (println (- (+ ab bc ca) (max ab bc ca)))
  	)
######################################
(println (let [a (doall (for [_ (range 3)] (read)))]
           (- (apply max a) (apply min a))))
######################################
(def a (sort (vec (map read-string (.split (read-line) " ")))))
(def ans (let [[x y z] a] (- z x)))
(print ans)

######################################
(def a (read))
(def b (read))
(def c (read))
(def mx (max (max a b) c))
(def mn (min (min a b) c))
(def t (- mx mn ))
(println t)
######################################
