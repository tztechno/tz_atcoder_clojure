abc110_a.clj
###########################################
###########################################
###########################################
###########################################
(def a (sort (vec (map read-string (.split (read-line) " ")))))
(def ans (let [[x y z] a] (+ (* z 10) y x)))
(print ans)
###########################################
(let [inputs (map read-string (clojure.string/split (read-line) #" "))
      a (nth inputs 0)
      b (nth inputs 1)
      c (nth inputs 2)
      m (max a b c)
      ans (+ a b c (* m 9))]
  (println ans))
###########################################
[python]
a,b,c=map(int,input().split())
ans=(a+b+c)+max(a,b,c)*9
print(ans)
###########################################
