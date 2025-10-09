(ns sicp-clj.ch-2.2-20
  (:require [sicp-clj.ch-2.list :refer [car, cdr]]))

(defn same-parity [f & r]
  (defn helper "Predicate and remained list." [p l]
    (if (empty? l)
      ()
      (let [cur (car l)]
        (cond
          (p cur) (cons cur (helper p (cdr l)))
          :else (helper p (cdr l))))))
  (cons f
        (cond
          (even? f) (helper even? r)
          (odd? f) (helper odd? r))))

(println (same-parity 1 2 3 4 5 6 7))
(println (same-parity 2 3 4 5 6 7))
