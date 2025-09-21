(ns sicp-clj.ch-1.fast-prime)

(defn square [x]
  (* x x))

(defn expmod [base exp m]
  (cond ((= exp 0) 1)
        ((even? exp)
         (mod
          (square (expmod base (/ exp 2) m))
          m))
        :else
        (mod
         (* base (expmod base (- exp 1) m))
         m)
        ))

(defn fermat-test [n]
  (defn try-it [a]
    (= (expmod a n n) a))
  (try-it (+ 1 (rand (- n 1)))))

(defn fast-prime? [n times]
  (cond (= times 0) true
        (fermat-test n) (fast-prime? n (- times 1))
        :else false)
  )
