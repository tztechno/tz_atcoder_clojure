//abc086_a.clj
################################
################################
################################
(println (if (odd? (* (read) (read))) "Odd" "Even"))
################################
(println (if (even? (* (read) (read)))
           "Even"
           "Odd"))
################################
(defn product [a b]
  (if (zero? (rem (* a b) 2))
    "Even"
    "Odd"))
(println (product (read) (read)))
################################
(defn product [a b]
  (if (even? (* a b))
             "Even"
             "Odd"))
  (println (product (read) (read)))
################################
