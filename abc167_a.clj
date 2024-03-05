//abc167_a.clj
################################
################################
################################
(def s (read-line))
(def t (read-line))
(def n (count s))
(def m (count t))
(def ans (and
  (= n (dec m))
  (= (subs s 0 n) (subs t 0 n))))
(print (if ans "Yes" "No"))
################################
(defn compare-strings []
  (let [s (read-line)
        t (read-line)]
    (if (= s (subs t 0 (dec (count t))))
      (println "Yes")
      (println "No"))))

(compare-strings)
################################
