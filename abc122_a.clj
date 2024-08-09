abc122_a.clj
##########################################
##########################################
##########################################
##########################################
##########################################
(def x (read-line))
(def ans (case x
  "A" "T"
  "T" "A"
  "C" "G"
  "G" "C"
))
(println ans)
##########################################
(def x (first (read-line))) 
(def ans (case x
  \A "T"
  \T "A"
  \C "G"
  \G "C"
)) 
(println ans)
##########################################
[fixed,AX]
(def x (first (read-line))) 
(def ans (case x
  \A "T"
  \T "A"
  \C "G"
  \G "C"
  "Invalid input")) 
(println ans)
##########################################
[error]
(def x (read))
(def ans (case x
  "A" "T"
  "T" "A"
  "C" "G"
  "G" "C"))
(print ans)

##########################################
[python]
b=str(input())
if b=='A':
    ans='T'
elif b=='T':
    ans='A'
elif b=='C':
    ans='G'
elif b=='G':
    ans='C'
print(ans)
##########################################
