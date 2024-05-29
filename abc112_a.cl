abc112_a.cl
#######################################
入力関数定義
(defn read-int []
  (Integer/parseInt (read-line))) 
if-else構文
(if (= n 1)
  (println ) 
  (do
    (println ))) 
#######################################
#######################################
#######################################
#######################################
#######################################
#######################################
#######################################
#######################################
(defn read-int []
  (Integer/parseInt (read-line))) 

(def n (read-int))
(if (= n 1)
  (println "Hello World") 
  (do
    (def a (read-int)) 
    (def b (read-int)) 
    (println (+ a b)))) 
#######################################
[error,elseの要素がない]
(def n (read))
(if (= n 1)
  (println "Hello World"))
(def a (read)) 
(def b (read))
(println (+ a b)) 
#######################################
[python]
N=int(input())
if N==1:
    print("Hello World")
else:
    a=int(input())
    b=int(input())
    print(a+b)
    
#######################################
