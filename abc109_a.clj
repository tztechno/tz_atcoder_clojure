abc109_a.clj
#############################################
#############################################
(defn ABC [A B]
  (if (every? odd? (list A B)) 
    "Yes"
    "No"
  ))
(println (ABC (bigint (read)) (bigint (read))))
#############################################
(def a (read))
(def b (read))
(def ans (and (odd? a) (odd? b)))
(print (if ans "Yes" "No"))
#############################################
(def a (read))
(def b (read))
(def c (-> (* a b)(rem 2)))
(print (if (= c 1) "Yes" "No"))
#############################################
[python]
a,b=map(int,input().split())
if (a*b)%2==1:
    print('Yes')
else:
    print('No')
#############################################
