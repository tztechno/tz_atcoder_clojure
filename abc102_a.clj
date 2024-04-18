abc102_a.clj
######################################
######################################
######################################
######################################
######################################
######################################
######################################
(defn gcd ([] 1)
          ([x] x)
          ([x y] (loop [p x q y]
                   (if (zero? q)
                     p
                     (recur q (mod p q)))))
          ([x y & args] (gcd (gcd x y) (reduce gcd args))))

(defn lcm ([] 1)
          ([x] x)
          ([x y] (/ (* x y) (gcd x y)))
          ([x y & args] (lcm (lcm x y) (reduce lcm args))))

(println (lcm 2 (read)))
######################################
(let [n (Long/parseLong (read-line))]
   (if (zero? (mod n 2))
      (print n)
      (print (* n 2)))
   (newline))

######################################
(defn MultipleOf2andN [N] (if (even? N) N (* 2 N)))
(println (MultipleOf2andN (int (read))))
######################################
[my ans]
[(zero? (rem n 2)) checks if n is even.]
--------------------------------------
(def n (Integer/parseInt (read-line)))
(def even? (zero? (rem n 2)))
(def ans (if even? n (* n 2)))
(println ans)
######################################
