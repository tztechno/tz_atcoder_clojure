abc105_a.clj
#######################################
#######################################
#######################################
#######################################
(let [a(read) b(read)]
  (println (if (zero? (rem a b))
            0
            1)))
#######################################
(defn AtCoderCrackers [N K] (if (zero? (rem N K)) 0 1))
(println (AtCoderCrackers (int (read)) (int (read))))
#######################################
(println (let [n (read)
               k (read)]
           (if (zero? (mod n k))
             0
             1)))
#######################################
(def n (read))
(def k (read))
(def ans (= (mod n k) 0))
(print (if ans 0 1))
#######################################
