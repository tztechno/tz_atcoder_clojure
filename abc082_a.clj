abc082_a.clj
##########################################
##########################################
##########################################
##########################################
(def a (read))
(def b (read))
(def ans (-> (+ a b) (+ 1) (quot 2)))
(print ans)
##########################################
(def a (read))
(def b (read))
(println(quot (+ a b 1) 2))
##########################################
(def a (read))
(def b (read))
(println (int (Math/ceil (/ (+ a b) 2))))
##########################################
[python]
import math
a,b=map(int,input().split())
print((a+b+1)//2)
##########################################
